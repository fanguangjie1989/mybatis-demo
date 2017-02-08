package examples.mybatis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author fanguangjie
 * 传统JDBC
 */
public class JDBCNormal {
	
	public static void main(String[] args) {
		//数据库链接
		Connection conn = null;
		//预编译Statement
		PreparedStatement ps = null;
		//结果集
		ResultSet rs = null ;
		
		try {
			//1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//2.通过驱动管理类管理获取数据库链接
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatis?characterEncoding=utf-8", "root", "root");
			
			//3.定义SQL语句
			String sql = " select * from users where id = ? ";
			
			//4.获取预处理statement
			ps = conn.prepareStatement(sql);
			
			//5.设置参数（从1开始）
			ps.setInt(1, 1);
			
			//6.获取结果集
			rs = ps.executeQuery();
			
			//7.遍历结果集
			while(rs.next()){
				System.out.println("username: "+rs.getString("username")+" password : "+rs.getString("password"));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			//释放资源
			
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if(ps != null){
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
