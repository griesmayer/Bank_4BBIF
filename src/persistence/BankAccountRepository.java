package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import domain.BankAccount;
import domain.BankAccountException;

public class BankAccountRepository {
	private final static String SQL_SELECT_ALL =
			"SELECT ACCOUNTNUMBER,\n" + 
			"       FIRSTNAME,\n" + 
			"       OPENINGDATE,\n" + 
			"       AMOUNT,\n" + 
			"       CREDITLIMIT\n" + 
			"FROM   BANKACCOUNT";
	private PreparedStatement selectAllStatement;
	
	public List<BankAccount> selectAll (Connection con) throws BankAccountException {
		try {
			if (selectAllStatement == null) {
				selectAllStatement = con.prepareStatement(SQL_SELECT_ALL);
			}
			ResultSet resultSet = selectAllStatement.executeQuery();
			if (resultSet != null) {
				List<BankAccount> accounts = new ArrayList<>();
				while (resultSet.next()) {
					Long accountNumber = resultSet.getLong(1);
					String firstname = resultSet.getString(2);
					LocalDateTime openingDate = resultSet.getTimestamp(3).toLocalDateTime();
					Double amount = resultSet.getDouble(4);
					Double creditlimit = resultSet.getDouble(5);
					accounts.add(new BankAccount(accountNumber, openingDate, firstname, amount, creditlimit));
				}
				return accounts;
			}
			else {
				throw new BankAccountException("Could not read data from database!");
			}
		}
		catch (SQLException e) {
			throw new BankAccountException("Could not execute SQL statement!");
		}
	}
}
















