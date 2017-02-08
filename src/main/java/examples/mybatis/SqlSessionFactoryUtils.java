package examples.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * @author fanguangjie
 *
 */
public class SqlSessionFactoryUtils {
	
	private static SqlSessionFactory sessionFactory;
	private static String configFile = "mybatis-config.xml";
	
	//私有化类的构造器
	private SqlSessionFactoryUtils() {
	}
	
	public static SqlSessionFactory getSqlSessionFactory() throws Exception{
		if(sessionFactory == null){
			synchronized(SqlSessionFactoryUtils.class){
				if(sessionFactory == null){
					InputStream is = Resources.getResourceAsStream(configFile);
					sessionFactory = new SqlSessionFactoryBuilder().build(is);
				}
			}
		}
		return sessionFactory;
	}
	
}
