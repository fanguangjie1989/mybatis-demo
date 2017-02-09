package examples.mybatis.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import examples.mybatis.SqlSessionFactoryUtils;
import examples.mybatis.entity.Orders;
import examples.mybatis.entity.OrdersCustom;
import examples.mybatis.entity.Users;
import examples.mybatis.entity.UsersVo;

public class MapperDriver {
	
	public static void userMapperTest() throws Exception{
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
		
		UsersVo userVo = new UsersVo();
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(1);ids.add(2);ids.add(3);
		userVo.setIds(ids);
		Users user = new Users();
		user.setUsername("fan");
		//user.setPassword("fan");
		userVo.setUser(user);
		List<Users> users= usersMapper.findByUsersVo(userVo);
		for (Users userstmp : users) {
			System.out.println(userstmp);
		}
		System.out.println(usersMapper.findUserCountsByUsersVo(userVo));
	}
	
	public static void ordersCustomMapperTest() throws Exception{
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		OrdersCustomMapper ordersCustomMapper = sqlSession.getMapper(OrdersCustomMapper.class);
		List<OrdersCustom> ordersCustoms = ordersCustomMapper.findOrdersUsers();
		for (OrdersCustom ordersCustom : ordersCustoms) {
			System.out.println(ordersCustom);
		}
		
		List<Orders> orders = ordersCustomMapper.findOrdersUsersResultMap();
		for (Orders orderstmp : orders) {
			System.out.println(orderstmp);
		}
		
		orders = ordersCustomMapper.findOrdersUsersOrderDetailResultMap();
		for (Orders orderstmp : orders) {
			System.out.println(orderstmp);
		}
		
		orders = ordersCustomMapper.findOrdersUsersOrderDetailItemsResultMap();
		for (Orders orderstmp : orders) {
			System.out.println(orderstmp);
		}
	}
	
	public static void main(String[] args) throws Exception {
		MapperDriver.ordersCustomMapperTest();
	}
}
