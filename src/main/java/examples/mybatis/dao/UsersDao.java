package examples.mybatis.dao;

import java.util.List;

import examples.mybatis.entity.Users;

public interface UsersDao {
	/**
	 * 根据用户id查找用户
	 * @param id 用户id
	 * @return   用户信息
	 * @throws Exception
	 */
	Users findUserById(int id) throws Exception;
	/**
	 * 根据用户名称查找满足的用户
	 * @param userName 用户名称
	 * @return   用户信息
	 * @throws Exception
	 */
	List<Users> findUsersByName(String userName) throws Exception;
	/**
	 * 添加用户
	 * @param user 要添加的用户信息
	 * @throws Exception
	 */
	void addUser(Users user) throws Exception;
	/**
	 * 根据用户id删除用户
	 * @param id 用户id
	 * @throws Exception
	 */
	void deleteUser(int id) throws Exception;
	/**
	 * 更新用户信息
	 * @param user 用户信息
	 * @throws Exception
	 */
	void updateUser(Users user) throws Exception;
}
