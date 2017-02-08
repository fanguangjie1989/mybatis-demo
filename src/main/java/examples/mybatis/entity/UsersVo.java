package examples.mybatis.entity;

import java.util.List;
/**
 * 
 * @author fanguangjie
 * Users的包装类
 * 
 */
public class UsersVo {
	private Users user;
	private List<Integer> ids;

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}
