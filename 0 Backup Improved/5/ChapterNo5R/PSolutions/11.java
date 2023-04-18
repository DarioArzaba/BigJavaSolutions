/* 

11.- Write a program to simulate a bank transaction. There are two bank accounts: checking and savings. First, ask for the initial balances of the bank accounts; reject negative balances. Then ask for the transactions; options are deposit, withdrawal, and transfer. Then ask for the account; options are checking and savings. Reject transactions that overdraw an account. At the end, print the balances of both accounts.

*/

import java.util.Scanner;

class BankAccount{
	
	private double balance;
	private boolean initialBalanceSet = false;
	private String accountName;
	
	public BankAccount (double balance, String name){
		this.balance = balance;
		accountName = name;
	}
	
	public void setInitialBalance(){
		Scanner input = new Scanner(System.in);
		boolean initialBalancePositive = false;
		double newBalance = 0;
		System.out.print("Enter the " + accountName + " Balance : " );
		while (initialBalancePositive == false){
			newBalance = input.nextDouble();
			if (newBalance < 0){
				System.out.println("Error. Initial balance must be a positive number." );
				System.out.print("Enter the " + accountName + " Balance : " );
			} else {
				initialBalancePositive = true;
			}
		}
		if (this.initialBalanceSet == false) {
			this.balance = newBalance;
			this.initialBalanceSet = true;
		} else {
			System.out.print("Error. Initial balance was already set." );
		}
	}
	
	public void deposit (double money){
		this.balance += money;
	}
	
	public void withdrawal (double money){
		double newBalance = (this.balance - money);
		if (newBalance < 0){
			System.out.println("Error. Withdrawal will overdraw the account." );
		} else {
			this.balance = newBalance;
		}
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void transfer(double money, BankAccount account){
		double oldBalance = account.getBalance();
		account.withdrawal(money);
		if (oldBalance != account.getBalance() ){
			this.deposit(money);
		}
		
	}
	
}

class TransactionMenu {
	
	private boolean endMenu = false;
	private Scanner input = new Scanner(System.in);
	
	public int askAccount(){
		
		System.out.println("\nAvailable Bank Accounts: " );
		System.out.println("1.- Checkings " );
		System.out.println("2.- Savings " );
		System.out.print("Account Number : " );
		int choice = input.nextInt();
		if (choice == 1 || choice == 2){
			return choice;
			
		} else {
			System.out.println("Error. Invalid Bank Account. " );
			return 0;
		}
		
	}
	
	public int askTransaction() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nAvailable Transactions: " );
		System.out.println("1.- Deposit " );
		System.out.println("2.- Withdrawal " );
		System.out.println("3.- Transfer from other account " );
		System.out.println("4.- End " );
		System.out.print("Transaction Number : " );
		int choice = input.nextInt();
		if (choice >= 1 && choice <= 4){
			return choice;
		} else {
			System.out.println("Error. Invalid Transaction. " );
			return 0;
		}
		
	}
	
	public boolean getEndMenu(){
		return endMenu;
	}
	
	public void setEndMenu(boolean b){
		this.endMenu = b;
	}
	
	public void showFinalBalances(BankAccount checkingsBalance, BankAccount savingsBalance){
		System.out.printf("\nCheckings Balance: %.3f\n", checkingsBalance.getBalance() );
		System.out.printf("Savings Balance: %.3f",savingsBalance.getBalance() );
	}
	
}

public class BankTransactionSimulator {
	
	public static void main(String[] args){
		
		//Create Bank Accounts
		Scanner input = new Scanner(System.in);
		BankAccount checkings = new BankAccount(0, "Checkings");
		checkings.setInitialBalance();
		BankAccount savings = new BankAccount(0, "Savings");
		savings.setInitialBalance();
		
		//Show and apply selected transaction to selected account
		TransactionMenu menu = new TransactionMenu();
		while(!menu.getEndMenu()){
			int transaction = menu.askTransaction();
			int bankAccount = 0;
			if (transaction != 4){
				bankAccount = menu.askAccount();
			}
			if (transaction == 4){
				menu.setEndMenu(true);
			} else if (transaction == 1){
				System.out.print("\nAmount of money to Deposit :  " );
				double money = input.nextDouble();
				if (bankAccount == 1){
					checkings.deposit( money );
				} else {
					savings.deposit( money );
				}
			} else if (transaction == 2){
				System.out.print("\nAmount of money to Withdrawal :  " );
				double money = input.nextDouble();
				if (bankAccount == 1){
					checkings.withdrawal( money );
				} else {
					savings.withdrawal( money );
				}
			} else if (transaction == 3) {
				System.out.print("\nAmount of money to Transfer :  " );
				double money = input.nextDouble();
				if (bankAccount == 1){
					checkings.transfer( money, savings );
				} else {
					savings.transfer( money, checkings );
				}
			}
			
		}
		
		//After the exit option is selected show the final balances of both accounts.
		
		menu.showFinalBalances(checkings, savings);
		
		input.close();
		
		System.exit(0);
		
	}
	
}