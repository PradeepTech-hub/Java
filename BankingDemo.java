package example;

class bankAccount {
	String name;
	String accounttype;
	double balance;
	
	//static variable to track the total number of accounts
	
	static int Totalaccounts;
	
	
    // i. Only name → default account type: Savings, balance: 0

	bankAccount(String name){
		this.name =name;
		this.accounttype = "Savings";
		this.balance = 0;
        Totalaccounts++; // update static counter
		
	}
	
    // ii. Name + initial deposit → default account type: Savings

	bankAccount(String name, double initialDeposit){
		this.name = name;
		this.accounttype = "savings";
		this.balance = initialDeposit;
		Totalaccounts++;
	}
    // iii. Name + initial deposit + account type

	bankAccount(String name, double initialDeposit , String Accountype){
		this.name = name;
		this.balance = initialDeposit;
		this.accounttype = "accountype";
		Totalaccounts++;
		
	}
	
    // 2. Method Overloading for deposit

	
    // i. Deposit by amount only

	void deposit(double amount) {
		balance += amount;
		System.out.println("deposited ₹ " +" " +amount +" "+"successfully");
		
	}
	
	void deposit(double amount , String transcationtype) {
		balance += amount;
		System.out.println("deposited"+" " +amount +" "+"successfully"+" " +"via"+" " +transcationtype );
		
		
	}

	
    // Display account details
    
		void displayaccount() {
			System.out.println("ACCOUNT DETAILS");
			System.out.println("name:" +" "+name);
			System.out.println("Account type:"+" " +accounttype);
			System.out.println("Balance:"+" "+balance);
		}
		
		static void displaytotalaccounts() {
			System.out.print("total account created" +Totalaccounts);
			
		}
		
		
}

public class BankingDemo{
	public static void main(String[] args) {
		bankAccount acc1 = new bankAccount("pradeep");
		bankAccount acc2 = new bankAccount("Ravi",5000);
		bankAccount acc3 = new bankAccount("darshan",5000,"Savings");
		
		acc1.deposit(2000);
		acc2.deposit(2500, "cash");
		acc3.deposit(5000, "cheque");
		
		
		acc1.displayaccount();
		acc2.displayaccount();
		acc3.displayaccount();
		
		bankAccount.displaytotalaccounts();
		
	}
}






























