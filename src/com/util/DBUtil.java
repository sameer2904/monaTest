
package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;

public class DBUtil
{
	
	
	Connection con = null;

	public static Connection getConnection()throws SQLException
	{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@172.26.132.40:1521:ORCLILP", "aja46core", "aja46core");
		
	}
	
		catch(Exception e)
		{
			e.printStackTrace();
		}

	return con;
}

	public static void closeConnection(Connection con)
	{
		
		if(con!=null){
			try{
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
			}

}

	public static void closePrepareStmt(PreparedStatement pst){
		// TODO Auto-generated method stub
		
	}

	public static void closeResult(ResultSet rs) {
		// TODO Auto-generated method stub
		
	}
}

