package org.sdet40.genericUtilty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility 
{
Connection connection;

public List<String>  getDataFromDataBase(String query, String ColumName) throws SQLException
{
	Statement statement=connection.createStatement();
	
	ResultSet result=statement.executeQuery(query);
	
	List<String> list=new ArrayList();
	
	while(result.next())
	{
		list.add(result.getString(ColumName));
	}
	return list;
}

public void openDBconnection(String dbURL, String dbUserName, String dbPassword) throws SQLException
{
	Driver dbdriver=new Driver();
	DriverManager.registerDriver(dbdriver);
	connection=DriverManager.getConnection(dbURL, dbUserName, dbPassword);
}


public void ClosDB() throws SQLException
{
	connection.close();
}
}
