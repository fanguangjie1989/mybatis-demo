package examples.mybatis.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import examples.mybatis.SqlSessionFactoryUtils;
import examples.mybatis.entity.Users;
import examples.mybatis.entity.UsersVo;

public class MapperDriver {
	public static void main(String[] args) throws Exception {
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
}
