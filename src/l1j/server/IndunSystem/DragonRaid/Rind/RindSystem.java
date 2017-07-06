package l1j.server.IndunSystem.DragonRaid.Rind;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import l1j.server.server.model.Instance.L1PcInstance;
import l1j.server.server.model.map.L1WorldMap;
import l1j.server.server.serverpackets.S_ChatPacket;
import l1j.server.server.utils.L1SpawnUtil;

public class RindSystem {
	
	//private static Logger _log = Logger.getLogger(HadinSystem.class.getName());

	private static RindSystem _instance;
	private final ArrayList<Integer> _map = new ArrayList<Integer>();
	private final Map<Integer, RindRaid> _list = new ConcurrentHashMap<Integer, RindRaid>();

	public static RindSystem getInstance() {
		if (_instance == null) {
			_instance = new RindSystem();
		}
		return _instance;
	}

	public RindSystem(){
		_map.add(1017);
	}

	public void startRind(L1PcInstance pc){
		if(countRind() >= 6){
			pc.sendPackets(new S_ChatPacket(pc,"인스턴스 던전을 더 이상 생성할수 없습니다."));
			return;
		}
		int id = blankMapId();
		if(id != 1017)
			L1WorldMap.getInstance().cloneMap(1017, id);
		RindRaid rind = new RindRaid(id);
		System.out.println("■■■■■■■■■■ 린드비올 레이드 시작 ■■■■■■■■■■ MAP - " + _map);
		L1SpawnUtil.spawn2(pc.getX(), pc.getY(), pc.getMapId(), 900219, 0, 7200 * 1000, id); // 포탈
		L1SpawnUtil.spawn2(32717, 32911, (short) id, 5101, 0, 7200 * 1000, id); // 직계형 입구
		L1SpawnUtil.spawn2(32748, 32869, (short) id, 5102, 0, 7200 * 1000, id); // 레어 입구
		L1SpawnUtil.spawn2(32718, 32913, (short) id, 5103, 0, 7200 * 1000, id); // 폭포 구조물
		L1SpawnUtil.spawn2(32736, 32864, (short) id, 5104, 0, 7200 * 1000, id); // 시빌레
		L1SpawnUtil.spawn2(32734, 32878, (short) id, 5105, 0, 7200 * 1000, id); // 프레디
		L1SpawnUtil.spawn2(32734, 32860, (short) id, 60169, 0, 7200 * 1000, id); // 군터
		_list.put(id, rind);
	}

	public int blankMapId(){
		if(_list.size() == 0)
			return 1017;
		for(int i = 1017 ; i <= 1022; i++){
			RindRaid h = _list.get(i);
			if(h == null)
				return i;
		}  
		return 1022;
	}

	public RindRaid getRind(int id){
		return _list.get(id);
	}

	public void removeRind(int id){
		_list.remove(id);
	}

	public int countRind(){
		return _list.size();
	}

}
