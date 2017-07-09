package l1j.server.server.clientpackets;

import static l1j.server.server.model.skill.L1SkillId.ADDITIONAL_FIRE;
import static l1j.server.server.model.skill.L1SkillId.ANTA_BUFF;
import static l1j.server.server.model.skill.L1SkillId.ANTA_MAAN;
import static l1j.server.server.model.skill.L1SkillId.BERSERKERS;
import static l1j.server.server.model.skill.L1SkillId.BIRTH_MAAN;
import static l1j.server.server.model.skill.L1SkillId.BLOOD_LUST;
import static l1j.server.server.model.skill.L1SkillId.CLEAR_MIND;
import static l1j.server.server.model.skill.L1SkillId.COMA_A;
import static l1j.server.server.model.skill.L1SkillId.COMA_B;
import static l1j.server.server.model.skill.L1SkillId.CONCENTRATION;
import static l1j.server.server.model.skill.L1SkillId.COOKING_BEGIN;
import static l1j.server.server.model.skill.L1SkillId.COOKING_END;
import static l1j.server.server.model.skill.L1SkillId.DECAY_POTION;
import static l1j.server.server.model.skill.L1SkillId.DECREASE_WEIGHT;
import static l1j.server.server.model.skill.L1SkillId.DISEASE;
import static l1j.server.server.model.skill.L1SkillId.DRAGON_PUPLE;
import static l1j.server.server.model.skill.L1SkillId.DRAGON_SKIN;
import static l1j.server.server.model.skill.L1SkillId.DRAGON_TOPAZ;
import static l1j.server.server.model.skill.L1SkillId.DRESS_EVASION;
import static l1j.server.server.model.skill.L1SkillId.ELEMENTAL_FALL_DOWN;
import static l1j.server.server.model.skill.L1SkillId.ELEMENTAL_FIRE;
import static l1j.server.server.model.skill.L1SkillId.ELEMENTAL_PROTECTION;
import static l1j.server.server.model.skill.L1SkillId.EMERALD_NO;
import static l1j.server.server.model.skill.L1SkillId.EMERALD_YES;
import static l1j.server.server.model.skill.L1SkillId.ERASE_MAGIC;
import static l1j.server.server.model.skill.L1SkillId.EXP_POTION;
import static l1j.server.server.model.skill.L1SkillId.FAFU_BUFF;
import static l1j.server.server.model.skill.L1SkillId.FAFU_MAAN;
import static l1j.server.server.model.skill.L1SkillId.FEAR;
import static l1j.server.server.model.skill.L1SkillId.FEATHER_BUFF_A;
import static l1j.server.server.model.skill.L1SkillId.FEATHER_BUFF_B;
import static l1j.server.server.model.skill.L1SkillId.FEATHER_BUFF_C;
import static l1j.server.server.model.skill.L1SkillId.FEATHER_BUFF_D;
import static l1j.server.server.model.skill.L1SkillId.GUARD_BREAK;
import static l1j.server.server.model.skill.L1SkillId.God_buff;
import static l1j.server.server.model.skill.L1SkillId.HORROR_OF_DEATH;
import static l1j.server.server.model.skill.L1SkillId.INSIGHT;
import static l1j.server.server.model.skill.L1SkillId.LIFE_MAAN;
import static l1j.server.server.model.skill.L1SkillId.LIND_MAAN;
import static l1j.server.server.model.skill.L1SkillId.MORTAL_BODY;
import static l1j.server.server.model.skill.L1SkillId.NATURES_TOUCH;
import static l1j.server.server.model.skill.L1SkillId.PANIC;
import static l1j.server.server.model.skill.L1SkillId.PATIENCE;
import static l1j.server.server.model.skill.L1SkillId.POLLUTE_WATER;
import static l1j.server.server.model.skill.L1SkillId.REDUCE_WEIGHT;
import static l1j.server.server.model.skill.L1SkillId.RESIST_ELEMENTAL;
import static l1j.server.server.model.skill.L1SkillId.RESIST_MAGIC;
import static l1j.server.server.model.skill.L1SkillId.RIND_BUFF;
import static l1j.server.server.model.skill.L1SkillId.VALA_BUFF;
import static l1j.server.server.model.skill.L1SkillId.SHAPE_CHANGE;
import static l1j.server.server.model.skill.L1SkillId.SHAPE_MAAN;
import static l1j.server.server.model.skill.L1SkillId.SILENCE;
import static l1j.server.server.model.skill.L1SkillId.SOUL_OF_FLAME;
import static l1j.server.server.model.skill.L1SkillId.STATUS_BLUE_POTION;
import static l1j.server.server.model.skill.L1SkillId.STATUS_BLUE_POTION2;
import static l1j.server.server.model.skill.L1SkillId.STATUS_BRAVE;
import static l1j.server.server.model.skill.L1SkillId.STATUS_CASHSCROLL;
import static l1j.server.server.model.skill.L1SkillId.STATUS_CASHSCROLL2;
import static l1j.server.server.model.skill.L1SkillId.STATUS_CASHSCROLL3;
import static l1j.server.server.model.skill.L1SkillId.STATUS_CHAT_PROHIBITED;
import static l1j.server.server.model.skill.L1SkillId.STATUS_DRAGON_PEARL;
import static l1j.server.server.model.skill.L1SkillId.STATUS_ELFBRAVE;
import static l1j.server.server.model.skill.L1SkillId.STATUS_FRUIT;
import static l1j.server.server.model.skill.L1SkillId.STATUS_HASTE;
import static l1j.server.server.model.skill.L1SkillId.STRIKER_GALE;
import static l1j.server.server.model.skill.L1SkillId.SetBuff;
import static l1j.server.server.model.skill.L1SkillId.Tam_Fruit1;
import static l1j.server.server.model.skill.L1SkillId.Tam_Fruit2;
import static l1j.server.server.model.skill.L1SkillId.Tam_Fruit3;
import static l1j.server.server.model.skill.L1SkillId.Tam_Fruit4;
import static l1j.server.server.model.skill.L1SkillId.Tam_Fruit5;
import static l1j.server.server.model.skill.L1SkillId.VALA_MAAN;
import static l1j.server.server.model.skill.L1SkillId.VENOM_RESIST;
import static l1j.server.server.model.skill.L1SkillId.WEAKNESS;
import static l1j.server.server.model.skill.L1SkillId.WIND_SHACKLE;
import static l1j.server.server.model.skill.L1SkillId.레벨업보너스;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import l1j.server.Config;
import l1j.server.L1DatabaseFactory;
import l1j.server.GameSystem.AttendanceController;
import l1j.server.GameSystem.Boss.BossAlive;
import l1j.server.IndunSystem.MiniGame.BattleZone;
import l1j.server.server.Account;
import l1j.server.server.ActionCodes;
import l1j.server.server.GameClient;
import l1j.server.server.GameServer;
import l1j.server.server.GeneralThreadPool;
import l1j.server.server.SkillCheck;
import l1j.server.server.Controller.InvSwapController;
import l1j.server.server.Controller.LoginController;
import l1j.server.server.Controller.RankingTimeController;
import l1j.server.server.Controller.WarTimeController;
import l1j.server.server.datatables.AccountAttendanceTable;
import l1j.server.server.datatables.CharacterTable;
import l1j.server.server.datatables.GetBackRestartTable;
import l1j.server.server.datatables.MonsterBookTable;
import l1j.server.server.datatables.RankTable;
import l1j.server.server.datatables.SkillsTable;
import l1j.server.server.datatables.SpamTable;
import l1j.server.server.datatables.WeekQuestTable;
import l1j.server.server.model.Getback;
import l1j.server.server.model.L1AccountAttendance;
import l1j.server.server.model.L1CastleLocation;
import l1j.server.server.model.L1Clan;
import l1j.server.server.model.L1ClanMatching;
import l1j.server.server.model.L1Cooking;
import l1j.server.server.model.L1ExcludingList;
import l1j.server.server.model.L1PolyMorph;
import l1j.server.server.model.L1Quest;
import l1j.server.server.model.L1Rank;
import l1j.server.server.model.L1Teleport;
import l1j.server.server.model.L1War;
import l1j.server.server.model.L1World;
import l1j.server.server.model.Instance.L1ItemInstance;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.Instance.L1SummonInstance;
import l1j.server.server.model.gametime.RealTimeClock;
import l1j.server.server.model.skill.L1SkillId;
import l1j.server.server.model.skill.L1SkillUse;
import l1j.server.server.monitor.LoggerInstance;
import l1j.server.server.serverpackets.S_ACTION_UI;
import l1j.server.server.serverpackets.S_ACTION_UI2;
import l1j.server.server.serverpackets.S_AddSkill;
import l1j.server.server.serverpackets.S_Attendance;
import l1j.server.server.serverpackets.S_BookMarkLoad;
import l1j.server.server.serverpackets.S_CharStat;
import l1j.server.server.serverpackets.S_CharVisualUpdate;
import l1j.server.server.serverpackets.S_CharacterConfig;
import l1j.server.server.serverpackets.S_ChatPacket;
import l1j.server.server.serverpackets.S_ClanAttention;
import l1j.server.server.serverpackets.S_ElfIcon;
import l1j.server.server.serverpackets.S_EventNotice;
import l1j.server.server.serverpackets.S_FairlyConfig;
import l1j.server.server.serverpackets.S_HPUpdate;
import l1j.server.server.serverpackets.S_InvList;
import l1j.server.server.serverpackets.S_InventorySwap;
import l1j.server.server.serverpackets.S_Karma;
import l1j.server.server.serverpackets.S_Liquor;
import l1j.server.server.serverpackets.S_MPUpdate;
import l1j.server.server.serverpackets.S_MapID;
import l1j.server.server.serverpackets.S_MatizAlarm;
import l1j.server.server.serverpackets.S_MatizBuff;
import l1j.server.server.serverpackets.S_MatizCloudia;
import l1j.server.server.serverpackets.S_Message_YN;
import l1j.server.server.serverpackets.S_MonsterBookUI;
import l1j.server.server.serverpackets.S_NewCreateItem;
import l1j.server.server.serverpackets.S_NewSkillIcon;
import l1j.server.server.serverpackets.S_OwnCharAttrDef;
import l1j.server.server.serverpackets.S_OwnCharPack;
import l1j.server.server.serverpackets.S_OwnCharStatus;
import l1j.server.server.serverpackets.S_OwnCharStatus2;
import l1j.server.server.serverpackets.S_PacketBox;
import l1j.server.server.serverpackets.S_ReturnedStat;
import l1j.server.server.serverpackets.S_SPMR;
import l1j.server.server.serverpackets.S_ServerMessage;
import l1j.server.server.serverpackets.S_SkillBrave;
import l1j.server.server.serverpackets.S_SkillHaste;
import l1j.server.server.serverpackets.S_SkillIconGFX;
import l1j.server.server.serverpackets.S_SkillSound;
import l1j.server.server.serverpackets.S_SummonPack;
import l1j.server.server.serverpackets.S_SystemMessage;
import l1j.server.server.serverpackets.S_UnityIcon;
import l1j.server.server.serverpackets.S_Unknown1;
import l1j.server.server.serverpackets.S_War;
import l1j.server.server.serverpackets.S_Weather;
import l1j.server.server.serverpackets.S_WeekQuest;
import l1j.server.server.serverpackets.S_Weight;
import l1j.server.server.serverpackets.S_Ranking2;
import l1j.server.server.serverpackets.S_ArdenStore;
import l1j.server.server.templates.L1BookMark;
import l1j.server.server.templates.L1GetBackRestart;
import l1j.server.server.templates.L1Skills;
import l1j.server.server.utils.CheckInitStat;
import l1j.server.server.utils.SQLUtil;
import l1j.server.server.utils.SystemUtil;
import manager.LinAllManager;

