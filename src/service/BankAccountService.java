package service;

import java.sql.Connection;

import domain.Bank;
import domain.BankAccountException;
import persistence.BankAccountRepository;

public class BankAccountService {
	private Connection con;
	private BankAccountRepository bankAccountRepository;
	
	public BankAccountService(Connection con) {
		this.con = con;
		this.bankAccountRepository = new BankAccountRepository();
	}
	
	public void getBankAccounts(Bank bank) throws BankAccountException {
		bank.clear();
		bank.addAll(bankAccountRepository.selectAll(con));
	}
}
