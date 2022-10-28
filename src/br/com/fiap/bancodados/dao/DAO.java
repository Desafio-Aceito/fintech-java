package br.com.fiap.bancodados.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
	private static final String database_user = "RM95537";
	private static final String database_pass = "fiap";
	private static final String database_url =  "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	
	
	public static Connection makeConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		Connection conn = null;
		try {
			
			conn = DriverManager.getConnection(database_url, database_user, database_pass);
		} catch (SQLException e) {
			System.out.println("Connection failed");
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
}
