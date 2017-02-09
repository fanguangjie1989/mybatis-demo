package examples.mybatis.entity;

import java.util.Date;

/**
 * 
 * @author fanguangjie
 *
 */
public class OrdersCustom {
	private int id;
	private int usersId;
	private Date createtime;
	private String username;
	private String password;

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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "OrdersCustom [id=" + id + ", usersId=" + usersId + ", createtime=" + createtime + ", username=" + username
				+ ", password=" + password + "]";
	}

}