public class C_LoginToServer extends ClientBasePacket {
	/** 날짜 및 시간 기록 **/
	Calendar rightNow = Calendar.getInstance();
	int day = rightNow.get(Calendar.DATE);
	int hour = rightNow.get(Calendar.HOUR);
	int min = rightNow.get(Calendar.MINUTE);
	int sec = rightNow.get(Calendar.SECOND);
	int year = rightNow.get(Calendar.YEAR);
	int month = rightNow.get(Calendar.MONTH) + 1;
	String totime = "[" + year + ":" + month + ":" + day + "]";
	String totime1 = "[" + hour + ":" + min + ":" + sec + "]";
	String date = +year + "_" + month + "_" + day;

	class BuffInfo {
		public int skillId;
		public int remainTime;
		public int polyId;
	}

	private static final String C_LOGIN_TO_SERVER = "[C] C_LoginToServer";
	private static Logger _log = Logger.getLogger(C_LoginToServer.class.getName());

	public C_LoginToServer(byte abyte0[], GameClient client) throws FileNotFoundException, Exception {
		super(abyte0);

		Calendar cal = Calendar.getInstance();
		int 시간 = Calendar.HOUR;
		int 분 = Calendar.MINUTE;
		/** 0 오전 , 1 오후 * */
		String 오전오후 = "오후";
		if (cal.get(Calendar.AM_PM) == 0) {
			오전오후 = "오전";
		}

		String login = client.getAccountName();
		String charName = readS();
		L1PcInstance pc = L1PcInstance.load(charName);
		Account account = Account.load(pc.getAccountName());

		if (client.getAccount() == null) {
			System.out.println("─────────────────────────────────");
			System.out.println("계정 Null 접속 시도 " + charName);
			System.out.println("─────────────────────────────────");
			client.kick();
			client.close();
			return;
		}

		if (client.getActiveChar() != null) {
			System.out.println("─────────────────────────────────");
			System.out.println("동일 ID의 중복 접속이므로 (" + client.getIp() + ")의 접속을 강제 종료합니다. #1");
			System.out.println("─────────────────────────────────");
			client.close();
			return;
		}
		GameClient clientByAccount = LoginController.getInstance().getClientByAccount(login);

		if (clientByAccount == null || clientByAccount != client) {
			System.out.println("─────────────────────────────────");
			System.out.println("동일 Account의 중복 접속이므로 (" + client.getIp() + ")의 접속을 강제 종료합니다. #1");
			System.out.println("─────────────────────────────────");
			client.close();
			return;
		}

		/** 2캐릭 버그 방지 Start */
		L1PcInstance OtherPc = L1World.getInstance().getPlayer(charName);

		if (OtherPc != null) {
			boolean isPrivateShop = OtherPc.isPrivateShop();
			boolean isAutoclanjoin = OtherPc.isAutoClanjoin();
			GameServer.disconnectChar(OtherPc);
			OtherPc = null;
			if (isPrivateShop == false && isAutoclanjoin==false) {
				System.out.println("─────────────────────────────────");
				System.out.println("동일 ID의 중복 접속이므로 (" + client.getIp() + ")의 접속을 강제 종료합니다. #2");
				System.out.println("─────────────────────────────────");
				client.kick();
				return;
			}
		}

		Collection<L1PcInstance> pcs = L1World.getInstance().getAllPlayers();
		for (L1PcInstance bugpc : pcs) {
			if (bugpc.getAccountName().equals(client.getAccountName())) {
				if ((!bugpc.isPrivateShop() && !bugpc.isAutoClanjoin()) || bugpc.getNetConnection() != null) {
					System.out.println("─────────────────────────────────");
					System.out.println("동일 Account의 중복 접속이므로 (" + client.getIp() + ")의 접속을 강제 종료합니다.");
					System.out.println("─────────────────────────────────");
					client.kick();
					GameServer.disconnectChar(bugpc);
				}
			}
		}
		pcs = null;
		/** 2캐릭 버그 방지 End */

		if ((pc == null) || !login.equals(pc.getAccountName())) {
			System.out.println("─────────────────────────────────");
			System.out.println("현재 계정에 없는 캐릭 접속시도 : " + charName + " 계정 : " + client.getAccountName());
			System.out.println("─────────────────────────────────");
			client.kick();
			client.close();
			return;
		}

		if (!pc.isGm() && Config.LEVEL_DOWN_RANGE != 0) {
			if (pc.getHighLevel() - pc.getLevel() >= Config.LEVEL_DOWN_RANGE) {
				System.out.println("─────────────────────────────────");
				_log.info("렙다운 허용범위 초과: " + charName + " 계정= " + login + " host=" + client.getIp());
				System.out.println("─────────────────────────────────");
				client.kick();
				return;
			}
		}

		System.out.println("[" + 오전오후 + "] [" + cal.get(시간) + "시] [" + cal.get(분) + "분] [" + "" + charName + "]  [" + login + "]  [" + client.getIp()
				+ "]  메모리:[" + SystemUtil.getUsedMemoryMB() + "]");

		/** 로그파일저장 **/
		LoggerInstance.getInstance().addConnection("접속 캐릭=" + charName + "	계정=" + login + "	IP=" + client.getHostname());

		
		pc.setOnlineStatus(1);
		CharacterTable.updateOnlineStatus(pc);
		L1World.getInstance().storeObject(pc);

		pc.setNetConnection(client);
		client.setActiveChar(pc);

		pc.sendPackets(new S_Unknown1(pc));
		

		if (Config.CHARACTER_CONFIG_IN_SERVER_SIDE && pc.isWarrior()) {
			pc.sendPackets(new S_CharacterConfig(pc.getId()));
		}
		

		loadItems(pc, false);
		sendItemPacket(pc);

		int[] skillList = loadSkills(pc);
		sendSkillPacket(pc, skillList);

		
		L1BookMark.bookmarkDB(pc);
		pc.sendPackets(new S_BookMarkLoad(pc));
		WeekQuestTable.getInstance().loadCharacterQuestData(pc);
		
		// 엘릭서 섭취량 로드
		pc.sendPackets(new S_ACTION_UI2(S_ACTION_UI2.Elixir, pc.getElixirStats()));
		


		GetBackRestartTable gbrTable = GetBackRestartTable.getInstance();
		L1GetBackRestart[] gbrList = gbrTable.getGetBackRestartTableList();
		for (L1GetBackRestart gbr : gbrList) {
			if (pc.getMapId() == gbr.getArea()) {
				pc.setX(gbr.getLocX());
				pc.setY(gbr.getLocY());
				pc.setMap(gbr.getMapId());
				break;
			}
		}

		// altsettings.properties로 GetBack가 true라면 거리에 이동시킨다
		if (Config.GET_BACK) {
			int[] loc = Getback.GetBack_Location(pc, true);
			pc.setX(loc[0]);
			pc.setY(loc[1]);
			pc.setMap((short) loc[2]);
		}

		// 전쟁중의 기내에 있었을 경우, 성주 혈맹이 아닌 경우는 귀환시킨다.
		int castle_id = L1CastleLocation.getCastleIdByArea(pc);
		if (pc.getMapId() == 66) {
			castle_id = 6;
		}
		if (0 < castle_id) {
			if (WarTimeController.getInstance().isNowWar(castle_id)) {
				L1Clan clan = L1World.getInstance().getClan(pc.getClanname());
				if (clan != null && clan.getCastleId() != castle_id) {
					int[] loc = new int[3];
					loc = L1CastleLocation.getGetBackLoc(castle_id);
					pc.setX(loc[0]);
					pc.setY(loc[1]);
					pc.setMap((short) loc[2]);
					loc = null;
				} else if (pc.getMapId() == 4) {
					int[] loc = new int[3];
					loc = L1CastleLocation.getGetBackLoc(castle_id);
					pc.setX(loc[0]);
					pc.setY(loc[1]);
					pc.setMap((short) loc[2]);
					loc = null;
				}
			}
		}

		pc.beginGameTimeCarrier();

		pc.sendPackets(new S_OwnCharStatus(pc));
		pc.sendPackets(new S_MapID(pc.getMap().getBaseMapId(), pc.getMap().isUnderwater()));
		pc.sendPackets(new S_Weather(L1World.getInstance().getWeather()));

		pc.sendPackets(new S_ReturnedStat(S_ReturnedStat.RING_RUNE_SLOT, S_ReturnedStat.SUBTYPE_RUNE, 1));
		
		pc.sendPackets(new S_OwnCharPack(pc));

		loadItems(pc, true);

		L1World.getInstance().addVisibleObject(pc);

		// XXX 타이틀 정보는 S_OwnCharPack에 포함되므로 아마 불요
		pc.sendPackets(new S_PacketBox(S_PacketBox.INIT_DODGE, 0x0000));
		pc.sendPackets(new S_PacketBox(S_PacketBox.DODGE, 0));

		List<BuffInfo> buffList = loadBuff(pc);
		processBuff(pc, buffList);

		// 고정신청한경우 pc방 보안 버프효과
		if (account.getphone() == null || (account.getphone().equalsIgnoreCase(""))) {
			pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[명령어] .고정신청 설정시 보안 버프 발동."));
		} else {
			보안버프(pc);
		}

		pc.sendPackets(new S_ReturnedStat(pc, S_ReturnedStat.UI4));
		pc.sendPackets(new S_ReturnedStat(pc, S_ReturnedStat.UI5));

		pc.sendVisualEffectAtLogin(); // 크라운, 독, 수중등의 시각 효과를 표
		pc.getLight().turnOnOffLight();
		pc.sendPackets(new S_SPMR(pc));
		pc.sendPackets(new S_PacketBox(32, 1));
		pc.sendPackets(new S_ReturnedStat(pc, S_ReturnedStat.LOGIN));
		// pc.sendPackets(new S_PacketBox(S_PacketBox.몰라2));

		L1ItemInstance weapon = pc.getWeapon();
		if (weapon != null) {
			int range = 1;
			int poly = pc.getTempCharGfx();
			if (weapon.getItem().getType() == 4) { // 양손활
				range = 17;
			} else if ((weapon.getItem().getType() == 10) || (weapon.getItem().getType() == 13)) {// 건들렛,한손활
				range = 14;
			} else if (weapon.getItem().getType() == 5 || weapon.getItem().getType() == 14 || weapon.getItem().getType() == 18) {
				if (poly == 11330||poly == 11344|| poly == 11351||poly == 11368||poly == 11376||poly == 11447|| 
						poly == 12237||poly == 0 ||poly == 61|| poly == 138||poly == 734||poly == 2786|| poly == 6658||
						poly == 6671||poly == 12490||poly == 1||poly == 48||poly == 37||poly == 1186||poly == 2796||poly == 6661||
						poly == 6650||poly == 12494||poly == 13389||
						poly == 11408||poly == 11409||poly == 11410||poly == 11411||poly == 11412||poly == 11413||
						poly == 11414||poly == 11415||poly == 11416||poly == 11417||poly == 11418||poly == 11419||
						poly == 11420||poly == 11421||poly == 12542||poly == 12541 || poly == 13735 || poly == 13737
						|| poly == 14928 //82경비창
						|| poly == 13389 //85경비창
						) {
					range = 2;
					}
			} else {
				range = 1;
			}
			if (weapon.getItem().getType1() == 20) {
				if (weapon.getItem().getType() == 4)
					pc.sendPackets(new S_PacketBox(S_PacketBox.ATTACKABLE_DISTANCE, range, 3, true));
				else
					pc.sendPackets(new S_PacketBox(S_PacketBox.ATTACKABLE_DISTANCE, range, 3, true));
			} else {
				//
				int type = 7;
				boolean bow_or_tohand = false;
				if (weapon.getItem().getType() == 3) {
					type = 1;
					bow_or_tohand = true;
				} else if (weapon.getItem().getType() == 11) {
					type = 2;
					bow_or_tohand = true;
				} else if (weapon.getItem().getType() == 12) {
					type = 4;
					bow_or_tohand = true;
				} else if (pc.isDragonknight()) {
					type = 10;
					bow_or_tohand = true;
				}
				//
				pc.sendPackets(new S_PacketBox(S_PacketBox.ATTACKABLE_DISTANCE, range, type, bow_or_tohand));
			}
		} else {
			pc.sendPackets(new S_PacketBox(S_PacketBox.ATTACKABLE_DISTANCE, 1, 0, false));
		}

		pc.sendClanMarks();// 성혈군주 왕관표시
		pc.sendPackets(new S_SPMR(pc));
		
		

		// pc.startMpRegeneration();
		pc.startObjectAutoUpdate();
		client.CharReStart(false);
		pc.beginExpMonitor();
		// 존재버그 관련 추가
		L1PcInstance jonje = L1World.getInstance().getPlayer(pc.getName());
		if (jonje == null) {
			pc.sendPackets(new S_SystemMessage("존재버그 강제종료! 재접속하세요"));
			client.kick();
			return;
		}

		if (pc.getCurrentHp() > 0) {
			pc.setDead(false);
			pc.setStatus(0);
		} else {
			pc.setDead(true);
			pc.setStatus(ActionCodes.ACTION_Die);
		}

		if (pc.getLevel() >= 51 && pc.getLevel() - 50 > pc.getBonusStats() && pc.getAbility().getAmount() < 150) {
			int upstat = (pc.getLevel() - 50) - (pc.getBonusStats());
			String s = Integer.toString(upstat);
			pc.sendPackets(new S_Message_YN(479, s));
		}

		if (pc.getReturnStat() != 0) {
			L1SkillUse l1skilluse = new L1SkillUse();
			l1skilluse.handleCommands(pc, L1SkillId.CANCELLATION, pc.getId(), pc.getX(), pc.getY(), null, 0, L1SkillUse.TYPE_LOGIN);

			if (pc.getWeapon() != null) {
				pc.getInventory().setEquipped(pc.getWeapon(), false, false, false, false);
			}

			pc.sendPackets(new S_CharVisualUpdate(pc));
			pc.sendPackets(new S_OwnCharStatus2(pc));

			for (L1ItemInstance armor : pc.getInventory().getItems()) {
				for (int type = 0; type <= 12; type++) {
					if (armor != null) {
						pc.getInventory().setEquipped(armor, false, false, false, false);
					}
				}
			}
			pc.sendPackets(new S_SPMR(pc));
			pc.sendPackets(new S_OwnCharAttrDef(pc));
			pc.sendPackets(new S_OwnCharStatus2(pc));
			pc.sendPackets(new S_ReturnedStat(pc, S_ReturnedStat.START));
			try {
				pc.save();
			} catch (Exception e) {
				System.out.println("스텟초기화에러");
			}
		}

		pc.sendPackets(new S_PacketBox(S_PacketBox.INVENTORY_SAVE));
		if (Config.CHARACTER_CONFIG_IN_SERVER_SIDE && !pc.isWarrior()) {
			pc.sendPackets(new S_CharacterConfig(pc.getId()));
		}
		

		pc.setCryOfSurvivalTime();

		pc.getInventory().consumeItem(810006);
		pc.getInventory().consumeItem(810007);

		serchSummon(pc);

		WarTimeController.getInstance().checkCastleWar(pc);
		L1Clan clan = L1World.getInstance().getClan(pc.getClanname());

		// 온라인 알리기.
		if (clan != null)
			clan.updateClanMemberOnline(pc);

		if (pc.getClanid() != 0) { // 크란 소속중
			if (clan != null) {
				if (clan.getBless() != 0) {
					new L1SkillUse().handleCommands(pc, 504 + clan.getBless(), pc.getId(), pc.getX(), pc.getY(), null, clan.getBuffTime()[clan.getBless() - 1], L1SkillUse.TYPE_LOGIN);					
				}
				pc.sendPackets(new S_ACTION_UI(clan.getClanName(), pc.getClanRank()));
				pc.sendPackets(new S_PacketBox(S_PacketBox.PLEDGE_EMBLEM_STATUS, pc.getClan().getEmblemStatus()));
				if (clan.getGazeSize() != 0) {
					pc.sendPackets(new S_ClanAttention(clan.getGazeSize(), clan.getGazeList()));
				}
				if (pc.getClanid() == clan.getClanId() && 
						// 크란을 해산해, 재차, 동명의 크란이 창설되었을 때의 대책
						pc.getClanname().toLowerCase().equals(clan.getClanName().toLowerCase())) {
					for (L1PcInstance clanMember : clan.getOnlineClanMember()) {
						if (clanMember.getId() != pc.getId()) {
							clanMember.sendPackets(new S_ServerMessage(843, pc.getName())); 
							// 지금, 혈맹원의%0%s가게임에접속했습니다.
						}
					}

					// 전전쟁 리스트를 취득
					for (L1War war : L1World.getInstance().getWarList()) {
						boolean ret = war.CheckClanInWar(pc.getClanname());
						if (ret) { // 전쟁에 참가중
							String enemy_clan_name = war.GetEnemyClanName(pc.getClanname());
							if (enemy_clan_name != null) {
								// 당신의 혈맹이 현재_혈맹과 교전중입니다.
								pc.sendPackets(new S_War(8, pc.getClanname(), enemy_clan_name));
							}
							break;
						}
					}
				} else {
					pc.setClanid(0);
					pc.setClanname("");
					pc.setClanRank(0);
					pc.save(); // DB에 캐릭터 정보를 기입한다
				}
			} else {
				pc.setClanid(0);
				pc.setClanname("");
				pc.setClanRank(0);
				pc.save(); // DB에 캐릭터 정보를 기입한다
			}
		}

		if (pc.getPartnerId() != 0) { // 결혼중
			L1PcInstance partner = (L1PcInstance) L1World.getInstance().findObject(pc.getPartnerId());
			if (partner != null && partner.getPartnerId() != 0) {
				if (pc.getPartnerId() == partner.getId() && partner.getPartnerId() == pc.getId()) {
					pc.sendPackets(new S_ServerMessage(548));
					// 당신의 파트너는 지금게임중입니다.
					partner.sendPackets(new S_ServerMessage(549));
					// 당신의 파트너는 방금로그인했습니다.
				}
			}
		}

		int tamcount = pc.tamcount();
		if (tamcount > 0) {
			long tamtime = pc.TamTime();

			int aftertamtime = (int) tamtime;
			pc.sendPackets(new S_NewCreateItem(S_NewCreateItem.BUFF_WINDOW, tamtime, tamcount, true));
			if (aftertamtime < 0) {
				aftertamtime = 0;
			}

			if (tamcount == 1) {
				pc.setSkillEffect(Tam_Fruit1,
						aftertamtime);
				pc.getAC().addAc(-1);
			} else if (tamcount == 2) {
				pc.setSkillEffect(Tam_Fruit2,
						aftertamtime);
				pc.getAC().addAc(-2);
			} else if (tamcount == 3) {
				pc.setSkillEffect(Tam_Fruit3,
						aftertamtime);
				pc.getAC().addAc(-3);
			}else if (tamcount == 4) {
				pc.setSkillEffect(Tam_Fruit4,
						aftertamtime);
				pc.getAC().addAc(-4);
			}else if (tamcount == 5) {
				pc.setSkillEffect(Tam_Fruit5,
						aftertamtime);
				pc.getAC().addAc(-5);
			}

			pc.sendPackets(new S_OwnCharStatus(pc));
		}

		pc.setSkillEffect(SetBuff, 30 * 1000);
		if (pc.getLevel() < Config.NEW_PLAYER) {// 바포메트 시스템 관련 처리
			pc.sendPackets(new S_PacketBox(S_PacketBox.BAPO, 6, true));
			pc.setNBapoLevel(7);
		}
		
		//InvSwapController.getInstance().toWorldJoin(pc); //스왑
		InvSwapController.getInstance().toWorldJoin(pc); //스왑
		
		// 아인하사드
		
		if (pc.getLevel() > 5) {
			int einhasad = pc.getEinhasad() + (int) (System.currentTimeMillis() - pc.getLastLoginTime().getTime()) / (15 * 60 * 1000);
			if (einhasad > 7000000) {
				einhasad = 7000000;
			}
			pc.setEinhasad(einhasad);

			if (pc.getZoneType() == 1) {
				pc.startEinhasadTimer();
			}
			if (einhasad > 0) {
				pc.sendPackets(new S_PacketBox(S_PacketBox.EINHASAD, einhasad));
			}
		}

		long sysTime = System.currentTimeMillis();

		if (pc.getAccount().getBuff_HPMP() != null) {
			if (sysTime <= pc.getAccount().getBuff_HPMP().getTime()) {
				long bufftime = pc.getAccount().getBuff_HPMP().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_활력);
				pc.setSkillEffect(L1SkillId.강화버프_활력, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("활력", (long) bufftime), true);
				pc.addMaxHp(50);
				pc.addMaxMp(50);
				pc.addWeightReduction(3);
				pc.sendPackets(new S_HPUpdate(pc));
				pc.sendPackets(new S_MPUpdate(pc.getCurrentMp(), pc.getMaxMp()));
			}
		}

