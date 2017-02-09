package examples.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author fanguangjie 数据库表items映射实体类
 */
public class Items {
	private int itemCode;
	private String itemName;
	private Date createtime;
	private double price;

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Items [itemCode=" + itemCode + ", itemName=" + itemName + ", createtime=" + createtime + ", price="
				+ price + "]";
	}
	
}
