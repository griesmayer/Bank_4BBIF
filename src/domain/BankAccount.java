package domain;

import java.time.LocalDateTime;

public class BankAccount {
	private Long	   		accountNumber;
	private LocalDateTime 	openingDate;
	private String    		firstname;
	private Double    		amount;
	private Double    		creditlimit;
	
	
	public BankAccount(Long accountNumber, LocalDateTime openingDate, String firstname, Double amount, Double creditlimit) {
		setAccountNumber( accountNumber );
		setOpeningDate(openingDate);
		setFirstname (firstname);
		setAmount(amount);
		setCreditlimit (creditlimit);
	}
	
	public BankAccount( String firstname, Double amount ) {
		this( null, null, firstname, amount, null);
	}
	
	public Long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber( Long accountNumber ) {
		this.accountNumber = accountNumber;
	}
	public LocalDateTime getOpeningDate() {
	
		return openingDate;
	}

	public void setOpeningDate(LocalDateTime openingDate) {
		this.openingDate = openingDate;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public Double getCreditlimit() {
		return creditlimit;
	}
	
	public void setCreditlimit(Double creditlimit) {
		this.creditlimit = creditlimit;
	}
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", openingDate=" + openingDate + ", firstname=" + firstname + ", amount=" + amount
				+ ", creditlimit=" + creditlimit + "]\n";
	}
}
