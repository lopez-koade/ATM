package ATMPackage;
import java.util.Scanner;

public class Account {
    private String userName;
    private int accountNumber;
    private int pin;
    private double poundsBalance = 0.00;
    private double eurosBalance = 0.00;
    private double dollarsBalance = 0.00;
    boolean exitMenu;

    
    public Account(String userName, int accountNumber, int pin, double poundsBalance, 
            double eurosBalance, double dollarsBalance){
        this.userName = userName;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.poundsBalance = poundsBalance;
        this.eurosBalance = eurosBalance;
        this.dollarsBalance = dollarsBalance;
        } 
    
    
    // MENU
    
   public void menu(Scanner scanner){
       exitMenu = false;
       while(!exitMenu){
            System.out.println("===========");
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1. Account Balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Exchange currency");
            System.out.println("5. Last movements statement");
            System.out.println("6. Change pin");
            System.out.println("9. Exit");  
   
            
            int menuChoice = ATM.getIntInput(scanner);
            switch(menuChoice){
              case 1:
                  checkBalance(scanner);
                  break;
              case 2:
                  makeDeposit(scanner);
                  break;
              case 3:
                  makeWithdrawal(scanner);
                  break;
              case 4:
                  exchangeCurrency(scanner);
                  break;
              case 5:
                  lastMovements(scanner);
                  break;
              case 6:
                  changePin(scanner);
                  break;
              case 9:
                  exitMenu = true;
                  break; 
              default:
                  System.out.println("");
            	  System.out.println("Invalid option, please try again");
            	  menu(scanner);
              }
        }
   }
       
   public void printMenuOptions() {
	   System.out.println("===========");
       System.out.println("MENU");
       System.out.println("");
       System.out.println("1. Account Balance");
       System.out.println("2. Make a deposit");
       System.out.println("3. Make a withdrawal");
       System.out.println("4. Exchange currency");
       System.out.println("5. Last movements statement");
       System.out.println("6. Change pin");
       System.out.println("9. Exit");
   }
   
  
	
   
   
   // Method CheckBalance
   
   
   public void checkBalance(Scanner scanner){
	   
	   System.out.println("==========");
   	   System.out.println("");
       System.out.println("1. Press to check Pound Sterling account balance");
       System.out.println("2. Press to check Euro account balance");
       System.out.println("3. Press to check Dollar account balance");
   	   System.out.println("4. Press to check all your accounts balance");
       System.out.println("8. Press to go back to the menu");
       System.out.println("9. Exit");
       
       int checkBalanceChoice = scanner.nextInt();
       switch (checkBalanceChoice){
           case 1:
        	 System.out.println("==========");
         	 System.out.println("");
             System.out.println("Your Pound Sterling account balance is £" + this.poundsBalance);
         	 System.out.println("");
             System.out.println("8. Press to check another account");
             System.out.println("9. Press to go back to the menu");
             int case1CheckBalanceChoice = ATM.getIntInput(scanner);
             if(case1CheckBalanceChoice == 8) {
            	 menu(scanner);
             } else if (case1CheckBalanceChoice == 9) {
            	 checkBalance(scanner);
             }
             break;
           case 2:
        	   System.out.println("==========");
           	 System.out.println("");
             System.out.println("Your Euro account balance is " + this.eurosBalance + "€");
         	 System.out.println("");
             System.out.println("8. Press to check another account");
             System.out.println("9. Press to go back to the menu");
             int case2CheckBalanceChoice = ATM.getIntInput(scanner);
             if(case2CheckBalanceChoice == 8) {
            	 menu(scanner);
             } else if (case2CheckBalanceChoice == 9) {
            	 checkBalance(scanner);
             }
             break;
           case 3:
        	   System.out.println("==========");
           	 System.out.println("");
             System.out.println("Your Dollar account balance is $" + this.dollarsBalance);
         	 System.out.println("");
             System.out.println("8. Press to check another account");
             System.out.println("9. Press to go back to the menu");
             int case3CheckBalanceChoice = ATM.getIntInput(scanner);
             if(case3CheckBalanceChoice == 8) {
            	 menu(scanner);
             } else if (case3CheckBalanceChoice == 9) {
            	 checkBalance(scanner);
             }
             break;
           case 4:
        	  System.out.println("==========");
           	 System.out.println("");
             System.out.println("Your Pound Sterling account balance is £" + this.poundsBalance);
             System.out.println("Your Euro account balance is " + this.eurosBalance + "€");
             System.out.println("Your Dollar account balance is $" + this.dollarsBalance);
         	 System.out.println("");
             System.out.println("8. Press to go back to the menu");
             System.out.println("9. Exit");
             int case4CheckBalanceChoice = ATM.getIntInput(scanner);
             if(case4CheckBalanceChoice == 9) {
            	 checkBalance(scanner);
             }
             break;
           case 8:
        	   return;
               
           case 9:
           	 System.out.println("");
           	 System.out.println("==========");
             System.out.println("We hope to see you back soon.");
             System.out.println("Good bye!.");
             System.exit(0);
           default:
        	System.out.println("Invalid option, please try again");
           	System.out.println("");
           	checkBalance(scanner);

       }
       
   }
   
   
   //Method makeDeposit
   
   
   public void makeDeposit(Scanner scanner){
	   
       
   }
   
   
   public void makeWithdrawal(Scanner scanner){
       
   }
   
   
   public void exchangeCurrency(Scanner scanner){
       
   }
   
   public void lastMovements(Scanner scanner){
       
   }
   
   public void changePin(Scanner scanner){
       
   }
   
   
   //GETTERS AND SETTERS
   
    public String getUserName(){
         return userName;
    }
    
    public int getAccountNumber(){
        return accountNumber;
    }
    
    public int getPin(){
        return pin;
    }
    
    public void setUserName(String newUser){
        this.userName = newUser;
    }
    
    public void setAccountNumber (int newAccount){
        this.accountNumber = newAccount;
    }
    
    public void setPin (int newPin){
        this.pin = newPin;
    }
}