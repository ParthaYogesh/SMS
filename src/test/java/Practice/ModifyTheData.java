//2
package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ModifyTheData 
{
	public static void main(String[] args) throws Throwable 
	{
		
		Driver driverRef=new Driver();
		
		//Register to the Database
		DriverManager.registerDriver(driverRef);
		
		//Connect to the Data Base
		Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/py", "root", "root");
		
		System.out.println("Connection Done");
		
		try
		{
			//Create the Statement
			Statement stat=conn.createStatement();
	
		//Execute the Query
			
			int res=stat.executeUpdate("insert into sdet40(epm_id, emp_name, phone_no, address) values (10, 'PA', 12345, 'INDI')");
		//Verify /Iterate / Fetch the Data
			System.out.println(res+" Data Updated Successfully");
		}finally
		{
			//Close the Data Base Connection
			conn.close(); // Mandatory
			System.out.println("Connction Closed Successfully");
		}
		
		
	
	
	}

}
