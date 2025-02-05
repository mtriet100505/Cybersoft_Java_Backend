package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3307/crm_app"; //database
		String user = "root";
		String password = "admin123";
		Connection connection=null;
		// Cố gắng kết nối
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //điều khiển cơ sở dữ liệu
			connection = DriverManager.getConnection(url, user, password); //mở kết nối csdl
			/* jdbc: mysql:// địa chỉ nằm ở đâu */
			if (connection != null) {
				System.out.println("Kết nối cơ sở dữ liệu thành công!");
			}
		} catch (SQLException e) {
			System.out.println("Kết nối thất bại!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
}
