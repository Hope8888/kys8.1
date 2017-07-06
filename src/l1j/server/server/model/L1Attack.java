package l1j.server.server.model;

import static l1j.server.server.model.skill.L1SkillId.ABSOLUTE_BARRIER;
import static l1j.server.server.model.skill.L1SkillId.ARMOR_BRAKE;
import static l1j.server.server.model.skill.L1SkillId.BERSERKERS;
import static l1j.server.server.model.skill.L1SkillId.BRAVE_AURA;
import static l1j.server.server.model.skill.L1SkillId.BURNING_SLASH;
import static l1j.server.server.model.skill.L1SkillId.BURNING_SPIRIT;
import static l1j.server.server.model.skill.L1SkillId.BURNING_WEAPON;
import static l1j.server.server.model.skill.L1SkillId.CLAN_BUFF3;
import static l1j.server.server.model.skill.L1SkillId.CLAN_BUFF4;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_0_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_10_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_11_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_12_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_13_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_14_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_15_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_16_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_17_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_18_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_19_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_1_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_20_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_21_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_22_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_23_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_2_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_3_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_4_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_5_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_6_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_7_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_8_S;
import static l1j.server.server.model.skill.L1SkillId.COOKING_1_9_S;
import static l1j.server.server.model.skill.L1SkillId.COOK_DEX;
import static l1j.server.server.model.skill.L1SkillId.COOK_GROW;
import static l1j.server.server.model.skill.L1SkillId.COOK_INT;
import static l1j.server.server.model.skill.L1SkillId.COOK_STR;
import static l1j.server.server.model.skill.L1SkillId.ARMORGUARD;
import static l1j.server.server.model.skill.L1SkillId.RANK_BUFF_2;
import static l1j.server.server.model.skill.L1SkillId.RANK_BUFF_3;
import static l1j.server.server.model.skill.L1SkillId.RANK_BUFF_4;
import static l1j.server.server.model.skill.L1SkillId.RANK_BUFF_5;
import static l1j.server.server.model.skill.L1SkillId.DOUBLE_BRAKE;
import static l1j.server.server.model.skill.L1SkillId.DRAGON_SKIN;
import static l1j.server.server.model.skill.L1SkillId.EARTH_BIND;
import static l1j.server.server.model.skill.L1SkillId.EARTH_GUARDIAN;
import static l1j.server.server.model.skill.L1SkillId.ELEMENTAL_FIRE;
import static l1j.server.server.model.skill.L1SkillId.ENCHANT_VENOM;
import static l1j.server.server.model.skill.L1SkillId.FEAR;
import static l1j.server.server.model.skill.L1SkillId.FEATHER_BUFF_A;
import static l1j.server.server.model.skill.L1SkillId.FEATHER_BUFF_B;
import static l1j.server.server.model.skill.L1SkillId.FIRE_WEAPON;
import static l1j.server.server.model.skill.L1SkillId.ICE_LANCE;
import static l1j.server.server.model.skill.L1SkillId.IMMUNE_TO_HARM;
import static l1j.server.server.model.skill.L1SkillId.IllUSION_AVATAR;
import static l1j.server.server.model.skill.L1SkillId.MIRROR_IMAGE;
import static l1j.server.server.model.skill.L1SkillId.MOB_BASILL;
import static l1j.server.server.model.skill.L1SkillId.MOB_COCA;
import static l1j.server.server.model.skill.L1SkillId.PAP_FIVEPEARLBUFF;
import static l1j.server.server.model.skill.L1SkillId.PAP_MAGICALPEARLBUFF;
import static l1j.server.server.model.skill.L1SkillId.PATIENCE;
import static l1j.server.server.model.skill.L1SkillId.PHANTASM;
import static l1j.server.server.model.skill.L1SkillId.REDUCTION_ARMOR;
import static l1j.server.server.model.skill.L1SkillId.SOUL_OF_FLAME;
import static l1j.server.server.model.skill.L1SkillId.STATUS_CURSE_BARLOG;
import static l1j.server.server.model.skill.L1SkillId.STATUS_CURSE_YAHEE;
import static l1j.server.server.model.skill.L1SkillId.STATUS_HOLY_MITHRIL_POWDER;
import static l1j.server.server.model.skill.L1SkillId.STATUS_HOLY_WATER;
import static l1j.server.server.model.skill.L1SkillId.STATUS_HOLY_WATER_OF_EVA;
import static l1j.server.server.model.skill.L1SkillId.UNCANNY_DODGE;

import java.util.Random;

import l1j.server.Config;
import l1j.server.GameSystem.Boss.BossAlive;
import l1j.server.GameSystem.Robot.L1RobotInstance;
import l1j.server.server.ActionCodes;
import l1j.server.server.Controller.WarTimeController;
import l1j.server.server.datatables.CharacterBalance;
import l1j.server.server.datatables.CharacterHitRate;
import l1j.server.server.datatables.CharacterReduc;
import l1j.server.server.datatables.SkillsTable;
import l1j.server.server.datatables.WeaponAddDamage;
import l1j.server.server.model.Instance.L1DollInstance;
import l1j.server.server.model.Instance.L1ItemInstance;
import l1j.server.server.model.Instance.L1NpcInstance;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.Instance.L1PetInstance;
import l1j.server.server.model.Instance.L1SummonInstance;
import l1j.server.server.model.gametime.L1GameTimeClock;
import l1j.server.server.model.poison.L1DamagePoison;
import l1j.server.server.model.poison.L1ParalysisPoison;
import l1j.server.server.model.poison.L1SilencePoison;
import l1j.server.server.model.skill.L1SkillId;
import l1j.server.server.serverpackets.S_AttackCritical;
import l1j.server.server.serverpackets.S_AttackMissPacket;
import l1j.server.server.serverpackets.S_AttackPacket;
import l1j.server.server.serverpackets.S_AttackPacketForNpc;
import l1j.server.server.serverpackets.S_ChatPacket;
import l1j.server.server.serverpackets.S_DoActionGFX;
import l1j.server.server.serverpackets.S_NewSkillIcon;
import l1j.server.server.serverpackets.S_OwnCharAttrDef;
import l1j.server.server.serverpackets.S_ServerMessage;
import l1j.server.server.serverpackets.S_SkillSound;
import l1j.server.server.serverpackets.S_SystemMessage;
import l1j.server.server.serverpackets.S_UseArrowSkill;
import l1j.server.server.serverpackets.S_UseAttackSkill;
import l1j.server.server.types.Point;
import l1j.server.server.utils.CalcStat;
import l1j.server.server.utils.CommonUtil;

public class L1Attack {

    private L1PcInstance _pc = null;

    private L1Character _target = null;

    private L1PcInstance _targetPc = null;

    private L1NpcInstance _npc = null; 

    private L1NpcInstance _targetNpc = null;

    private final int _targetId;

    private int _targetX;

    private int _targetY;

    private int _statusDamage = 0;

    private static final Random _random = new Random(System.nanoTime());

    private int _hitRate = 0;

    private int _calcType;

    private static final int PC_PC = 1;

    private static final int PC_NPC = 2;

    private static final int NPC_PC = 3;

    private static final int NPC_NPC = 4;

    public boolean _isHit = false;

    public boolean _isCritical = false;

    private int _damage = 0;

    private int _drainMana = 0;

    /** 조우의 돌골렘 **/

    private int _drainHp = 0;

    /** 조우의 돌골렘 **/

    private int _attckGrfxId = 0;

    private int _attckActId = 0;

    // 공격자가 플레이어의 경우의 무기 정보
    private L1ItemInstance weapon = null;

    private L1ItemInstance armor = null;
    // 전사 쌍수
    private L1ItemInstance Sweapon = null;// 세컨웨폰
    private int _SweaponId = 0;
    private int _SweaponType = 0;
    private int _SweaponType1 = 0;
    private int _SweaponAddHit = 0;
    private int _SweaponAddDmg = 0;
    private int _SweaponSmall = 0;
    private int _SweaponLarge = 0;
    private int _SweaponRange = 1;
    private int _SweaponBless = 1;
    private int _SweaponEnchant = 0;
    private int _SweaponMaterial = 0;
    private int _SweaponAttrEnchantLevel = 0;

    private int _weaponId = 0;

    private int _weaponType = 0;

    private int _weaponType2 = 0;

    // private int _weaponType1 = 0;

    private int _weaponAddHit = 0;

    private int _weaponAddDmg = 0;

    private int _weaponSmall = 0;

    private int _weaponLarge = 0;

    private int _weaponBless = 1;

    private int _weaponEnchant = 0;

    private int _weaponMaterial = 0;

    private int _weaponDoubleDmgChance = 0;
    
    private int _ignorereductionbyweapon = 0;
    
    private int _ignorereductionbyarmor = 0;

    private int _weaponAttrLevel = 0; // 속성 레벨

    private int _attackType = 0;

    private L1ItemInstance _arrow = null;

    private L1ItemInstance _sting = null;

    private int _leverage = 10; // 1/10배로 표현한다.

    public void setLeverage(int i) {
        _leverage = i;
    }

    private int getLeverage() {
        return _leverage;
    }

    private static final int[] strHit = new int[128];

    static {
        for (int str = 0; str <= 7; str++) {
            strHit[str] = -2;
        }
        strHit[8] = -1;
        strHit[9] = -1;
        strHit[10] = 0;
        strHit[11] = 0;
        strHit[12] = 1;
        strHit[13] = 1;
        strHit[14] = 2;
        strHit[15] = 2;
        strHit[16] = 3;
        strHit[17] = 3;
        strHit[18] = 4;
        strHit[19] = 4;
        strHit[20] = 4;
        strHit[21] = 5;
        strHit[22] = 5;
        strHit[23] = 5;
        strHit[24] = 6;
        strHit[25] = 6;
        strHit[26] = 6;
        strHit[27] = 7;
        strHit[28] = 7;
        strHit[29] = 7;
        strHit[30] = 8;
        strHit[31] = 8;
        strHit[32] = 8;
        strHit[33] = 9;
        strHit[34] = 9;
        strHit[35] = 9;
        strHit[36] = 10;
        strHit[37] = 10;
        strHit[38] = 10;
        strHit[39] = 11;
        strHit[40] = 11;
        strHit[41] = 11;
        strHit[42] = 12;
        strHit[43] = 12;
        strHit[44] = 12;
        strHit[45] = 13;
        strHit[46] = 13;
        strHit[47] = 13;
        strHit[48] = 14;
        strHit[49] = 14;
        strHit[50] = 14;
        strHit[51] = 15;
        strHit[52] = 15;
        strHit[53] = 15;
        strHit[54] = 16;
        strHit[55] = 16;
        strHit[56] = 16;
        strHit[57] = 17;
        strHit[57] = 17;
        strHit[58] = 17;
        int Hit = 18;
        for (int str = 59; str <= 127; str++) { // 59~127은 3마다＋1
            if (str % 3 == 1) {
                Hit++;
            }
            strHit[str] = Hit;
        }
    }

    private static final int[] dexHit = new int[128];

    static {
        // DEX 데미지 보정
        for (int dex = 0; dex <= 6; dex++) {
            // 0~11는 0
            dexHit[dex] = -2;
        }
        dexHit[7] = -1;
        dexHit[8] = -1;
        dexHit[9] = 0;
        dexHit[10] = 0;
        dexHit[11] = 1;
        dexHit[12] = 1;
        dexHit[13] = 2;
        dexHit[14] = 2;
        dexHit[15] = 3;
        dexHit[16] = 3;
        dexHit[17] = 4;
        dexHit[18] = 4;
        dexHit[19] = 5;
        dexHit[20] = 6;
        dexHit[21] = 7;
        dexHit[22] = 8;
        dexHit[23] = 9;
        dexHit[24] = 10;
        dexHit[25] = 11;
        dexHit[26] = 12;
        dexHit[27] = 13;
        dexHit[28] = 14;
        dexHit[29] = 15;
        dexHit[30] = 16;
        dexHit[31] = 17;
        dexHit[32] = 18;
        dexHit[33] = 19;
        dexHit[34] = 19;
        dexHit[35] = 19;
        dexHit[36] = 20;
        dexHit[37] = 20;
        dexHit[38] = 20;
        dexHit[39] = 21;
        dexHit[40] = 21;
        dexHit[41] = 21;
        dexHit[42] = 22;
        dexHit[43] = 22;
        dexHit[44] = 22;
        dexHit[45] = 23;
        dexHit[46] = 23;
        dexHit[47] = 23;
        dexHit[48] = 24;
        dexHit[49] = 24;
        dexHit[50] = 24;
        dexHit[51] = 25;
        dexHit[52] = 25;
        dexHit[53] = 25;
        dexHit[54] = 26;
        dexHit[55] = 26;
        dexHit[56] = 26;
        dexHit[57] = 27;
        dexHit[58] = 27;
        dexHit[59] = 27;
        dexHit[60] = 28;
        dexHit[61] = 28;
        dexHit[62] = 28;
        dexHit[63] = 29;
        dexHit[64] = 29;
        dexHit[65] = 29;
        dexHit[66] = 30;
        dexHit[67] = 30;
        dexHit[68] = 30;

        int hit = 31;
        for (int dex = 69; dex <= 127; dex++) { // 48~127은 3마다＋1 //#
            if (dex % 3 == 1) {
                hit++;
            }
            dexHit[dex] = hit;
        }
    }

    private static final int[] strDmg = new int[128];

    static {
		 strDmg[ 7 ] = 2 ;
		 strDmg[ 8 ] = 2 ;
		 strDmg[ 9 ] = 2 ;
		 strDmg[ 10 ] = 3 ;
		 strDmg[ 11 ] = 3 ;
		 strDmg[ 12 ] = 4 ;
		 strDmg[ 13 ] = 4 ;
		 strDmg[ 14 ] = 5 ;
		 strDmg[ 15 ] = 5 ;
		 strDmg[ 16 ] = 6 ;
		 strDmg[ 17 ] = 6 ;
		 strDmg[ 18 ] = 7 ;
		 strDmg[ 19 ] = 7 ;
		 strDmg[ 20 ] = 8 ;
		 strDmg[ 21 ] = 8 ;
		 strDmg[ 22 ] = 9 ;
		 strDmg[ 23 ] = 9 ;
		 strDmg[ 24 ] = 10 ;
		 strDmg[ 25 ] = 10 ;
		 strDmg[ 26 ] = 11 ;
		 strDmg[ 27 ] = 11 ;
		 strDmg[ 28 ] = 12 ;
		 strDmg[ 29 ] = 12 ;
		 strDmg[ 30 ] = 13 ;
		 strDmg[ 31 ] = 13 ;
		 strDmg[ 32 ] = 14 ;
		 strDmg[ 33 ] = 14 ;
		 strDmg[ 34 ] = 15 ;
		 strDmg[ 35 ] = 15 ;
		 strDmg[ 36 ] = 16 ;
		 strDmg[ 37 ] = 16 ;
		 strDmg[ 38 ] = 17 ;
		 strDmg[ 39 ] = 17 ;
		 strDmg[ 40 ] = 18 ;
		 strDmg[ 41 ] = 18 ;
		 strDmg[ 42 ] = 19 ;
		 strDmg[ 43 ] = 19 ;
		 strDmg[ 44 ] = 20 ;
		 strDmg[ 45 ] = 20 ;
		 strDmg[ 46 ] = 21 ;
		 strDmg[ 47 ] = 21 ;
		 strDmg[ 48 ] = 22 ;
		 strDmg[ 49 ] = 22 ;
		 strDmg[ 50 ] = 23 ;
		 strDmg[ 51 ] = 23 ;
		 strDmg[ 52 ] = 24 ;
		 strDmg[ 53 ] = 24 ;
		 strDmg[ 54 ] = 25 ;
		 strDmg[ 55 ] = 25 ;
		 strDmg[ 56 ] = 26 ;
		 strDmg[ 57 ] = 26 ;
		 strDmg[ 58 ] = 27 ;
		 strDmg[ 59 ] = 27 ;
		 strDmg[ 60 ] = 28 ;
		 strDmg[ 61 ] = 28 ;
		 strDmg[ 62 ] = 29 ;
		 strDmg[ 63 ] = 29 ;
		 strDmg[ 64 ] = 30 ;
		 strDmg[ 65 ] = 30 ;
		 strDmg[ 66 ] = 31 ;
		 strDmg[ 67 ] = 31 ;
		 strDmg[ 68 ] = 32 ;
		 strDmg[ 69 ] = 32 ;
		 strDmg[ 70 ] = 33 ;
		 strDmg[ 71 ] = 33 ;
		 strDmg[ 72 ] = 34 ;

	}

    private static final int[] dexDmg = new int[128];

    static {
		// DEX 데미지 보정			
		dexDmg[ 7 ] = 2 ;
		dexDmg[ 8 ] = 2 ;
		dexDmg[ 9 ] = 3 ;
		dexDmg[ 10 ] = 3 ;
		dexDmg[ 11 ] = 3 ;
		dexDmg[ 12 ] = 4 ;
		dexDmg[ 13 ] = 4 ;
		dexDmg[ 14 ] = 4 ;
		dexDmg[ 15 ] = 5 ;
		dexDmg[ 16 ] = 5 ;
		dexDmg[ 17 ] = 5 ;
		dexDmg[ 18 ] = 6 ;
		dexDmg[ 19 ] = 6 ;
		dexDmg[ 20 ] = 6 ;
		dexDmg[ 21 ] = 7 ;
		dexDmg[ 22 ] = 7 ;
		dexDmg[ 23 ] = 7 ;
		dexDmg[ 24 ] = 8 ;
		dexDmg[ 25 ] = 8 ;
		dexDmg[ 26 ] = 8 ;
		dexDmg[ 27 ] = 9 ;
		dexDmg[ 28 ] = 9 ;
		dexDmg[ 29 ] = 9 ;
		dexDmg[ 30 ] = 10 ;
		dexDmg[ 31 ] = 10 ;
		dexDmg[ 32 ] = 10 ;
		dexDmg[ 33 ] = 11 ;
		dexDmg[ 34 ] = 11 ;
		dexDmg[ 35 ] = 11 ;
		dexDmg[ 36 ] = 12 ;
		dexDmg[ 37 ] = 12 ;
		dexDmg[ 38 ] = 12 ;
		dexDmg[ 39 ] = 13 ;
		dexDmg[ 40 ] = 13 ;
		dexDmg[ 41 ] = 13 ;
		dexDmg[ 42 ] = 14 ;
		dexDmg[ 43 ] = 14 ;
		dexDmg[ 44 ] = 14 ;
		dexDmg[ 45 ] = 15 ;
		dexDmg[ 46 ] = 15 ;
		dexDmg[ 47 ] = 15 ;
		dexDmg[ 48 ] = 16 ;
		dexDmg[ 49 ] = 16 ;
		dexDmg[ 50 ] = 16 ;
		dexDmg[ 51 ] = 17 ;
		dexDmg[ 52 ] = 17 ;
		dexDmg[ 53 ] = 17 ;
		dexDmg[ 54 ] = 18 ;
		dexDmg[ 55 ] = 18 ;
		dexDmg[ 56 ] = 18 ;
		dexDmg[ 57 ] = 19 ;
		dexDmg[ 58 ] = 19 ;
		dexDmg[ 59 ] = 19 ;
		dexDmg[ 60 ] = 20 ;
		dexDmg[ 61 ] = 20 ;
		dexDmg[ 62 ] = 20 ;
		dexDmg[ 63 ] = 21 ;
		dexDmg[ 64 ] = 21 ;
		dexDmg[ 65 ] = 21 ;
		dexDmg[ 66 ] = 22 ;
		dexDmg[ 67 ] = 22 ;
		dexDmg[ 68 ] = 22 ;
		dexDmg[ 69 ] = 23 ;
		dexDmg[ 70 ] = 23 ;
		dexDmg[ 71 ] = 23 ;
		dexDmg[ 72 ] = 24 ;    								
	}

    private static final int[] intDmg = new int[128];

    static {
        // int 대미지 보정
        for (int int1 = 0; int1 <= 14; int1++) {
            intDmg[int1] = 0;
        }
        intDmg[15] = 3;
        intDmg[16] = 4;
        intDmg[17] = 5;
        intDmg[18] = 6;
        intDmg[19] = 6;
        intDmg[20] = 7;
        intDmg[21] = 7;
        intDmg[22] = 8;
        intDmg[23] = 8;
        intDmg[24] = 9;
        intDmg[25] = 9;
        intDmg[26] = 9;
        intDmg[27] = 10;
        intDmg[28] = 10;
        intDmg[29] = 11;
        intDmg[30] = 11;
        intDmg[31] = 12;
        intDmg[32] = 12;
        intDmg[33] = 13;
        intDmg[34] = 13;
        int dmg = 25;
        for (int int1 = 35; int1 <= 127; int1++) { // 35~127은 1마다＋1
            dmg += 1;
            intDmg[int1] = dmg;
        }
    }

    public void setActId(int actId) {
        _attckActId = actId;
    }

    public void setGfxId(int gfxId) {
        _attckGrfxId = gfxId;
    }

    public int getActId() {
        return _attckActId;
    }

    public int getGfxId() {
        return _attckGrfxId;
    }

