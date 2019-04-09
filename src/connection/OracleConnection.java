package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import domain.BankAccountException;

public class OracleConnection {
	private Connection con;
	
	public OracleConnection() throws BankAccountException {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch (ClassNotFoundException e) {
			throw new BankAccountException("Couldnt find database driver!");
		}
	}
	
	public void open() throws BankAccountException {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:ORCL", "DEMO", "oracle");
		}
		catch (SQLException e) {
			throw new BankAccountException("Couldnt open database connection!");
		}
	}
	
	public void close() throws BankAccountException {
		try {
			con.close();
		}
		catch (SQLException e) {
			throw new BankAccountException("Couldnt close database connection!");
		}
	}
	
	public Connection getConnection() {
		return con;
	}
	
}
