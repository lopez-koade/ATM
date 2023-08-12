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
    
    //////////
    // MENU
    //////////
    
   public void menu(Scanner scanner){
       exitMenu = false;
       while(!exitMenu){
    	   System.out.println("===========");
           System.out.println("MENU");
           System.out.println("");
           System.out.println("1. Account Balance.");
           System.out.println("2. Make a deposit.");
           System.out.println("3. Make a withdrawal.");
           System.out.println("4. Exchange currency.");
           System.out.println("5. Last movements statement.");
           System.out.println("6. Change pin.");
           System.out.println("9. Exit the program.");  
   
            
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
                  exitTheProgram();
                  break; 
              default:
                  System.out.println("");
            	  System.out.println("Invalid option, please try again.");
            	  menu(scanner);
              }
        }
   }
       
   public void printMenuOptions() {
	   System.out.println("===========");
       System.out.println("MENU");
       System.out.println("");
       System.out.println("1. Account Balance.");
       System.out.println("2. Make a deposit.");
       System.out.println("3. Make a withdrawal.");
       System.out.println("4. Exchange currency.");
       System.out.println("5. Last movements statement.");
       System.out.println("6. Change pin.");
       System.out.println("9. Exit the program.");
   }
   
///////////
   // Method CheckBalance
///////////
   
   private void checkBalance(Scanner scanner){
	   
	   System.out.println("==========");
   	   System.out.println("");
       System.out.println("1. Press to check Pound Sterling account balance.");
       System.out.println("2. Press to check Euro account balance.");
       System.out.println("3. Press to check Dollar account balance.");
   	   System.out.println("4. Press to check all your accounts balance.");
   	   System.out.println("");
       System.out.println("8. Press to go back to the menu.");
       System.out.println("9. Exit the program.");
       
       int checkBalanceChoice = ATM.getIntInput(scanner);
    	  switch (checkBalanceChoice){
       		case 1:
       			boolean exit = false;
       			while(!exit) {
		        	 System.out.println("==========");
		         	 System.out.println("");
		             System.out.println("Your Pound Sterling account balance is "+ this.poundsBalance + " pounds.");
		         	 System.out.println("");
		             System.out.println("7. Press to check another account.");
		             System.out.println("8. Press to go back to the menu.");
		             System.out.println("9. Exit the program.");
		             int case1CheckBalanceChoice = ATM.getIntInput(scanner);
		             if(case1CheckBalanceChoice == 7){
		             	checkBalance(scanner);
		             } else if (case1CheckBalanceChoice == 8){
		            	 menu(scanner);
		            	 exit = true;
		             } else if(case1CheckBalanceChoice == 9) {
		            	 exitTheProgram();
		             } else {
		            	 System.out.println("");
		            	 System.out.println("Invalid option, please try again.");
		             }
		         }
       			break;
           case 2:
        	   boolean exit2 = false;
      			while(!exit2) {
		        	 System.out.println("==========");
		         	 System.out.println("");
		             System.out.println("Your euro account balance is " + this.eurosBalance + " euros.");
		         	 System.out.println("");
		             System.out.println("7. Press to check another account.");
		             System.out.println("8. Press to go back to the menu.");
		             System.out.println("9. Exit the program.");
		             int case2CheckBalanceChoice = ATM.getIntInput(scanner);
		             if(case2CheckBalanceChoice == 7){
		             	checkBalance(scanner);
		             } else if (case2CheckBalanceChoice == 8){
		            	 menu(scanner);
		            	 exit2 = true;
		             } else if(case2CheckBalanceChoice == 9) {
		            	 exitTheProgram();
		             } else {
		            	 System.out.println("");
		            	 System.out.println("Invalid option, please try again.");
		             }
		         }
      			break;
           case 3:
        	   boolean exit3 = false;
     			while(!exit3) {
		        	 System.out.println("==========");
		         	 System.out.println("");
		             System.out.println("Your dollar account balance is " + this.dollarsBalance + " dollars.");
		         	 System.out.println("");
		             System.out.println("7. Press to check another account.");
		             System.out.println("8. Press to go back to the menu.");
		             System.out.println("9. Exit the program.");
		             int case3CheckBalanceChoice = ATM.getIntInput(scanner);
		             if(case3CheckBalanceChoice == 7){
		             	checkBalance(scanner);
		             } else if (case3CheckBalanceChoice == 8){
		            	 menu(scanner);
		            	 exit3 = true;
		             } else if(case3CheckBalanceChoice == 9) {
		            	 exitTheProgram();
		             } else {
		            	 System.out.println("");
		            	 System.out.println("Invalid option, please try again.");
		             }
		         }
     			break;
           case 4:
        	   boolean exit4 = false;
    			while(!exit4) {
		        	   System.out.println("==========");
		           	 System.out.println("");
		           	 System.out.println("Your Pound Sterling account balance is "+ this.poundsBalance + " pounds.");
		             System.out.println("Your euro account balance is " + this.eurosBalance + " euros.");
		             System.out.println("Your dollar account balance is " + this.dollarsBalance + " dollars.");
		         	 System.out.println("");
		             System.out.println("8. Press to go back to the menu");
		             System.out.println("9. Exit the program.");
		             int case4CheckBalanceChoice = ATM.getIntInput(scanner);
		             if(case4CheckBalanceChoice == 8){
		            	 menu(scanner);
		            	 exit4 = true;
		             } else if(case4CheckBalanceChoice == 9) {
		            	 exitTheProgram();
		             } else {
		            	 System.out.println("");
		            	 System.out.println("Invalid option, please try again.");
		             }
		         }
     			break;
           case 8:
        	   menu(scanner);
               
           case 9:
           	 exitTheProgram();
           default:
        	System.out.println("Invalid option, please try again");
           	System.out.println("");
           	checkBalance(scanner);
       }
       
   }
   
