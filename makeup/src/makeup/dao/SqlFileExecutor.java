package makeup.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class SqlFileExecutor {

	/**
	 * 读取 SQL 文件，获�?SQL 语句
	 * 
	 * @return List<sql> 返回�?�� SQL 语句�?List
	 * @throws Exception
	 */
	private List<String> loadSql() throws Exception {

		List<String> sqlList = new ArrayList<String>();

		try {
			InputStream sqlFileIn = getClass().getResourceAsStream(
					"/coupon.sql");
			StringBuffer sqlSb = new StringBuffer();
			byte[] buff = new byte[1024];
			int byteRead = 0;
			while ((byteRead = sqlFileIn.read(buff)) != -1) {
				sqlSb.append(new String(buff, 0, byteRead));
			}

			String[] sqlArr = sqlSb.toString()
					.split("(;\\s*\\r\\n)|(;\\s*\\n)");
			for (int i = 0; i < sqlArr.length; i++) {
				String sql = sqlArr[i].replaceAll("--.*", "").trim();
				if (!sql.equals("")) {
					sqlList.add(sql);
				}
			}
			return sqlList;
		} catch (Exception ex) {
			throw new Exception(ex.getMessage());
		}
	}

	/**
	 * 传入连接来执�?SQL 脚本文件，这样可与其外的数据库操作同处一个事物中
	 * 
	 * @param conn
	 *            传入数据库连�?
	 * @throws Exception
	 */
	public void execute() throws Exception {
		Connection conn = new SqlFileExecutor().getConnection();
		Statement stmt = null;
		List<String> sqlList = loadSql();
		stmt = conn.createStatement();
		System.out.println("Beginning Execute >>>");
		for (String sql : sqlList) {
			stmt.addBatch(sql);
		}
		int[] rows = stmt.executeBatch();
		for (int s : rows) {
			System.out.println("Execute Result:" + s);
		}
		System.out.println("Execute Finished !");

	}

	/**
	 * 
	 * @return
	 */
	public Connection getConnection() {
		Connection conn = null;
		DBConfig config = new DBConfig();
		try {
			Class.forName(config.getDriverClass());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
		try {
			conn = DriverManager.getConnection(config.getUrl(),
					config.getUsername(), config.getPassword());
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return conn;
	}

	public static void main(String[] args) throws Exception {
		List<String> sqlList = new SqlFileExecutor().loadSql();
		System.out.println("size:" + sqlList.size());
		for (String sql : sqlList) {
			System.out.println(sql);
		}
		new SqlFileExecutor().execute();
	}
}