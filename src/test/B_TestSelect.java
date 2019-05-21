package test;

import connection.OracleConnection;
import domain.Bank;
import domain.BankAccountException;
import service.BankAccountService;

public class B_TestSelect {

	public static void main(String[] args) {
		try {
			Bank bank = new Bank();
			OracleConnection oracon;
			oracon = new OracleConnection();
			BankAccountService bankAccountService = new BankAccountService(oracon.getConnection());
			bankAccountService.getBankAccounts(bank);
			System.out.println(bank);
			oracon.close();
		}
		catch (BankAccountException e) {
			System.out.println(e.getMessage());
		}		
	}

}
