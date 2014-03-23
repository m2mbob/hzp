package makeup.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import makeup.vo.PageModel;


public class DBManager{
	ConnectionPool cm;
	Connection conn;
	Statement stmt;
	ResultSet rs;
	int rst;

	public DBManager() {
		try {
			cm = ConnectionPool.getInstance();
			conn = cm.getConnection();
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void excuteSql(String sql) throws SQLException {
		stmt.execute(sql);
	}

	public static DBManager getInstance() {
		return new DBManager();
	}

	public void releaseConnection() {
			try {
				this.stmt.close();
				this.conn.close();				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public ResultSet excuteQuery(String sql) {
		try {
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public ResultSet excuteQuery(String sql, PageModel page) {
		if(page != null){
			sql += " LIMIT " + ((page.getPage()-1)*page.getMaxRecord()) + "," + page.getMaxRecord();
			System.out.println(sql);
		}
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	


	public int excuteUpdate(String sql) {
		try {
		
			rst = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rst;
	}

	public int getCount(String table) {
		if (table != null) {
			String sql = "select count(id) from " + table;
			try {
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					return rs.getInt(1);
				} else {
					return 0;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
		} else {
			return 0;
		}

	}

	public int getCount(String table, String where) {
		if (table != null) {
			String sql = "select count(id) from " + table;
			if(where != null){
				sql += " " + where;
			}
			try {
				rs = stmt.executeQuery(sql);
				if (rs.next()) {
					return rs.getInt(1);
				} else {
					return 0;
				}
			} catch (SQLException e) {
				e.printStackTrace();
				return 0;
			}
		} else {
			return 0;
		}
	}
	public void generalPage(PageModel page, String table){
		page.setTotalRecords(this.getCount(table));
		if(page.getTotalRecords() % page.getMaxRecord() == 0){
			page.setTotalPages((int) (page.getTotalRecords()/page.getMaxRecord()));
		}else{
			page.setTotalPages((int) (page.getTotalRecords() / page.getMaxRecord()) + 1);
		}
	}
	
	public void generalPage(PageModel page, String table,String where){
		page.setTotalRecords(this.getCount(table,where));
		if(page.getTotalRecords() % page.getMaxRecord() == 0){
			page.setTotalPages((int) (page.getTotalRecords()/page.getMaxRecord()));
		}else{
			page.setTotalPages((int) (page.getTotalRecords() / page.getMaxRecord()) + 1);
		}
	}
	
	
	
	
	
	
	
}
