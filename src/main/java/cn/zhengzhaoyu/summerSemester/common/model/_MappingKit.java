package cn.zhengzhaoyu.summerSemester.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("j_meal", "id", Meal.class);
		arp.addMapping("j_meal_order", "id", MealOrder.class);
		arp.addMapping("j_room", "id", Room.class);
		arp.addMapping("j_room_order", "id", RoomOrder.class);
		arp.addMapping("j_table", "id", Table.class);
		arp.addMapping("j_user", "id", User.class);
	}
}

