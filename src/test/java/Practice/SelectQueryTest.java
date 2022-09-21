//1
package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class SelectQueryTest 
{
	public static void main(String[] args) throws Throwable 
	{
		
		Driver driverRef=new Driver();
		
		//Register to the Database
		DriverManager.registerDriver(driverRef);
		
		//Connect to the Data Base
		Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/py", "root", "root");
		
		System.out.println("Connection Done");
		
		//Create the Statement
		Statement stat=conn.createStatement();
		try
		{
		String query="select * from sdet40;";
		//Execute the Query
		ResultSet res=	stat.executeQuery(query);
	
//		while(res.next())
//		{
//			System.out.print(res.getString(2)+" "+"\t");
//		System.out.println(res.getInt(1)+" "+"\t");
//		}
//		}catch(Exception e)
//		{
//			System.out.println("Check the SQL Query");
//		}
		
		while(res.next())
		{
			System.out.println(res.getString("emp_name"));
	
		}
		}catch(Exception e)
		{
			System.out.println("Check the SQL Query");
		}
	
	//Close the Connection
	finally
	{
	conn.close();
	}
		
	}
}
