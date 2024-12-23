package jdbc_task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Manoj4546@");
		System.out.println("connection created");
		
		
		PreparedStatement ps=con.prepareStatement("insert into insert_data values(105,'Shameer',25,90000) ");
		int i=ps.executeUpdate();
		
		if(i>0)
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("failed");
		}
	}

}