///////////  
   //Method makeDeposit
///////////
   
   
   private void makeDeposit(Scanner scanner){
	   double amountToDeposit = 0;
	   int confirmAmountToDeposit;
	   System.out.println("==========");
	   System.out.println("");
	   System.out.println("Please select account:");
	   System.out.println("1. Pound Sterling account.");
       System.out.println("2. Euro account.");
       System.out.println("3. Dollar account.");
       System.out.println("");
       System.out.println("8. Go back to menu.");
 	   System.out.println("9. Exit the program.");
	   
       int makeDepositInput = ATM.getIntInput(scanner);
       
       switch(makeDepositInput) {
       	case 1:
     	   System.out.println("==========");
     	  System.out.println("");
     	   System.out.println("Please select the amount in pounds to be deposited:");
     	   
     	   amountToDeposit = ATM.getIntInput(scanner);
     	   
     	   boolean exitPoundDeposit = false;
     	   while(!exitPoundDeposit) {
     		   System.out.println("");
	     	   System.out.println("1. Press to confirm that you want to deposit " + amountToDeposit + " pounds.");
	    	   System.out.println("");
	     	   System.out.println("8. Go back to menu.");
	     	   System.out.println("9. Exit the program.");
	
	     	   confirmAmountToDeposit = ATM.getIntInput(scanner);
	     	   switch(confirmAmountToDeposit) {
	     	   		case 1:
	     	   			this.poundsBalance += amountToDeposit;
	     	   			boolean exitConfirmDeposit = false;
	     	   			while (!exitConfirmDeposit) {
	     	   				System.out.println("==========");
	     	   				System.out.println("");
		     	   			System.out.println("Your new Pound Sterling account balance is " + this.poundsBalance + " pounds.");
		     	   			System.out.println("");
		     	   			System.out.println("8. Press to go back to the menu.");
		     	   			System.out.println("9. Exit the program.");
		     	   			int loopSterlingDeposit = ATM.getIntInput(scanner);
		     	   			if(loopSterlingDeposit == 8){
			            	 
		     	   			exitConfirmDeposit = true;
		     	   			exitPoundDeposit = true;
		     	   			} else if(loopSterlingDeposit == 9) {
			            	 exitTheProgram();
		     	   			} else {
			            	 System.out.println("");
			            	 System.out.println("Invalid option, please try again.");
		     	   			}
	     	   			}
	     	   			break;
	     	   		case 8:
	     	   			exitPoundDeposit = true;
	     	   			break;
	     	   		case 9:
	     	   			exitTheProgram();
	     	   			break;
	     	   		default:
	     	   			System.out.println("==========");
	     	   			System.out.println("");
	     	   			System.out.println("Invalid option, please try again.");
	     	   }
     	   }
     	   break;
       	case 2:
       	 System.out.println("==========");
       	 System.out.println("");
       	 System.out.println("Please select the amount in euros to be deposited:");
   	   
       	 amountToDeposit = ATM.getIntInput(scanner);
   	   
       	 boolean exitEuroDeposit = false;
       	 while(!exitEuroDeposit) {
       		   System.out.println("");
	     	   System.out.println("1. Press to confirm that you want to deposit " + amountToDeposit + " euros.");
	    	   System.out.println("");
	     	   System.out.println("8. Go back to menu.");
	     	   System.out.println("9. Exit the program.");
	
	     	   confirmAmountToDeposit = ATM.getIntInput(scanner);
	     	   switch(confirmAmountToDeposit) {
	     	   		case 1:
	     	   			this.eurosBalance += amountToDeposit;
	     	   			boolean exitConfirmDeposit = false;
	     	   			while (!exitConfirmDeposit) {
	     	   				System.out.println("==========");
	     	   				System.out.println("");
		     	   			System.out.println("Your new euro account balance is " + this.eurosBalance + " euros.");
		     	   			System.out.println("");
		     	   			System.out.println("8. Press to go back to the menu.");
		     	   			System.out.println("9. Exit the program.");
		     	   			int loopEuroDeposit = ATM.getIntInput(scanner);
		     	   			if(loopEuroDeposit == 8){
			            	 
		     	   			exitConfirmDeposit = true;
		     	   			exitEuroDeposit = true;
		     	   			} else if(loopEuroDeposit == 9) {
			            	 exitTheProgram();
		     	   			} else {
			            	 System.out.println("");
			            	 System.out.println("Invalid option, please try again.");
		     	   			}
	     	   			}
	     	   			break;
	     	   		case 8:
	     	   			exitEuroDeposit = true;
	     	   			break;
	     	   		case 9:
	     	   			exitTheProgram();
	     	   			break;
	     	   		default:
	     	   			System.out.println("==========");
	     	   			System.out.println("");
	     	   			System.out.println("Invalid option, please try again.");
	     	   		break;	
	     	   	}
       	 	}
       	 		break;
       case 3:
       			 System.out.println("==========");
       			 System.out.println("");
              	 System.out.println("Please select the amount in dollars to be deposited:");
          	   
              	 amountToDeposit = ATM.getIntInput(scanner);
          	   
              	 boolean exitDollarDeposit = false;
              	 while(!exitDollarDeposit) {
                   System.out.println("");
       	     	   System.out.println("1. Press to confirm that you want to deposit " + amountToDeposit + " dollars.");
       	    	   System.out.println("");
       	     	   System.out.println("8. Go back to menu.");
       	     	   System.out.println("9. Exit the program.");
       	
       	     	   confirmAmountToDeposit = ATM.getIntInput(scanner);
       	     	   switch(confirmAmountToDeposit) {
       	     	   		case 1:
       	     	   			this.dollarsBalance += amountToDeposit;
       	     	   			boolean exitConfirmDeposit = false;
       	     	   			while (!exitConfirmDeposit) {
       	     	   				System.out.println("==========");
       	     	   				System.out.println("");
       		     	   			System.out.println("Your new dollar account balance is " + this.dollarsBalance + " dollars.");
       		     	   			System.out.println("");
       		     	   			System.out.println("8. Press to go back to the menu.");
       		     	   			System.out.println("9. Exit the program.");
       		     	   			int loopDollarDeposit = ATM.getIntInput(scanner);
       		     	   			if(loopDollarDeposit == 8){
       			            	 
       		     	   			exitConfirmDeposit = true;
       		     	   			exitDollarDeposit = true;
       		     	   			} else if(loopDollarDeposit == 9) {
       			            	 exitTheProgram();
       		     	   			} else {
       			            	 System.out.println("");
       			            	 System.out.println("Invalid option, please try again.");
       		     	   			}
       	     	   			}
       	     	   			break;
       	     	   		case 8:
       	     	   			exitDollarDeposit = true;
       	     	   			break;
       	     	   		case 9:
       	     	   			exitTheProgram();
       	     	   			break;
       	     	   		default:
       	     	   			System.out.println("==========");
       	     	   			System.out.println("");
       	     	   			System.out.println("Invalid option, please try again.");
       	     	   			break;	
       	     	   	}
              	 	}
              	 	
       case 8:
    	   break;
       case 9:
       		exitTheProgram();
       default:
       		System.out.println("Invalid option, please try again.");
       		System.out.println("");
       		makeDeposit(scanner);
       		break;

       	}
   	}
   
   
///////////
   
///////////
   
   
   private void makeWithdrawal(Scanner scanner){
       
   }
   
   
   private void exchangeCurrency(Scanner scanner){
       
   }
   
   private void lastMovements(Scanner scanner){
       
   }
   
   private void changePin(Scanner scanner){
       
   }
   
   public void exitTheProgram() {
	   System.out.println("");
       System.out.println("==========");
       System.out.println("We hope to see you back soon.");
       System.out.println("Good bye!.");
       System.exit(0);
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