    public L1Attack(L1Character attacker, L1Character target) {
        if (attacker instanceof L1PcInstance) {
            _pc = (L1PcInstance) attacker;
            if (target instanceof L1PcInstance) {
                _targetPc = (L1PcInstance) target;
                _calcType = PC_PC;
            } else if (target instanceof L1NpcInstance) {
                _targetNpc = (L1NpcInstance) target;
                _calcType = PC_NPC;
            }
            // 무기 정보의 취득
            weapon = _pc.getWeaponSwap();
            Sweapon = _pc.getSecondWeapon();
            if (Sweapon != null) {
                _SweaponId = Sweapon.getItem().getItemId();
                _SweaponType = Sweapon.getItem().getType1();
                _SweaponAddHit = Sweapon.getItem().getHitModifier() + Sweapon.getHitByMagic();
                _SweaponAddDmg = Sweapon.getItem().getDmgModifier() + Sweapon.getDmgByMagic();
                _SweaponType1 = Sweapon.getItem().getType();
                _SweaponSmall = Sweapon.getItem().getDmgSmall();
                _SweaponLarge = Sweapon.getItem().getDmgLarge();
                _SweaponBless = Sweapon.getItem().getBless();
                _SweaponEnchant = Sweapon.getEnchantLevel() - Sweapon.get_durability(); // 손상분 마이너스
                _SweaponMaterial = Sweapon.getItem().getMaterial();
                _SweaponAttrEnchantLevel = Sweapon.getAttrEnchantLevel();
            }
            if (weapon != null) {
                _weaponId = weapon.getItem().getItemId();
                _weaponType = weapon.getItem().getType1();
                _weaponType2 = weapon.getItem().getType();// 변경
                _weaponAddHit = weapon.getItem().getHitModifier() + weapon.getHitByMagic();
                _weaponAddDmg = weapon.getItem().getDmgModifier() + weapon.getDmgByMagic();
                _weaponSmall = weapon.getItem().getDmgSmall();
                _weaponLarge = weapon.getItem().getDmgLarge();
                _weaponBless = weapon.getItem().getBless();
                if (_weaponType == 0) {
                    _weaponEnchant = 0;
                }
                if (_weaponType != 20 && _weaponType != 62) {
                    _weaponEnchant = weapon.getEnchantLevel() - weapon.get_durability(); // 손상분 마이너스
                } else {
                    _weaponEnchant = weapon.getEnchantLevel();
                }
                _weaponMaterial = weapon.getItem().getMaterial();
                if (_weaponType == 20) { // 아로의 취득
                    _arrow = _pc.getInventory().getArrow();
                    if (_arrow != null) {
                        _weaponBless = _arrow.getItem().getBless();
                        _weaponMaterial = _arrow.getItem().getMaterial();
                    }
                }
                if (_weaponType == 62) { // 스팅의 취득
                    _sting = _pc.getInventory().getSting();
                    if (_sting != null) {
                        _weaponBless = _sting.getItem().getBless();
                        _weaponMaterial = _sting.getItem().getMaterial();
                    }
                }
                _weaponDoubleDmgChance = weapon.getItem().getDoubleDmgChance();
                _weaponAttrLevel = weapon.getAttrEnchantLevel();
            }
            // 스테이터스에 의한 추가 대미지 보정
            if (_weaponType == 20) { // 활의 경우는 DEX치 참조
                _statusDamage = dexDmg[_pc.getAbility().getTotalDex()];
            } else if (_weaponType2 == 17) {// 키링크는 인트영향
                _statusDamage = intDmg[_pc.getAbility().getTotalInt()];
            } else {
                _statusDamage = strDmg[_pc.getAbility().getTotalStr()];
            }
        } else if (attacker instanceof L1NpcInstance) {
            _npc = (L1NpcInstance) attacker;
            if (target instanceof L1PcInstance) {
                _targetPc = (L1PcInstance) target;
                _calcType = NPC_PC;
            } else if (target instanceof L1NpcInstance) {
                _targetNpc = (L1NpcInstance) target;
                _calcType = NPC_NPC;
            }
        }
        _target = target;
        _targetId = target.getId();
        _targetX = target.getX();
        _targetY = target.getY();
    }

    /* ■■■■■■■■■■■■■■■■ 명중 판정 ■■■■■■■■■■■■■■■■ */

    public boolean calcHit() {
        if (_calcType == PC_PC || _calcType == PC_NPC) {
            if (_pc == null || _target == null)
                return _isHit;
            // 키링크 일경우 상대방 앱솔일경우 무시
            if (_weaponType2 == 17) {
                if (_target.hasSkillEffect(L1SkillId.ABSOLUTE_BARRIER)) {
                    _isHit = false;
                } else {
                    _isHit = true;
                }
                return _isHit;
            }
    		if (_pc instanceof L1RobotInstance && _pc.isElf()) {
				if (!_pc.getLocation().isInScreen(_target.getLocation())) {
					_isHit = false;
					return _isHit;
				}
			}
            if (!(_pc instanceof L1RobotInstance) && _weaponType == 20 && _weaponId != 190 && _weaponId != 10000 && _weaponId != 202011 && _arrow == null) {
                _isHit = false; // 화살이 없는 경우는 미스
            } else if (_weaponType == 62 && _sting == null) {
                _isHit = false; // 스팅이 없는 경우는 미스
            } else if (!_pc.glanceCheck(_targetX, _targetY)) {
                _isHit = false; // 공격자가 플레이어의 경우는 장애물 판정
            } else if (_weaponId == 247 || _weaponId == 248 || _weaponId == 249) {
                _isHit = false; // 시련의 검B~C 공격 무효
            } else if (_pc.getMapId() == 631 || _pc.getMapId() == 514) {
            	_isHit = false;
            } else if (_calcType == PC_PC) {
                _isHit = calcPcPcHit();
                if (_isHit == false) {
                    _pc.sendPackets(new S_SkillSound(_target.getId(), 13418));// 이펙트
                    _targetPc.sendPackets(new S_SkillSound(_target.getId(), 13418));// 이펙트
                }
            } else if (_calcType == PC_NPC) {
                /** 바포방 뚫어 방지 **/
                if (_pc.바포방 != true && _pc.getX() == 32758 && _pc.getY() == 32878 && _pc.getMapId() == 2) {
                    return _isHit = false;
                } else if (_pc.바포방 != true && _pc.getX() == 32794 && _pc.getY() == 32790 && _pc.getMapId() == 2) {
                    return _isHit = false;
                } else {
                    _isHit = calcPcNpcHit();
                }
                /** 바포방 뚫어 방지 **/
                if (_isHit == false) {
                    _pc.sendPackets(new S_SkillSound(_targetNpc.getId(), 13418));// 미스 이펙트
                }
            }
        } else if (_calcType == NPC_PC) {
            _isHit = calcNpcPcHit();
            if (_isHit == false) {
                _targetPc.sendPackets(new S_SkillSound(_target.getId(), 13418));// 이펙트
            }
        } else if (_calcType == NPC_NPC) {
            _isHit = calcNpcNpcHit();
        } else if (_targetNpc.getNpcTemplate().get_gfxid() == 7684 && !_pc.hasSkillEffect(PAP_FIVEPEARLBUFF)) {
            _isHit = false;
            return _isHit;
        } else if (_targetNpc.getNpcTemplate().get_gfxid() == 7805 && !_pc.hasSkillEffect(PAP_MAGICALPEARLBUFF)) {
            _isHit = false;
            return _isHit;
        }
        return _isHit;
    }

