package Project_S;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdb", "root", "root");
			Statement st=con.createStatement();
			String sql="insert into student(roll, name, city, marks) "
					+ "values(12, 'Amit', 'Chennai', 458)";
			int result=st.executeUpdate(sql);
			con.close();
			System.out.println(result+" no of rows inserted");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
