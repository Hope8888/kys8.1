package l1j.server.server.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import l1j.server.L1DatabaseFactory;
import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.utils.SQLUtil;

public class L1Quest {
	private static Logger _log = Logger.getLogger(L1Quest.class.getName());

	public static final int QUEST_LEVEL15 = 1;
	public static final int QUEST_LEVEL30 = 2;
	public static final int QUEST_LEVEL45 = 3;
	public static final int QUEST_LEVEL50 = 4;

	public static final int QUEST_FIRSTQUEST = 40; // ## A70 말하는 두루마리 퀘스트 추가

	public static final int QUEST_LYRA = 10;
	public static final int QUEST_OILSKINMANT = 11;

	public static final int QUEST_DOROMOND = 20;
	public static final int QUEST_RUBA = 21;
	public static final int QUEST_AREX = 22;

	public static final int QUEST_LUKEIN1 = 23;
	public static final int QUEST_TBOX1 = 24;
	public static final int QUEST_TBOX2 = 25;
	public static final int QUEST_TBOX3 = 26;
	public static final int QUEST_SIMIZZ = 27;
	public static final int QUEST_DOIL = 28;
	public static final int QUEST_RUDIAN = 29;
	public static final int QUEST_RESTA = 30;
	public static final int QUEST_CADMUS = 31;
	public static final int QUEST_KAMYLA = 32;
	public static final int QUEST_CRYSTAL = 33;
	public static final int QUEST_LIZARD = 34;
	public static final int QUEST_KEPLISHA = 35;
	public static final int QUEST_DESIRE = 36;
	public static final int QUEST_SHADOWS = 37;
	public static final int QUEST_ROI = 38;
	public static final int QUEST_MOONBOW = 39;
	public static final int QUEST_ICEQUEENRING = 41;
	public static final int QUEST_END = 255;

	// 스냅퍼 방지/귀걸이
	public static final int QUEST_SLOT76 = 60;
	public static final int QUEST_SLOT81 = 61;
	public static final int QUEST_SLOT59 = 62;
	public static final int QUEST_SAI_RUNE70 = 63;
	public static final int QUEST_SLOT70 = 64;
	public static final int QUEST_SLOT83 = 65;

	public static final int QUEST_HAMO = 80;

	// 리뉴얼 퀘스트
	public static final int QUEST_HIDDENVALLEY = 43; // 숨겨진 계곡 초보자 도우미
	public static final int QUEST_HIGHDAILY = 44; // 토벌 대원 일일 퀘스트
	public static final int QUEST_HPASS = 45; // 기초 훈련 교관 서브 퀘스트
	public static final int QUEST_HIGHPASS = 46; // 최종 훈련 심사원 서브 퀘스트
	public static final int QUEST_HIGHDAILYB = 47; // 드래곤뼈 수집꾼 일일 퀘스트

	private L1PcInstance _owner = null;
	private HashMap<Integer, Integer> _quest = null;

	public L1Quest(L1PcInstance owner) {
		_owner = owner;
	}

	public L1PcInstance get_owner() {
		return _owner;
	}

	public int get_step(int quest_id) {

		if (_quest == null) {

			Connection con = null;
			PreparedStatement pstm = null;
			ResultSet rs = null;
			try {
				_quest = new HashMap<Integer, Integer>();

				con = L1DatabaseFactory.getInstance().getConnection();
				pstm = con.prepareStatement("SELECT * FROM character_quests WHERE char_id=?");
				pstm.setInt(1, _owner.getId());
				rs = pstm.executeQuery();

				while (rs.next()) {
					_quest.put(new Integer(rs.getInt(2)), new Integer(rs.getInt(3)));
				}

			} catch (SQLException e) {
				_log.log(Level.SEVERE, e.getLocalizedMessage(), e);
			} finally {
				SQLUtil.close(rs);
				SQLUtil.close(pstm);
				SQLUtil.close(con);
			}
		}
		Integer step = _quest.get(new Integer(quest_id));
		if (step == null) {
			return 0;
		} else {
			return step.intValue();
		}
	}

	public void set_step(int quest_id, int step) {

		Connection con = null;
		PreparedStatement pstm = null;
		try {
			con = L1DatabaseFactory.getInstance().getConnection();

			if (_quest.get(new Integer(quest_id)) == null) {

				pstm = con.prepareStatement("INSERT INTO character_quests " + "SET char_id = ?, quest_id = ?, quest_step = ?");
				pstm.setInt(1, _owner.getId());
				pstm.setInt(2, quest_id);
				pstm.setInt(3, step);
				pstm.execute();
			} else {
				pstm = con.prepareStatement("UPDATE character_quests " + "SET quest_step = ? WHERE char_id = ? AND quest_id = ?");
				pstm.setInt(1, step);
				pstm.setInt(2, _owner.getId());
				pstm.setInt(3, quest_id);
				pstm.execute();
			}
		} catch (SQLException e) {
			_log.log(Level.SEVERE, e.getLocalizedMessage(), e);

		} finally {
			SQLUtil.close(pstm);
			SQLUtil.close(con);

		}
		_quest.put(new Integer(quest_id), new Integer(step));
	}

	public void add_step(int quest_id, int add) {
		int step = get_step(quest_id);
		step += add;
		set_step(quest_id, step);
	}

	public void set_end(int quest_id) {
		set_step(quest_id, QUEST_END);
	}

	public boolean isEnd(int quest_id) {
		if (get_step(quest_id) == QUEST_END) {
			return true;
		}
		return false;
	}

}
