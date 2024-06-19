package Project_S;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao {
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	public StudentDao() {
		// TODO Auto-generated constructor stub
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sbdb", "root", "root");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void retrieveData() {
		String sql= "select * from student";
		try {
			pst=con.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("roll")+ rs.getString("name")+rs.getString("city")+ rs.getFloat("marks"));
			}
			con.close();
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
	}
	public void retrieveData(int r) {
		String sql="select * from student where roll=?";
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, r);
			rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("roll")+ rs.getString("name")+rs.getString("city")+ rs.getFloat("marks"));
			}
			con.close();
		}
		catch(SQLException s) {
			s.printStackTrace();
		}
	}
	public void storeData() {}
	public void updateMarks() {}
	public void deleteData() {}
	}
