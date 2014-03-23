package makeup.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import makeup.dao.DBManager;
import makeup.model.Intro;

public class IntroService {
	/*public List<Intro> queryall() {
		DBManager conn = DBManager.getInstance();
		String sql = "select * from intro";
		ResultSet rs = conn.excuteQuery(sql);
		List<Intro> list = new ArrayList<Intro> ();
		try{
			while(rs.next()){
				Intro intro = new Intro();
				intro.setClazz(rs.getString("clazz"));
				intro.setContent(rs.getString("content"));
				intro.setSavepath(rs.getString("savepath"));
				intro.setSavepath(rs.getString("savepath1"));
				intro.setSavepath(rs.getString("videopath"));
				list.add(intro);
			}
			
		}catch (SQLException e){
			e.printStackTrace();
		}
		conn.releaseConnection();
		
		return list;
		
	}
	 */
	
	public Intro getIntro(int id) {
		DBManager conn = DBManager.getInstance();
		String sql = "select * from intro where id = 1";
		ResultSet rs = conn.excuteQuery(sql);
		Intro intro = new Intro();
		try{
			while(rs.next()){
				intro.setId(rs.getInt("id"));
				intro.setContent(rs.getString("content"));
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		conn.releaseConnection();
		return intro;
	}
	
	public void setIntro(Intro intro) {
		String sql;
		DBManager conn = DBManager.getInstance();
		if (intro.getId() != 0) {
			sql = " update intro set content =' " + intro.getContent() 
					+ "'where id = 1 ";
		} else {
			sql = "insert into intro (content,culture,savepath,savepath1,videopath) values( '" 
					+ intro.getContent()
					+ "')";

		}
		conn.excuteUpdate(sql);
		conn.releaseConnection();
	}
	
	
	
	
	
	
	
}