    // ●●●● 플레이어로부터 플레이어에의 명중 판정 ●●●●
    /*
     * PC에의 명중율 =(PC의 Lv＋클래스 보정＋STR 보정＋DEX 보정＋무기 보정＋DAI의 매수/2＋마법 보정)×0.68－10 이것으로 산출된 수치는 자신이 최대 명중(95%)을 주는 일을 할 수 있는 상대측 PC의 AC 거기로부터 상대측 PC의 AC가
     * 1좋아질 때마다 자명중율로부터 1당겨 간다 최소 명중율5% 최대 명중율95%
     */
    private boolean calcPcPcHit() {

        if (_pc.hasSkillEffect(L1SkillId.ABSOLUTE_BLADE)) {
            if (_target.hasSkillEffect(ABSOLUTE_BARRIER)) {
                int chance = _pc.getLevel() - 79;
                if (chance >= 10)
                    chance = 10;
                if (chance >= _random.nextInt(100) + 1) {
                    _targetPc.removeSkillEffect(ABSOLUTE_BARRIER);
                    _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 14539));
                    _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 14539));
                }
            }
        }
        if (_targetPc.hasSkillEffect(ABSOLUTE_BARRIER) || _targetPc.hasSkillEffect(ICE_LANCE))
            return false;

        /** 배틀존 **/
        if (_calcType == PC_PC) {
            if (_pc.getMapId() == 5153) {
                if (_pc.get_DuelLine() == _targetPc.get_DuelLine()) {
                    return false;
                }
            }
        }

        _hitRate = _pc.getLevel();

        /** 스탯 + 무기에 따른 공성 **/
        _hitRate += PchitAdd();

        /** 전사일경우 50부터 렙당 명중+2 상승 **/
        if (_pc.is전사()) {
            _hitRate += Math.max(0, _pc.getLevel() - 50) * 2;
        }
        int attackerDice = _random.nextInt(20) + 1 + _hitRate - 10;

        /** 타겟PC의 회피 스킬 연산 **/
        attackerDice += toPcSkillHit();

        int defenderValue = (int) (_targetPc.getAC().getAc() * 1.5) * -1;
        int levelDmg = (int) ((_targetPc.getLevel() - _pc.getLevel()) * 2.0);
        if (levelDmg <= 0)
            levelDmg = 0;

        defenderValue += levelDmg;

        /** DefenderDice 연산 **/
        int defenderDice = toPcDD(defenderValue);

        // 캐릭터 공성데이터 추가
        try {
            if (_pc.isCrown()) {
                _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(0);
            } else if (_pc.isKnight()) {
                _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(1);
            } else if (_pc.isElf()) {
                _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(2);
            } else if (_pc.isWizard()) {
                _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(3);
            } else if (_pc.isDarkelf()) {
                _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(4);
            } else if (_pc.isBlackwizard()) {
                _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(5);
            } else if (_pc.isDragonknight()) {
                _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(6);
            } else if (_pc.is전사()) {
            	 _hitRate += CharacterHitRate.getInstance().getCharacterHitRate(7);
                
            }
        } catch (Exception e) {
            System.out.println("Character Add Damege Error");
        }

        /** 히트 최종 연산 **/
        if (hitRateCal(attackerDice, defenderDice, _hitRate - 9, _hitRate + 10))
            return false;

        if (_pc.getLocation().getLineDistance(_targetPc.getLocation()) >= 3 && _weaponType != 20 && _weaponType != 62) { // 타겟과의 거리가 3이상이면서 활이나 스팅이
                                                                                                                         // 아니면 공격미스 ㅎ;
            _hitRate = 0;
        }
        int rnd = _random.nextInt(100) + 1;
        if (_weaponType == 20 && _hitRate > rnd) { // 활의 경우 , 히트 했을 경우에서도 ER에서의 회피를 재차 실시한다.
            return calcErEvasion();
        }

        int _jX = _pc.getX() - _targetPc.getX();
        int _jY = _pc.getY() - _targetPc.getY();

        if (_weaponType == 24) { // 창
            if ((_jX > 3 || _jX < -3) && (_jY > 3 || _jY < -3)) {
                _hitRate = 0;
            }
        } else if (_weaponType == 20 || _weaponType == 62) {// 활
            if ((_jX > 15 || _jX < -15) && (_jY > 15 || _jY < -15)) {
                _hitRate = 0;
            }
        } else {
            if ((_jX > 2 || _jX < -2) && (_jY > 2 || _jY < -2)) {
                _hitRate = 0;
            }
        }

        // System.out.println("Final 값 : _hitRate:"+_hitRate+" rnd:"+rnd+" 결과:"+(_hitRate >= rnd));
        // return _hitRate >= rnd;
        // 미스이팩 넣기
        if (_hitRate >= rnd) {
            return true;
        } else {
            _pc.sendPackets(new S_SkillSound(_targetPc.getId(), 13418));// 이펙트
            _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 13418));// 이펙트
            return false;
        }
    }

    // ●●●● 플레이어로부터 NPC 에의 명중 판정 ●●●●
    private boolean calcPcNpcHit() {
        /** SPR체크 **/
        if (_pc.AttackSpeedCheck2 >= 1) {
            if (_pc.AttackSpeedCheck2 == 1) {
                _pc.AttackSpeed2 = System.currentTimeMillis();
                _pc.sendPackets(new S_SystemMessage("\\fY[체크시작]"));
            }
            _pc.AttackSpeedCheck2++;
            if (_pc.AttackSpeedCheck2 >= 12) {
                _pc.AttackSpeedCheck2 = 0;
                double k = (System.currentTimeMillis() - _pc.AttackSpeed2) / 10D;
                String s = String.format("%.0f", k);
                _pc.AttackSpeed2 = 0;
                _pc.sendPackets(new S_ChatPacket(_pc, "-----------------------------------------"));
                _pc.sendPackets(new S_ChatPacket(_pc, "해당변신은 " + s + "이 공속으로 적절한값입니다."));
                _pc.sendPackets(new S_ChatPacket(_pc, "-----------------------------------------"));
            }
        }
        /** SPR체크 **/


        try {
        	if(_pc.isCrown()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(0);
        	} else if(_pc.isKnight()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(1);
        	} else if(_pc.isElf()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(2);
        	} else if(_pc.isWizard()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(3);
        	} else if(_pc.isDarkelf()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(4);
        	} else if(_pc.isBlackwizard()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(5);
        	} else if(_pc.isDragonknight()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(6);
        	} else if(_pc.is전사()){
        		_hitRate += CharacterHitRate.getInstance().getCharacterHitRate(7);
        	}
        } catch (Exception e){
        	System.out.println("Character Add Damege Error");
        }
  
        // NPC에의 명중율 =(PC의 Lv＋클래스 보정＋STR 보정＋DEX 보정＋무기 보정＋DAI의 매수/2＋마법 보정)×5－{NPC의 AC×(-5)}
        _hitRate = _pc.getLevel();

        /** 스탯 + 무기에 따른 공성 **/
        _hitRate += PchitAdd();

        if (_targetNpc.getAc() < 0) {
            int acrate = _targetNpc.getAc() * -1;
            double aaaa = (_hitRate / 100) * (acrate / 2.5D);
            _hitRate -= (int) aaaa;
        }

        if (_pc.getLevel() < _targetNpc.getLevel()) {
            _hitRate -= _targetNpc.getLevel() - _pc.getLevel();
        }
        if (_hitRate > 95) {
            _hitRate = 95;
        } else if (_hitRate < 5) {
            _hitRate = 5;
        }

        int _jX = _pc.getX() - _targetNpc.getX();
        int _jY = _pc.getY() - _targetNpc.getY();

        if (_weaponType == 24) { // 창일때
            if ((_jX > 3 || _jX < -3) && (_jY > 3 || _jY < -3)) {
                _hitRate = 0;
            }
        } else if (_weaponType == 20 || _weaponType == 62) {// 활일때
            if ((_jX > 15 || _jX < -15) && (_jY > 15 || _jY < -15)) {
                _hitRate = 0;
            }
        } else {
            if ((_jX > 2 || _jX < -2) && (_jY > 2 || _jY < -2)) {
                _hitRate = 0;
            }
        }
        
        int npcId = _targetNpc.getNpcTemplate().get_npcId(); // 씨엠디오류나옴
        if (npcId >= 45912 && npcId <= 45915 && !_pc.hasSkillEffect(STATUS_HOLY_WATER)) {
            _hitRate = 0;
        }
        if (npcId == 45916 && !_pc.hasSkillEffect(STATUS_HOLY_MITHRIL_POWDER)) {
            _hitRate = 0;
        }
        if (npcId == 45941 && !_pc.hasSkillEffect(STATUS_HOLY_WATER_OF_EVA)) {
            _hitRate = 0;
        }
        if (npcId == 45752 && !_pc.hasSkillEffect(STATUS_CURSE_BARLOG)) {
            _hitRate = 0;
        }
        if (npcId == 45753 && !_pc.hasSkillEffect(STATUS_CURSE_BARLOG)) {
            _hitRate = 0;
        }
        if (npcId == 45675 && !_pc.hasSkillEffect(STATUS_CURSE_YAHEE)) {
            _hitRate = 0;
        }
        if (npcId == 81082 && !_pc.hasSkillEffect(STATUS_CURSE_YAHEE)) {
            _hitRate = 0;
        }
        if (npcId == 45625 && !_pc.hasSkillEffect(STATUS_CURSE_YAHEE)) {
            _hitRate = 0;
        }
        if (npcId == 45674 && !_pc.hasSkillEffect(STATUS_CURSE_YAHEE)) {
            _hitRate = 0;
        }
        if (npcId == 45685 && !_pc.hasSkillEffect(STATUS_CURSE_YAHEE)) {
            _hitRate = 0;
        }
        if (npcId >= 46068 && npcId <= 46091 && _pc.getTempCharGfx() == 6035) {
            _hitRate = 0;
        }
        if (npcId >= 46092 && npcId <= 46106 && _pc.getTempCharGfx() == 6034) {
            _hitRate = 0;
        }
        if (_targetNpc.getNpcTemplate().get_gfxid() == 7684 && !_pc.hasSkillEffect(PAP_FIVEPEARLBUFF)) { // 오색진주
            _hitRate = 0;
        }
        if (_targetNpc.getNpcTemplate().get_gfxid() == 7805 && !_pc.hasSkillEffect(PAP_MAGICALPEARLBUFF)) { // 신비진주
            _hitRate = 0;
        }

        return _hitRate >= _random.nextInt(100) + 1;
    }

    // ●●●● NPC 로부터 플레이어에의 명중 판정 ●●●●
    private boolean calcNpcPcHit() {

        if (_targetPc.hasSkillEffect(ABSOLUTE_BARRIER)) {
            return false;
        }
        _hitRate += _npc.getLevel() * 1.2;

        if (_npc instanceof L1PetInstance) { // 펫은 LV1마다 추가 명중+2
            _hitRate += _npc.getLevel() * 2;
            _hitRate += ((L1PetInstance) _npc).getHitByWeapon();
        }

        _hitRate += _npc.getHitup();

        int attackerDice = _random.nextInt(20) + 1 + _hitRate - 1;

        /** 타겟PC의 회피 스킬 연산 **/
        attackerDice += toPcSkillHit();

        int defenderValue = (_targetPc.getAC().getAc()) * -1;

        /** DefenderDice 연산 **/
        int defenderDice = toPcDD(defenderValue);

        /** 히트 최종 연산 **/
        if (hitRateCal(attackerDice, defenderDice, _hitRate, _hitRate + 19))
            return false;

        int rnd = _random.nextInt(100) + 1;

        // NPC의 공격 레인지가 10이상의 경우로, 2이상 떨어져 있는 경우활공격으로 간주한다
        if (_npc.getNpcTemplate().get_ranged() >= 10 && _hitRate > rnd
                && _npc.getLocation().getTileLineDistance(new Point(_targetX, _targetY)) >= 2) {
            return calcErEvasion();
        }

        return _hitRate >= rnd;
    }

    // ●●●● NPC 로부터 NPC 에의 명중 판정 ●●●●
    private boolean calcNpcNpcHit() {
        int target_ac = 10 - _targetNpc.getAC().getAc();
        int attacker_lvl = _npc.getNpcTemplate().get_level();

        if (target_ac != 0) {
            _hitRate = (100 / target_ac * attacker_lvl); // 피공격자 AC = 공격자 Lv  // 의 때 명중율 100%
        } else {
            _hitRate = 100 / 1 * attacker_lvl;
        }

        if (_npc instanceof L1PetInstance) { // 펫은 LV1마다 추가 명중+2
            _hitRate += _npc.getLevel() * 2;
            _hitRate += ((L1PetInstance) _npc).getHitByWeapon();
        }

        if (_hitRate < attacker_lvl) {
            _hitRate = attacker_lvl; // 최저 명중율=Lｖ％
        }
        if (_hitRate > 95) {
            _hitRate = 95; // 최고 명중율은 95%
        }
        if (_hitRate < 5) {
            _hitRate = 5; // 공격자 Lv가 5 미만때는 명중율 5%
        }

        int rnd = _random.nextInt(100) + 1;
        return _hitRate >= rnd;
    }

    // ●●●● ER에 의한 회피 판정 ●●●●
    private boolean calcErEvasion() {
        int er = _targetPc.get_PlusEr();

        int rnd = _random.nextInt(130) + 1;
        return er < rnd;
    }

    /* ■■■■■■■■■■■■■■■ 대미지 산출 ■■■■■■■■■■■■■■■ */

    public int calcDamage() {
        try {
            switch (_calcType) {
            case PC_PC:
                _damage = calcPcPcDamage();
                // 타이탄 락 : HP가 40% 미만일때 근접공격을 확률적으로 반사.
                if (_weaponType != 20 && _weaponType != 62 && _weaponType2 != 17 && _weaponType2 != 19) { // 활이 아니라면 락 발동.
                    if (SkillsTable.getInstance().spellCheck(_targetPc.getId(), 238)) {
                        int percent = (int) Math.round(((double) _targetPc.getCurrentHp() / (double) _targetPc.getMaxHp()) * 100);
                        int chance = _random.nextInt(100) + 1;
                        int 락구간 = 0;
                        if (_target.get락구간상승() != 0) {
                            락구간 += _target.get락구간상승();
                        }
                        // System.out.println("락구간 얼마상승하는가" + 락구간);
                        if (!_targetPc.isstop() && percent <= (40 + 락구간 + _targetPc.getRisingUp()) && chance <= 23) {
                            // System.out.println("락이 발동하는가??");
                            if (_targetPc.getInventory().checkItem(41246, 10)) {
                                _pc.receiveCounterBarrierDamage(_targetPc, 타이탄대미지());
                                _damage = 0;
                                _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 12555));
                              //  _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 12555));
                                _targetPc.getInventory().consumeItem(41246, 10);
                            } else {
                                _targetPc.sendPackets(new S_SystemMessage("타이탄 락: 촉매제가 부족합니다."));
                            }
                        }
                    }
                } else { // 그렇지 않다면 블릿 발동
                    if (_weaponType2 != 17 && _weaponType2 != 19) {
                        if (SkillsTable.getInstance().spellCheck(_targetPc.getId(), 239)) {
                            int percent = (int) Math.round(((double) _targetPc.getCurrentHp() / (double) _targetPc.getMaxHp()) * 100);
                            int chance = _random.nextInt(100) + 1;
                            int 락구간 = 0;
                            if (_target.get락구간상승() != 0) {
                                락구간 += _target.get락구간상승();
                            }
                            // System.out.println("락구간 얼마상승하는가" + 락구간);
                            if (!_targetPc.isstop() && percent <= (40 + 락구간 + _targetPc.getRisingUp()) && chance <= 23) {
                                if (_targetPc.getInventory().checkItem(41246, 10)) {
                                    _pc.receiveCounterBarrierDamage(_targetPc, 타이탄대미지());
                                    _damage = 0;
                                    _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 12557));
                                  //  _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 12557));
                                    _targetPc.getInventory().consumeItem(41246, 10);
                                } else {
                                    _targetPc.sendPackets(new S_SystemMessage("타이탄 블릿: 촉매제가 부족합니다."));
                                }
                            }
                        }
                    } else { // 그렇지 않다면 매직 발동
                        if (SkillsTable.getInstance().spellCheck(_targetPc.getId(), 240)) {
                            int percent = (int) Math.round(((double) _targetPc.getCurrentHp() / (double) _targetPc.getMaxHp()) * 100);
                            int chance = _random.nextInt(100) + 1;
                            int 락구간 = 0;
                            if (_target.get락구간상승() != 0) {
                                락구간 += _target.get락구간상승();
                            }
                            // System.out.println("락구간 얼마상승하는가" + 락구간);
                            if (!_targetPc.isstop() && percent <= (40 + 락구간 + _targetPc.getRisingUp()) && chance <= 23) {
                                if (this._targetPc.getInventory().checkItem(41246, 10)) {
                                    if (this._calcType == 1)
                                        this._pc.receiveCounterBarrierDamage(this._targetPc, 타이탄대미지());
                                    else if (this._calcType == 2)
                                        this._npc.receiveCounterBarrierDamage(this._targetPc, 타이탄대미지());
                                    _damage = 0;
                                    this._targetPc.sendPackets(new S_SkillSound(this._targetPc.getId(), 12559));
                                   // this._targetPc.broadcastPacket(new S_SkillSound(this._targetPc.getId(), 12559));
                                    this._targetPc.getInventory().consumeItem(41246, 10);
                                } else {
                                    this._targetPc.sendPackets(new S_SystemMessage("타이탄 매직: 촉매제가 부족합니다."));
                                }
                            }
                        }
                    }
                }
                break;
            case PC_NPC:
                _damage = calcPcNpcDamage();
                break;
            case NPC_PC:
                _damage = calcNpcPcDamage();
                // 타이탄 락 : HP가 40% 미만일때 근접 공격을 확률적으로 반사.
                int bowactid = _npc.getNpcTemplate().getBowActId();
                if (bowactid != 66) {
                    if (SkillsTable.getInstance().spellCheck(_targetPc.getId(), 238)) {
                        int percent = (int) Math.round(((double) _targetPc.getCurrentHp() / (double) _targetPc.getMaxHp()) * 100);
                        int chance = _random.nextInt(100) + 1;
                        int 락구간 = 0;
                        if (_target.get락구간상승() != 0) {
                            락구간 += _target.get락구간상승();
                        }
                        // System.out.println("락구간 얼마상승하는가" + 락구간);
                        if (!_targetPc.isstop() && percent <= (40 + 락구간 + _targetPc.getRisingUp()) && chance <= 23) {
                            if (_targetPc.getInventory().checkItem(41246, 10)) {
                                _npc.receiveCounterBarrierDamage(_targetPc, 타이탄대미지());
                                _damage = 0;
                                _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 12555));
                               // _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 12555));
                                _targetPc.getInventory().consumeItem(41246, 10);
                            } else {
                                _targetPc.sendPackets(new S_SystemMessage("타이탄 락: 촉매제가 부족합니다."));
                            }
                        }
                    }
                } else {
                    // 타이탄 블릿 : HP가 40% 미만일때 원거리 공격을 확률적으로 반사.
                    if (SkillsTable.getInstance().spellCheck(_targetPc.getId(), 239)) {
                        int percent = (int) Math.round(((double) _targetPc.getCurrentHp() / (double) _targetPc.getMaxHp()) * 100);
                        int chance = _random.nextInt(100) + 1;
                        int 락구간 = 0;
                        if (_target.get락구간상승() != 0) {
                            락구간 += _target.get락구간상승();
                        }
                        // System.out.println("락구간 얼마상승하는가" + 락구간);
                        if (!_targetPc.isstop() && percent <= (40 + 락구간 + _targetPc.getRisingUp()) && chance <= 23) {
                            if (_targetPc.getInventory().checkItem(41246, 10)) {
                                _npc.receiveCounterBarrierDamage(_targetPc, 타이탄대미지());
                                _damage = 0;
                                _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 12557));
                               // _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 12557));
                                _targetPc.getInventory().consumeItem(41246, 10);
                            } else {
                                _targetPc.sendPackets(new S_SystemMessage("타이탄 블릿: 촉매제가 부족합니다."));
                            }
                        }
                    }
                }
                break;
            case NPC_NPC:
                _damage = calcNpcNpcDamage();
                break;
            default:
                break;
            }
        } catch (Exception e) {
        }
        return _damage;
    }

    // ●●●● 플레이어로부터 플레이어에의 대미지 산출 ●●●●
    public int calcPcPcDamage() {
		if (_pc instanceof L1RobotInstance) {
			if (!_targetPc.isRobot()) {
				if (_pc.getCurrentWeapon() == 20) { // 활
					return _random.nextInt(70) + 40;
				} else {
					return _random.nextInt(80) + 30;
				}
			} else {
				return 50;
			}

		}
        int weaponMaxDamage = _weaponSmall; // + _weaponAddDmg;

        int weaponDamage = 0;

        if ((_pc.getZoneType() == 1 && _targetPc.getZoneType() == 0) || (_pc.getZoneType() == 1 && _targetPc.getZoneType() == -1)) {
            _isHit = false;
            // 세이프티존에서 노멀/컴뱃존 공격 불가
        }

        /** 포효의이도류 인첸당 발동확률증가 **/
        if (_weaponId == 203018) {
            _weaponDoubleDmgChance += _pc.getWeapon().getEnchantLevel();
        }
        if (_weaponType == 58) { // 크로우
        	int crowchance = _random.nextInt(100) + 1;
        	if(crowchance <= _weaponDoubleDmgChance){
        		weaponDamage = weaponMaxDamage + _weaponAddDmg;
                // _attackType = 2;
                _pc.sendPackets(new S_SkillSound(_pc.getId(), 3671));
                _pc.broadcastPacket(new S_SkillSound(_pc.getId(), 3671));
        	}else{
        		weaponDamage = _random.nextInt(weaponMaxDamage) + _weaponAddDmg + 1;
        	}
        }else if (_weaponType == 0) { // 맨손
            weaponDamage = 0;
        } else {
            weaponDamage = _random.nextInt(weaponMaxDamage) + _weaponAddDmg + 1;
        }

        if (_pc.hasSkillEffect(SOUL_OF_FLAME)) {
            if (_weaponType != 20 && _weaponType != 62) {
                // weaponDamage = weaponMaxDamage + 5;
                weaponDamage = weaponMaxDamage + _weaponAddDmg;
            }
        }
		/** 축복주문서무기 추타관련 **/
		/*if (_weaponType != 0) {
			if (weapon.getBless() == 0 || weapon.getBless() == 128) {
				weaponDamage += 3;
			}
		}*/
        if(_weaponType != 0 ){
            if (_weaponType != 20 && _weaponType != 62) { // 근거리
                int Dmgcritical = CalcStat.calcDmgCritical(_pc.getAbility().getTotalStr())+_pc.getDmgCritical();
                int chance = _random.nextInt(100) + 1;
                //휘장 치명타
                if (_pc.getInventory().checkEquipped(900032)){
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(900032);
                	if(item.getEnchantLevel() == 6){
                		Dmgcritical += 1;
                	}else if(item.getEnchantLevel() == 7){
                		Dmgcritical += 3;
                	}else if(item.getEnchantLevel() >= 8){
                		Dmgcritical += 5;
                	}
                }/*if (_pc.getInventory().checkEquipped(22208)){ // 발라완력
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(22208);
                	if(item.getEnchantLevel() == 7){
                		Dmgcritical += 1;
                	}else if(item.getEnchantLevel() == 8){
                		Dmgcritical += 2;
                	}else if(item.getEnchantLevel() >= 9){
                		Dmgcritical += 3;
                	}
                }if (_pc.getInventory().checkEquipped(22209)){ //발라인내
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(22209);
                	if(item.getEnchantLevel() == 7){
                		Dmgcritical += 1;
                	}else if(item.getEnchantLevel() == 8){
                		Dmgcritical += 2;
                	}else if(item.getEnchantLevel() >= 9){
                		Dmgcritical += 3;
                	}
                }*/
                /** 발라카스의 일격 **/
         		if (_pc.getInventory().checkEquipped(22208) || _pc.getInventory().checkEquipped(22209)
         				|| _pc.getInventory().checkEquipped(22210) || _pc.getInventory().checkEquipped(22211)) {
         			int chancess = _random.nextInt(100);
         			if (chancess <= 8) {
         				weaponDamage *= 1.3;
         				S_UseAttackSkill packet = new S_UseAttackSkill(_target, _target.getId(), 15841, _targetX, _targetY,
         						ActionCodes.ACTION_Attack, false);
         				_pc.sendPackets(packet);
         				Broadcaster.broadcastPacket(_pc, packet);
         			}
         		}
                if (chance <= Dmgcritical) {
                    weaponDamage = weaponMaxDamage + _weaponAddDmg;
                    _isCritical = true;
                }
            } else {
                int Bowcritical = CalcStat.calcBowCritical(_pc.getAbility().getTotalDex())+_pc.getBowDmgCritical();
                int chance = _random.nextInt(100) + 1;
              //휘장 치명타
                if (_pc.getInventory().checkEquipped(900033)){
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(900033);
                	if(item.getEnchantLevel() == 6){
                		Bowcritical += 1;
                	}else if(item.getEnchantLevel() == 7){
                		Bowcritical += 3;
                	}else if(item.getEnchantLevel() >= 8){
                		Bowcritical += 5;
                	}
                }/*if (_pc.getInventory().checkEquipped(22210)){
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(22210);
                	if(item.getEnchantLevel() == 7){
                		Bowcritical += 1;
                	}else if(item.getEnchantLevel() == 8){
                		Bowcritical += 2;
                	}else if(item.getEnchantLevel() >= 9){
                		Bowcritical += 3;
                	}
                }*/
                /** 발라카스의 일격 **/
        		if (_pc.getInventory().checkEquipped(22208) || _pc.getInventory().checkEquipped(22209)
        				|| _pc.getInventory().checkEquipped(22210) || _pc.getInventory().checkEquipped(22211)) {
        			int chancess = _random.nextInt(100);
        			if (chancess <= 8) {
        				weaponDamage *= 1.3;
        				S_UseAttackSkill packet = new S_UseAttackSkill(_target, _target.getId(), 15841, _targetX, _targetY,
        						ActionCodes.ACTION_Attack, false);
        				_pc.sendPackets(packet);
        				Broadcaster.broadcastPacket(_pc, packet);
        			}
        		}
                if (chance <= Bowcritical) {
                    weaponDamage = weaponMaxDamage + _weaponAddDmg;
                    _isCritical = true;
                }
    	        }
            }
        int weaponTotalDamage = weaponDamage + _weaponEnchant;
        boolean secondw = false;
        if (_pc.is전사() && _pc.hasSkillEffect(L1SkillId.SLAYER) && _pc.getSecondWeapon() != null) {
            int ran = _random.nextInt(100);
            if (ran < 50) {
                secondw = true;
                weaponMaxDamage = _SweaponSmall + _SweaponAddDmg;
            }
        }

        if (_weaponType == 54 && _pc.hasSkillEffect(L1SkillId.ASSASSIN)) {
            if (!_pc.getInventory().checkEquipped(20077) && !_pc.getInventory().checkEquipped(120077) && !_pc.getInventory().checkEquipped(20062)) {

                if (_random.nextInt(100) + 1 <= 60) {
                    weaponTotalDamage *= 2.5;
                    _pc.sendPackets(new S_SkillSound(_pc.getId(), 14547));
                    _pc.broadcastPacket(new S_SkillSound(_pc.getId(), 14547));

                    if (SkillsTable.getInstance().spellCheck(_pc.getId(), 241)) {
                        int time = 3 + (_pc.getLevel() - 85);
                        if (time > 8)
                            time = 8;
                        _pc.setSkillEffect(L1SkillId.BLAZING_SPIRITS, time * 1000);
                        _pc.sendPackets(new S_NewSkillIcon(L1SkillId.BLAZING_SPIRITS, true, time));
                    }
                    
                }
            } else {
                _pc.sendPackets(new S_SystemMessage("현재 투명상태에서는 해당스킬 발동 무효."));
            }
            _pc.removeSkillEffect(L1SkillId.ASSASSIN);
        }

        if (_weaponType == 54 && _pc.isDarkelf()) {
        	if (_pc.hasSkillEffect(L1SkillId.BLAZING_SPIRITS)) {
        		weaponTotalDamage *= 2.5;
        		_targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 14547));
        		_targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 14547));
        		_pc.sendPackets(new S_AttackCritical(_pc, _targetId, 54));
        		Broadcaster.broadcastPacket(_pc, new S_AttackCritical(_pc, _targetId, 54));
        	} else if ((_random.nextInt(100) + 1) <= (_weaponDoubleDmgChance - weapon.get_durability())) {
        		weaponTotalDamage *= 2.5;
        		_pc.sendPackets(new S_SkillSound(_pc.getId(), 3398));
        		_pc.broadcastPacket(new S_SkillSound(_pc.getId(), 3398));
        	}
        }


        if (_pc.hasSkillEffect(DOUBLE_BRAKE) && (_weaponType == 54 || _weaponType == 58)) { // 더블브레이크 확률 50렙부터 5렙당 1%씩 상승
            int RealSteelLevel = _pc.getLevel();
            if (RealSteelLevel < 45) {
                RealSteelLevel = 45;
            }
            int RealSteelLevelChance = (RealSteelLevel - 45) / 5 + 33;
            if ((_random.nextInt(100) + 1) <= RealSteelLevelChance) {
                weaponTotalDamage *= 2;
                if (_pc.hasSkillEffect(BURNING_SPIRIT)) {
                    _pc.sendPackets(new S_SkillSound(_targetPc.getId(), 6532));
                    Broadcaster.broadcastPacket(_pc, new S_SkillSound(_targetPc.getId(), 6532));
                }
            }
        }
       

        double dmg = weaponTotalDamage + _statusDamage;

        if (_weaponType2 == 17) {
            dmg = L1WeaponSkill.키링크데미지(_pc, _target);
        }
        if (_weaponType != 20 && _weaponType != 62) {
            dmg = weaponTotalDamage + _statusDamage + _pc.getDmgup() + _pc.getDmgRate() + _pc.get_regist_PVPweaponTotalDamage();
        } else {
            dmg = weaponTotalDamage + _statusDamage + _pc.getBowDmgup() + _pc.getBowDmgRate() + _pc.get_regist_PVPweaponTotalDamage();
        }
        if (_pc.hasSkillEffect(BURNING_SPIRIT)) {
            if ((_random.nextInt(100) + 1) <= 33) {
                dmg *= 3 / 2;
            }
        }
        
        if (_weaponType == 20) { // 활
            if (_arrow != null) {
                int add_dmg = _arrow.getItem().getDmgSmall();
                if (add_dmg == 0) {
                    add_dmg = 1;
                }
                dmg = dmg + _random.nextInt(add_dmg) + 1;
            } else if (_weaponId == 190) { // 사이하의 활
                dmg = dmg + _random.nextInt(15);

            } else if (_pc.getTempCharGfx() == 7959) { // 천상의 활
                dmg = dmg + _random.nextInt(13);
            }
        } else if (_pc.getTempCharGfx() == 202011) { // 가이아의격노
            dmg = dmg + _random.nextInt(15);

        } else if (_weaponType == 62) { // 암 토토 렛
            int add_dmg = _sting.getItem().getDmgSmall();
            if (add_dmg == 0) {
                add_dmg = 1;
            }
            dmg = dmg + _random.nextInt(add_dmg) + 1;
        }
        dmg = calcBuffDamage(dmg);
    

		//double dmgRate = 1;
        
        /** 본섭 10검이상 추타 +1 표기 효과 **/
        if (_weaponType != 0 && _weaponType != 20) {
			if(_weaponId != 66){
            switch (weapon.getEnchantLevel()) {
            case 10:
                dmg += 1;
                break;
            case 11:
                dmg += 2;
                break;
            case 12:
                dmg += 3;
                break;
            case 13:
                dmg += 4;
                break;
            case 14:
                dmg += 5;
                break;
            case 15:
                dmg += 6;
                break;
            default:
                break;
            }
			}
        }
        
        /** 인첸트에 따른 추타관련 **/
        if (_weaponType != 0 && _weaponType != 20) {
            switch (weapon.getEnchantLevel()) {
            case 7:
                dmg += 1;
                break;
            case 8:
                dmg += 2;
                break;
            case 9:
                dmg += 3;
                break;
            case 10:
                dmg += 4;
                break;
            case 11:
                dmg += 5;
                break;
            case 12:
                dmg += 6;
                break;
            case 13:
                dmg += 7;
                break;
            case 14:
                dmg += 8;
                break;
            case 15:
                dmg += 9;
                break;
            default:
                break;
            }
        }
        /** 드슬 인첸별 추타2씩 **/
        if(_weaponId == 66){
        	dmg += weapon.getEnchantLevel();
        }
        
        /** 붉은 기사의 대검 리뉴얼 **/
        if (_pc.getInventory().checkEquipped(202002) || _pc.getInventory().checkEquipped(203002) || _pc.getInventory().checkEquipped(1136)
                || _pc.getInventory().checkEquipped(1137)) {
            if (_pc.getLawful() < -32760) {
                dmg += 8;
            }
            if (_pc.getLawful() >= -32760 && _pc.getLawful() < -25000) {
                dmg += 6;
            }
            if (_pc.getLawful() >= -25000 && _pc.getLawful() < -15000) {
                dmg += 4;
            }
            if (_pc.getLawful() >= -15000 && _pc.getLawful() < 0) {
                dmg += 2;
            }
            if (_pc.getLawful() >= 0) {
                dmg += 1;
            }
        }
        if (_weaponType2 == 17) {
            dmg = L1WeaponSkill.키링크데미지(_pc, _target);
        }
       // dmg *= dmgRate;
        
        switch (_weaponId) {
        case 307:
        case 308:
        case 309:
        case 310:
        case 311:
        case 313:
        case 314:
            dmg = L1WeaponSkill.블레이즈쇼크(_pc, _targetPc, _weaponEnchant);
            break;
        case 1010:
        case 1011:
        case 1012:
        case 1013:
        case 1014:
            L1WeaponSkill.getDiseaseWeapon(_pc, _targetPc, _weaponId);
            break;
        case 2: // 악운의단검
        case 200002: // 축악운의단검
            dmg = L1WeaponSkill.악운의단검(_pc, _targetPc, weapon);
            break;
        case 12: // 바람칼날단검
        case 203020: // 생명의단검
        case 601: // 파멸의대검
            파멸의대검(dmg);
            break;
        case 204: // 진홍의크로스보우
        case 100204: // 축진홍의크로스보우
        case 86: // 붉은그림자의이도류
            L1WeaponSkill.붉은그림자의이도류(_pc, _targetPc);
            break;
        case 1115: // 신묘장검
        case 1117: // 신묘크로
            dmg += getEbHP(_pc, _target, 8981, _weaponEnchant);
            break;
        case 1116: // 신묘지팡이
        case 1118: // 신묘장궁
        case 202011: // 가이야의격노
            dmg += getEbMP1(_pc, _target, 8981, _weaponEnchant);
            break;
        case 1109: // 마족크로우
        case 1113: // 마족검
        case 1114: // 마족양손검
        case 203011: // 마족도끼
            dmg += getEbHP(_pc, _target, 8150, _weaponEnchant);
            break;
        case 1110: // 마족지팡이
        case 1112: // 마족키링크
        case 1111: // 마족활
            dmg += getEbMP(_pc, _target, 8152, _weaponEnchant);
            break;
        case 1108: // 마족체인
            dmg += getEbHP(_pc, _target, 8150, _weaponEnchant);
            L1WeaponSkill.체인소드(_pc);
            break;
        case 1119: // 극한의 체인소드
            dmg += 극한의체인소드(_pc, _target, 3685, _weaponEnchant);
            L1WeaponSkill.체인소드(_pc);
            break;
        case 1123: // 블러드서커
        case 202013:
            L1WeaponSkill.체인소드(_pc);
            블러드서커(dmg, _weaponEnchant);
            break;
        case 500:// 소멸자의체인소드
        case 501:// 파멸자의체인소드
        case 1104:// 엘모어체인소드
        case 1132:// 베테르랑체인소드
            L1WeaponSkill.체인소드(_pc);
            break;
        case 203017:
            L1WeaponSkill.섬멸자의체인소드(_pc);
            if (weapon.getEnchantLevel() >= 10)
            dmg += L1WeaponSkill.섬멸자(_pc, _target, 4077, _weaponEnchant);
            break;
        case 203006://태풍의도끼
        	if (weapon.getEnchantLevel() >= 10)
        	 dmg += L1WeaponSkill.태풍도끼(_pc, _target, 7977, _weaponEnchant);
        	break;
            
        case 1136://악몽의장궁
       	 if (weapon.getEnchantLevel() >= 10)
                dmg += L1WeaponSkill.악장(_pc, _target, 14339, _weaponEnchant);
       	break;
        case 203025://진싸
        case 203026:
       	 if (weapon.getEnchantLevel() >= 10)
                dmg += L1WeaponSkill.진싸(_pc, _target, 8032, _weaponEnchant);
       	break;
        case 312:
            dmg = L1WeaponSkill.체인소드블레이즈쇼크(_pc, _targetNpc, _weaponEnchant);
            break;
        case 202001: // 환영의 체인소드
            dmg += L1WeaponSkill.환영의체인소드(_pc, _target, _weaponEnchant);
            L1WeaponSkill.체인소드(_pc);
            break;
        case 1124: // 파괴의 이도류
        case 1125: // 파괴의 크로우
        case 11125:// 축복 파괴의이도류
            dmg += L1WeaponSkill.파괴의이도류크로우(_pc, _target, 9359, _weaponEnchant);
            break;
        case 600: // 뇌신검
            dmg += L1WeaponSkill.뇌신검(_pc, _target, 3940, _weaponEnchant);
            break;
        case 604: // 혹한의 창
            dmg += L1WeaponSkill.혹한의창(_pc, _target, 3704, _weaponEnchant);
            break;
        case 605: // 광풍의 도끼
        case 203015: // 질풍의 도끼
            dmg += L1WeaponSkill.광풍의도끼(_pc, _target, 5524, _weaponEnchant);
            break;
        case 191: // 살천의 활
            dmg += L1WeaponSkill.살천의활(_pc, _target, 9361, _weaponEnchant);
            break;
        case 1135: // 공명의 키링크
            dmg += L1WeaponSkill.공명의키링크(_pc, _target, 5201, _weaponEnchant);
            break;
        case 202012: // 히페리온의 절망
            dmg += L1WeaponSkill.히페리온의절망(_pc, _target, 12248, _weaponEnchant);
            break;
        case 1120: // 냉한의 키링크
            dmg += L1WeaponSkill.냉한의키링크(_pc, _target, 6553, _weaponEnchant);
            break;
        case 283: // 발라카스의 키링크
            dmg += L1WeaponSkill.Redskill(_pc, _target, 10405, _weaponEnchant);
            break;
        case 294: // 군주의 검
            dmg += L1WeaponSkill.군주의검(_pc, _target, 4842, _weaponEnchant);
            break;
        case 58: // 데스나이트의 불검
            dmg += L1WeaponSkill.데스나이트의불검(_pc, _target, _weaponEnchant, 7300);
            break;
        case 54: // 커츠의 검
            dmg += L1WeaponSkill.커츠의검(_pc, _target, _weaponEnchant, 10405);
            break;
        case 124: // 바포메트의지팡이
            dmg += L1WeaponSkill.바포메트의지팡이(_pc, _target, _weaponEnchant, 129);
            break;
        case 202003: // 제로스의 지팡이
            dmg += L1WeaponSkill.제로스의지팡이(_pc, _target, _weaponEnchant, 11760);
            break;
        case 134: // 수정 결정체 지팡이
            dmg += L1WeaponSkill.수정결정체지팡이(_pc, _target, _weaponEnchant, 10405);
            dmg+=getEbMP(_pc, _target, 8152, _weaponEnchant);
            break;
        default:
            dmg += L1WeaponSkill.getWeaponSkillDamage(_pc, _target, _weaponId);
            break;
        }

        if (_weaponType == 0) { // 맨손
            dmg = (_random.nextInt(5) + 4) / 4;
        }

        try {
            dmg += WeaponAddDamage.getInstance().getWeaponAddDamage(_weaponId);
        } catch (Exception e) {
            System.out.println("무기추가대미지에러");
        }
        
        //스킬, 요리 등에 대한 데미지리덕션
        int damagereduction = 0;
        if (_targetPc.hasSkillEffect(COOK_STR) || _targetPc.hasSkillEffect(COOK_DEX) || _targetPc.hasSkillEffect(COOK_INT)) { // 리뉴얼 요리
        	damagereduction += 2;
        }
        if(_targetPc.hasSkillEffect(COOK_GROW)){
        	damagereduction += 2;
        }
        // 전사스킬 : 아머가드 - 캐릭의 AC/10의 데미지감소 효과를 얻는다.
        if (SkillsTable.getInstance().spellCheck(_targetPc.getId(), 237)) {
        	if(_targetPc.getAC().getAc() < -10){
        		damagereduction += _targetPc.getAC().getAc() / -10;
        	}
        }
        

        if (_targetPc.hasSkillEffect(REDUCTION_ARMOR)) {
            int targetPcLvl = _targetPc.getLevel();
            if (targetPcLvl < 50) {
                targetPcLvl = 50;
            }
            damagereduction += (targetPcLvl - 50) / 5 + 1;
        }

        if (_targetPc.hasSkillEffect(EARTH_GUARDIAN)) {
        	damagereduction += 2;
        }
        
        dmg -= 룸티스붉귀데미지감소();

        if (_targetPc.hasSkillEffect(DRAGON_SKIN)) {
            if (_targetPc.getLevel() >= 80) {
            	damagereduction += 5 + ((_targetPc.getLevel() - 78) / 2);
            } else {
            	damagereduction += 5;
            }
        }
        if (_targetPc.hasSkillEffect(PATIENCE)) {
        	damagereduction += 2;
        }        
        if (_targetPc.hasSkillEffect(FEATHER_BUFF_A)) {
        	damagereduction += 3;
        }
        if (_targetPc.hasSkillEffect(FEATHER_BUFF_B)) {
        	damagereduction += 2;
        }
        if (_targetPc.hasSkillEffect(RANK_BUFF_2) || _targetPc.hasSkillEffect(RANK_BUFF_3)
            || _targetPc.hasSkillEffect(RANK_BUFF_4)) {
        
        	damagereduction += 2;
        }
        if (_targetPc.hasSkillEffect(RANK_BUFF_5)){ //정상의가호
        	damagereduction += 8;
        }
        if (_targetPc.hasSkillEffect(CLAN_BUFF4)) {
        	damagereduction += 1;
        }
     /*   for (L1DollInstance doll : _targetPc.getDollList()) {// 마법인형에 의한 대미지 감소.돌골렘인형
			dmg -= doll.getDamageReductionByDoll();
		}
        dmg -= _targetPc.getDamageReductionByArmor(); // 방어구에 의한 대미지 감소
*/        
       /* _ignorereductionbyarmor = armor.getItem().getIgnoreReductionByArmor(); //리덕션무시
        _ignorereductionbyweapon = weapon.getItem().getIgnoreReductionByWeapon(); //리덕션무시
        int ignorereduction = _ignorereductionbyarmor + _ignorereductionbyweapon;
        int damagereductiontotal = _targetPc.getDamageReductionByArmor() + damagereduction;
        
        if(damagereduction >= ignorereduction){
        	damagereduction -= ignorereduction;
        }
        dmg += _ignorereductionbyarmor;
        dmg += _ignorereductionbyweapon;
        if(_pc.getInventory().checkEquipped(1)){
        	if(damagereduction > 0 && damagereduction <= 12){
        		damagereduction = 0;
        	}else{
        		damagereduction -= 12;
        	}
        }*/
        dmg -= damagereduction;
        
        //스킬, 요리 등에 대한 데미지리덕션
        
        
        if (_pc.hasSkillEffect(L1SkillId.RANK_BUFF_3) || _pc.hasSkillEffect(L1SkillId.RANK_BUFF_4)) {
        	dmg += 2;
        }
       
       
        // 클랜버프 pvp        
        if (_pc.hasSkillEffect(L1SkillId.RANK_BUFF_3)){
            dmg += 2;
        }
        if (_pc.hasSkillEffect(L1SkillId.RANK_BUFF_4)){
        	dmg += 2;
        }
        
        
        if (_pc.hasSkillEffect(L1SkillId.DESTROY)) {
            if (_pc.getWeapon().getItem().getType() == 18)
                ArmorDestory();
        } 
        if (_targetPc.hasSkillEffect(ABSOLUTE_BARRIER)) {
            dmg = 0;
        }
        if (_targetPc.hasSkillEffect(ICE_LANCE)) {
            dmg = 0;
        }
        if (_targetPc.hasSkillEffect(EARTH_BIND)) {
            dmg = 0;
        }

        if (_targetPc.hasSkillEffect(PHANTASM)) {
            _targetPc.removeSkillEffect(PHANTASM);
        }
        if (_targetPc.hasSkillEffect(IllUSION_AVATAR)) {
        	dmg += (dmg / 5);
        }
        if (_targetPc.hasSkillEffect(IMMUNE_TO_HARM)) {
        	dmg -= (dmg * 0.3);//4
        }
        dmg += 룸티스검귀추가데미지(); // 검은빛 귀걸이 추가 데미지 처리


		for (L1DollInstance doll : _pc.getDollList()) {// 매직 돌 인형에 의한 추가 대미지
			if (doll == null)
				continue;
			if (_weaponType != 20 && _weaponType != 62) {
				dmg += doll.getDamageByDoll();
			}
			dmg += doll.attackPixieDamage(_pc, _targetPc);
			doll.getPixieGreg(_pc, _targetPc);
		}

        // 전사 스킬 PC - PC
        // 크래쉬 : 공격자에 레벨에 50% 정도를 데미지에 반영한다.
        if (SkillsTable.getInstance().spellCheck(_pc.getId(), 236)) {
            int chance = _random.nextInt(100) + 1;
            if (13 >= chance) { // 크래쉬 : 레벨 나누기 2의 데미지
                //
                int alpha_dmg = _pc.getLevel() / 2;
                if (SkillsTable.getInstance().spellCheck(_pc.getId(), 234)) {// 퓨리 : 크래쉬에서 나온 데미지에 2배
                    chance = _random.nextInt(100) + 1;
                    if (2 >= chance) { // 퓨리 확률
                        dmg += dmg + _pc.getLevel();
                        // 성공시 이팩 2개 나가는거
                        _pc.sendPackets(new S_SkillSound(_targetPc.getId(), 12489));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 12489));
                    }
                }
                dmg += alpha_dmg;
                // 크래쉬는 크래쉬 이팩트 그대로 처리.
                _pc.sendPackets(new S_SkillSound(_targetPc.getId(), 12487));
                _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 12487));
            }
        }

        if (_pc.hasSkillEffect(L1SkillId.주군의버프)) {
            if (_pc.getClanRank() >= L1Clan.수호)
                dmg += 5;
		}
        int dolldamagereduction = 0;
        for (L1DollInstance doll : _targetPc.getDollList()) {// 마법인형에 의한 대미지 감소.돌골렘인형
        	dolldamagereduction = doll.getDamageReductionByDoll();
		}
        dmg -= dolldamagereduction;
        int itemamagereduction= _targetPc.getDamageReductionByArmor(); // 방어구에 의한 대미지 감소
        
        dmg -= itemamagereduction;
        int totaldamagereduction = 0;
        totaldamagereduction = dolldamagereduction + itemamagereduction + damagereduction;	
        if(_pc.getInventory().checkEquipped(202011)){
        	if(_pc.getInventory().checkEquipped(22209)
        		|| _pc.getInventory().checkEquipped(22210)){
        		if(totaldamagereduction > 0 && totaldamagereduction <= 15){
            		dmg += totaldamagereduction;
            	}else{
            		dmg += 15;
            	}	
        	}else{
        		if(totaldamagereduction > 0 && totaldamagereduction <= 12){
        		dmg += totaldamagereduction;
        	}else{
        		dmg += 12;
        	}
        	}
        	
        }
        if((_pc.getInventory().checkEquipped(22208) || _pc.getInventory().checkEquipped(22209)
        		|| _pc.getInventory().checkEquipped(22210) || _pc.getInventory().checkEquipped(22211))
        		&& !_pc.getInventory().checkEquipped(202011)){
        	if(_pc.getInventory().checkEquipped(22208)){
        		L1ItemInstance item = _pc.getInventory().findEquippedItemId(22208);
        		if(item.getEnchantLevel() == 7){
        			dmg += 1;
        		}else if(item.getEnchantLevel() == 8){
        			dmg += 2;
        		}else if(item.getEnchantLevel() == 9){
        			dmg += 3;
        		}
        	}if(_pc.getInventory().checkEquipped(22209)){
        		L1ItemInstance item = _pc.getInventory().findEquippedItemId(22209);
        		if(item.getEnchantLevel() == 7){
        			dmg += 1;
        		}else if(item.getEnchantLevel() == 8){
        			dmg += 2;
        		}else if(item.getEnchantLevel() == 9){
        			dmg += 3;
        		}
        	}if(_pc.getInventory().checkEquipped(22210)){
        		L1ItemInstance item = _pc.getInventory().findEquippedItemId(22210);
        		if(item.getEnchantLevel() == 7){
        			dmg += 1;
        		}else if(item.getEnchantLevel() == 8){
        			dmg += 2;
        		}else if(item.getEnchantLevel() == 9){
        			dmg += 3;
        		}
        	}if(_pc.getInventory().checkEquipped(22211)){
        		L1ItemInstance item = _pc.getInventory().findEquippedItemId(22211);
        		if(item.getEnchantLevel() == 7){
        			dmg += 1;
        		}else if(item.getEnchantLevel() == 8){
        			dmg += 2;
        		}else if(item.getEnchantLevel() == 9){
        			dmg += 3;
        		}
        	}
        	if(totaldamagereduction > 0 && totaldamagereduction <= 3){
        		dmg += totaldamagereduction;
        	}else{
        		dmg += 3;
        	}
        }
        
        /** 대상 속성인첸트에따른 대미지연산 **/
        dmg += 피시속성인첸트효과();

        /** 대상 Buff에 따른 대미지 연산 **/
        //dmg += toPcBuffDmg(dmg);

        /** 캐릭별 추가데미지, 추가리덕션, 확률 **/
        if (_calcType == PC_PC) {
            if (_pc.getAddDamageRate() >= CommonUtil.random(100)) {
                dmg += _pc.getAddDamage();
            }
            if (_targetPc.getAddReductionRate() >= CommonUtil.random(100)) {
                dmg -= _targetPc.getAddReduction();
            }
        }
        /** 캐릭별 추가데미지, 추가리덕션, 확률 **/

        /** 70레벨부터 추가타격 + 1 **/
       // dmg += Math.max(0, _pc.getLevel() - 70) * 1;

        /** 아머브레이크 */
        if (_targetPc.hasSkillEffect(ARMOR_BRAKE)) { // 아머브레이크
            if (_weaponType != 20 && _weaponType != 62) {
                dmg *= 1.25;
            }
        }
        /** 아머브레이크 */

        /** 트루타켓 **/
        if (_targetPc.get트루타켓() > 0) {
            dmg *= 1 + (_targetPc.get트루타켓() / 100);
        }
        /** 트루타켓 **/

        /*** 신규레벨보호 ***/
        /*if (_calcType == PC_PC) {
            int castle_id = L1CastleLocation.getCastleIdByArea(_pc);
            if (castle_id == 0) {
                if (_targetPc.getLevel() < Config.AUTO_REMOVELEVEL || _pc.getLevel() < Config.AUTO_REMOVELEVEL) {
                    dmg /= 2;
                    _pc.sendPackets(new S_SystemMessage("신규 레벨은 대미지의 50%만 가해집니다."));
                    _targetPc.sendPackets(new S_SystemMessage("신규 레벨은 대미지를 50%만 받습니다."));
                }
            }
        }*/
        /*** 신규레벨보호 ***/

        /** 신규혈맹 공격안되게 **/
       if (_calcType == PC_PC) {
            int castle_id = L1CastleLocation.getCastleIdByArea(_pc);
            boolean isAliveBoss = BossAlive.getInstance().isBossAlive(_targetPc.getMapId());
            if (castle_id == 0 && !isAliveBoss ) {
                if (_pc.getClanid() == Config.신규혈맹클랜 || _targetPc.getClanid() == Config.신규혈맹클랜) {
                    if (Config.신규혈맹보호처리) {
                        _isHit = false;
                        _pc.sendPackets(new S_SystemMessage("신규보호 혈맹은 상호간에 공격이 되지 않습니다."));
                        _targetPc.sendPackets(new S_SystemMessage("신규보호 혈맹은 상호간에 공격이 되지 않습니다."));
                    } else {
                        dmg /= 2;
                        _pc.sendPackets(new S_SystemMessage("신규보호혈맹은 대미지의 50%만 가해집니다."));
                        _targetPc.sendPackets(new S_SystemMessage("신규보호혈맹은 대미지를 50%만 받습니다."));
                    }
                }
            }
        }
        /** 신규혈맹 공격안되게 **/

        if (_pc.hasSkillEffect(BURNING_SLASH)) {
            if (_weaponType != 20) {
                dmg += 30;
                _pc.sendPackets(new S_SkillSound(_targetPc.getId(), 6591));
                _pc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 6591));
                _pc.removeSkillEffect(BURNING_SLASH);
            }
        }
    /**/
        // 반역자의방패 대미지감소처리
        if (_targetPc.getInventory().checkEquipped(22263)) {// 반역자의방패
            int chance = _random.nextInt(100);
            L1ItemInstance item = _targetPc.getInventory().findEquippedItemId(22263);
            int enchant = item.getEnchantLevel();
            if (chance <= 1 + (enchant * 2)) {
                dmg -= 50;
                _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 6320));
                _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 6320));
            }
        }
        if (_targetPc.getInventory().checkEquipped(222355)) {// 신성한요정족방패
            int chance = _random.nextInt(100) + 1;
            L1ItemInstance item = _targetPc.getInventory().findEquippedItemId(222355);
            if (chance <= item.getEnchantLevel()) {
                dmg -= 20;
                _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 14543));
                _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 14543));
            }
        }
        // 린드비오르의 가호
        int chance6 = _random.nextInt(100) + 1;
        if (dmg > 25) {
            if (_target != _targetNpc) {
                if (_targetPc.getInventory().checkEquipped(22204)) {// 린드완력
                    if (chance6 <= 5) {
                        short getMp = (short) (_targetPc.getCurrentMp() + 10);
                        _targetPc.setCurrentMp(getMp);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2188));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2188));
                    }
                } else if (_targetPc.getInventory().checkEquipped(22205)) {// 린드예지력
                    if (chance6 <= 5) {
                        short getMp = (short) (_targetPc.getCurrentMp() + 15);
                        _targetPc.setCurrentMp(getMp);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2188));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2188));
                    }
                } else if (_targetPc.getInventory().checkEquipped(22206)// 린드인내력
                        || _targetPc.getInventory().checkEquipped(22207)) {// 린드마력
                    if (chance6 <= 5) {
                        short getMp = (short) (_targetPc.getCurrentMp() + 20);
                        _targetPc.setCurrentMp(getMp);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2188));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2188));
                    }
                }
            }
        }

        // 파푸리온의 가호
        int chance5 = _random.nextInt(100) + 1;
            if (_target != null) {
                int dmg2 = 0;
                int plus = 0;
                if (_targetPc.getInventory().checkEquipped(22200) || // 파푸 완력
                        _targetPc.getInventory().checkEquipped(22201) || // 파푸 예지력
                        _targetPc.getInventory().checkEquipped(22202) || // 파푸 인내력
                        _targetPc.getInventory().checkEquipped(22203)) { // 파푸 마력
                    if (chance5 <= 6) { // 원래 5임
                        L1ItemInstance item = _targetPc.getInventory().findEquippedItemId(22200);
                        L1ItemInstance item1 = _targetPc.getInventory().findEquippedItemId(22201);
                        L1ItemInstance item2 = _targetPc.getInventory().findEquippedItemId(22202);
                        L1ItemInstance item3 = _targetPc.getInventory().findEquippedItemId(22203);
                        if (item.getEnchantLevel() >= 7 && item.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item1.getEnchantLevel() >= 7 && item1.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item2.getEnchantLevel() >= 7 && item2.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item3.getEnchantLevel() >= 7 && item3.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item.getEnchantLevel() > 9 || item1.getEnchantLevel() > 9 || item2.getEnchantLevel() > 9
                                || item3.getEnchantLevel() > 9) {
                            plus = 3;
                        }
                        if (_targetPc.hasSkillEffect(L1SkillId.POLLUTE_WATER)) {
                            dmg2 += (40 + _random.nextInt(15) + (plus * 10)) / 2; // 플루트워터경우절반 //원래 랜덤수치 30임
                        }
                        if (_targetPc.hasSkillEffect(L1SkillId.WATER_LIFE)) {
                            dmg2 += (40 + _random.nextInt(15) + (plus * 10)) * 2; // 워터라이프경우두배 //원래 랜덤수치 30임
                        }
                        dmg2 += 40 + _random.nextInt(15) + (plus * 10); // 회복률 = 기본50회복+랜덤(1~30) //원래 랜덤수치 30임
                        _targetPc.setCurrentHp(_targetPc.getCurrentHp() + dmg2);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2187));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2187));
                    }
                }
            }
          
		// 신성한 요정족판금갑옷
		int chance66 = _random.nextInt(100) + 1;
		if (_target != null) {
			int dmg2 = 0;
			int plus = 0;
			if (_targetPc.getInventory().checkEquipped(222351)) {
				if (chance66 <= 5) { // 원래 5임
					if (_targetPc.hasSkillEffect(L1SkillId.POLLUTE_WATER)) {
						dmg2 += (25 + _random.nextInt(15) + (plus * 10)) / 2; //
					}
					if (_targetPc.hasSkillEffect(L1SkillId.WATER_LIFE)) {
						dmg2 += (25 + _random.nextInt(15) + (plus * 10)) * 2; //
					}
					dmg2 += 25 + _random.nextInt(15) + (plus * 10); //
					_targetPc.setCurrentHp(_targetPc.getCurrentHp() + dmg2);
					_targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 15355));
					_targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 15355));
				}
			}
		}
        try {
            if (_targetPc.isCrown()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(0);
            } else if (_targetPc.isKnight()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(1);
            } else if (_targetPc.isElf()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(2);
            } else if (_targetPc.isWizard()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(3);
            } else if (_targetPc.isDarkelf()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(4);
            } else if (_targetPc.isBlackwizard()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(5);
            } else if (_targetPc.isDragonknight()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(6);
            } else if (_targetPc.is전사()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(7);
            }
        } catch (Exception e) {
            System.out.println("Character Add Reduction Error");
        }

        try {
            if (_pc.isCrown()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(0);
            } else if (_pc.isKnight()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(1);
            } else if (_pc.isElf()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(2);
            } else if (_pc.isWizard()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(3);
            } else if (_pc.isDarkelf()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(4);
            } else if (_pc.isBlackwizard()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(5);
            } else if (_pc.isDragonknight()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(6);
            } else if (_pc.is전사()) {
            	dmg += CharacterBalance.getInstance().getCharacterBalance(7);
            }
        } catch (Exception e) {
            System.out.println("Character Add Damege Error");
        }

        /** 버닝스피릿츠, 엘리멘탈파이어, 브레이브멘탈 1.5배 스킬이펙트 및 추타 부분 **/
        int chance41 = _random.nextInt(100) + 1;
        if (_weaponType != 20 && _weaponType != 62 && _weaponType2 != 17) {
            if (_pc.hasSkillEffect(BURNING_SPIRIT) || _pc.hasSkillEffect(ELEMENTAL_FIRE) || _pc.hasSkillEffect(BRAVE_AURA)) {
                if (chance41 <= 15) {
                    if (_pc.isDarkelf()) {
                        dmg *= 1.3;
                        _targetNpc.broadcastPacket(new S_SkillSound(_targetNpc.getId(), 7727));
                    } else {
                        dmg *= 1.5;
                        _targetNpc.broadcastPacket(new S_SkillSound(_targetNpc.getId(), 7727));
                    }
                }
            }
        }

        // 캐릭터 간 대미지 외부화 처리
        /*if (_calcType == PC_PC) {
            if (_pc.isCrown()) {
                dmg += Config.PRINCE_ADD_DAMAGEPC;
            } else if (_pc.isKnight()) {
                dmg += Config.KNIGHT_ADD_DAMAGEPC;
            } else if (_pc.isElf()) {
                dmg += Config.ELF_ADD_DAMAGEPC;
            } else if (_pc.isDarkelf()) {
                dmg += Config.DARKELF_ADD_DAMAGEPC;
            } else if (_pc.isWizard()) {
                dmg += Config.WIZARD_ADD_DAMAGEPC;
            } else if (_pc.isDragonknight()) {
                dmg += Config.DRAGONKNIGHT_ADD_DAMAGEPC;
            } else if (_pc.isBlackwizard()) {
                dmg += Config.BLACKWIZARD_ADD_DAMAGEPC;
            } else if (_pc.is전사()) {
                dmg += Config.전사_ADD_DAMAGEPC;
            }
        }
*/
        /** AC에 의한 데미지 감소 수정본 **/
      /*  if (_calcType == PC_PC) {
            if (_targetPc.isKnight()) { // 기사/
                dmg -= dmg * (calcPcDefense() * Config.기사);
            } else if (_targetPc.isDragonknight()) {// 용기사
                dmg -= dmg * (calcPcDefense() * Config.용기사);
            } else if (_targetPc.isElf()) { // 요정
                dmg -= dmg * (calcPcDefense() * Config.요정);
            } else if (_targetPc.isCrown()) { // 군주/
                dmg -= dmg * (calcPcDefense() * Config.군주);
            } else if (_targetPc.isWizard()) { // 법사/
                dmg -= dmg * (calcPcDefense() * Config.법사);
            } else if (_targetPc.isDarkelf()) { // 다엘/
                dmg -= dmg * (calcPcDefense() * Config.다엘);
            } else if (_targetPc.isBlackwizard()) { // 환술사/
                dmg -= dmg * (calcPcDefense() * Config.환술사);
            } else if (_targetPc.is전사()) { // 전사/
                dmg -= dmg * (calcPcDefense() * Config.전사);
            }
        }*/
        if (dmg <= 0) {
            _isHit = false;
        }
