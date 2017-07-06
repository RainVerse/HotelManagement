package cn.zhengzhaoyu.summerSemester.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseRoomOrder<M extends BaseRoomOrder<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public M setOrdername(java.lang.String ordername) {
		set("ordername", ordername);
		return (M)this;
	}

	public java.lang.String getOrdername() {
		return get("ordername");
	}

	public M setOrdernum(java.lang.Integer ordernum) {
		set("ordernum", ordernum);
		return (M)this;
	}

	public java.lang.Integer getOrdernum() {
		return get("ordernum");
	}

	public M setTel(java.lang.String tel) {
		set("tel", tel);
		return (M)this;
	}

	public java.lang.String getTel() {
		return get("tel");
	}

	public M setMealOrderId(java.lang.Integer mealOrderId) {
		set("meal_order_id", mealOrderId);
		return (M)this;
	}

	public java.lang.Integer getMealOrderId() {
		return get("meal_order_id");
	}

	public M setRoomId(java.lang.Integer roomId) {
		set("room_id", roomId);
		return (M)this;
	}

	public java.lang.Integer getRoomId() {
		return get("room_id");
	}

}
