package domain;

public class BankAccountException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public BankAccountException( String message ) {
		super( message );
	}
}
