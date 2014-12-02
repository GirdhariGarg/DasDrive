package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;



public class GetLocalData {
	@Test
	public void getdata(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/dasdrive", "root", "girdhari12");
			Statement smst  = con.createStatement();
			ResultSet rs = smst.executeQuery("select * from customer");
			while(rs.next()){
				System.out.print(rs.getString(1));
				System.out.print("\t|"+rs.getString(2));
				System.out.print("\t|"+rs.getString(3));
				System.out.println("\t|"+rs.getString(4));
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
