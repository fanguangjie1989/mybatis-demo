package examples.mybatis.entity;

/**
 * 
 * @author fanguangjie 数据库表ordersDetail映射实体类
 */
public class OrdersDetail {
	private int id;
	private int ordersId;
	private int itemsCode;
	private int itemsNum;
	private Items items;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}

	public int getItemsCode() {
		return itemsCode;
	}

	public void setItemsCode(int itemsCode) {
		this.itemsCode = itemsCode;
	}

	public int getItemsNum() {
		return itemsNum;
	}

	public void setItemsNum(int itemsNum) {
		this.itemsNum = itemsNum;
	}

	@Override
	public String toString() {
		return "OrdersDetail [id=" + id + ", ordersId=" + ordersId + ", itemsCode=" + itemsCode + ", itemsNum="
				+ itemsNum + ", items=" + items + "]";
	}

}
