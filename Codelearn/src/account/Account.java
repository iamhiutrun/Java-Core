package account;

public class Account {
	private int id;
	private String name;
	private int balance;
	public Account(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Account(int id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int amount)
	{
		this.balance += amount; 
	}
	
	public void withdraw(int amount)
	{
		if(balance >= amount)
		this.balance -= amount; 
		else 
			System.out.println("That amount exceeds your current balance.");
	}
	
	public void display()
	{
		System.out.println("Id: "+id+'\n'+"Name: "+name +'\n'+"Balance: "+balance);
	}
}
