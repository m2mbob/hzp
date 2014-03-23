package makeup.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import makeup.dao.DBManager;
import makeup.model.User;

public class UserService {

	public User getUser(String username) {
		DBManager conn = DBManager.getInstance();
		String sql = "select * from user where username = '" + username + "'";
		ResultSet rs = conn.excuteQuery(sql);
		User user = new User();
		try {
			if (rs.next()) {
				user.setUsername(rs.getString("username"));
				String s = rs.getString("password");
				if (s == null) {
					s = "";
				}
				user.setPassword(s);
			} else {
				user.setPassword("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn.releaseConnection();
		return user;
	}


}