/**어비스포인트에따른 리덕	 */
		
		if (_targetPc.getPeerage() == 1){ dmg -=0.5;
		} else if (_targetPc.getPeerage() == 2){ dmg -= 1;
		} else if (_targetPc.getPeerage() == 3){ dmg -= 1.5;
		} else if (_targetPc.getPeerage() == 4){ dmg -= 2;
		} else if (_targetPc.getPeerage() == 5){ dmg -= 2.5;
		} else if (_targetPc.getPeerage() == 6){ dmg -= 3;
		} else if (_targetPc.getPeerage() == 7){ dmg -= 3.5;
		} else if (_targetPc.getPeerage() == 8){ dmg -= 4;
		} else if (_targetPc.getPeerage() == 9){ dmg -= 4.5;
		} else if (_targetPc.getPeerage() == 10){ dmg -= 5;
		} else if (_targetPc.getPeerage() == 11){ dmg -= 5.5;
		} else if (_targetPc.getPeerage() == 12){ dmg -= 6;
		} else if (_targetPc.getPeerage() == 13){ dmg -= 6.5;
		} else if (_targetPc.getPeerage() == 14){ dmg -= 7;
		} else if (_targetPc.getPeerage() == 15){ dmg -= 7.5;
		} else if (_targetPc.getPeerage() == 16){ dmg -= 8;
		} else if (_targetPc.getPeerage() == 17){ dmg -= 8.5;
		} else if (_targetPc.getPeerage() == 18){ dmg -= 9; 
		}
        return (int) dmg;
    }

    // ●●●● 플레이어로부터 NPC 에의 대미지 산출 ●●●●
    private int calcPcNpcDamage() {
        if (_targetNpc == null || _pc == null) {
            _isHit = false;
            _drainHp = 0;
            return 0;
        }
    	if (_pc instanceof L1RobotInstance) {
			if (((L1RobotInstance) _pc).사냥봇_위치.equalsIgnoreCase("지저")
					|| ((L1RobotInstance) _pc).사냥봇_위치.startsWith("잊섬")
					|| ((L1RobotInstance) _pc).사냥봇_위치.equalsIgnoreCase("선박수면")
					|| ((L1RobotInstance) _pc).사냥봇_위치.equalsIgnoreCase("상아탑4층")
					|| ((L1RobotInstance) _pc).사냥봇_위치.equalsIgnoreCase("상아탑5층")) {
				if (_pc.getCurrentWeapon() == 46 // 단검
						|| _pc.getCurrentWeapon() == 20
						|| _pc.getCurrentWeapon() == 24) {// 활
					return _random.nextInt(50) + 100;
				} else {
					return _random.nextInt(50) + 50;
				}
			} else {
				if (_pc.getCurrentWeapon() == 46 // 단검
						|| _pc.getCurrentWeapon() == 20
						|| _pc.getCurrentWeapon() == 24) {// 활
					return _random.nextInt(30) + 70;
				} else {
					return _random.nextInt(40) + 40;
				}
			}
		}
        int weaponMaxDamage = 0;
        boolean secondw = false;

        if (_targetNpc.getNpcTemplate().get_size().equalsIgnoreCase("small") && _weaponSmall > 0) {
            weaponMaxDamage = _weaponSmall;
        } else if (_targetNpc.getNpcTemplate().get_size().equalsIgnoreCase("large") && _weaponLarge > 0) {
            weaponMaxDamage = _weaponLarge;
        }

        // weaponMaxDamage += _weaponAddDmg;

        int weaponDamage = 0;

        if (_weaponType == 58) { // 크로우
        	int crowchance = _random.nextInt(100) + 1;
        	if(crowchance <= _weaponDoubleDmgChance){
        		weaponDamage = weaponMaxDamage + _weaponAddDmg;
                // _attackType = 2;
                _pc.sendPackets(new S_SkillSound(_pc.getId(), 3671));
                _pc.broadcastPacket(new S_SkillSound(_pc.getId(), 3671));
        	}else{
        		weaponDamage = _random.nextInt(weaponMaxDamage) + _weaponAddDmg + 1;
        	}
        }

        else if (_weaponType == 0) { // 맨손, 활, 암 토토 렛_weaponType == 0 ||
            weaponDamage = 0;
        } else {
            // weaponDamage = _random.nextInt(weaponMaxDamage) + 1;
            weaponDamage = _random.nextInt(weaponMaxDamage) + _weaponAddDmg;
        }

        if (_pc.hasSkillEffect(SOUL_OF_FLAME)) {
            if (_weaponType != 20 && _weaponType != 62) {
                // weaponDamage = weaponMaxDamage;
                weaponDamage = weaponMaxDamage + _weaponAddDmg;
            }
        }
        if(_weaponType != 0 ){
            if (_weaponType != 20 && _weaponType != 62) { // 근거리
                int Dmgcritical = CalcStat.calcDmgCritical(_pc.getAbility().getTotalStr())+_pc.getDmgCritical();
                int chance = _random.nextInt(100) + 1;
                //휘장 치명타
                if (_pc.getInventory().checkEquipped(900032)){
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(900032);
                	if(item.getEnchantLevel() == 6){
                		Dmgcritical += 1;
                	}else if(item.getEnchantLevel() == 7){
                		Dmgcritical += 3;
                	}else if(item.getEnchantLevel() >= 8){
                		Dmgcritical += 5;
                	}
                }if (_pc.getInventory().checkEquipped(22208)){ // 발라완력
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(22208);
                	if(item.getEnchantLevel() == 7){
                		Dmgcritical += 1;
                	}else if(item.getEnchantLevel() == 8){
                		Dmgcritical += 2;
                	}else if(item.getEnchantLevel() >= 9){
                		Dmgcritical += 3;
                	}
                }if (_pc.getInventory().checkEquipped(22209)){ //발라인내
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(22209);
                	if(item.getEnchantLevel() == 7){
                		Dmgcritical += 1;
                	}else if(item.getEnchantLevel() == 8){
                		Dmgcritical += 2;
                	}else if(item.getEnchantLevel() >= 9){
                		Dmgcritical += 3;
                	}
                }
                if (chance <= Dmgcritical) {
                    weaponDamage = weaponMaxDamage + _weaponAddDmg;
                    _isCritical = true;
                }
            } else {
                int Bowcritical = CalcStat.calcBowCritical(_pc.getAbility().getTotalDex())+_pc.getBowDmgCritical();
                int chance = _random.nextInt(100) + 1;
              //휘장 치명타
                if (_pc.getInventory().checkEquipped(900033)){
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(900033);
                	if(item.getEnchantLevel() == 6){
                		Bowcritical += 1;
                	}else if(item.getEnchantLevel() == 7){
                		Bowcritical += 3;
                	}else if(item.getEnchantLevel() >= 8){
                		Bowcritical += 5;
                	}
                }if (_pc.getInventory().checkEquipped(22210)){
                	L1ItemInstance item = _pc.getInventory().findEquippedItemId(22210);
                	if(item.getEnchantLevel() == 7){
                		Bowcritical += 1;
                	}else if(item.getEnchantLevel() == 8){
                		Bowcritical += 2;
                	}else if(item.getEnchantLevel() >= 9){
                		Bowcritical += 3;
                	}
                }
                if (chance <= Bowcritical) {
                    weaponDamage = weaponMaxDamage + _weaponAddDmg;
                    _isCritical = true;
                }
    	        }
            }
        int weaponTotalDamage = weaponDamage + _weaponEnchant;

        if (_pc.is전사() && _pc.hasSkillEffect(L1SkillId.SLAYER) && _pc.getSecondWeapon() != null) {
            int ran = _random.nextInt(100);
            if (ran < 50) {
                secondw = true;
                if (_targetNpc.getNpcTemplate().get_size().equalsIgnoreCase("small") && _SweaponSmall > 0) {
                    weaponMaxDamage = _SweaponSmall + _SweaponAddDmg;
                } else if (_targetNpc.getNpcTemplate().get_size().equalsIgnoreCase("large") && _SweaponLarge > 0) {
                    weaponMaxDamage = _SweaponLarge + _SweaponAddDmg;
                } else {
                    weaponMaxDamage = _SweaponSmall + _SweaponAddDmg;
                }
            }
        }

        weaponTotalDamage += calcMaterialBlessDmg(); // 은축복 대미지 보너스
        /** 포효의이도류 인첸당 발동확률증가 **/
        if (_weaponId == 203018) {
            _weaponDoubleDmgChance += _pc.getWeapon().getEnchantLevel();
        }

        if (_weaponType == 54 && (_random.nextInt(100) + 1) <= (_weaponDoubleDmgChance - weapon.get_durability()) && _pc.isDarkelf()) { // 이도류
            weaponTotalDamage *= 2.5;
            // _attackType = 4;
            _pc.sendPackets(new S_SkillSound(_pc.getId(), 3398));
            _pc.broadcastPacket(new S_SkillSound(_pc.getId(), 3398));
        }
        if (_pc.hasSkillEffect(DOUBLE_BRAKE) && (_weaponType == 54 || _weaponType == 58)) {
            int RealSteelLevel = _pc.getLevel();
            if (RealSteelLevel < 45) {
                RealSteelLevel = 45;
            }
            int RealSteelLevelChance = (RealSteelLevel - 45) / 5 + 33;
            if ((_random.nextInt(100) + 1) <= RealSteelLevelChance) {
                weaponTotalDamage *= 2;
                if (_pc.hasSkillEffect(BURNING_SPIRIT)) {
                    _pc.sendPackets(new S_SkillSound(_targetNpc.getId(), 6532));
                    Broadcaster.broadcastPacket(_pc, new S_SkillSound(_targetNpc.getId(), 6532));
                }
            }
        }
      

        double dmg = weaponTotalDamage + _statusDamage;

        if (_weaponType2 == 17) {
            dmg = L1WeaponSkill.키링크데미지(_pc, _target);
        }
        if (_weaponType != 20 && _weaponType != 62) {
            dmg = weaponTotalDamage + _statusDamage + _pc.getDmgup() + _pc.getDmgRate();
        } else {
            dmg = weaponTotalDamage + _statusDamage + _pc.getBowDmgup() + _pc.getBowDmgRate();
        }
        if (_pc.hasSkillEffect(BURNING_SPIRIT) && _pc.isDarkelf()) { // 버닝스피릿츠
            if ((_random.nextInt(100) + 1) <= 33) {
                dmg *= 3 / 2;
            }
        }
        dmg += 몬스터속성인첸트효과(); // 속성 대미지

        if (_weaponType == 20) { // 활
            if (_arrow != null) {
                int add_dmg = 0;
                if (_targetNpc.getNpcTemplate().get_size().equalsIgnoreCase("large")) {
                    add_dmg = _arrow.getItem().getDmgLarge();
                } else {
                    add_dmg = _arrow.getItem().getDmgSmall();
                }
                if (add_dmg == 0) {
                    add_dmg = 1;
                }
                if (_targetNpc.getNpcTemplate().is_hard() && weapon.getItem().get_penetration() != 1) {
					add_dmg /= 2;
				}
            } else if (_weaponId == 190 || _weaponId == 10000 || _weaponId == 202011) { // 사이하의 활
                dmg = dmg + _random.nextInt(15) + 4;
            }

        } else if (_weaponType == 62) { // 암 토토 렛
            int add_dmg = 0;
            if (_targetNpc.getNpcTemplate().get_size().equalsIgnoreCase("large")) {
                add_dmg = _sting.getItem().getDmgLarge();
            } else {
                add_dmg = _sting.getItem().getDmgSmall();
            }
            if (add_dmg == 0) {
                add_dmg = 1;
            }
            dmg = dmg + _random.nextInt(add_dmg) + 1 + 속성화살(_arrow, _targetNpc);
        }
        
        /** 본섭 10검이상 추타 +1 표기 효과 **/
        if (_weaponType != 0 && _weaponType != 20) {
            switch (weapon.getEnchantLevel()) {
            case 10:
                dmg += 1;
                break;
            case 11:
                dmg += 2;
                break;
            case 12:
                dmg += 3;
                break;
            case 13:
                dmg += 4;
                break;
            case 14:
                dmg += 5;
                break;
            case 15:
                dmg += 6;
                break;
            default:
                break;
            }
        }
        
        /** 드슬 인첸별 추타2씩 **/
        if(_weaponId == 66){
        	dmg += weapon.getEnchantLevel();
        }
        /** 인첸트에 따른 추타관련 **/
        /*if (_weaponType != 0 && _weaponType != 20) {
            switch (weapon.getEnchantLevel()) {
            case 7:
                dmg += 1;
                break;
            case 8:
                dmg += 2;
                break;
            case 9:
                dmg += 3;
                break;
            case 10:
                dmg += 4;
                break;
            case 11:
                dmg += 5;
                break;
            case 12:
                dmg += 6;
                break;
            case 13:
                dmg += 7;
                break;
            case 14:
                dmg += 8;
                break;
            case 15:
                dmg += 9;
                break;
            default:
                break;
            }
        }*/
        switch (_weaponId) {
        case 307:
        case 308:
        case 309:
        case 310:
        case 311:
        case 313:
        case 314:
            dmg = L1WeaponSkill.블레이즈쇼크(_pc, _targetNpc, _weaponEnchant);
            break;
        case 1010:
        case 1011:
        case 1012:
        case 1013:
        case 1014:
            L1WeaponSkill.getDiseaseWeapon(_pc, _targetNpc, _weaponId);
            break;
        case 12: // 바람칼날단검
        case 203020: // 생명의단검
        case 601: // 파멸의대검
            파멸의대검(dmg);
            break;
        case 204: // 진홍의크로스보우
        case 100204: // 축진홍의크로스보우
        case 86: // 붉은그림자의이도류
            L1WeaponSkill.붉은그림자의이도류(_pc, _targetNpc);
            break;
        case 1115: // 신묘장검
        case 1117: // 신묘크로
            dmg += getEbHP(_pc, _target, 8981, _weaponEnchant);
            break;
        case 1116: // 신묘지팡이
        case 1118: // 신묘장궁
        case 202011: // 가이야의격노
            dmg += getEbMP1(_pc, _target, 8981, _weaponEnchant);
            break;
        case 1109: // 마족크로우
        case 1113: // 마족검
        case 1114: // 마족양손검
        case 203011: // 마족양손검
            dmg += getEbHP(_pc, _target, 8150, _weaponEnchant);
            break;
        case 1110: // 마족지팡이
        case 1112: // 마족키링크
        case 1111: // 마족활
            dmg += getEbMP(_pc, _target, 8152, _weaponEnchant);
            break;
        case 1108: // 마족체인
            dmg += getEbHP(_pc, _target, 8150, _weaponEnchant);
            L1WeaponSkill.체인소드(_pc);
            break;
        case 1119: // 극한의 체인소드
            dmg += 극한의체인소드(_pc, _target, 3685, _weaponEnchant);
            L1WeaponSkill.체인소드(_pc);
            break;
        case 1123: // 블러드서커
        case 202013:
            L1WeaponSkill.체인소드(_pc);
            블러드서커(dmg, _weaponEnchant);
            break;
        case 500:// 소멸자의체인소드
        case 501:// 파멸자의체인소드
        case 1104:// 엘모어체인소드
        case 1132:// 베테르랑체인소드
            L1WeaponSkill.체인소드(_pc);
            break;
        case 312:
            dmg = L1WeaponSkill.체인소드블레이즈쇼크(_pc, _targetNpc, _weaponEnchant);
            break;
        case 203017:
            L1WeaponSkill.섬멸자의체인소드(_pc);
            if (weapon.getEnchantLevel() >= 10)
            dmg += L1WeaponSkill.섬멸자(_pc, _target, 4077, _weaponEnchant);
            break;
        case 203006://태풍의도끼
        	if (weapon.getEnchantLevel() >= 10)
        	 dmg += L1WeaponSkill.태풍도끼(_pc, _target, 7977, _weaponEnchant);
        	break;
        case 1136://악몽의장궁
        	 if (weapon.getEnchantLevel() >= 10)
                 dmg += L1WeaponSkill.악장(_pc, _target, 14339, _weaponEnchant);
        	break;
        case 203025://진싸
        case 203026:
       	 if (weapon.getEnchantLevel() >= 10)
                dmg += L1WeaponSkill.진싸(_pc, _target, 8032, _weaponEnchant);
       	break;
        case 202001: // 환영의 체인소드
            dmg += L1WeaponSkill.환영의체인소드(_pc, _target, _weaponEnchant);
            L1WeaponSkill.체인소드(_pc);
            break;
        case 1124: // 파괴의 이도류
        case 1125: // 파괴의 크로우
        case 11125:// 축복 파괴의이도류
            dmg += L1WeaponSkill.파괴의이도류크로우(_pc, _target, 9359, _weaponEnchant);
            break;
        case 600: // 뇌신검
            dmg += L1WeaponSkill.뇌신검(_pc, _target, 3940, _weaponEnchant);
            break;
        case 604: // 혹한의 창
            dmg += L1WeaponSkill.혹한의창(_pc, _target, 3704, _weaponEnchant);
            break;
        case 605: // 광풍의 도끼
        case 203015: // 질풍의 도끼
            dmg += L1WeaponSkill.광풍의도끼(_pc, _target, 5524, _weaponEnchant);
            break;
        case 191: // 살천의 활
            dmg += L1WeaponSkill.살천의활(_pc, _target, 9361, _weaponEnchant);
            break;
        case 1135: // 공명의 키링크
            dmg += L1WeaponSkill.공명의키링크(_pc, _target, 5201, _weaponEnchant);
            break;
        case 1120: // 냉한의 키링크
            dmg += L1WeaponSkill.냉한의키링크(_pc, _target, 6553, _weaponEnchant);
            break;
        case 202012: // 히페리온의 절망
            dmg += L1WeaponSkill.히페리온의절망(_pc, _target, 12248, _weaponEnchant);
            break;
        case 283: // 발라카스의 키링크
            dmg += L1WeaponSkill.Redskill(_pc, _target, 10405, _weaponEnchant);
            break;
        case 294: // 군주의 검
            dmg += L1WeaponSkill.군주의검(_pc, _target, 4842, _weaponEnchant);
            break;
        case 58: // 데스나이트의 불검
            dmg += L1WeaponSkill.데스나이트의불검(_pc, _target, _weaponEnchant, 7300);
            break;
        case 54: // 커츠의 검
            dmg += L1WeaponSkill.커츠의검(_pc, _target, _weaponEnchant, 10405);
            break;
        case 124: // 바포메트의지팡이
            dmg += L1WeaponSkill.바포메트의지팡이(_pc, _target, _weaponEnchant, 129);
            break;
        case 202003: // 제로스의 지팡이
            dmg += L1WeaponSkill.제로스의지팡이(_pc, _target, _weaponEnchant, 11760);
            break;
        case 134: // 수정 결정체 지팡이
            dmg += L1WeaponSkill.수정결정체지팡이(_pc, _target, _weaponEnchant, 10405);
            dmg+=getEbMP(_pc, _target, 8152, _weaponEnchant);
            break;
        case 603: // 천사의 지팡이
            L1WeaponSkill.천사의지팡이(_pc, _target, _weaponEnchant);
            break;
        default:
            dmg += L1WeaponSkill.getWeaponSkillDamage(_pc, _target, _weaponId);
            break;
        }

        if (_weaponType == 0) { // 맨손
            dmg = (_random.nextInt(5) + 4) / 4;
        }

        try {
            dmg += WeaponAddDamage.getInstance().getWeaponAddDamage(_weaponId);
        } catch (Exception e) {
            System.out.println("Weapon Add Damege Error");
        }

        dmg += 룸티스검귀추가데미지();  // 검은빛 귀걸이 추가 데미지 처리

        if (_pc.hasSkillEffect(BURNING_SLASH)) {
            if (_weaponType != 20 && _weaponType != 62) {
                dmg += 20;
                _pc.sendPackets(new S_SkillSound(_targetNpc.getId(), 6591));
                _pc.broadcastPacket(new S_SkillSound(_targetNpc.getId(), 6591));
                _pc.removeSkillEffect(BURNING_SLASH);
            }
        }
        for (L1DollInstance doll : _pc.getDollList()) {// 매직 돌 인형에 의한 추가 대미지
        	if (doll == null)
        		continue;
        	if (_weaponType != 20 && _weaponType != 62) {
        		dmg += doll.getDamageByDoll();
        	}
        	dmg += doll.attackPixieDamage(_pc, _targetNpc);
        	doll.getPixieGreg(_pc, _targetNpc);
        }

        // 전사 스킬 PC - NPC
        // 크래쉬 : 공격자에 레벨에 50% 정도를 데미지에 반영한다.
        if (SkillsTable.getInstance().spellCheck(_pc.getId(), 236)) {
            int chance = _random.nextInt(100) + 1;
            if (13 >= chance) { // 크래쉬 확률
                //
                int alpha_dmg = _pc.getLevel() / 2;
                // 퓨리 : 크래쉬에서 나온 뎀지에 2배.
                if (SkillsTable.getInstance().spellCheck(_pc.getId(), 234)) {
                    chance = _random.nextInt(100) + 1;
                    if (1 >= chance) { // 퓨리 확률
                        dmg += dmg + _pc.getLevel();
                        // 성공시 이팩 2개 나가는거
                        _targetNpc.broadcastPacket(new S_SkillSound(_targetNpc.getId(), 12489));
                    }
                }
                dmg += alpha_dmg;
                // 크래쉬는 크래쉬 이팩트 그대로 처리.
                _targetNpc.broadcastPacket(new S_SkillSound(_targetNpc.getId(), 12487));
            }
        }

        /** 버닝스피릿츠, 엘리멘탈파이어, 브레이브멘탈 1.5배 스킬이펙트 및 추타 부분 **/
        int chance41 = _random.nextInt(100) + 1;
        if (_weaponType != 20 && _weaponType != 62 && _weaponType2 != 17) {
            if (_pc.hasSkillEffect(BURNING_SPIRIT) || _pc.hasSkillEffect(ELEMENTAL_FIRE) || _pc.hasSkillEffect(BRAVE_AURA)) {
                if (chance41 <= 15) {
                    if (_pc.isDarkelf()) {
                        dmg *= 1.5;
                        _targetNpc.broadcastPacket(new S_SkillSound(_targetNpc.getId(), 7727));
                    } else {
                        dmg *= 1.5;
                        _targetNpc.broadcastPacket(new S_SkillSound(_targetNpc.getId(), 7727));
                    }
                }
            }
        }

        try {
            if (_pc.isCrown()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(0);
            } else if (_pc.isKnight()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(1);
            } else if (_pc.isElf()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(2);
            } else if (_pc.isWizard()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(3);
            } else if (_pc.isDarkelf()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(4);
            } else if (_pc.isBlackwizard()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(5);
            } else if (_pc.isDragonknight()) {
                dmg += CharacterBalance.getInstance().getCharacterBalance(6);
            } else if (_pc.is전사()) {
            	dmg += CharacterBalance.getInstance().getCharacterBalance(7);
            }
        } catch (Exception e) {
            System.out.println("Character Add Damege Error");
        }

        dmg -= calcNpcDamageReduction();

        boolean isNowWar = false;
        int castleId = L1CastleLocation.getCastleIdByArea(_targetNpc);
        if (castleId > 0) {
            isNowWar = WarTimeController.getInstance().isNowWar(castleId);
        }
        if (!isNowWar) {
            if (_targetNpc instanceof L1PetInstance) {
                dmg /= 8;
            }
            if (_targetNpc instanceof L1SummonInstance) {
                L1SummonInstance summon = (L1SummonInstance) _targetNpc;
                if (summon.isExsistMaster()) {
                    dmg /= 8;
                }
            }
        }

        if (_targetNpc.hasSkillEffect(ICE_LANCE)) {
            dmg = 0;
        }
        if (_targetNpc.hasSkillEffect(EARTH_BIND)) {
            dmg = 0;
        }
        if (_targetNpc.hasSkillEffect(PHANTASM)) {
            _targetNpc.removeSkillEffect(PHANTASM);
        }
        if (dmg <= 0) {
            _isHit = false;
        }
        return (int) dmg;
    }

    // ●●●● NPC 로부터 플레이어에의 대미지 산출 ●●●●
    private int calcNpcPcDamage() {
        if (_npc == null || _targetPc == null)
            return 0;

        
        int lvl = _npc.getLevel();
		double dmg = 0D;
		if (_targetPc instanceof L1RobotInstance) {
			dmg = 20;

		} // 로봇뎀감
		if (lvl < 10) // 몹렙이 10미만
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 2;
		else if (lvl >= 10 && lvl < 20) // 몹렙이 10 ~ 49
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 2;
		else if (lvl >= 20 && lvl < 30) // 몹렙이 50 ~ 69
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 2;
		else if (lvl >= 30 && lvl < 40) // 몹렙이 50 ~ 69
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 2;
		else if (lvl >= 40 && lvl < 50) // 몹렙이 50 ~ 69
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 3;
		else if (lvl >= 50 && lvl < 60) // 몹렙이 70 ~ 79
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 5;
		else if (lvl >= 60 && lvl < 70) // 몹렙이 80 ~ 86
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 10;
		else if (lvl >= 70 && lvl < 80) // 몹렙이 50 ~ 69
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 15;
		else if (lvl >= 80 && lvl < 87) // 몹렙이 50 ~ 69
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 20;
		else if (lvl >= 87) // 몹렙이 87 이상
			dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 100;
	

        if (_npc instanceof L1PetInstance) {
            dmg += (lvl / 16); // 펫은 LV16마다 추가 타격
            dmg += ((L1PetInstance) _npc).getDamageByWeapon();
        }
        dmg += _npc.getDmgup();

        if (isUndeadDamage()) {
            // dmg *= 1.1;
            dmg *= 1.2;
        }
        if (_npc.getMapId() == 1700 /*|| _npc.getMapId()== ???*/) {// 잊섬이라면
        	dmg *= 1.4; //데미지 두배 
        }
       /* *//** 특정 맵 몬스터 쌔게 **//*
        if (_npc.getMapId() == 30) {
        	dmg = (dmg * getLeverage()) / 0; //숫자를 올릴수록 쌔진다
        	}*/
        /** 전체 몬스터 쌔게 **/
        // dmg = dmg * getLeverage() / 13;//<몬스터 물리데미지 올리면 약해진다.
        dmg = dmg * getLeverage() / Config.npcdmg; // npc물리데미지 외부화
        dmg -= calcPcDefense();

        if (_npc.isWeaponBreaked()) { // NPC가 웨폰브레이크중.
            dmg *= 0.5;
        }

        for (L1DollInstance doll : _targetPc.getDollList()) {// 마법인형에 의한 대미지 감소. 돌골렘
        	dmg -= doll.getDamageReductionByDoll();
        }

        dmg -= _targetPc.getDamageReductionByArmor(); // 방어구에 의한 대미지 감소

        /** 대상 Buff에 따른 대미지 연산 **/
        //dmg += toPcBuffDmg(dmg);
      //스킬, 요리 등에 대한 데미지리덕션
        int damagereduction = 0;
        if (_targetPc.hasSkillEffect(COOK_STR) || _targetPc.hasSkillEffect(COOK_DEX) || _targetPc.hasSkillEffect(COOK_INT)) { // 리뉴얼 요리
        	damagereduction += 2;
        }
        if(_targetPc.hasSkillEffect(COOK_GROW)){
        	damagereduction += 2;
        }
        // 전사스킬 : 아머가드 - 캐릭의 AC/10의 데미지감소 효과를 얻는다.
        if (SkillsTable.getInstance().spellCheck(_targetPc.getId(), 237)) {
        	if(_targetPc.getAC().getAc() < -10){
        		damagereduction += _targetPc.getAC().getAc() / -10;
        	}
        }

        if (_targetPc.hasSkillEffect(REDUCTION_ARMOR)) {
            int targetPcLvl = _targetPc.getLevel();
            if (targetPcLvl < 50) {
                targetPcLvl = 50;
            }
            damagereduction += (targetPcLvl - 50) / 5 + 1;
        }

        if (_targetPc.hasSkillEffect(EARTH_GUARDIAN)) {
        	damagereduction += 2;
        }
        
        dmg -= 룸티스붉귀데미지감소();

        if (_targetPc.hasSkillEffect(DRAGON_SKIN)) {
            if (_targetPc.getLevel() >= 80) {
            	damagereduction += 5 + ((_targetPc.getLevel() - 78) / 2);
            } else {
            	damagereduction += 5;
            }
        }
        if (_targetPc.hasSkillEffect(PATIENCE)) {
        	damagereduction += 2;
        }        
        if (_targetPc.hasSkillEffect(FEATHER_BUFF_A)) {
        	damagereduction += 3;
        }
        if (_targetPc.hasSkillEffect(FEATHER_BUFF_B)) {
        	damagereduction += 2;
        }
        if (_targetPc.hasSkillEffect(CLAN_BUFF4)) {
        	damagereduction += 1;
        }     
        dmg -= damagereduction;
        
        if (_targetPc.hasSkillEffect(IMMUNE_TO_HARM)) {
        	dmg -= (dmg * 0.3);//4
        }
        //스킬, 요리 등에 대한 데미지리덕션
        

        // 반역자의방패 확률적 대미지감소처리
        if (_targetPc.getInventory().checkEquipped(22263)) {// 반역자의방패
            int chance = _random.nextInt(100);
            L1ItemInstance item = _targetPc.getInventory().findEquippedItemId(22263);
            int enchant = item.getEnchantLevel();
            if (chance <= 1 + (enchant * 2)) {
                dmg -= 50; // 원래 50임
                _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 6320));
                _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 6320));
            }
        }
        if (_targetPc.getInventory().checkEquipped(222355)) {// 신성한요정족방패
            int chance = _random.nextInt(100) + 1;
            L1ItemInstance item = _targetPc.getInventory().findEquippedItemId(222355);
            if (chance <= item.getEnchantLevel()) {
                dmg -= 20;
                _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 14543));
                _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 14543));
            }
        }
        // 린드비오르의 가호
        int chance6 = _random.nextInt(100) + 1;
        if (dmg > 25) {
            if (_target != _targetNpc) {
                if (_targetPc.getInventory().checkEquipped(22204)) {// 린드완력
                    if (chance6 <= 5) {
                        short getMp = (short) (_targetPc.getCurrentMp() + 10);
                        _targetPc.setCurrentMp(getMp);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2188));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2188));
                    }
                } else if (_targetPc.getInventory().checkEquipped(22205)) {// 린드예지력
                    if (chance6 <= 5) {
                        short getMp = (short) (_targetPc.getCurrentMp() + 15);
                        _targetPc.setCurrentMp(getMp);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2188));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2188));
                    }
                } else if (_targetPc.getInventory().checkEquipped(22206)// 린드인내력
                        || _targetPc.getInventory().checkEquipped(22207)) {// 린드마력
                    if (chance6 <= 5) {
                        short getMp = (short) (_targetPc.getCurrentMp() + 20);
                        _targetPc.setCurrentMp(getMp);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2188));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2188));
                    }
                }
            }
        }
        // 파푸리온의 가호
        int chance5 = _random.nextInt(100) + 1;
        if (dmg > 25) {
            if (_target != null) {
                int dmg2 = 0;
                int plus = 0;
                if (_targetPc.getInventory().checkEquipped(22200) || // 파푸 완력
                        _targetPc.getInventory().checkEquipped(22201) || // 파푸 예지력
                        _targetPc.getInventory().checkEquipped(22202) || // 파푸 인내력
                        _targetPc.getInventory().checkEquipped(22203)) { // 파푸 마력
                    if (chance5 <= 5) { // 원래 5임
                        L1ItemInstance item = _targetPc.getInventory().findEquippedItemId(22200);
                        L1ItemInstance item1 = _targetPc.getInventory().findEquippedItemId(22201);
                        L1ItemInstance item2 = _targetPc.getInventory().findEquippedItemId(22202);
                        L1ItemInstance item3 = _targetPc.getInventory().findEquippedItemId(22203);
                        if (item.getEnchantLevel() >= 7 && item.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item1.getEnchantLevel() >= 7 && item1.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item2.getEnchantLevel() >= 7 && item2.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item3.getEnchantLevel() >= 7 && item3.getEnchantLevel() <= 9) {
                            plus = item.getEnchantLevel() - 6;
                        } else if (item.getEnchantLevel() > 9 || item1.getEnchantLevel() > 9 || item2.getEnchantLevel() > 9
                                || item3.getEnchantLevel() > 9) {
                            plus = 3;
                        }
                        if (_targetPc.hasSkillEffect(L1SkillId.POLLUTE_WATER)) {
                            dmg2 += (40 + _random.nextInt(15) + (plus * 10)) / 2; // 플루트워터경우절반 //원래 랜덤수치 30임
                        }
                        if (_targetPc.hasSkillEffect(L1SkillId.WATER_LIFE)) {
                            dmg2 += (40 + _random.nextInt(15) + (plus * 10)) * 2; // 워터라이프경우두배 //원래 랜덤수치 30임
                        }
                        dmg2 += 40 + _random.nextInt(15) + (plus * 10); // 회복률 = 기본50회복+랜덤(1~30) //원래 랜덤수치 30임
                        _targetPc.setCurrentHp(_targetPc.getCurrentHp() + dmg2);
                        _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 2187));
                        _targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 2187));
                    }
                }
            }
        }
		// 신성한 요정족판금갑옷
		int chance66 = _random.nextInt(100) + 1;
		if (_target != null) {
			int dmg2 = 0;
			int plus = 0;
			if (_targetPc.getInventory().checkEquipped(222351)) {
				if (chance66 <= 6) { // 원래 5임
					if (_targetPc.hasSkillEffect(L1SkillId.POLLUTE_WATER)) {
						dmg2 += (25 + _random.nextInt(15) + (plus * 10)) / 2; //
					}
					if (_targetPc.hasSkillEffect(L1SkillId.WATER_LIFE)) {
						dmg2 += (25 + _random.nextInt(15) + (plus * 10)) * 2; //
					}
					dmg2 += 25 + _random.nextInt(15) + (plus * 10); //
					_targetPc.setCurrentHp(_targetPc.getCurrentHp() + dmg2);
					_targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 15355));
					_targetPc.broadcastPacket(new S_SkillSound(_targetPc.getId(), 15355));
				}
			}
		}

        try {
            if (_targetPc.isCrown()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(0);
            } else if (_targetPc.isKnight()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(1);
            } else if (_targetPc.isElf()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(2);
            } else if (_targetPc.isWizard()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(3);
            } else if (_targetPc.isDarkelf()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(4);
            } else if (_targetPc.isBlackwizard()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(5);
            } else if (_targetPc.isDragonknight()) {
                dmg -= CharacterReduc.getInstance().getCharacterReduc(6);
            } else if (_targetPc.is전사()) {
            	dmg -= CharacterReduc.getInstance().getCharacterReduc(7);
            }
        } catch (Exception e) {
            System.out.println("Character Add Reduction Error");
        }

        // 애완동물, 사몬으로부터 플레이어에 공격
        boolean isNowWar = false;
        int castleId = L1CastleLocation.getCastleIdByArea(_targetPc);
        if (castleId > 0) {
            isNowWar = WarTimeController.getInstance().isNowWar(castleId);
        }
        if (!isNowWar) {
            if (_npc instanceof L1PetInstance) {
                dmg /= 2;
            }
            if (_npc instanceof L1SummonInstance) {
                L1SummonInstance summon = (L1SummonInstance) _npc;
                if (summon.isExsistMaster()) {
                    dmg /= 2;
                }
            }
        }

        addNpcPoisonAttack(_npc, _targetPc);

        if (_npc instanceof L1PetInstance || _npc instanceof L1SummonInstance) {
            if (_targetPc.getZoneType() == 1) {
                _isHit = false;
            }
        }

        if (dmg <= 0) {
            _isHit = false;
        }

        return (int) dmg;
    }

    // ●●●● NPC 로부터 NPC 에의 대미지 산출 ●●●●
    private int calcNpcNpcDamage() {
        if (_targetNpc == null || _npc == null)
            return 0;

        int lvl = _npc.getLevel();
        double dmg = 0;

        if (_npc instanceof L1PetInstance) {
            dmg = _random.nextInt(_npc.getNpcTemplate().get_level()) + _npc.getAbility().getTotalStr() / 2 + 1;
            dmg += (lvl / 16); // 펫은 LV16마다 추가 타격
            dmg += ((L1PetInstance) _npc).getDamageByWeapon();
        } else if (_npc instanceof L1SummonInstance) {
            dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() + 5;
        } else {
            dmg = _random.nextInt(lvl) + _npc.getAbility().getTotalStr() / 2 + 1;
        }

        if (isUndeadDamage()) {
            dmg *= 1.1;
        }

        dmg = dmg * getLeverage() / 10;

        dmg -= calcNpcDamageReduction();

        if (_npc.isWeaponBreaked()) { // NPC가 웨폰브레이크중.
            dmg /= 2;
        }

        addNpcPoisonAttack(_npc, _targetNpc);

        if (_targetNpc.hasSkillEffect(ICE_LANCE)) {
            dmg = 0;
        }
        if (_targetNpc.hasSkillEffect(EARTH_BIND)) {
            dmg = 0;
        }

        if (dmg <= 0) {
            _isHit = false;
        }

        return (int) dmg;
    }

    // ●●●● 플레이어의 대미지 강화 마법 ●●●●
    private double calcBuffDamage(double dmg) {
        if (_pc.hasSkillEffect(BURNING_SPIRIT) || (_pc.hasSkillEffect(ELEMENTAL_FIRE) && _weaponType != 20 && _weaponType != 62)) {
            if ((_random.nextInt(100) + 1) <= 33) {
                double tempDmg = dmg;
                if (_pc.hasSkillEffect(FIRE_WEAPON)) {
                    tempDmg -= 4;
                }
                if (_pc.hasSkillEffect(BURNING_WEAPON)) {
                    tempDmg -= 6;
                }
                if (_pc.hasSkillEffect(BERSERKERS)) {
                    tempDmg -= 5;
                }
                double diffDmg = dmg - tempDmg;
                dmg = tempDmg * 1.5 + diffDmg;
            }
        }

        return dmg;
    }

    /** 무기 속성 인챈에 따른 효과 부여(PC-PC) **/
    private double 피시속성인첸트효과() {
        int Attr = _weaponAttrLevel;
        double AttrDmg = 0;
        switch (_weaponAttrLevel) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            // AttrDmg += (Attr - 1) * 2+1;
            AttrDmg += (Attr - 1) + 1;
            AttrDmg -= AttrDmg * _targetPc.getResistance().getFire() / 100;
            break;
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
            // AttrDmg += (Attr - 6) * 2+1;
            AttrDmg += (Attr - 6) + 1;
            AttrDmg -= AttrDmg * _targetPc.getResistance().getWater() / 100;
            break;
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
            // AttrDmg += (Attr - 11) * 2+1;
            AttrDmg += (Attr - 11) + 1;
            AttrDmg -= AttrDmg * _targetPc.getResistance().getWind() / 100;
            break;
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
            // AttrDmg += (Attr - 16) * 2+1;
            AttrDmg += (Attr - 16) + 1;
            AttrDmg -= AttrDmg * _targetPc.getResistance().getEarth() / 100;
            break;
        default:
            AttrDmg = 0;
            break;
        }
        return AttrDmg;
    }

    /** 무기 속성 인챈에 따른 효과 부여(PC-NPC) **/
    private int 몬스터속성인첸트효과() {
        int AttrDmg = 0;
        int Attr = _weaponAttrLevel;
        int NpcWeakAttr = _targetNpc.getNpcTemplate().get_weakAttr();
        switch (NpcWeakAttr) {
        case 1: // 땅 취약 몬스터
            if (Attr >= 15 && Attr <= 20) {
                // AttrDmg += 1 + (Attr - 15) * 2;
                AttrDmg += 1 + (Attr - 15);
            }
            break;
        case 2: // 물 취약 몬스터
            if (Attr >= 6 && Attr <= 10) {
                // AttrDmg += 1 + (Attr - 6) * 2;
                AttrDmg += 1 + (Attr - 6);
            }
            break;
        case 4: // 불 취약 몬스터
            if (Attr >= 1 && Attr <= 5) {
                // AttrDmg += (Attr - 1) * 2 + 1;
                AttrDmg += 1 + (Attr - 1);
            }
            break;
        case 8: // 바람 취약 몬스터
            if (Attr >= 11 && Attr <= 15) {
                // AttrDmg += 1 + (Attr - 11) * 2;
                AttrDmg += 1 + (Attr - 11);
            }
            break;
        default:
            AttrDmg = 0;
            break;
        }
        return AttrDmg;
    }

    // ●●●● 플레이어의 AC에 의한 대미지 경감 ●●●●
    private int calcPcDefense() {
        int ac = Math.max(0, 10 - _targetPc.getAC().getAc());
        int acDefMax = _targetPc.getClassFeature().getAcDefenseMax(ac);
        return _random.nextInt(acDefMax + 1);
    }

    // ●●●● NPC의 대미지 축소에 의한 경감 ●●●●
    private int calcNpcDamageReduction() {
        return _targetNpc.getNpcTemplate().get_damagereduction();
    }

    // ●●●● 무기의 재질과 축복에 의한 추가 대미지 산출 ●●●●
    private int calcMaterialBlessDmg() {
        int damage = 0;
        int undead = _targetNpc.getNpcTemplate().get_undead();
        if ((_weaponMaterial == 14 || _weaponMaterial == 17 || _weaponMaterial == 22) && (undead == 1 || undead == 3)) { // 은·미스릴·오리하르콘, 한편, 안 데드계·안
                                                                                                                         // 데드계 보스
            damage += _random.nextInt(20) + 1;
        }
        if (_weaponBless == 0 && (undead == 1 || undead == 2 || undead == 3)) { // 축복 무기, 한편, 안 데드계·악마계·안 데드계 보스
            damage += _random.nextInt(4) + 1;
        }
        if (weapon != null && _weaponType != 20 && _weaponType != 62 && weapon.getHolyDmgByMagic() != 0 && (undead == 1 || undead == 3)) {
            damage += weapon.getHolyDmgByMagic();
        }
        return damage;
    }

    // ●●●● NPC의 안 데드의 야간 공격력의 변화 ●●●●
    private boolean isUndeadDamage() {
        boolean flag = false;
        int undead = _npc.getNpcTemplate().get_undead();
        boolean isNight = L1GameTimeClock.getInstance().getGameTime().isNight();
        if (isNight && (undead == 1 || undead == 3)) {
            flag = true;
        }
        return flag;
    }

    // ●●●● NPC의 독공격을 부가 ●●●●
    private void addNpcPoisonAttack(L1Character attacker, L1Character target) {
        if (_npc.getNpcTemplate().get_poisonatk() != 0) { // 독공격 있어
            if (15 >= _random.nextInt(100) + 1) { // 15%의 확률로 독공격
                if (_npc.getNpcTemplate().get_poisonatk() == 1) { // 통상독
                    // 3초 주기에 대미지 5
                    L1DamagePoison.doInfection(attacker, target, 3000, 5, false);
                } else if (_npc.getNpcTemplate().get_poisonatk() == 2) { // 침묵독
                    L1SilencePoison.doInfection(target);
                } else if (_npc.getNpcTemplate().get_poisonatk() == 4) { // 마비독
                    // 20초 후에 16초간 마비
                    L1ParalysisPoison.doInfection(target, 20000, 16000);
                }
            }
        } else if (_npc.getNpcTemplate().get_paralysisatk() != 0) { // / 마비 공격 있어
        }
    }

    // ■■■■ 마나스탓후와 강철의 마나스탓후의 MP흡수량 산출 ■■■■
    public void calcStaffOfMana() {
        // 마나,강철마나,악마지팡이
        if (_weaponId == 126 || _weaponId == 127 || _weaponId == 413103) {
            int som_lvl = _weaponEnchant + 3; // 최대 MP흡수량을 설정
            if (som_lvl < 0) {
                som_lvl = 0;
            }
            // MP흡수량을 랜덤 취득
            _drainMana = _random.nextInt(som_lvl) + 1;
            // 최대 MP흡수량을 9에 제한
            if (_drainMana > Config.MANA_DRAIN_LIMIT_PER_SOM_ATTACK) {
                _drainMana = Config.MANA_DRAIN_LIMIT_PER_SOM_ATTACK;
            }
        }
    }

    public void 마력의단검() { // 마나 흡수를 위한 추가
        int MR = getTargetMr(); // 마방에 따라 성공률 적용
        if (MR >= 100)
            return;
        if (MR < _random.nextInt(100))
            _drainMana = 1;
    }

    private int getTargetMr() {
        int mr = 1;
        if (_calcType == PC_PC || _calcType == NPC_PC) {
            mr = _targetPc.getResistance().getEffectedMrBySkill();
        } else {
            mr = _targetNpc.getResistance().getEffectedMrBySkill();
        }
        return mr;
    }

    public void getAbsorHP(L1PcInstance pc, L1Character target) {
        int pcInt = pc.getAbility().getTotalInt();

        _drainHp = (_random.nextInt(5) + pcInt + _weaponEnchant) / 3;

        if (_drainHp > 0 && target.getCurrentHp() > 0) {
            if (_drainHp > target.getCurrentHp()) {
                _drainHp = target.getCurrentHp();
            }
            short newHp = (short) (target.getCurrentHp() - _drainHp);
            target.setCurrentHp(newHp);
            newHp = (short) (_pc.getCurrentHp() + _drainHp);
            pc.setCurrentHp(newHp);
        }
    }

    /** 조우의 돌골렘 - 마력의 단검 **/
    public void calcDrainOfMana() {
        if (_weaponId == 602) {
            마력의단검();
        }
    }

    /** 조우의 돌골렘 - 파멸의 대검 * */
    public void 파멸의대검(double dmg) { // 21차파멸의대검파워북참조
        int r = _random.nextInt(100);
        if (r <= 80) {
            if (dmg <= 30) {
                _drainHp = 1;
            } else if (dmg > 30 && dmg <= 38) {
                _drainHp = 2;
            } else if (dmg > 38 && dmg <= 46) {
                _drainHp = 3;
            } else if (dmg > 46 && dmg <= 54) {
                _drainHp = 4;
            } else if (dmg > 54 && dmg <= 62) {
                _drainHp = 5;
            } else if (dmg > 62 && dmg <= 70) {
                _drainHp = 6;
            } else if (dmg > 70 && dmg <= 78) {
                _drainHp = 7;
            } else if (dmg > 78) {
                _drainHp = 8;
            }
        }
    }

    public void 블러드서커(double dmg, int enchant) { // 21차파워북참조
        int r = _random.nextInt(100);
        int e = enchant - 6;
        if (r <= 75) {
            if (dmg <= 30) {
                _drainHp = 1 + e;
            } else if (dmg > 30 && dmg <= 38) {
                _drainHp = 2 + e;
            } else if (dmg > 38 && dmg <= 46) {
                _drainHp = 3 + e;
            } else if (dmg > 46 && dmg <= 54) {
                _drainHp = 4 + e;
            } else if (dmg > 54 && dmg <= 63) {
                _drainHp = 5 + e;
            } else if (dmg > 63 && dmg <= 73) {
                _drainHp = 6 + e;
            } else if (dmg > 73 && dmg <= 83) {
                _drainHp = 7 + e;
            } else if (dmg > 83 && dmg <= 92) {
                _drainHp = 8 + e;
            } else if (dmg > 92) {
                _drainHp = 9 + e;
            }
            if (e <= 0) {
                e = 0;
            }
        }
    }

    public int 극한의체인소드(L1PcInstance pc, L1Character target, int effect, int enchant) {
        int dmg = 0;
        int en = enchant;
        int intel = pc.getAbility().getTotalInt();
        int chance = _random.nextInt(100) + 1;
        if (chance <= en + 2) {
            _drainHp = _random.nextInt(intel / 2) + (intel * 2);
            pc.sendPackets(new S_SkillSound(target.getId(), effect));
            Broadcaster.broadcastPacket(pc, new S_SkillSound(target.getId(), effect));
        }
        return dmg;
        // return L1WeaponSkill.calcDamageReduction(target, dmg, L1Skills.ATTR_WATER);
    }

    // 가이아격노
    public int getEbMP1(L1PcInstance pc, L1Character target, int effect, int enchant) {
        int dmg = 0;
        int en = enchant;
        int intel = pc.getAbility().getTotalInt();
        int chance = _random.nextInt(90) + 1;
        if (chance <= en + 8) {
            _drainMana = _random.nextInt(intel / 6) + (intel / 3);
            pc.sendPackets(new S_SkillSound(target.getId(), effect));
            Broadcaster.broadcastPacket(pc, new S_SkillSound(target.getId(), effect));
        }
        return dmg;
    }

    /** ●●●● 이블 리버스 ●●●● **/
    // 검 체인소드 크로우 도끼
    public int getEbHP(L1PcInstance pc, L1Character target, int effect, int enchant) {
        int dmg = 0;
        int en = enchant;
        int intel = pc.getAbility().getTotalInt();
        int chance = _random.nextInt(100) + 1;
        if (chance <= en + 5) {
            _drainHp = _random.nextInt(intel / 2) + (intel);
            pc.sendPackets(new S_SkillSound(target.getId(), effect));
            Broadcaster.broadcastPacket(pc, new S_SkillSound(target.getId(), effect));
        }
        return dmg;
    }

    public void miss(L1PcInstance pc, L1Character target) {

        pc.sendPackets(new S_SkillSound(target.getId(), 13418));
        Broadcaster.broadcastPacket(pc, new S_SkillSound(target.getId(), 13418));
    }

    /** ●●●● 이블 트릭 ●●●● **/
    // 지팡이 활 키링크
    public int getEbMP(L1PcInstance pc, L1Character target, int effect, int enchant) {
        int dmg = 0;
        int en = enchant;
        int intel = pc.getAbility().getTotalInt();
        int chance = _random.nextInt(100) + 1;
        if (chance <= (en) + 5) {
            _drainMana = _random.nextInt(intel / 6) + (intel / 3);
            pc.sendPackets(new S_SkillSound(target.getId(), effect));
            Broadcaster.broadcastPacket(pc, new S_SkillSound(target.getId(), effect));
        }
        return dmg;
    }

    // ■■■■ PC의 독공격을 부가 ■■■■
    public void addPcPoisonAttack(L1Character attacker, L1Character target) {
        int chance = _random.nextInt(100) + 1;
        if ((_weaponId == 13 || _weaponId == 44 // FOD, 고대의 다크 에르프 소도
                || (_weaponId != 0 && _pc.hasSkillEffect(ENCHANT_VENOM))) // 엔챤트
                // 베놈중
                && chance <= 10) {
            L1DamagePoison.doInfection(attacker, target, 3000, 30, false);
        }
    }

    /* ■■■■■■■■■■■■■■ 공격 모션 송신 ■■■■■■■■■■■■■■ */

    public void action() {
        try {
            if (_calcType == PC_PC || _calcType == PC_NPC) {
                if (_isCritical) {
                    criticalPc();
                    if (!_pc.isGm()) {
                        _isCritical = false;
                    }
                } else {
                    actionPc();
                }
            } else if (_calcType == NPC_PC || _calcType == NPC_NPC) {
                actionNpc();
            }
        } catch (Exception e) {
        }
    }

    // ●●●● 플레이어의 공격 모션 송신 ●●●●
    private void actionPc() {
        _pc.setHeading(_pc.targetDirection(_targetX, _targetY)); // 방향세트
        if(_target instanceof L1NpcInstance){
        	if(((L1NpcInstance)_target).getNpcId() >=400067 && ((L1NpcInstance)_target).getNpcId() <=400080){
        		_isHit = false;
        	}
        }
        if (_weaponType == 20) {
            if (_pc instanceof L1RobotInstance || _arrow != null) {
                if (!_pc.noPlayerCK)
                    _pc.getInventory().removeItem(_arrow, 1);
                 if (_pc.getTempCharGfx() == 7967) {
                    _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 7972, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 7972, _targetX, _targetY, _isHit));
                } else if (_pc.getTempCharGfx() == 11402 || _pc.getTempCharGfx() == 8900) { // 75렙 변신
                    _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 8904, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 8904, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                } else if (_pc.getTempCharGfx() == 11406 || _pc.getTempCharGfx() == 8913) {// 80렙 변신
                    _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 8916, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 8916, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                } else if (_pc.getTempCharGfx() == 13631) {// 82렙 변신
                    _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 13656, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 13656, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                } else if (_pc.getTempCharGfx() == 13635) {// 85렙 변신
                    _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 13658, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 13658, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                } else {
                    _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 66, _targetX, _targetY, _isHit));
                    Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 66, _targetX, _targetY, _isHit));
                }
                if (_isHit) {
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                }
            } else if (_weaponId == 190) {
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 2349, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 2349, _targetX, _targetY, _isHit));
                if (_isHit) {
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                }
            } else if (_weaponId == 202011) {// 가이아의격노
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 13658, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 13658, _targetX, _targetY, _isHit));
                if (_isHit) {
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                }
            } else if (_weaponId == 10000) {
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 8771, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 8771, _targetX, _targetY, _isHit));
                if (_isHit) {
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
                }
            }
        } else if (_weaponType == 62 && _sting != null) {
            _pc.getInventory().removeItem(_sting, 1);
             if (_pc.getTempCharGfx() == 7967) {
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 7972, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 7972, _targetX, _targetY, _isHit));
            } else if (_pc.getTempCharGfx() == 11402 || _pc.getTempCharGfx() == 8900) {// 75렙 변신
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 8904, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 8904, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
            } else if (_pc.getTempCharGfx() == 11406 || _pc.getTempCharGfx() == 8913) {// 80렙 변신
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 8916, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 8916, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
            } else if (_pc.getTempCharGfx() == 13631) {// 82렙 변신
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 13656, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 13656, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
            } else if (_pc.getTempCharGfx() == 13635) {// 85렙 변신
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 13658, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 13658, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
            } else {
                _pc.sendPackets(new S_UseArrowSkill(_pc, _targetId, 2989, _targetX, _targetY, _isHit));
                Broadcaster.broadcastPacket(_pc, new S_UseArrowSkill(_pc, _targetId, 2989, _targetX, _targetY, _isHit));
            }
            if (_isHit) {
                Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
            }
        } else {
            if (_isHit) {
                _pc.sendPackets(new S_AttackPacket(_pc, _targetId, ActionCodes.ACTION_Attack, _attackType));
               Broadcaster.broadcastPacket(_pc, new S_AttackPacket(_pc, _targetId, ActionCodes.ACTION_Attack, _attackType));
                Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _pc);
            } else {
                if (_targetId > 0) {
                    _pc.sendPackets(new S_AttackMissPacket(_pc, _targetId));
                    Broadcaster.broadcastPacket(_pc, new S_AttackMissPacket(_pc, _targetId));
                } else {
                    _pc.sendPackets(new S_AttackPacket(_pc, 0, ActionCodes.ACTION_Attack));
                    Broadcaster.broadcastPacket(_pc, new S_AttackPacket(_pc, 0, ActionCodes.ACTION_Attack));
                }
            }
        }
    }

    private void criticalPc() {
        _pc.setHeading(_pc.targetDirection(_targetX, _targetY)); // 방향세트
        if (_weaponType == 20) {
            _pc.sendPackets(new S_AttackCritical(_pc, _targetId, _targetX, _targetY, _weaponType, _isHit));
            Broadcaster.broadcastPacket(_pc, new S_AttackCritical(_pc, _targetId, _targetX, _targetY, _weaponType, _isHit));// 새로만드셔서 ㅎ
        } else if (_weaponType == 62 && _sting != null) {

            _pc.sendPackets(new S_AttackCritical(_pc, _targetId, _targetX, _targetY, _weaponType, _isHit));
            Broadcaster.broadcastPacket(_pc, new S_AttackCritical(_pc, _targetId, _targetX, _targetY, _weaponType, _isHit));
        } else {
            if (_pc.is전사()) {
                _pc.sendPackets(new S_AttackCritical(_pc, _targetId, 99));
                Broadcaster.broadcastPacket(_pc, new S_AttackCritical(_pc, _targetId, 99));
            } else {
                if (_weaponType2 == 18) {
                    _weaponType = 90;
                } else if (_weaponType2 == 17) {
                    _weaponType = 91;
                } else if (_weaponType2 == 8 || _weaponType == 10) {
                    _weaponType = 92;
                }
            }
            _pc.sendPackets(new S_AttackCritical(_pc, _targetId, _weaponType));
            Broadcaster.broadcastPacket(_pc, new S_AttackCritical(_pc, _targetId, _weaponType));
        }
    }

    // ●●●● NPC의 공격 모션 송신 ●●●●
    private void actionNpc() {
        int _npcObjectId = _npc.getId();
        int bowActId = 0;
        int actId = 0;

        _npc.setHeading(_npc.targetDirection(_targetX, _targetY)); // 방향세트

        // 타겟과의 거리가 2이상 있으면 원거리 공격
        boolean isLongRange = (_npc.getLocation().getTileLineDistance(new Point(_targetX, _targetY)) > 1);
        bowActId = _npc.getNpcTemplate().getBowActId();

        if (getActId() > 0) {
            actId = getActId();
        } else {
            actId = ActionCodes.ACTION_Attack;
        }

        if (isLongRange && bowActId > 0) {
            Broadcaster.broadcastPacket(_npc, new S_UseArrowSkill(_npc, _targetId, bowActId, _targetX, _targetY, _isHit));
        } else {
            if (_isHit) {
                if (getGfxId() > 0) {
                    Broadcaster.broadcastPacket(_npc, new S_UseAttackSkill(_target, _npcObjectId, getGfxId(), _targetX, _targetY, actId));
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _npc);
                } else {
                    Broadcaster.broadcastPacket(_npc, new S_AttackPacketForNpc(_target, _npcObjectId, actId));
                    Broadcaster.broadcastPacketExceptTargetSight(_target, new S_DoActionGFX(_targetId, ActionCodes.ACTION_Damage), _npc);
                }
            } else {
                if (getGfxId() > 0) {
                    Broadcaster.broadcastPacket(_npc, new S_UseAttackSkill(_target, _npcObjectId, getGfxId(), _targetX, _targetY, actId, 0));
                } else {
                    Broadcaster.broadcastPacket(_npc, new S_AttackMissPacket(_npc, _targetId, actId));
                }
            }
        }
    }

    // 나는 일 도구(화살, 스팅)가 미스였다고 나무의 궤도를 계산
    public void calcOrbit(int cx, int cy, int head) // 기점 X 기점 Y 지금 향하고 있는 방향
    {
        float dis_x = Math.abs(cx - _targetX); // X방향의 타겟까지의 거리
        float dis_y = Math.abs(cy - _targetY); // Y방향의 타겟까지의 거리
        float dis = Math.max(dis_x, dis_y); // 타겟까지의 거리
        float avg_x = 0;
        float avg_y = 0;
        if (dis == 0) { // 목표와 같은 위치라면 향하고 있는 방향에 진곧
            switch (head) {
            case 1:
                avg_x = 1;
                avg_y = -1;
                break;
            case 2:
                avg_x = 1;
                avg_y = 0;
                break;
            case 3:
                avg_x = 1;
                avg_y = 1;
                break;
            case 4:
                avg_x = 0;
                avg_y = 1;
                break;
            case 5:
                avg_x = -1;
                avg_y = 1;
                break;
            case 6:
                avg_x = -1;
                avg_y = 0;
                break;
            case 7:
                avg_x = -1;
                avg_y = -1;
                break;
            case 0:
                avg_x = 0;
                avg_y = -1;
                break;
            default:
                break;
            }
        } else {
            avg_x = dis_x / dis;
            avg_y = dis_y / dis;
        }

        int add_x = (int) Math.floor((avg_x * 15) + 0.59f); // 상하 좌우가 조금 우선인 둥근
        int add_y = (int) Math.floor((avg_y * 15) + 0.59f); // 상하 좌우가 조금 우선인 둥근

        if (cx > _targetX) {
            add_x *= -1;
        }
        if (cy > _targetY) {
            add_y *= -1;
        }

        _targetX = _targetX + add_x;
        _targetY = _targetY + add_y;
    }

    /* ■■■■■■■■■■■■■■■ 계산 결과 반영 ■■■■■■■■■■■■■■■ */

    public void commit() {
        if (_isHit) {
            try {
                if (_calcType == PC_PC || _calcType == NPC_PC) {
                    commitPc();
                } else if (_calcType == PC_NPC || _calcType == NPC_NPC) {
                    commitNpc();
                }
            } catch (Exception e) {
            }
        }

        // 대미지치 및 명중율 확인용 메세지
        if (!Config.ALT_ATKMSG) {
            return;
        }
        if (_target == null)
			return;
        if (Config.ALT_ATKMSG) {
            if ((_calcType == PC_PC || _calcType == PC_NPC) && !_pc.isGm()) {
                return;
            }
            if ((_calcType == PC_PC || _calcType == NPC_PC) && !_targetPc.isGm()) {
                return;
            }
        }
        String msg0 = "";
        String msg1 = "";
        String msg2 = "";
        String msg3 = "";
        if (_calcType == PC_PC || _calcType == PC_NPC) { // 어텍커가 PC의 경우
            msg0 = _pc.getName();
        } else if (_calcType == NPC_PC) { // 어텍커가 NPC의 경우
            msg0 = _npc.getName();
        }

        if (_calcType == NPC_PC || _calcType == PC_PC) { // 타겟이 PC의 경우
            msg3 = _targetPc.getName();
            msg1 = "HP:" + _targetPc.getCurrentHp() + " / HR:" + _hitRate;
        } else if (_calcType == PC_NPC) { // 타겟이 NPC의 경우
            msg3 = _targetNpc.getName();
            msg1 = "HP:" + _targetNpc.getCurrentHp() + " / HR:" + _hitRate;
        }
        msg2 = "DMG:" + _damage;

        if (_calcType == PC_PC || _calcType == PC_NPC) { // 어텍커가 PC의 경우
            _pc.sendPackets(new S_SystemMessage("\\fR[" + msg0 + "->" + msg3 + "] " + msg2 + " / " + msg1));
        }
        if (_calcType == NPC_PC || _calcType == PC_PC) { // 타겟이 PC의 경우
            _targetPc.sendPackets(new S_SystemMessage("\\fY[" + msg0 + "->" + msg3 + "] " + msg2 + " / " + msg1));
        }
    }

    // ●●●● 플레이어에 계산 결과를 반영 ●●●●
    private void commitPc() {
        if (_calcType == PC_PC) {
            if (_targetPc.hasSkillEffect(ICE_LANCE)) {
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_targetPc.hasSkillEffect(EARTH_BIND)) {
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_targetPc.hasSkillEffect(MOB_BASILL)) { // 바실얼리기대미지0
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_targetPc.hasSkillEffect(MOB_COCA)) { // 코카얼리기대미지0
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_drainMana > 0 && _targetPc.getCurrentMp() > 0) {
                if (_drainMana > _targetPc.getCurrentMp()) {
                    _drainMana = _targetPc.getCurrentMp();
                }
                short newMp = (short) (_targetPc.getCurrentMp() - _drainMana);
                _targetPc.setCurrentMp(newMp);
                newMp = (short) (_pc.getCurrentMp() + _drainMana);
                _pc.setCurrentMp(newMp);
            }

            /** 조우의 돌골렘 **/

            if (_drainHp > 0 && _targetPc.getCurrentHp() > 0) {
                if (_drainHp > _targetPc.getCurrentHp()) {
                    _drainHp = _targetPc.getCurrentHp();
                }
                short newHp = (short) (_targetPc.getCurrentHp() - _drainHp);
                _targetPc.setCurrentHp(newHp);
                newHp = (short) (_pc.getCurrentHp() + _drainHp);
                _pc.setCurrentHp(newHp);
            }
            /** 조우의 돌골렘 **/

            // damagePcWeaponDurability(); // 무기를 손상시킨다.

            _targetPc.receiveDamage(_pc, _damage);
        } else if (_calcType == NPC_PC) {
            if (_targetPc.hasSkillEffect(ICE_LANCE)) {
                _damage = 0;
            }
            if (_targetPc.hasSkillEffect(EARTH_BIND)) {
                _damage = 0;
            }
            if (_targetPc.hasSkillEffect(MOB_BASILL)) { // 바실얼리기대미지0
                _damage = 0;
            }
            if (_targetPc.hasSkillEffect(MOB_COCA)) { // 코카얼리기대미지0
                _damage = 0;
            }
            _targetPc.receiveDamage(_npc, _damage);
        }
    }

    // ●●●● NPC에 계산 결과를 반영 ●●●●
    private void commitNpc() {
        if (_calcType == PC_NPC) {
            if (_targetNpc.hasSkillEffect(ICE_LANCE)) {
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_targetNpc.hasSkillEffect(EARTH_BIND)) {
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_targetNpc.hasSkillEffect(MOB_BASILL)) { // 바실얼리기대미지0
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_targetNpc.hasSkillEffect(MOB_COCA)) { // 코카얼리기대미지0
                _damage = 0;
                _drainMana = 0;
                _drainHp = 0;
            }
            if (_drainMana > 0) {
                int drainValue = _targetNpc.drainMana(_drainMana);
                int newMp = _pc.getCurrentMp() + drainValue;
                _pc.setCurrentMp(newMp);

                if (drainValue > 0) {
                    int newMp2 = _targetNpc.getCurrentMp() - drainValue;
                    _targetNpc.setCurrentMp(newMp2);
                }
            }

            /** 조우의 돌골렘 **/

            if (_drainHp > 0) {
                int newHp = _pc.getCurrentHp() + _drainHp;
                _pc.setCurrentHp(newHp);
            }
            /** 조우의 돌골렘 **/

            damageNpcWeaponDurability(); // 무기를 손상시킨다.

            _targetNpc.receiveDamage(_pc, _damage);
        } else if (_calcType == NPC_NPC) {
            if (_targetNpc.hasSkillEffect(ICE_LANCE)) {
                _damage = 0;
            }
            if (_targetNpc.hasSkillEffect(EARTH_BIND)) {
                _damage = 0;
            }
            if (_targetNpc.hasSkillEffect(MOB_BASILL)) { // 바실얼리기대미지0
                _damage = 0;
            }
            if (_targetNpc.hasSkillEffect(MOB_COCA)) { // 코카얼리기대미지0
                _damage = 0;
            }
            _targetNpc.receiveDamage(_npc, _damage);
        }
    }

    /* ■■■■■■■■■■■■■■■ 카운터 배리어 ■■■■■■■■■■■■■■■ */

    // ■■■■ 카운터 배리어시의 공격 모션 송신 ■■■■
    public void actionCounterBarrier() {
        if (_calcType == PC_PC) {
            if (_pc == null)
                return;
            _pc.setHeading(_pc.targetDirection(_targetX, _targetY)); // 방향세트
            _pc.sendPackets(new S_AttackMissPacket(_pc, _targetId));
            _pc.broadcastPacket(new S_AttackMissPacket(_pc, _targetId), _target);
            _pc.sendPackets(new S_DoActionGFX(_pc.getId(), ActionCodes.ACTION_Damage));
            _pc.broadcastPacket(new S_DoActionGFX(_pc.getId(), ActionCodes.ACTION_Damage));
            _pc.sendPackets(new S_SkillSound(_targetId, 10710));
            _pc.broadcastPacket(new S_SkillSound(_targetId, 10710));
        } else if (_calcType == NPC_PC) {
            if (_npc == null || _target == null)
                return;
            int actId = 0;
            _npc.setHeading(_npc.targetDirection(_targetX, _targetY)); // 방향세트
            if (getActId() > 0) {
                actId = getActId();
            } else {
                actId = ActionCodes.ACTION_Attack;
            }
            if (getGfxId() > 0) {
                _npc.broadcastPacket(new S_UseAttackSkill(_target, _npc.getId(), getGfxId(), _targetX, _targetY, actId, 0), _target);
            } else {
                _npc.broadcastPacket(new S_AttackMissPacket(_npc, _targetId, actId), _target);
            }
            _npc.broadcastPacket(new S_DoActionGFX(_npc.getId(), ActionCodes.ACTION_Damage));
            _npc.broadcastPacket(new S_SkillSound(_targetId, 10710));
        }
    }

    // ■■■■ 모탈바디 발동시의 공격 모션 송신 ■■■■

    public void actionMortalBody() {
        if (_calcType == PC_PC) {
            if (_pc == null || _target == null)
                return;
            _pc.setHeading(_pc.targetDirection(_targetX, _targetY)); // 방향세트
            S_UseAttackSkill packet = new S_UseAttackSkill(_pc, _target.getId(), 6519, _targetX, _targetY, ActionCodes.ACTION_Attack, false);
            _pc.sendPackets(packet);
            _pc.broadcastPacket(packet, _target);
            _pc.sendPackets(new S_DoActionGFX(_pc.getId(), ActionCodes.ACTION_Damage));
            _pc.broadcastPacket(new S_DoActionGFX(_pc.getId(), ActionCodes.ACTION_Damage));
        } else if (_calcType == NPC_PC) {
            if (_npc == null || _target == null)
                return;
            _npc.setHeading(_npc.targetDirection(_targetX, _targetY)); // 방향세트
            _npc.broadcastPacket(new S_SkillSound(_target.getId(), 6519));
            _npc.broadcastPacket(new S_DoActionGFX(_npc.getId(), ActionCodes.ACTION_Damage));
        }
    }

    // ■■■■ 상대의 공격에 대해서 카운터 배리어가 유효한가를 판별 ■■■■
    public boolean isShortDistance() {
        boolean isShortDistance = true;
        if (_calcType == PC_PC) {
            if (_weaponType == 20 || _weaponType == 62 || _weaponType2 == 17 || _weaponType2 == 19 || _pc.hasSkillEffect(L1SkillId.ARMOR_BRAKE)) {
                isShortDistance = false;
            }
        } else if (_calcType == NPC_PC) {
            if (_npc == null)
                return false;
            boolean isLongRange = (_npc.getLocation().getTileLineDistance(new Point(_targetX, _targetY)) > 1);
            int bowActId = _npc.getNpcTemplate().getBowActId();
            // 거리가 2이상, 공격자의 활의 액션 ID가 있는 경우는 원공격
            if (isLongRange && bowActId > 0) {
                isShortDistance = false;
            }
        }
        return isShortDistance;
    }

    // ■■■■ 카운터 배리어의 대미지를 반영 ■■■■
    public void commitCounterBarrier() {
        int damage = calcCounterBarrierDamage();
        if (damage == 0) {
            return;
        }
        if (_calcType == PC_PC) {
            _pc.receiveCounterBarrierDamage(_targetPc, damage);
        } else if (_calcType == NPC_PC) {
            _npc.receiveCounterBarrierDamage(_targetPc, damage);
        }
    }

    // ■■■■ 모탈바디의 대미지를 반영 ■■■■
    public void commitMortalBody() {
        // int damage = 40;
        // if (damage == 0) {
        // return;
        // }
        int ac = Math.max(0, 10 - _targetPc.getAC().getAc());
        int damage = ac / 2;

        if (damage == 0) {
            return;
        }
        if (damage <= 40) {
            damage = 40;
        }
        if (_calcType == PC_PC) {
            _pc.receiveDamage(_targetPc, damage);
        } else if (_calcType == NPC_PC) {
            _npc.receiveDamage(_targetPc, damage);
        }
    }

    // ●●●● 카운터 배리어의 대미지를 산출 ●●●●
    private int calcCounterBarrierDamage() {
        double damage = 0;
        L1ItemInstance weapon = null;
        weapon = _targetPc.getWeapon();
        if (weapon != null) {
            if (weapon.getItem().getType() == 3) {
                damage = Math.round((weapon.getItem().getDmgLarge() + weapon.getEnchantLevel() + weapon.getItem().getDmgModifier()) * 2);
                
            }
        }
        return (int) damage;
    }

    // ●●●● 전사 타이탄 대미지를 산출 ●●●●
    private int 타이탄대미지() {
        double damage = 0;
        L1ItemInstance weapon = null;
        weapon = _targetPc.getWeapon();
        if (weapon != null) {
            damage = Math.round((weapon.getItem().getDmgLarge() + weapon.getEnchantLevel() + weapon.getItem().getDmgModifier()) * 1.5);
        }
        return (int) damage;
    }

    /*
     * 무기를 손상시킨다. 대NPC의 경우, 손상 확률은10%로 한다. 축복 무기는3%로 한다.
     */
    private void damageNpcWeaponDurability() {
        int chance = 10; //일반 무기
        int bchance = 3; //축복 받은 무기 손상확률

        /** 로봇시스템 **/
        if (_pc.getRobotAi() != null) {
            return;
        }
        /** 로봇시스템 **/

        /*
         * 손상하지 않는 NPC, 맨손, 손상하지 않는 무기 사용, SOF중의 경우 아무것도 하지 않는다.
         */
        if (_calcType != PC_NPC || _targetNpc.getNpcTemplate().is_hard() == false || _weaponType == 0 || weapon.getItem().get_canbedmg() == 0
                || _pc.hasSkillEffect(SOUL_OF_FLAME)) {
            return;
        }
        // 통상의 무기·저주해진 무기
        if ((_weaponBless == 1 || _weaponBless == 2) && ((_random.nextInt(100) + 1) < chance)) {
            // \f1당신의%0가 손상했습니다.
            _pc.sendPackets(new S_ServerMessage(268, weapon.getLogName()));
            _pc.getInventory().receiveDamage(weapon);
        }
        // 축복된 무기
        if (_weaponBless == 0 && ((_random.nextInt(100) + 1) < bchance)) {
            // \f1당신의%0가 손상했습니다.
            _pc.sendPackets(new S_ServerMessage(268, weapon.getLogName()));
            _pc.getInventory().receiveDamage(weapon);
        }
    }

    /** 속성화살 **/
    private int 속성화살(L1ItemInstance arrow, L1NpcInstance npc) {
        int itemId = arrow.getItem().getItemId();
        int damage = 0;
        int NpcWeakAttr = _targetNpc.getNpcTemplate().get_weakAttr();
        if (itemId == 820014) {// 수령의 블랙 미스릴 화살
            if (NpcWeakAttr == 2) {
                damage = 3;
            }
        } else if (itemId == 820015) {// 풍령의 블랙 미스릴 화살
            if (NpcWeakAttr == 8) {
                damage = 3;
            }
        } else if (itemId == 820016) {// 지령의 블랙 미스릴 화살
            if (NpcWeakAttr == 1) {
                damage = 3;
            }
        } else if (itemId == 820017) {// 화령의 블랙 미스릴 화살
            if (NpcWeakAttr == 4) {
                damage = 3;
            }
        }
        return damage;
    }

    /** 스탯 + 무기에 따른 공성 **/
    private int PchitAdd() {
        int value = 0;
        if(_pc instanceof L1RobotInstance){
        	return 10;
        }
        if (_pc.getAbility().getTotalStr() > 59) {
            value += (strHit[58]);
        } else {
            value += (strHit[_pc.getAbility().getTotalStr() - 1]);
        }

        if (_pc.getAbility().getTotalDex() > 60) {
            value += (dexHit[59]);
        } else {
            value += (dexHit[_pc.getAbility().getTotalDex() - 1]);
        }

        if (_weaponType != 20 && _weaponType != 62) {
            value += _weaponAddHit + _pc.getHitup() + _pc.getHitRate() + (_weaponEnchant / 2);
        } else {
            value += _weaponAddHit + _pc.getBowHitup() + _pc.getBowHitRate() + (_weaponEnchant / 2);
        }
		if (Sweapon != null){ // 전사 쌍수 공성 추가
			value += _SweaponAddHit + (_SweaponEnchant /2);
		}
        return value;
    }

    /** 타겟PC 회피 스킬에 대한 연산 **/
    private int toPcSkillHit() {
        int value = 0;
        if (_targetPc.hasSkillEffect(UNCANNY_DODGE)) {
            value -= 5;// 2
        }
        if (_targetPc.hasSkillEffect(FEAR)) {
            value += 4;
        }
        if (_targetPc.hasSkillEffect(MIRROR_IMAGE)) {
            value -= 4;
        }
        return value;
    }

    /** Hit 최종 연산 **/
    private boolean hitRateCal(int AD, int DD, int fumble, int critical) {
        if (AD <= fumble) {
            _hitRate = 0;
            return true;
        } else if (AD >= critical) {
            _hitRate = 100;
        } else {
            if (AD > DD) {
                _hitRate = 100;
            } else if (AD <= DD) {
                _hitRate = 0;
                return true;
            }
        }
        return false;
    }

    /** 타겟PC DD 연산 **/
    private int toPcDD(int dv) {
        if (_targetPc.getAC().getAc() >= 0) {
            return 10 - _targetPc.getAC().getAc();
        } else {
            return 10 + _random.nextInt(dv) + 1;
        }
    }
    
	private double 룸티스검귀추가데미지() {
		int dmg = 0;
		if(_calcType == PC_PC || _calcType == PC_NPC) {
			L1ItemInstance blackRumti = _pc.getInventory().checkEquippedItem(222340);
			if(blackRumti == null)
				blackRumti = _pc.getInventory().checkEquippedItem(222341);
			if(blackRumti != null) {
				int chance = 0;
				if(blackRumti.getBless() == 0 && blackRumti.getEnchantLevel() >= 4) {
					chance = 2 + blackRumti.getEnchantLevel() - 4;
				}
				else if(blackRumti.getEnchantLevel() >= 5) {
					chance = 2 + blackRumti.getEnchantLevel() - 5;
				}
				if(chance != 0) {
					if(_random.nextInt(100) < Config.ROOMTIECE_CHANCE) {
						dmg += 20;
						_pc.sendPackets(new S_SkillSound(_pc.getId(), 13931));
						_pc.broadcastPacket(new S_SkillSound(_pc.getId(), 13931));
					}
				}
			}
		}
		return dmg;
	}
	
	
	private int 룸티스붉귀데미지감소() {
		int damage = 0;
		if (_calcType == NPC_PC || _calcType == PC_PC) {
			L1ItemInstance item = _targetPc.getInventory().checkEquippedItem(22229);
			if (item != null && item.getEnchantLevel() >= 5) {
				if (_random.nextInt(100) < 2 + item.getEnchantLevel() - 5) {
					damage = 20;
					_targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 12118), true);
				}
			}

			L1ItemInstance item2 = _targetPc.getInventory().checkEquippedItem(222337);
			if (item2 != null && item2.getEnchantLevel() >= 5) {
				if (_random.nextInt(100) < Config.ROOMTIECE_CHANCE) {
					damage = 20;
					_targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 12118), true);
				}
			}
		}
		return damage;
	}


    public void ArmorDestory() {
        for (L1ItemInstance armorItem : _targetPc.getInventory().getItems()) {
            if (armorItem.getItem().getType2() == 2 && armorItem.getItem().getType() == 2) {
                int armorId = armorItem.getItemId();
                L1ItemInstance item = _targetPc.getInventory().findEquippedItemId(armorId);
                if (item != null) {
                    int chance = _random.nextInt(100) + 1;
                    if (item.get_durability() == (armorItem.getItem().get_ac() * -1)) {
                        break;
                    } else {
                        if (chance <= 15) {
                            item.set_durability(item.get_durability() + 1);
                            _targetPc.getInventory().updateItem(item, L1PcInventory.COL_DURABILITY);
                            _targetPc.sendPackets(new S_SkillSound(_targetPc.getId(), 14549));
                            _targetPc.getAC().addAc(1);
                            _targetPc.sendPackets(new S_OwnCharAttrDef(_targetPc));
                            _targetPc.sendPackets(new S_ServerMessage(268, armorItem.getLogName()));
                            Broadcaster.broadcastPacket(_targetPc, new S_SkillSound(_targetPc.getId(), 14549));
                        }
                    }
                }
            }
        }
    }
}
