 package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import config.MysqlConfig;
@WebServlet(name="userController", urlPatterns = {"/user"})
public class UserController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<UserEntity>listUser=new ArrayList<UserEntity>();
		String query="SELECT u.id, u.fullname, u.username,r.name,r.description FROM users u\r\n"
				+ "JOIN roles r ON r.id=u.role_id";
		Connection connection=MysqlConfig.getConnection();
		try {
			PreparedStatement statement= connection.prepareStatement(query);
			ResultSet result=statement.executeQuery();
			//tạo mảng rỗng
			//Duyệt từng dòng dữ liệu truy vấn được, gán vào listUser
			while(result.next()) {
				UserEntity entity=new UserEntity();
				entity.setId(result.getInt("id"));
				entity.setFullName(result.getString("fullname"));
				entity.setUsername(result.getString("username"));
				RoleEntity role=new RoleEntity();
				role.setName(result.getString("name"));
				role.setDescription(result.getString("description"));
				entity.setRole(role);
				listUser.add(entity);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		req.setAttribute("listUser",listUser);
		req.getRequestDispatcher("user-table.jsp").forward(req, resp);	
	}
}
