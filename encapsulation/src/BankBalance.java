class BankAccount
{
	private double balance;
	public double getBalance()
	{
		return balance;
	}

	public void deposit(double amount)
	{
          this.balance += amount;
	}
	public void withdraw(double amount)
	{
          this.balance -= amount;
	}

	public static void main(String[] args) 
	{
		BankAccount account = new BankAccount ();
		account.deposit(10000);
		System.out.println("Balance: " + account.getBalance());
		account.withdraw(1000);
		System.out.println("Balance: " + account.getBalance() );
		
	}
}

