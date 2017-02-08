package examples.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import examples.mybatis.SqlSessionFactoryUtils;
import examples.mybatis.dao.UsersDao;
import examples.mybatis.entity.Users;

public class UsersDaoImpl implements UsersDao {

	@Override
	public Users findUserById(int id) throws Exception {
		SqlSession session = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		/* selectOne 查询出一条记录进行映射 如果结果存在多条不能使用该函数TooManyResultException */
		Users user = session.selectOne("users.findUserById", id);
		// 释放资源
		session.close();
		return user;
	}

	@Override
	public List<Users> findUsersByName(String userName) throws Exception {
		SqlSession session = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		/* selectList 查询出多条记录进行映射 */
		List<Users> users = session.selectList("users.findUsersByName", userName);
		session.close();
		return users;
	}

	@Override
	public void addUser(Users user) throws Exception {
		SqlSession session = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		session.insert("users.addUser", user);
		session.commit();
		session.close();
	}

	@Override
	public void deleteUser(int id) throws Exception {
		SqlSession session = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		session.insert("users.deleteUser", id);
		session.commit();
		session.close();
	}

	@Override
	public void updateUser(Users user) throws Exception {
		SqlSession session = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		session.update("users.updateUser", user);
		session.commit();
		session.close();
	}

	public static void main(String[] args) throws Exception {
		UsersDaoImpl userDao = new UsersDaoImpl();
		Users user =  userDao.findUserById(3);
		user.setUsername("rain");
		userDao.updateUser(user);
	}

}