		if (pc.getAccount().getBuff_DMG() != null) {
			if (sysTime <= pc.getAccount().getBuff_DMG().getTime()) {
				long bufftime = pc.getAccount().getBuff_DMG().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_공격);
				pc.setSkillEffect(L1SkillId.강화버프_공격, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("공격", (long) bufftime), true);
				pc.addDmgup(1);
				pc.addBowDmgup(1);
			}
		}

		if (pc.getAccount().getBuff_REDUC() != null) {
			if (sysTime <= pc.getAccount().getBuff_REDUC().getTime()) {
				long bufftime = pc.getAccount().getBuff_REDUC().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_방어);
				pc.setSkillEffect(L1SkillId.강화버프_방어, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("방어", (long) bufftime), true);
				pc.addDamageReductionByArmor(1);
			}
		}

		if (pc.getAccount().getBuff_MAGIC() != null) {
			if (sysTime <= pc.getAccount().getBuff_MAGIC().getTime()) {
				long bufftime = pc.getAccount().getBuff_MAGIC().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_마법);
				pc.setSkillEffect(L1SkillId.강화버프_마법, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("마법", (long) bufftime), true);
				pc.getAbility().addSp(1);
				pc.sendPackets(new S_SPMR(pc));
			}
		}

		if (pc.getAccount().getBuff_STUN() != null) {
			if (sysTime <= pc.getAccount().getBuff_STUN().getTime()) {
				long bufftime = pc.getAccount().getBuff_STUN().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_스턴);
				pc.setSkillEffect(L1SkillId.강화버프_스턴, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("스턴", (long) bufftime), true);
				pc.getResistance().addStun(2);
			}
		}

		if (pc.getAccount().getBuff_HOLD() != null) {
			if (sysTime <= pc.getAccount().getBuff_HOLD().getTime()) {
				long bufftime = pc.getAccount().getBuff_HOLD().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_홀드);
				pc.setSkillEffect(L1SkillId.강화버프_홀드, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("홀드", (long) bufftime), true);
				pc.getResistance().addHold(2);
			}
		}
		if (pc.getAccount().getBuff_STR() != null) {
			if (sysTime <= pc.getAccount().getBuff_STR().getTime()) {
				long bufftime = pc.getAccount().getBuff_STR().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_힘);
				pc.setSkillEffect(L1SkillId.강화버프_힘, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("힘", (long) bufftime), true);
				pc.getAbility().addAddedStr(1);
				pc.sendPackets(new S_OwnCharStatus2(pc), true);
			}
		}
		if (pc.getAccount().getBuff_DEX() != null) {
			if (sysTime <= pc.getAccount().getBuff_DEX().getTime()) {
				long bufftime = pc.getAccount().getBuff_DEX().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_덱스);
				pc.setSkillEffect(L1SkillId.강화버프_덱스, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("덱스", (long) bufftime), true);
				pc.getAbility().addAddedDex(1);
				pc.sendPackets(new S_OwnCharStatus2(pc), true);
			}
		}
		if (pc.getAccount().getBuff_INT() != null) {
			if (sysTime <= pc.getAccount().getBuff_INT().getTime()) {
				long bufftime = pc.getAccount().getBuff_INT().getTime() - sysTime;
				pc.removeSkillEffect(L1SkillId.강화버프_인트);
				pc.setSkillEffect(L1SkillId.강화버프_인트, (int) bufftime);
				pc.sendPackets(new S_ACTION_UI2("인트", (long) bufftime), true);
				pc.getAbility().addAddedInt(1);
				pc.sendPackets(new S_OwnCharStatus2(pc), true);
			}
		}
		/*if (pc.getNetConnection().getAccount().getDragonRaid() != null) {
			if (sysTime <= pc.getNetConnection().getAccount()
					.getDragonRaid().getTime()) {
				long BloodTime = pc.getNetConnection().getAccount()
						.getDragonRaid().getTime()
						- sysTime;
				pc.removeSkillEffect(
						L1SkillId.VALA_BUFF);
				pc.setSkillEffect(
						L1SkillId.VALA_BUFF, (int) BloodTime);
				//pc.sendPackets(new S_PacketBox(S_PacketBox.드래곤레이드버프,(int) BloodTime / 1000), true);
				pc.sendPackets(new S_PacketBox(S_PacketBox.DRAGONBLOOD, 88, (int) BloodTime/1000));
			}
		}*/

		if (pc.getInventory().checkItem(30044, 1) && pc.getLevel() < 45) {
			// 빛나는구슬
			pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "퀘스트 시작: 은기사 마을 토벌대원을 만나서 시작"));
		} else if (pc.getInventory().checkItem(30046, 1) && (pc.getLevel() > 45 && pc.getLevel() < 52)) {
			// 영롱한 구슬
			pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "퀘스트 시작: 은기사 마을 드래곤뼈 수집꾼을 만나서 시작"));
		}
		if (Config.STANDBY_SERVER) {
			pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "현재 오픈대기 상태로 경험치가 없습니다."));
			pc.sendPackets(new S_ChatPacket(pc, "현재 오픈대기 상태로 경험치가 없습니다."));
		}
		/** 차단 리스트 불러오기 **/
		L1ExcludingList exList = SpamTable.getInstance().getExcludeTable(pc.getId());
		if (exList != null) {
			setExcludeList(pc, exList);
		}
		/** 스탯 리뉴얼 표기 **/
		RenewStat(pc);

		/** 무게 게이지 **/
		pc.sendPackets(new S_Weight(pc));
		


		// manager.LogServerAppend("접속", pc, client.getIp(), 1);
		LinAllManager.getInstance().LogConnectAppend(pc.getName(), client.getHostname());
		

		// 서버 접속 알림 운영자만 보임
		for (L1PcInstance player : L1World.getInstance().getAllPlayers()) {
			if (player.isGm()) {
				 player.sendPackets(new S_SystemMessage("\\aD" + pc.getName() + "님 접속 \\aLIP:" + client.getIp() + " \\aF계정:"+ client.getAccountName()));
			}
		}

		// 3.63아이템패킷처리
		pc.isWorld = true;
		L1ItemInstance temp = null;
		try {
			// 착용한 아이템이 슬롯에 정상적으로 표현하도록 하기위해 임시로 작업함.
			for (L1ItemInstance item : pc.getInventory().getItems()) {
				temp = item;
				if (item.isEquipped())
					pc.getInventory().toSlotPacket(pc, item, true);

			}
		} catch (Exception e) {
			System.out.println("에러 남 의심되는 아이템은 ->> " + temp.getItem().getName());
		}
		DragonknightPolyCheck(pc);
		ClanMatching(pc);
		Clanclan(pc);

		/** 배틀존 **/
		if (pc.getMapId() == 5153) {
			if (!BattleZone.getInstance().getDuelOpen()) {
				if (pc.get_DuelLine() != 0) {
					pc.set_DuelLine(0);
				}
				new L1Teleport().teleport(pc, 33090, 33402, (short) 4, 0, true);
			} else {
				if (pc.get_DuelLine() == 0) {
					new L1Teleport().teleport(pc, 33090, 33402, (short) 4, 0, true);
				}
			}
		} else {
			if (pc.get_DuelLine() != 0) {
				pc.set_DuelLine(0);
			}
		}

		/** 몽섬리뉴얼 **/
		if (pc.getMap().getBaseMapId() == 1936) {
			new L1Teleport().teleport(pc, 33968, 32961, (short) 4, 2, true);
		}
		/** 카이저 훈련소 **/
		if (pc.getMap().getBaseMapId() == 1400) {
			new L1Teleport().teleport(pc, 33491, 32762, (short) 4, 0, true);
		}
		/** 화룡의 안식처 **/
		if (pc.getMap().getBaseMapId() == 2600 || pc.getMap().getBaseMapId() == 2699) {
			new L1Teleport().teleport(pc, 33705, 32504, (short) 4, 0, true);
		}
		/** 정령의무덤 **/
		if (pc.getMapId() == 430) {
			new L1Teleport().teleport(pc, 32779, 32831, (short) 622, 0, true);
		}
		if (pc.getMapId() == 514) {
			new L1Teleport().teleport(pc, 33435, 32814, (short) 4, 0, true);
		}

		// 얼던맵 기
		if (pc.getMapId() >= 2101 && pc.getMapId() <= 2151 || pc.getMapId() >= 2151 && pc.getMapId() <= 2201) {
			new L1Teleport().teleport(pc, 33442, 32809, (short) 4, 5, false);
		}

		// 화염의 막대/신비한 회복 물약 삭제.
		if (!(pc.getMapId() >= 2101 && pc.getMapId() <= 2151 || pc.getMapId() >= 2151 && pc.getMapId() <= 2201)) {
			for (L1ItemInstance item : pc.getInventory().getItems()) {
				if (item.getItemId() == 30055 || item.getItemId() == 30056) {
					if (item != null) {
						pc.getInventory().removeItem(item, item.getCount());
					}
				}
			}
		}

		if (pc.getClanname() != null && pc.getClanid() > 0) {
			if (pc.getClan().getClanExp() >= Config.CLAN_EXP_ONE && pc.getClan().getClanExp() < Config.CLAN_EXP_TWO) { // 혈맹1레벨
				pc.sendPackets(new S_PacketBox(S_PacketBox.UNLIMITED_ICON1, 154, true));
				pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[" + pc.getClan().getClanName() + "]혈맹 1레벨버프적용"));
			}
			if (pc.getClan().getClanExp() >= Config.CLAN_EXP_TWO && pc.getClan().getClanExp() < Config.CLAN_EXP_THREE) { // 혈맹2레벨
				pc.sendPackets(new S_PacketBox(S_PacketBox.UNLIMITED_ICON1, 155, true));
				pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[" + pc.getClan().getClanName() + "]혈맹 2레벨버프적용"));
				pc.addDmgup(1);
				pc.addBowDmgup(1);
				pc.getAC().addAc(-1);
			}
			if (pc.getClan().getClanExp() >= Config.CLAN_EXP_THREE && pc.getClan().getClanExp() < Config.CLAN_EXP_FOUR) { // 혈맹3레벨
				pc.sendPackets(new S_PacketBox(S_PacketBox.UNLIMITED_ICON1, 156, true));
				pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[" + pc.getClan().getClanName() + "]혈맹 3레벨버프적용"));
				pc.addDmgup(2);
				pc.addBowDmgup(2);
				pc.addDamageReductionByArmor(1);
				pc.getAC().addAc(-2);
			}
			if (pc.getClan().getClanExp() >= Config.CLAN_EXP_FOUR && pc.getClan().getClanExp() < Config.CLAN_EXP_FIVE) { // 혈맹4레벨
				pc.sendPackets(new S_PacketBox(S_PacketBox.UNLIMITED_ICON1, 157, true));
				pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[" + pc.getClan().getClanName() + "]혈맹 4레벨버프적용"));
				pc.addDmgup(3);
				pc.addBowDmgup(2);
				pc.addDamageReductionByArmor(3);
				pc.getAC().addAc(-4);
			}
			if (pc.getClan().getClanExp() >= Config.CLAN_EXP_FIVE && pc.getClan().getClanExp() < Config.CLAN_EXP_SIX) { // 혈맹5레벨
				pc.sendPackets(new S_PacketBox(S_PacketBox.UNLIMITED_ICON1, 158, true));
				pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[" + pc.getClan().getClanName() + "]혈맹 5레벨버프적용"));
				pc.addDmgup(4);
				pc.addBowDmgup(4);
				pc.addDamageReductionByArmor(5);
				pc.getAC().addAc(-6);
			}
			if (pc.getClan().getClanExp() >= Config.CLAN_EXP_SIX && pc.getClan().getClanExp() < Config.CLAN_EXP_SEVEN) { // 혈맹6레벨
				pc.sendPackets(new S_PacketBox(S_PacketBox.UNLIMITED_ICON1, 159, true));
				pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[" + pc.getClan().getClanName() + "]혈맹 6레벨버프적용"));
				pc.addDmgup(6);
				pc.addBowDmgup(6);
				pc.addHitup(5);
				pc.addBowHitup(5);
				pc.addDamageReductionByArmor(7);
				pc.getAC().addAc(-8);
			}
			if (pc.getClan().getClanExp() >= Config.CLAN_EXP_SEVEN) { // 혈맹7레벨
				pc.sendPackets(new S_PacketBox(S_PacketBox.UNLIMITED_ICON1, 160, true));
				pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[" + pc.getClan().getClanName() + "]혈맹 7레벨버프적용"));
				pc.addDmgup(8);
				pc.addBowDmgup(8);
				pc.addHitup(10);
				pc.addBowHitup(10);
				pc.addDamageReductionByArmor(10);
				pc.getAC().addAc(-10);
			}
		}
		// 로그인시 폭죽
		// welcome(pc);
		// 어비스 계급갱신
		Abyss(pc);
		// 페어리시스템
		pc.sendPackets(new S_FairlyConfig(pc));
		/** 세이프존패킷 **/
		safetyzone(pc);

		// 피씨방버프
		if (pc.getAccount().getBuff_PCRoom() != null) {
			if (sysTime <= pc.getAccount().getBuff_PCRoom().getTime()) {
				long 피씨타임 = pc.getAccount().getBuff_PCRoom().getTime() - sysTime;
				TimeZone seoul = TimeZone.getTimeZone("UTC");
				Calendar calendar = Calendar.getInstance(seoul);
				calendar.setTimeInMillis(피씨타임);
				int d = calendar.get(Calendar.DATE) - 1;
				int h = calendar.get(Calendar.HOUR_OF_DAY);
				int m = calendar.get(Calendar.MINUTE);
				int sc = calendar.get(Calendar.SECOND);

				if (d > 0) {
					pc.sendPackets(new S_SystemMessage("[PC방 이용 시간] " + d + "일 " + h + "시간 " + m + "분 " + sc + "초 남았습니다."));
				} else if (h > 0) {
					pc.sendPackets(new S_SystemMessage("[PC방 이용 시간] " + h + "시간 " + m + "분 " + sc + "초 남았습니다."));
				} else if (m > 0) {
					pc.sendPackets(new S_SystemMessage("[PC방 이용 시간] " + m + "분 " + sc + "초 남았습니다."));
				} else {
					pc.sendPackets(new S_SystemMessage("[PC방 이용 시간] " + sc + "초 남았습니다."));
				}
				pc.PC방_버프 = true;
				pc.sendPackets(new S_PacketBox(S_PacketBox.PC_ROOM_BUFF, 1));
			}
		} else {
			pc.PC방_버프 = false;
		}

		if (Config.아놀드이벤트) {
			pc.sendPackets(new S_PacketBox(S_PacketBox.GREEN_MESSAGE, "[이벤트 진행중] 돌아온 아놀드 이벤트"));
		}
		
		pc.sendPackets(new S_Attendance(S_Attendance.출석체크아이콘, 0, 0));
		pc.sendPackets(new S_Attendance(S_Attendance.출석리스트, 0, 0));// 일반
		pc.sendPackets(new S_Attendance(S_Attendance.출석리스트, 1, 0));// pc방
		
		L1AccountAttendance acc = AttendanceController.findacc(pc.getAccountName());
		if (acc == null) {

			AccountAttendanceTable.getInstance().load_account(pc);
		}
		AttendanceController.accsetPc(pc, pc.getAccountName(), 0);
		/*if(AttendanceController.findacc(pc.getAccountName()).checktype()==1)
			acc.getPc().sendPackets(new S_Attendance(acc, 0 , acc.getPc().PC방_버프));
		if(AttendanceController.findacc(pc.getAccountName()).checktypepc()==1)
			acc.getPc().sendPackets(new S_Attendance(acc, 1 , acc.getPc().PC방_버프));*/
		//pc.sendPackets(new S_EventNotice()); // 이벤트알람
		
		HashMap<Integer, Integer> mbq = MonsterBookTable.getInstace().getMonQuest(pc.getId());
		if (mbq != null)
			pc.sendPackets(new S_MonsterBookUI(S_MonsterBookUI.MONSTER_BOOK, mbq));
		else
			pc.sendPackets(new S_MonsterBookUI(S_MonsterBookUI.MONSTER_BOOK, null));

		HashMap<Integer, Integer> mbl = MonsterBookTable.getInstace().getMonBookList(pc.getId());
		if (mbl != null)
			pc.sendPackets(new S_MonsterBookUI(S_MonsterBookUI.MONSTER_LOAD, mbl));
		else
			pc.sendPackets(new S_MonsterBookUI(S_MonsterBookUI.MONSTER_LOAD, null));
		
		if (pc.PC방_버프) {
			pc.sendPackets(new S_ACTION_UI(S_ACTION_UI.PCBANG_SET, true));
		} else {
			pc.sendPackets(new S_ACTION_UI(S_ACTION_UI.PCBANG_SET, false));
		}
		
