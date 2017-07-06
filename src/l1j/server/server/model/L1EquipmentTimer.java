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
package l1j.server.server.model;

import l1j.server.server.GeneralThreadPool;
import l1j.server.server.model.Instance.L1ItemInstance;
import l1j.server.server.model.Instance.L1PcInstance;

public class L1EquipmentTimer implements Runnable {
	private long _scheduleTime;
	private boolean _active;
	
	public L1EquipmentTimer(L1PcInstance pc, L1ItemInstance item, long scheduleTime ) {
		_pc = pc;
		_item = item;
		_scheduleTime = scheduleTime;
		_active = true;
	}

	@Override
	public void run() {
		if( !_active )
		{
			return;
		}

		if ((_item.getRemainingTime() - 1) > 0) {
			_item.setRemainingTime(_item.getRemainingTime() - 1);
			_pc.getInventory().updateItem(_item, L1PcInventory.COL_REMAINING_TIME); //시간아이템 실시간보기
			GeneralThreadPool.getInstance().schedule(this, _scheduleTime);
		} else {
			_pc.getInventory().removeItem(_item, 1);
		}
	}
	
	public void cancel()
	{
		_active = false;
	}

	private final L1PcInstance _pc;
	private final L1ItemInstance _item;
}
