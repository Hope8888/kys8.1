/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
 * 02111-1307, USA.
 *
 * http://www.gnu.org/copyleft/gpl.html
 */

package l1j.server.server.serverpackets;

import java.util.Random;

import l1j.server.server.Opcodes;
import l1j.server.server.datatables.NPCTalkDataTable;
import l1j.server.server.model.L1Clan;
import l1j.server.server.model.L1NpcTalkData;
import l1j.server.server.model.L1World;
import l1j.server.server.model.Instance.L1FieldObjectInstance;
import l1j.server.server.model.Instance.L1NpcInstance;
import l1j.server.server.model.Instance.L1NpcShopInstance;

// Referenced classes of package l1j.server.server.serverpackets:
// ServerBasePacket

public class S_NPCPack extends ServerBasePacket {

    private static final String S_NPC_PACK = "[S] S_NPCPack";

    private static final int STATUS_POISON = 1;
    private static final int STATUS_PC = 4;
    private static final int STATUS_FREEZE = 8;


    private byte[] _byte = null;
    private static Random _random = new Random();

    public S_NPCPack(L1NpcInstance npc) {
        writeC(Opcodes.S_PUT_OBJECT);
        writeH(npc.getX());
        writeH(npc.getY());
        writeD(npc.getId());
        try {
            if (npc.getTempCharGfx() == 0) {
                writeH(npc.getGfxId());
            } else {
                writeH(npc.getTempCharGfx());
            }
            if (((npc instanceof L1NpcShopInstance)) && (npc.getNpcTemplate().is_doppel())) {
                writeC(70);
            } else if ((npc.getNpcTemplate().is_doppel() && npc.getGfxId() != 31)    // スライムの姿をしていない場合はドッペル
                    || npc.getGfxId() == 6632 || npc.getGfxId() == 6634        // 氷のダンジョン
                    || npc.getGfxId() == 6636 || npc.getGfxId() == 6638) {    // 氷のダンジョン
                writeC(4); // ソード
            } else if (npc.getGfxId() == 51) { // ウィンドウガード
                writeC(24);
            } else if (npc.getGfxId() == 816) { // 五つオークスカウト
                writeC(20);
            } else {
                writeC(npc.getStatus());
            }
            writeC(npc.getHeading());
            writeC(npc.getLight().getChaLightSize());
            writeC(npc.getMoveSpeed());
            writeD(1);
            writeH(npc.getTempLawful());
            /** 攻城勝利血盟バフ像 **/
            if (npc.getNpcId() == 6200008) {
                String clanName = null;
                for (L1Clan checkClan : L1World.getInstance().getAllClans()) {
                    /** 1.ケント2.オーク3ウィンソン4ギラン5ハイネ6ドワーフ7アデン8ディアド **/
                    if (checkClan.getCastleId() == 4) {
                        clanName = checkClan.getClanName();
                        break;
                    }
                }
                writeS(clanName);
            } else {
                writeS(npc.getNameId());
            }
            /**攻城勝利血盟バフ像 **/
            if (npc instanceof L1FieldObjectInstance) { // SICのビョクジャ、看板など
                L1NpcTalkData talkdata = NPCTalkDataTable.getInstance().getTemplate(npc.getNpcTemplate().get_npcId());
                if (talkdata != null) {
                    writeS(talkdata.getNormalAction()); // タイトルが HTML人として解釈される
                } else {
                    writeS(null);
                }
            } else {
                if (npc.getNpcTemplate().get_npcId() >= 4000001 && npc.getNpcTemplate().get_npcId() <= 4000061) {
                    int rnd = _random.nextInt(8);
                    switch (rnd) {
                        case 0:
                            writeS("");
                            break;
                        case 1:
                            writeS("");
                            break;
                        case 2:
                            writeS("");
                            break;
                        case 3:
                            writeS("");
                            break;
                        case 4:
                            writeS("");
                            break;
                        case 5:
                            writeS("");
                            break;
                        case 6:
                            writeS("");
                            break;
                        case 7:
                            writeS("");
                            break;
                    }
                } else
                    writeS(npc.getTitle());
            }

            /**
             * セッティング -  0：mob、item（atk pointer）、1：poisoned（）、2：invisable（）、4：pc、
             * 8:cursed(), 16:brave(), 32:??, 64:??(??), 128:invisable but name
             */
            int status = 0;
            if (npc.getPoison() != null) {
                if (npc.getPoison().getEffectId() == 1) {
                    status |= STATUS_POISON;
                }
            }
            if (npc.getNpcTemplate().is_doppel()) {
                // PCのプロパティであれば、エヴァの祝福を渡すことができないので、WIZクエストのドッペルは例外
                if (npc.getNpcTemplate().get_npcId() != 81069) {
                    status |= STATUS_PC;
                }
            }
            if ((npc instanceof L1NpcShopInstance))
                status |= 4;
            if (npc.isParalyzed()) {
                status |= STATUS_FREEZE;
            }
            writeC(status);
            /** 攻城勝利血盟バフ像 **/
            if (npc.getNpcId() == 6200008) {
                int emblem = 0;
                for (L1Clan checkClan : L1World.getInstance().getAllClans()) {
                    /** 1.ケント2.オーク3ウィンソン4ギラン5ハイネ6ドワーフ7アデン8ディアド **/
                    if (checkClan.getCastleId() == 4) {
                        emblem = checkClan.getEmblemId();
                        break;
                    }
                }
                writeD(emblem);
            } else {
                writeD(0); // 0以外とするとC_27が出る
            }
            /** 攻城勝利血盟バフ像 **/
            writeS(null);
            writeS(null); // マスター人?
            writeC(0);
            writeC(0xFF); // HP
            writeC(0);
            writeC(npc.getLevel());
            if (((npc instanceof L1NpcShopInstance)) && (((L1NpcShopInstance) npc).getState() == 1)) {
                writeByte(((L1NpcShopInstance) npc).getShopName().getBytes());
            }
            writeC(0);
            writeC(0xFF);
            writeC(0xFF);
            writeC(0x00);
            writeC(0xFF);
            writeH(0x00);
        } catch (Exception e) {
        }
    }

    @Override
    public byte[] getContent() {
        if (_byte == null) {
            _byte = _bao.toByteArray();
        }

        return _byte;
    }

    @Override
    public String getType() {
        return S_NPC_PACK;
    }

}