/*		if(pc.getWcount(0)==WeekQuestTable.getInstance().maxcount.get(0) && pc.getWcount(1)==WeekQuestTable.getInstance().maxcount.get(1) && pc.getWcount(2)==WeekQuestTable.getInstance().maxcount.get(2)){
			pc.setLineClear(0,true);
		}
		if(pc.getWcount(3)==WeekQuestTable.getInstance().maxcount.get(3) && pc.getWcount(4)==WeekQuestTable.getInstance().maxcount.get(4) && pc.getWcount(5)==WeekQuestTable.getInstance().maxcount.get(5)){
			pc.setLineClear(1,true);
		}
		if(pc.getWcount(6)==WeekQuestTable.getInstance().maxcount.get(6) && pc.getWcount(7)==WeekQuestTable.getInstance().maxcount.get(7) && pc.getWcount(8)==WeekQuestTable.getInstance().maxcount.get(8)){
			pc.setLineClear(2,true);
		}
		pc.sendPackets(new S_WeekQuest(pc)); */
		
		// 76반지 개방완료
		if (pc.getQuest().isEnd(L1Quest.QUEST_SLOT76)) {
			pc.sendPackets(new S_ReturnedStat(S_ReturnedStat.RING_RUNE_SLOT, S_ReturnedStat.SUBTYPE_RING, 1));
		}
		if (pc.getQuest().isEnd(L1Quest.QUEST_SLOT81)) { // 81반지 개방완료
			pc.sendPackets(new S_ReturnedStat(S_ReturnedStat.RING_RUNE_SLOT, S_ReturnedStat.SUBTYPE_RING, 2));
		}
		if (pc.getQuest().isEnd(L1Quest.QUEST_SLOT59)) {// 귀걸이 개방완료
			pc.sendPackets(new S_ReturnedStat(S_ReturnedStat.RING_RUNE_SLOT, S_ReturnedStat.SUBTYPE_RING, 16));
		}
		if (pc.getQuest().isEnd(L1Quest.QUEST_SLOT70)) {// 휘장 개방완료 
			pc.sendPackets(new S_ReturnedStat(S_ReturnedStat.RING_RUNE_SLOT, S_ReturnedStat.SUBTYPE_RING, 128));
		}
		if (pc.getQuest().isEnd(L1Quest.QUEST_SLOT83)) {// 견갑
			pc.sendPackets(new S_ReturnedStat(S_ReturnedStat.RING_RUNE_SLOT, S_ReturnedStat.SUBTYPE_RING, 64));
		}
		if (pc.getHellTime() > 0) {
			pc.beginHell(false);
		}
	
		huntoption(pc); // 수배효과
		
		
		if(BossAlive.getInstance().isErusabe){
			int time = (int)(BossAlive.getInstance().ezTime - RealTimeClock.getInstance().getRealTime().getSeconds());
			pc.sendPackets(new S_MatizAlarm(1,time,3600,true));	
		}
		if(BossAlive.getInstance().isSandWarm){
			int time = (int)(BossAlive.getInstance().sdTime - RealTimeClock.getInstance().getRealTime().getSeconds());
			pc.sendPackets(new S_MatizAlarm(2,time,3600,true));	
		}
			
		
		if (CheckMail(pc) > 0) {
			pc.sendPackets(new S_SkillSound(pc.getId(), 1091));
			pc.sendPackets(new S_ServerMessage(428)); // 편지가 도착했습니다.
		}
		pc.LoadCheckStatus();
		if (!CheckInitStat.CheckPcStat(pc)) {
			pc.sendPackets(new S_ReturnedStat(pc, S_ReturnedStat.START));
			return;
		}

		pc.sendPackets(new S_Karma(pc));
		
		pc.sendPackets(new S_ArdenStore(15, pc));
		

		int currentTime = (int) (System.currentTimeMillis() / 1000);
		if (pc.getSealScrollTime() > 0) {
			if (pc.getSealScrollTime() < currentTime) {
				// 인벤에 아이템 지급
				pc.getInventory().storeItem(50021, pc.getSealScrollCount());
				pc.setSealScrollTime(0);
				pc.setSealScrollCount(0);
				pc.save();
				pc.sendPackets(new S_ChatPacket(pc, "봉인해제 주문서가 지급되었습니다.", 1));
			} else {
				int remainMin = (pc.getSealScrollTime() - currentTime) / 60 + 1;
				int remainHour = remainMin / 60;
				remainMin -= remainHour * 60;
				int remainDay = remainHour / 24;
				remainHour -= remainDay * 24;
				pc.sendPackets(new S_ChatPacket(pc, "봉인해제주문서 지급까지 " + remainDay + "일 " + remainHour + "시간 " + remainMin + "분 남았습니다.", 1));
			}
		}
		/** 클라우디아**/
		if(pc.getLevel() <= 5){
			Thread.sleep(1000);
			pc.sendPackets(new S_MatizCloudia(0,pc.getLevel()));
			pc.sendPackets(new S_MatizCloudia(1));
		}else if(pc.getLevel()==8){
			pc.sendPackets(new S_MatizCloudia(1,0));
		}
	
	}
	
	private void loadItems(final L1PcInstance pc, boolean sendOption) {
		// DB로부터 캐릭터와 창고의 아이템을 읽어들인다
		if(sendOption)
			pc.getInventory().sendOptioon();
		else
			CharacterTable.getInstance().restoreInventory(pc);
		L1Rank rank = RankTable.getInstance().getRankByName(pc.getName());
		if (rank == null) {
			while (pc.getInventory().checkItem(5558));
		}
		GeneralThreadPool.getInstance().schedule(new Runnable() {
			@Override
			public void run() {
				L1Rank rank = RankTable.getInstance().getRankByName(pc.getName());
				if (rank == null) {
					pc.setRankLevel(0);
					while (pc.getInventory().checkItem(5558));
					return;
				}
				pc.setRankLevel(rank.getRankLevel());
				RankingTimeController.getInstance().setBuffEffect(pc, rank, 1);
				if (rank.getRankLevel() == 4) {
					if (!pc.getInventory().checkItem(5558)) {
						pc.getInventory().storeItem(5558, 1);
					}
					if (rank.getRankLevel() != 4) {
						return;
					}
					else {
						return;
					}
				} else {
					while (pc.getInventory().checkItem(5558)) {
						pc.getInventory() .consumeItem(5558);
					}
				}
			}
		}, 100L);//0.1초 
	}


	private void sendItemPacket(L1PcInstance pc) {
		pc.sendPackets(new S_InvList(pc.getInventory().getItems()));
		// pc.sendPackets(new S_InvList(pc));
	}

	/** Safetyzone 표시 **/
	private void safetyzone(L1PcInstance pc) {
		if (pc.getZoneType() == 0) {
			if (pc.getSafetyZone() == true) {
				pc.sendPackets(new S_ACTION_UI(S_ACTION_UI.SAFETYZONE, false));
				pc.setSafetyZone(false);
			}
		} else {
			if (pc.getSafetyZone() == false) {
				pc.sendPackets(new S_ACTION_UI(S_ACTION_UI.SAFETYZONE, true));
				pc.setSafetyZone(true);
			}
		}
	}
	
	private void huntoption(L1PcInstance pc) { // 해당맵 이펙트 보여주기
		if (pc.getHuntCount() != 0) {
			if (pc.isWizard() || pc.isBlackwizard()) {
				if (pc.getHuntPrice() == Config.수배1단) {
					pc.addSp(1);
					pc.sendPackets(new S_SPMR(pc));
					pc.sendPackets(new S_OwnCharAttrDef(pc));
					pc.sendPackets(new S_OwnCharStatus2(pc));
					pc.sendPackets(new S_OwnCharStatus(pc));
				} else if (pc.getHuntPrice() == Config.수배2단) {
					pc.addSp(2);
					pc.sendPackets(new S_SPMR(pc));
					pc.sendPackets(new S_OwnCharAttrDef(pc));
					pc.sendPackets(new S_OwnCharStatus2(pc));
					pc.sendPackets(new S_OwnCharStatus(pc));
				} else if (pc.getHuntPrice() == Config.수배3단) {
					pc.addSp(3);
					pc.sendPackets(new S_SPMR(pc));
					pc.sendPackets(new S_OwnCharAttrDef(pc));
					pc.sendPackets(new S_OwnCharStatus2(pc));
					pc.sendPackets(new S_OwnCharStatus(pc));
				}
			} else if (pc.isCrown() || pc.isKnight() || pc.isDarkelf() || pc.isDragonknight() || pc.isWarrior()) {
				if (pc.getHuntPrice() == Config.수배1단) {
					pc.addDmgup(1);
					pc.addBowDmgup(1);
					pc.sendPackets(new S_OwnCharAttrDef(pc));
					pc.sendPackets(new S_OwnCharStatus2(pc));
					pc.sendPackets(new S_OwnCharStatus(pc));
				} else if (pc.getHuntPrice() == Config.수배2단) {
					pc.addDmgup(2);
					pc.addBowDmgup(2);
					pc.sendPackets(new S_OwnCharAttrDef(pc));
					pc.sendPackets(new S_OwnCharStatus2(pc));
					pc.sendPackets(new S_OwnCharStatus(pc));
				} else if (pc.getHuntPrice() == Config.수배3단) {
					pc.addDmgup(3);
					pc.addBowDmgup(3);
					pc.sendPackets(new S_OwnCharAttrDef(pc));
					pc.sendPackets(new S_OwnCharStatus2(pc));
					pc.sendPackets(new S_OwnCharStatus(pc));
				}
			}
		}
	}

	private int CheckMail(L1PcInstance pc) {
		int count = 0;
		Connection con = null;
		PreparedStatement pstm1 = null;
		ResultSet rs = null;
		try {
			con = L1DatabaseFactory.getInstance().getConnection();
			pstm1 = con.prepareStatement(" SELECT count(*) as cnt FROM letter where receiver = ? AND isCheck = 0");
			pstm1.setString(1, pc.getName());

			rs = pstm1.executeQuery();
			if (rs.next()) {
				count = rs.getInt("cnt");
			}

		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs);
			SQLUtil.close(pstm1);
			SQLUtil.close(con);
		}

		return count;
	}

	private int[] loadSkills(L1PcInstance pc) {
		int[] skillList = new int[30];

		for (int i = 0; i < 30; ++i) {
			skillList[i] = 0;
		}

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {

			con = L1DatabaseFactory.getInstance().getConnection();
			pstm = con.prepareStatement("SELECT * FROM character_skills WHERE char_obj_id=?");
			pstm.setInt(1, pc.getId());
			rs = pstm.executeQuery();

			L1Skills l1skills = null;

			List<Integer> skillIdList = new ArrayList<Integer>();
			while (rs.next()) {
				int skillId = rs.getInt("skill_id");

				l1skills = SkillsTable.getInstance().getTemplate(skillId);

				if (l1skills != null && l1skills.getSkillLevel() > 0 && l1skills.getSkillLevel() <= 29) {
					if (skillId == 233) {
						skillList[l1skills.getSkillLevel()] |= l1skills.getId();
					} else {
						skillList[l1skills.getSkillLevel() - 1] |= l1skills.getId();
					}
				}
				// 전사스킬 로드
				if (l1skills != null && pc.isWarrior() && l1skills.getSkillLevel() == 30) {
					pc.sendPackets(new S_ACTION_UI(145, l1skills.getId()));
				}
				if (l1skills != null && pc.isDarkelf() && l1skills.getSkillLevel() == 30) {
					pc.sendPackets(new S_ACTION_UI(145, l1skills.getId()));
				}
				skillIdList.add(skillId);
			}
			SkillCheck.getInstance().AddSkill(pc.getId(), skillIdList);

		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs);
			SQLUtil.close(pstm);
			SQLUtil.close(con);
		}

		return skillList;
	}

	private void sendSkillPacket(L1PcInstance pc, int[] skillList) {
		//
		pc.sendPackets(new S_AddSkill(skillList[0], skillList[1], skillList[2], skillList[3], skillList[4], skillList[5], skillList[6], skillList[7],
				skillList[8], skillList[9], skillList[10], skillList[11], skillList[12], skillList[13], skillList[14], skillList[15], skillList[16],
				skillList[17], skillList[18], skillList[19], skillList[20], skillList[21], skillList[22], skillList[23], skillList[24], skillList[25],
				skillList[26], skillList[27], skillList[28], skillList[29], pc.getElfAttr()));
	}

	private void 보안버프(L1PcInstance pc) {
		pc.getAC().addAc(-1);
		pc.sendPackets(new S_PacketBox(pc, S_PacketBox.ICON_SECURITY_SERVICES));
	}

	private void serchSummon(L1PcInstance pc) {
		try {
			for (L1SummonInstance summon : L1World.getInstance().getAllSummons()) {
				if (summon.getMaster().getId() == pc.getId()) {
					summon.setMaster(pc);
					pc.addPet(summon);
					for (L1PcInstance visiblePc : L1World.getInstance().getVisiblePlayer(summon)) {
						visiblePc.sendPackets(new S_SummonPack(summon, visiblePc));
					}
				}
			}
		} catch (Exception e) {

		}
	}

	private void RenewStat(L1PcInstance pc) {
		pc.sendPackets(new S_CharStat(pc, S_CharStat.STAT_REFRESH));
		pc.sendPackets(new S_CharStat(pc, 1, S_CharStat.Stat_Str)); // 스탯 상세능력
		pc.sendPackets(new S_CharStat(pc, 1, S_CharStat.Stat_Int));
		pc.sendPackets(new S_CharStat(pc, 1, S_CharStat.Stat_Wis));
		pc.sendPackets(new S_CharStat(pc, 1, S_CharStat.Stat_Dex));
		pc.sendPackets(new S_CharStat(pc, 1, S_CharStat.Stat_Con));
		pc.sendPackets(new S_CharStat(S_CharStat.STAT_VIEW, 25)); // 스탯능력치
		pc.sendPackets(new S_CharStat(S_CharStat.STAT_VIEW, 35));
		pc.sendPackets(new S_CharStat(S_CharStat.STAT_VIEW, 45));
		pc.sendPackets(new S_CharStat(pc, S_CharStat.STAT_REFRESH));
	}

	// 용기사
	private void DragonknightPolyCheck(L1PcInstance pc) {
		L1ItemInstance weapon = pc.getWeapon();
		int polyId = pc.getTempCharGfx();
		if (pc.isDragonknight()) {
			if (polyId == 9206 || polyId == 6137 || polyId == 6142 || polyId == 6147 || polyId == 6152 || polyId == 6157 || polyId == 9205
					|| polyId == 6267 || polyId == 6270 || polyId == 6273 || polyId == 6276) {
				for (L1ItemInstance items : pc.getInventory().getItems()) {
					if (items.getItem().getType() == 18) {
						if (items.getItem().getType1() == 24) {
							items.getItem().setType1(50);
							if (weapon != null) {
								pc.getInventory().setEquipped(weapon, false);
								pc.getInventory().setEquipped(weapon, true);
							}
						}
					}
				}
			} else {
				for (L1ItemInstance items : pc.getInventory().getItems()) {
					if (items.getItem().getType() == 18) {
						if (items.getItem().getType1() == 50) {
							items.getItem().setType1(24);
							if (weapon != null) {
								pc.getInventory().setEquipped(weapon, false);
								pc.getInventory().setEquipped(weapon, true);
							}
						}
					}
				}
			}
		}
	}

	private void ClanMatching(L1PcInstance pc) {
		L1ClanMatching cml = L1ClanMatching.getInstance();
		if (pc.getClanid() == 0) {
			if (!pc.isCrown()) {
				cml.loadClanMatchingApcList_User(pc);
			}
		} else {
			switch (pc.getClanRank()) {
			case 3:
			case 4:
			case 6:
			case 10:
			case 9:
				// 부군주, 혈맹군주, 수호기사
				cml.loadClanMatchingApcList_Crown(pc);
				break;
			}
		}
	}

	private void Clanclan(L1PcInstance pc) {
		// 3245군주의 부름: 혈맹에 가입하세요//3246군주의 부름: 혈원을 모집하세요
		// 3247혈맹을 창설하고 쉽게 알리세요//3248혈맹 가입 요청이 왔습니다
		L1Clan clan = L1World.getInstance().getClan(pc.getClanname());
		if (clan == null && pc.isCrown()) {
			pc.sendPackets(new S_ServerMessage(3247)); // 혈맹을 창설하고 쉽게 알리세요
			// pc.sendPackets(new S_SystemMessage(pc.getName() + "의 계급이 " + L1Clan.군주 + " 로 변경되었습니다."));
		} else if (clan != null && pc.isCrown()) {
			pc.sendPackets(new S_ServerMessage(3246)); // 혈맹원을 모집하세요
		} else if (clan == null && !pc.isCrown()) {
			pc.sendPackets(new S_ServerMessage(3245)); // 혈맹에 가입하세요
		}
	}

	private List<BuffInfo> loadBuff(L1PcInstance pc) {
		List<BuffInfo> buffList = new ArrayList<BuffInfo>();

		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = L1DatabaseFactory.getInstance().getConnection();
			pstm = con.prepareStatement("SELECT * FROM character_buff WHERE char_obj_id=?");
			pstm.setInt(1, pc.getId());
			rs = pstm.executeQuery();

			while (rs.next()) {
				BuffInfo buffInfo = new BuffInfo();

				buffInfo.skillId = rs.getInt("skill_id");
				buffInfo.remainTime = rs.getInt("remaining_time");
				buffInfo.polyId = rs.getInt("poly_id");

				buffList.add(buffInfo);
			}
		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs);
			SQLUtil.close(pstm);
			SQLUtil.close(con);
		}

		return buffList;
	}

	private void processBuff(L1PcInstance pc, List<BuffInfo> buffList) {
		int icon[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (BuffInfo buffInfo : buffList) {
			int skillid = buffInfo.skillId;
			int remaining_time = buffInfo.remainTime;

			if (skillid >= COOKING_BEGIN && skillid <= COOKING_END) {
				L1Cooking.eatCooking(pc, skillid, remaining_time);
				continue;
			}
			switch (skillid) {
			case God_buff: // 흑사 버프
				pc.getAC().addAc(-2);
				pc.getResistance().addHold(10);
				pc.addMaxHp(20);
				pc.sendPackets(new S_HPUpdate(pc.getCurrentHp(), pc.getMaxHp()));
				pc.addMaxMp(13);
				pc.sendPackets(new S_MPUpdate(pc.getCurrentMp(), pc.getMaxMp()));
				pc.sendPackets(new S_PacketBox(S_PacketBox.BUFFICON, 4914, remaining_time));
				break;
			case SHAPE_CHANGE:
				int poly_id = buffInfo.polyId;
				L1PolyMorph.doPoly(pc, poly_id, remaining_time, L1PolyMorph.MORPH_BY_LOGIN);
				break;
			case STATUS_BRAVE:
				pc.sendPackets(new S_SkillBrave(pc.getId(), 1, remaining_time));
				pc.broadcastPacket(new S_SkillBrave(pc.getId(), 1, 0));
				pc.setBraveSpeed(1);
				break;
			case STATUS_ELFBRAVE:
				pc.sendPackets(new S_SkillBrave(pc.getId(), 3, remaining_time));
				pc.broadcastPacket(new S_SkillBrave(pc.getId(), 3, 0));
				pc.setBraveSpeed(1);
				break;
			case STATUS_HASTE:
				pc.sendPackets(new S_SkillHaste(pc.getId(), 1, remaining_time));
				pc.broadcastPacket(new S_SkillHaste(pc.getId(), 1, 0));
				pc.setMoveSpeed(1);
				break;
			case STATUS_BLUE_POTION:
			case STATUS_BLUE_POTION2:
				pc.sendPackets(new S_SkillIconGFX(34, remaining_time, true));
				break;
			case STATUS_CHAT_PROHIBITED:
				pc.sendPackets(new S_SkillIconGFX(36, remaining_time));
				break;
			case BLOOD_LUST:
				pc.sendPackets(new S_SkillBrave(pc.getId(), 1, remaining_time));
				break;
			case DECREASE_WEIGHT:// 환술사 리듀스 웨이트
			case REDUCE_WEIGHT:// 마법사 디크리즈 웨이트
				icon[0] = remaining_time / 16;
				break;
			case DECAY_POTION:
				icon[1] = remaining_time / 4;
				break;
			case SILENCE:
				icon[2] = remaining_time / 4;
				break;
			case VENOM_RESIST:
				icon[3] = remaining_time / 4;
				break;
			case WEAKNESS:
				icon[4] = remaining_time / 4;
				pc.addDmgup(-5);
				pc.addHitup(-1);
				break;
			case DISEASE:
				icon[5] = remaining_time / 4;
				pc.addDmgup(-6);
				pc.getAC().addAc(12);
				break;
			case DRESS_EVASION:
				icon[6] = remaining_time / 4;
				break;
			case BERSERKERS:
				icon[7] = remaining_time / 4;
				pc.getAC().addAc(10);
				pc.addDmgup(5);
				pc.addHitup(2);
				break;
			case NATURES_TOUCH:
				icon[8] = remaining_time / 4;
				break;
			case WIND_SHACKLE:
				icon[9] = remaining_time / 4;
				break;
			case ERASE_MAGIC:
				icon[10] = remaining_time / 4;
				break;
			case ADDITIONAL_FIRE:
				icon[11] = remaining_time / 4;
				break;
			case ELEMENTAL_FALL_DOWN:
				icon[12] = remaining_time / 4;
				int playerAttr = pc.getElfAttr();
				int i = -50;
				switch (playerAttr) {
				case 0:
					pc.sendPackets(new S_ServerMessage(79));
					break;
				case 1:
					pc.getResistance().addEarth(i);
					pc.setAddAttrKind(1);
					break;
				case 2:
					pc.getResistance().addFire(i);
					pc.setAddAttrKind(2);
					break;
				case 4:
					pc.getResistance().addWater(i);
					pc.setAddAttrKind(4);
					break;
				case 8:
					pc.getResistance().addWind(i);
					pc.setAddAttrKind(8);
					break;
				default:
					break;
				}
				break;
			case ELEMENTAL_FIRE:
				icon[13] = remaining_time / 4;
				break;
			case STRIKER_GALE:
				icon[14] = remaining_time / 4;
				break;
			case SOUL_OF_FLAME:
				icon[15] = remaining_time / 4;
				break;
			case POLLUTE_WATER:
				icon[16] = remaining_time / 4;
			case COMA_A:
				icon[30] = (remaining_time + 16) / 32;
				icon[31] = 40;
				pc.getAbility().addAddedCon(1);
				pc.getAbility().addAddedDex(5);
				pc.getAbility().addAddedStr(5);
				pc.addHitRate(3);
				pc.getAC().addAc(-3);
				break;
			case COMA_B:
				icon[30] = (remaining_time + 16) / 32;
				icon[31] = 41;
				// pc.addSp(1);
				pc.getAbility().addSp(1);
				pc.getAbility().addAddedCon(3);
				pc.getAbility().addAddedDex(5);
				pc.getAbility().addAddedStr(5);
				pc.addHitRate(5);
				pc.getAC().addAc(-8);
				break;
			case EXP_POTION:
				pc.sendPackets(new S_PacketBox(S_PacketBox.EMERALD_ICON_NEW, 0x01, remaining_time));
				// pc.sendPackets(new S_SkillIconGFX(3, remaining_time));
				break;
			case STATUS_CASHSCROLL:
				icon[18] = remaining_time / 16;
				icon[19] = 0;
				pc.addMaxHp(50);
				pc.sendPackets(new S_HPUpdate(pc.getCurrentHp(), pc.getMaxHp()));
				if (pc.isInParty()) {
					pc.getParty().updateMiniHP(pc);
				}
				pc.sendPackets(new S_MPUpdate(pc.getCurrentMp(), pc.getMaxMp()));
				break;
			case STATUS_CASHSCROLL2:
				icon[18] = remaining_time / 16;
				icon[19] = 1;
				pc.addMaxMp(40);
				pc.sendPackets(new S_MPUpdate(pc.getCurrentMp(), pc.getMaxMp()));
				break;
			case STATUS_CASHSCROLL3:
				//icon[18] = remaining_time / 16;
				//icon[19] = 2;
				pc.addDmgup(3);
				pc.addHitup(3);
				// pc.addSp(3);
				pc.getAbility().addSp(3);
				pc.sendPackets(new S_NewSkillIcon(STATUS_CASHSCROLL3, true, remaining_time));
				break;
			case CONCENTRATION:
				icon[20] = remaining_time / 16;
				break;
			case INSIGHT:
				icon[21] = remaining_time / 16;
				pc.getAbility().addAddedStr((byte) 1);
				pc.getAbility().addAddedDex((byte) 1);
				pc.getAbility().addAddedCon((byte) 1);
				pc.getAbility().addAddedInt((byte) 1);
				pc.getAbility().addAddedWis((byte) 1);
				pc.resetBaseMr();
				break;
			case PANIC:
				icon[22] = remaining_time / 16;
				pc.getAbility().addAddedStr((byte) -1);
				pc.getAbility().addAddedDex((byte) -1);
				pc.getAbility().addAddedCon((byte) -1);
				pc.getAbility().addAddedInt((byte) -1);
				pc.getAbility().addAddedWis((byte) -1);
				pc.getAbility().addAddedCha((byte) -1);
				pc.resetBaseMr();
				break;
			case MORTAL_BODY:
				icon[23] = remaining_time / 4;
				break;
			case HORROR_OF_DEATH:
				icon[24] = remaining_time / 4;
				pc.getAbility().addAddedStr((byte) -10);
				pc.getAbility().addAddedInt((byte) -10);
				break;
			case FEAR:
				icon[25] = remaining_time / 4;
				break;
			case PATIENCE:
				icon[26] = remaining_time / 4;
				break;
			case GUARD_BREAK:
				icon[27] = remaining_time / 4;
				pc.getAC().addAc(15);
				break;
			case DRAGON_SKIN:
				icon[28] = remaining_time / 16;
				break;
			case STATUS_FRUIT:
				icon[29] = remaining_time / 4;
				break;
			case RESIST_MAGIC:
				pc.getResistance().addMr(10);
				pc.sendPackets(new S_ElfIcon(remaining_time / 16, 0, 0, 0));
				break;
			case CLEAR_MIND:
				pc.getAbility().addAddedWis((byte) 3);
				pc.resetBaseMr();
				pc.sendPackets(new S_ElfIcon(0, remaining_time / 16, 0, 0));
				break;
			case RESIST_ELEMENTAL:
				pc.getResistance().addAllNaturalResistance(10);
				pc.sendPackets(new S_ElfIcon(0, 0, remaining_time / 16, 0));
				break;
			case ELEMENTAL_PROTECTION:
				int attr = pc.getElfAttr();
				if (attr == 1) {
					pc.getResistance().addEarth(50);
				} else if (attr == 2) {
					pc.getResistance().addFire(50);
				} else if (attr == 4) {
					pc.getResistance().addWater(50);
				} else if (attr == 8) {
					pc.getResistance().addWind(50);
				}
				pc.sendPackets(new S_ElfIcon(0, 0, 0, remaining_time / 16));
				break;
			case ANTA_MAAN:
				icon[34] = remaining_time / 30;
				icon[35] = 46;
				pc.getAC().addAc(-2);
				pc.getResistance().addHold(15);
				break;
			case FAFU_MAAN:
				icon[34] = remaining_time / 30;
				icon[35] = 47;
				pc.getResistance().addFreeze(15);
				break;
			case LIND_MAAN:
				icon[34] = remaining_time / 30;
				icon[35] = 48;
				// pc.addSp(1);
				pc.getAbility().addSp(1);
				pc.getResistance().addSleep(15);
				break;
			case VALA_MAAN:
				icon[34] = remaining_time / 30;
				icon[35] = 49;
				pc.addDmgup(2);
				pc.getResistance().addStun(15);
				break;
			case BIRTH_MAAN:
				icon[34] = remaining_time / 30;
				icon[35] = 50;
				pc.getAC().addAc(-2);
				pc.getResistance().addHold(15);
				pc.getResistance().addFreeze(15);
				break;
			case SHAPE_MAAN:
				icon[34] = remaining_time / 30;
				icon[35] = 51;
				pc.getAC().addAc(-3);
				pc.getAbility().addSp(1);
				pc.getResistance().addHold(15);
				pc.getResistance().addFreeze(15);
				pc.getResistance().addSleep(15);
				break;
			case LIFE_MAAN:
				icon[34] = remaining_time / 30;
				icon[35] = 52;
				pc.addDmgup(2);
				pc.getAC().addAc(-5);
				// pc.addSp(1);
				pc.getAbility().addSp(1);
				pc.getResistance().addHold(15);
				pc.getResistance().addFreeze(15);
				pc.getResistance().addSleep(15);
				pc.getResistance().addStun(15);
				break;
			case FEATHER_BUFF_A:
				icon[36] = remaining_time / 16;
				icon[37] = 70;
				pc.addHpr(3);
				pc.addMpr(3);
				pc.addDmgup(2);
				pc.addHitup(2);
				pc.addMaxHp(50);
				pc.addMaxMp(30);
				// pc.addSp(2);
				pc.getAbility().addSp(2);
				break;
			case FEATHER_BUFF_B:
				icon[36] = remaining_time / 16;
				icon[37] = 71;
				pc.addHitup(2);
				// pc.addSp(1);
				pc.getAbility().addSp(1);
				pc.addMaxHp(50);
				pc.addMaxMp(30);
				break;
			case FEATHER_BUFF_C:
				icon[36] = remaining_time / 16;
				icon[37] = 72;
				pc.addMaxHp(50);
				pc.addMaxMp(30);
				pc.getAC().addAc(-2);
				break;
			case FEATHER_BUFF_D:
				icon[36] = remaining_time / 16;
				icon[37] = 73;
				pc.getAC().addAc(-1);
				break;
			case ANTA_BUFF:
				pc.getAC().addAc(-2);
				pc.getResistance().addWater(50);
				pc.sendPackets(new S_OwnCharStatus(pc));
				pc.sendPackets(new S_PacketBox(S_PacketBox.DRAGONBLOOD, 82, remaining_time / 60));
				break;
			case FAFU_BUFF:
				pc.addHpr(3);
				pc.addMpr(1);
				pc.getResistance().addWind(50);
				pc.sendPackets(new S_OwnCharStatus(pc));
				pc.sendPackets(new S_PacketBox(S_PacketBox.DRAGONBLOOD, 85, remaining_time / 60));
				break;
			case RIND_BUFF:
			case VALA_BUFF:
				pc.addHitup(3);
				pc.addBowHitup(3);
				pc.getResistance().addFire(50);
				pc.sendPackets(new S_OwnCharStatus(pc));
				pc.sendPackets(new S_PacketBox(S_PacketBox.DRAGONBLOOD, 88, remaining_time / 60));
				break;
			case STATUS_DRAGON_PEARL:
				pc.sendPackets(new S_PacketBox(S_PacketBox.DRAGON_PEARL, 8, remaining_time));
				pc.sendPackets(new S_Liquor(pc.getId(), 8));
				pc.setPearl(1);
				break;
			case 레벨업보너스:
				pc.sendPackets(new S_PacketBox(remaining_time, true, true));
				break;
			case DRAGON_TOPAZ:
				pc.sendPackets(new S_PacketBox(remaining_time, 2, true, true));
				break;
			case DRAGON_PUPLE:
				pc.sendPackets(new S_PacketBox(remaining_time, 1, true, true));
				break;
			case EMERALD_NO:
				pc.sendPackets(new S_PacketBox(S_PacketBox.EMERALD_ICON, 0x01, remaining_time));
				break;
			case EMERALD_YES:
				pc.sendPackets(new S_PacketBox(S_PacketBox.EMERALD_ICON, 0x02, remaining_time));
				break;
			case L1SkillId.RANK_BUFF_5:
				pc.sendPackets(new S_PacketBox(S_PacketBox.BUFFICON, 12536, remaining_time));
				break;
			case SetBuff:
				remaining_time = 30;
				// pc.setSkillEffect(SetBuff, 30 * 1000);
				break;
			case L1SkillId.Matiz_Buff1:
				pc.sendPackets(new S_MatizBuff(1,remaining_time));
				break;
			case L1SkillId.Matiz_Buff2:
				pc.getResistance().addMr(10);
				pc.addDamageReductionByArmor(2);
				pc.addMaxHp(100);
				pc.addHpr(2);
				pc.sendPackets(new S_SPMR(pc));
				pc.sendPackets(new S_HPUpdate(pc));
				pc.sendPackets(new S_MPUpdate(pc.getCurrentMp(), pc.getMaxMp()));
				pc.sendPackets(new S_MatizBuff(2,remaining_time));
				break;
			case L1SkillId.Matiz_Buff3:
				pc.addDmgup(3);
				pc.addBowDmgup(3);
				pc.getAbility().addSp(3);
				pc.addMaxMp(50);
				pc.addMpr(2);
				pc.sendPackets(new S_SPMR(pc));
				pc.sendPackets(new S_HPUpdate(pc));
				pc.sendPackets(new S_MPUpdate(pc.getCurrentMp(), pc.getMaxMp()));
				pc.sendPackets(new S_MatizBuff(3,remaining_time));
				break;
			default:
				L1SkillUse l1skilluse = new L1SkillUse();
				l1skilluse.handleCommands(pc, skillid, pc.getId(), pc.getX(), pc.getY(), null, remaining_time, L1SkillUse.TYPE_LOGIN);
				break;
			}
			pc.setSkillEffect(skillid, remaining_time * 1000);
		}
		pc.sendPackets(new S_UnityIcon(icon[0], icon[1], icon[2], icon[3], icon[4], icon[5], icon[6], icon[7], icon[8], icon[9], icon[10], icon[11],
				icon[12], icon[13], icon[14], icon[15], icon[16], icon[17], icon[18], icon[19], icon[20], icon[21], icon[22], icon[23], icon[24],
				icon[25], icon[26], icon[27], icon[28], icon[29], icon[30], icon[31], icon[32], icon[33], icon[34], icon[35], icon[36], icon[37]));
	}

	
	  private void Abyss(L1PcInstance pc) {
		  if(pc.getLevel() >= Config.CLASS_START_LEVEL){
			  if(pc.getAbysspoint() >= Config.NINE_CLASS && pc.getAbysspoint() < Config.EIGHT_CLASS){ 
				  pc.setPeerage(1); //9 
			  } else if(pc.getAbysspoint() >= Config.EIGHT_CLASS && pc.getAbysspoint() <  Config.SEVEN_CLASS){ 
				  pc.setPeerage(2); //8 
			  } else if(pc.getAbysspoint() >= Config.SEVEN_CLASS && pc.getAbysspoint() < Config.SIX_CLASS){
				  pc.setPeerage(3); //7 } 
			  }  else if(pc.getAbysspoint() >= Config.SIX_CLASS && pc.getAbysspoint() < Config.FIVE_CLASS){ 
				  pc.setPeerage(4); //6 
			  } else if(pc.getAbysspoint() >= Config.FIVE_CLASS && pc.getAbysspoint() < Config.FOUR_CLASS){ 
				pc.setPeerage(5); // 5 
			  } else if(pc.getAbysspoint() >=  Config.FOUR_CLASS && pc.getAbysspoint() < Config.THREE_CLASS){
				pc.setPeerage(6); // 4 
			  } else if(pc.getAbysspoint() >= Config.THREE_CLASS && pc.getAbysspoint() < Config.TWO_CLASS){
				  pc.setPeerage(7); // 3 
			  } else if(pc.getAbysspoint() >= Config.TWO_CLASS && pc.getAbysspoint() < Config.ONE_CLASS){ 
				  pc.setPeerage(8); // 2 
			  } else if(pc.getAbysspoint() >= Config.ONE_CLASS && pc.getAbysspoint() < Config.STAR_ONE){		
				  pc.setPeerage(9); // 1
			  } else if(pc.getAbysspoint() >= Config.STAR_ONE && pc.getAbysspoint() < Config.STAR_TWO){ 
				  pc.setPeerage(10); // 1성 
			  }	
	 }else if(pc.getAbysspoint() >= Config.STAR_TWO && pc.getAbysspoint() < Config.STAR_THREE){ 
		 		  		pc.setPeerage(11); // 2성 
				} else if(pc.getAbysspoint() >= Config.STAR_THREE && pc.getAbysspoint() < Config.STAR_FOUR){
						pc.setPeerage(12); // 3성 
				} else if(pc.getAbysspoint() >= Config.STAR_FOUR &&  pc.getAbysspoint() < Config.STAR_FIVE){ 
						pc.setPeerage(13); // 4성 
				} else if(pc.getAbysspoint() >= Config.STAR_FIVE && pc.getAbysspoint() < Config.GENERAL){ 
						pc.setPeerage(14); // 5성 
				} else if(pc.getAbysspoint() >= Config.GENERAL && pc.getAbysspoint() < Config.IMPERATOR){
						pc.setPeerage(15); // 장군 
				} else if(pc.getAbysspoint() >= Config.IMPERATOR && pc.getAbysspoint() < Config.COMMANDER){
						pc.setPeerage(16); // 대장군
				} else if(pc.getAbysspoint() >= Config.COMMANDER && pc.getAbysspoint() < Config.SUPREMECOMMANDER){ 
						pc.setPeerage(17); // 사령관 } else
				}
	  
		  if(pc.getAbysspoint() >= Config.SUPREMECOMMANDER){ 
		  pc.setPeerage(18); // 총사령관 
	  }
	  
	  if (pc.getPeerage() == 1) {
	  pc.set9급병(true);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 2) {
	  pc.set9급병(false);pc.set8급병(true);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 3) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(true);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 4) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(true);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 5) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(true);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 6) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(true);pc.set6급병(false);pc.set5급병(false);pc.set4급병(true);pc.set3급병(false);pc.set2급병(false);pc.set1급병
	  (false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 7) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(true);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 8) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(true);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 9) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(true); pc.set1성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);pc.set2성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 10) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(true);pc.set2성장교(false);pc.set3성장교(false);pc.set4성장교(false);pc.set5성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 11) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(true);pc.set3성장교(false);pc.set4성장교(false);pc.set5성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false);
	  
	  } else if (pc.getPeerage() == 12) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set3성장교(true);pc.set4성장교(false);pc.set5성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false); } else if (pc.getPeerage() == 13) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set3성장교(false);pc.set4성장교(true);pc.set5성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false); } else if (pc.getPeerage() == 14) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set3성장교(false);pc.set4성장교(false);pc.set5성장교(true);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false); } else if (pc.getPeerage() == 15) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set3성장교(false);pc.set4성장교(false);pc.set5성장교(false);
	  pc.set장군(true);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(false); } else if (pc.getPeerage() == 16) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set3성장교(false);pc.set4성장교(false);pc.set5성장교(false);
	  pc.set장군(false);pc.set대장군(true);pc.set사령관(false);pc.set총사령관(false); } else if (pc.getPeerage() == 17) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set3성장교(false);pc.set4성장교(false);pc.set5성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(true);pc.set총사령관(false); } else if (pc.getPeerage() == 18) {
	  pc.set9급병(false);pc.set8급병(false);pc.set7급병(false);pc.set6급병(false);pc.set5급병(false);pc.set4급병(false);pc.set3급병(false);pc.set2급병(false);pc.
	  set1급병(false); pc.set1성장교(false);pc.set2성장교(false);pc.set3성장교(false);pc.set4성장교(false);pc.set5성장교(false);
	  pc.set장군(false);pc.set대장군(false);pc.set사령관(false);pc.set총사령관(true); } }
	 

	private void setExcludeList(L1PcInstance pc, L1ExcludingList exList) {
		Connection con = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			con = L1DatabaseFactory.getInstance().getConnection();
			pstm = con.prepareStatement("SELECT * FROM character_exclude WHERE char_id = ?");
			pstm.setInt(1, pc.getId());
			rs = pstm.executeQuery();

			while (rs.next()) {
				int type = rs.getInt("type");
				String name = rs.getString("exclude_name");
				if (!exList.contains(type, name)) {
					exList.add(type, name);
				}
			}
		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
		} finally {
			SQLUtil.close(rs);
			SQLUtil.close(pstm);
			SQLUtil.close(con);
		}
	}

	/*
	 * private void welcome(L1PcInstance pc) { //해당맵 이펙트 보여주기
	 * 
	 * pc.sendPackets(new S_EffectLocation(pc.getX() + 3, pc.getY() + 3, 6415)); // e pc.sendPackets(new S_EffectLocation(pc.getX() + 2, pc.getY() +
	 * 2, 6423)); // m pc.sendPackets(new S_EffectLocation(pc.getX() + 1, pc.getY() + 1, 6425)); // o pc.sendPackets(new S_EffectLocation(pc.getX() ,
	 * pc.getY(), 6413)); // c pc.sendPackets(new S_EffectLocation(pc.getX() - 1, pc.getY() - 1, 6422)); // l pc.sendPackets(new
	 * S_EffectLocation(pc.getX() - 2, pc.getY() - 2, 6415)); // e pc.sendPackets(new S_EffectLocation(pc.getX() - 3, pc.getY() - 3, 6433)); // w
	 * 
	 * pc.sendPackets(new S_EffectLocation(pc.getX() +1, pc.getY() +5, 6417)); // G pc.sendPackets(new S_EffectLocation(pc.getX() , pc.getY() +4,
	 * 6424)); // N pc.sendPackets(new S_EffectLocation(pc.getX() -1, pc.getY() +3, 6425)); // O pc.sendPackets(new S_EffectLocation(pc.getX() -2,
	 * pc.getY() +2, 6422)); // L pc.sendPackets(new S_EffectLocation(pc.getX() -3, pc.getY() +1, 6425)); // O pc.sendPackets(new
	 * S_EffectLocation(pc.getX() -4, pc.getY() , 6418)); // H pc.sendPackets(new S_EffectLocation(pc.getX() -5, pc.getY() -1, 6413)); // C }
	 */

	@Override
	public String getType() {
		return C_LOGIN_TO_SERVER;
	}
}