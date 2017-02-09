package examples.mybatis.entity;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author fanguangjie 数据库表orders映射实体类
 */
public class Orders {
	private int id;
	private int usersId;
	private Date createtime;
	private Users user;
	private List<OrdersDetail> orderdetails;

	public List<OrdersDetail> getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(List<OrdersDetail> orderdetails) {
		this.orderdetails = orderdetails;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", usersId=" + usersId + ", createtime=" + createtime + ", user=" + user
				+ ", orderdetails=" + orderdetails + "]";
	}
	
}
