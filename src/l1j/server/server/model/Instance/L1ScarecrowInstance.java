package l1j.server.server.model.Instance;

import java.util.ArrayList;

import l1j.server.Config;
import l1j.server.server.datatables.ExpTable;
import l1j.server.server.model.L1Attack;
import l1j.server.server.serverpackets.S_ChangeHeading;
import l1j.server.server.serverpackets.S_MatizCloudia;
import l1j.server.server.serverpackets.S_NewCreateItem;
import l1j.server.server.serverpackets.S_SystemMessage;
import l1j.server.server.templates.L1Npc;
import l1j.server.server.utils.CalcExp;

public class L1ScarecrowInstance extends L1NpcInstance {

	private static final long serialVersionUID = 1L;

	public L1ScarecrowInstance(L1Npc template) {
		super(template);
	}

	@Override
	public void onAction(L1PcInstance player) {
		L1Attack attack = new L1Attack(player, this);

		if (attack.calcHit()) {
			if(player.getLevel() < 5 && getNpcId()==202064){
				if(player.getLevel()==2)
					player.sendPackets(new S_MatizCloudia(1));
				player.setExp(ExpTable.getExpByLevel(player.getLevel()+1));
				player.sendPackets(new S_MatizCloudia(0,player.getLevel()+1));
			}else if (player.getLevel() < 99 && !player.noPlayerCK && getNpcId()!=202064) {//레벨5까지만 로봇제외
				ArrayList<L1PcInstance> targetList = new ArrayList<L1PcInstance>();
				targetList.add(player);
				ArrayList<Integer> hateList = new ArrayList<Integer>();
				hateList.add(1);

				if (player.isInParty() || player.isDead()) { 
					CalcExp.calcExp(player, getId(), targetList, hateList, 0);//경험치지급
				}else{
					CalcExp.calcExp(player, getId(), targetList, hateList, getExp());//경험치지급
				}
				
				if (Config.허수아비탐지급여부) {
					player.sendPackets(new S_NewCreateItem(S_NewCreateItem.TAM_POINT, player.getNetConnection()), true);// 탐지급
					player.getNetConnection().getAccount().tam_point += 10;// 탐지급갯수
					player.getNetConnection().getAccount().updateTam();// 탐업뎃
				}
			}
			if (getNpcId() >= 45002 && getNpcId() <= 45003) {
				player.getInventory().storeItem(40308, 10);
				//player.sendPackets(new S_ServerMessage(143, "허수아비", "$4 (" + 10 + ")"));
			}

			int dmg = attack.calcDamage();
			if (this.getNpcId() == 44997 || this.getNpcId() == 44998 || this.getNpcId() == 44999) {	
				player.sendPackets(new S_SystemMessage("물리대미지: [" + dmg + "]"));
			}
			if (getHeading() < 7) {
				setHeading(getHeading() + 1);
			} else {
				setHeading(0);
			}
			broadcastPacket(new S_ChangeHeading(this));
		}
		attack.action();
	}

	@Override
	public void onTalkAction(L1PcInstance l1pcinstance) {}
	public void onFinalAction() {}
	public void doFinalAction() {}
}
