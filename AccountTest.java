class Account {
	String name;
	protected double balance;
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {      //directly get it from right click source 
		return name;
	}

	public double getBalance() {   //directly get it from source getters
		return balance;
	}
	void deposite(double amt) {     
		balance+=amt;
		System.out.println("DEpositing:" + amt);
	}
	
	void withdraw(double amt) {                         //overriding
		balance-=amt;
		System.out.println("withdrawing:" + amt);
	}
}
	class SavingsAccount extends Account {
		double interestRate;
		SavingsAccount(String str , double amt, double rate) {
			super(str , amt);
			interestRate = rate;
			
			}
	}
		class CheckingAccount extends Account {
			double overDraft;
			CheckingAccount(String str , double amt){
				super(str, amt);
				
				
			}
			CheckingAccount(String str , double amt, double draft) {
				super(str , amt);
				overDraft = draft;
				
			}
			void withdraw(double amt ) {
				System.out.println("Overdraft Amount:" + overDraft);
				if(amt <= balance) {
					balance -= amt;
					System.out.println("wITHDRAWING :" + amt);
				
				
				} else if ((amt > balance) &&(amt > (balance + overDraft))) {
					System.out.println("sorry you cannot withdraw");
				}
				else {
					double result = amt - balance;
					overDraft -= result;
					balance=0;
				}
			} 
			
		}
	


	
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		SavingsAccount sAccountObj= new SavingsAccount("meghu",500,4);
		System.out.println("\nSavings  Account Details");
		System.out.println("______________________--");
		System.out.println(""+ sAccountObj.getName() + "has an initial Balance of: " + sAccountObj.getBalance());
		sAccountObj.deposite(200);
		sAccountObj.withdraw(200);
		System.out.println(""+ sAccountObj.getName() + "At the end of the transaction has a  Balance of: " + sAccountObj.getBalance());
		System.out.println("\n Checking Account Details;");
		System.out.println("______________________--");
		CheckingAccount cAccountObj = new CheckingAccount("jiji" , 200, 200);
		System.out.println("" + cAccountObj.getName() + "has a initial balance of " + cAccountObj.getBalance());
		cAccountObj.deposite(200);
		cAccountObj.withdraw(500);
		System.out.println(""+ cAccountObj.getName() + "at the end of transaction has a balance of:"+ cAccountObj.getBalance() );
		
	}

}
