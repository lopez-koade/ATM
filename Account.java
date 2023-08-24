package ATMPackage;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
	
    private String userName;
    private int accountNumber;
    private int pin;
    private double poundsBalance = 0.00;
    private double eurosBalance = 0.00;
    private double dollarsBalance = 0.00;
    boolean exitMenu;
    // Currency exchanges according to xe.com on August 1st 2023
    private double gbpEur = 1.1620;
    private double gbpDol = 1.2746;
    private double eurGbp = 0.86062;
    private double eurDol = 1.0970;
    private double dolGbp = 0.78452;
    private double dolEur = 0.91158;
    public static ArrayList<ArrayList<Object>> transactions2DArray = new ArrayList<>();
	


    
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
    	   	printMenuOptions(); 
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
	     	   			createRegularStatementEntry("Deposit", this.poundsBalance, "pounds", amountToDeposit);
	     	   			
	     	   			boolean exitConfirmDeposit = false;
	     	   			while (!exitConfirmDeposit) {
	     	   				
	     	   				System.out.println("==========");
	     	   				System.out.println("");
		     	   			System.out.println("Your new Pound Sterling account balance is " + twoDigitDecimals(this.poundsBalance) + " pounds.");
		     	   			System.out.println("");
		     	   			System.out.println("8. Press to go back to the menu.");
		     	   			System.out.println("9. Exit the program.");
		     	   			int loopSterlingDeposit = ATM.getIntInput(scanner);
		     	   			if(loopSterlingDeposit == 8){
			            	 
		     	   			exitConfirmDeposit = true;
		     	   			exitPoundDeposit = true;
		     	   			menu(scanner);
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
	     	   			createRegularStatementEntry("Deposit", this.eurosBalance, "euros", amountToDeposit);
	     	   			boolean exitConfirmDeposit = false;
	     	   			while (!exitConfirmDeposit) {
	     	   			
	     	   				System.out.println("==========");
	     	   				System.out.println("");
		     	   			System.out.println("Your new euro account balance is " + twoDigitDecimals(this.eurosBalance) + " euros.");
		     	   			System.out.println("");
		     	   			System.out.println("8. Press to go back to the menu.");
		     	   			System.out.println("9. Exit the program.");
		     	   			int loopEuroDeposit = ATM.getIntInput(scanner);
		     	   			if(loopEuroDeposit == 8){
			            	 
		     	   			exitConfirmDeposit = true;
		     	   			exitEuroDeposit = true;
		     	   			menu(scanner);
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
       	     	   			createRegularStatementEntry("Deposit", this.dollarsBalance, "dollars", amountToDeposit);
       	     	   			boolean exitConfirmDeposit = false;
       	     	   			while (!exitConfirmDeposit) {
       	     	   				System.out.println("==========");
       	     	   				System.out.println("");
       		     	   			System.out.println("Your new dollar account balance is " + twoDigitDecimals(this.dollarsBalance) + " dollars.");
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
//   METHOD MAKE WITHDRAWAL
///////////
   
   
   private void makeWithdrawal(Scanner scanner){
	   double amountToWithdraw = 0;
	   int confirmAmountToWithdraw;
	   System.out.println("==========");
	   System.out.println("");
	   System.out.println("Please select account:");
	   System.out.println("1. Pound Sterling account.");
       System.out.println("2. Euro account.");
       System.out.println("3. Dollar account.");
       System.out.println("");
       System.out.println("8. Go back to menu.");
 	   System.out.println("9. Exit the program.");
	   
       int makeWithdrawInput = ATM.getIntInput(scanner);
       
       switch(makeWithdrawInput) {
       	case 1:
       		boolean case1Loop = false;
       		while(!case1Loop) {
     	   System.out.println("==========");
     	   System.out.println("");
     	   System.out.println("Please select the amount in pounds to be withdrawn:");
     	   
     	   amountToWithdraw = ATM.getIntInput(scanner);
     	   if(amountToWithdraw <= this.poundsBalance) {
     		   case1Loop = true;
     		   boolean exitPoundWithdraw = false;
	     	   while(!exitPoundWithdraw) {
	     		   System.out.println("");
		     	   System.out.println("1. Press to confirm that you want to Withdraw " + amountToWithdraw + " pounds.");
		    	   System.out.println("");
		     	   System.out.println("8. Go back to menu.");
		     	   System.out.println("9. Exit the program.");
		
		     	   confirmAmountToWithdraw = ATM.getIntInput(scanner);
		     	   switch(confirmAmountToWithdraw) {
		     	   		case 1:
		     	   			this.poundsBalance -= amountToWithdraw;
       	     	   			createRegularStatementEntry("Withdraw", this.poundsBalance, "pounds", amountToWithdraw);

		     	   			boolean exitConfirmWithdraw = false;
		     	   			while (!exitConfirmWithdraw) {
		     	   				
		     	   				System.out.println("==========");
		     	   				System.out.println("");
			     	   			System.out.println("Your new Pound Sterling account balance is " + twoDigitDecimals(this.poundsBalance) + " pounds.");
			     	   			System.out.println("");
			     	   			System.out.println("8. Press to go back to the menu.");
			     	   			System.out.println("9. Exit the program.");
			     	   			int loopSterlingWithdraw = ATM.getIntInput(scanner);
			     	   			if(loopSterlingWithdraw == 8){
				            	 
			     	   			exitConfirmWithdraw = true;
			     	   			exitPoundWithdraw = true;
			     	   			menu(scanner);
			     	   			} else if(loopSterlingWithdraw == 9) {
				            	 exitTheProgram();
			     	   			} else {
				            	 System.out.println("");
				            	 System.out.println("Invalid option, please try again.");
			     	   			}
		     	   			}
		     	   			break;
		     	   		case 8:
		     	   			exitPoundWithdraw = true;
		     	   			case1Loop = true;
		     	   			menu(scanner);
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
     	   } else {
     		  System.out.println("");
     		  System.out.println("The selected amount is higher than your current balance.");
     		  System.out.println("Your Pound Sterling account balance is " + twoDigitDecimals(this.poundsBalance) + ".");
     		  System.out.println("");
     	   }  
     	   }
       	case 2:
       		boolean case2Loop = false;
       		while(!case2Loop) {
       		System.out.println("==========");
       	 System.out.println("");
       	 System.out.println("Please select the amount in euros to be withdrawn:");
   	   
       	 amountToWithdraw = ATM.getIntInput(scanner);
       	 if(amountToWithdraw <= this.eurosBalance) {
       		 case2Loop = true;
       		 boolean exitEuroWithdraw = false;
	       	 while(!exitEuroWithdraw) {
	       		   System.out.println("");
		     	   System.out.println("1. Press to confirm that you want to withdraw " + amountToWithdraw + " euros.");
		    	   System.out.println("");
		     	   System.out.println("8. Go back to menu.");
		     	   System.out.println("9. Exit the program.");
		
		     	   confirmAmountToWithdraw = ATM.getIntInput(scanner);
		     	   switch(confirmAmountToWithdraw) {
		     	   		case 1:
		     	   			this.eurosBalance -= amountToWithdraw;
		     	   			createRegularStatementEntry("Withdraw", this.eurosBalance, "euros", amountToWithdraw);
		     	   			boolean exitConfirmWithdraw = false;
		     	   			while (!exitConfirmWithdraw) {
		     	   				System.out.println("==========");
		     	   				System.out.println("");
			     	   			System.out.println("Your new Euro account balance is " + twoDigitDecimals(this.eurosBalance) + " euros.");
			     	   			System.out.println("");
			     	   			System.out.println("8. Press to go back to the menu.");
			     	   			System.out.println("9. Exit the program.");
			     	   			int loopEuroWithdraw = ATM.getIntInput(scanner);
			     	   			if(loopEuroWithdraw == 8){
			     	   			exitConfirmWithdraw = true;
			     	   			exitEuroWithdraw = true;
			     	   			menu(scanner);
			     	   			} else if(loopEuroWithdraw == 9) {
				            	 exitTheProgram();
			     	   			} else {
				            	 System.out.println("");
				            	 System.out.println("Invalid option, please try again.");
			     	   			}
		     	   			}
		     	   			break;
		     	   		case 8:
		     	   			exitEuroWithdraw = true;
		     	   			case2Loop = true;
		     	   			menu(scanner);
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
       	} else {
       		System.out.println("");
       		System.out.println("The selected amount is higher than your current balance.");
   		  System.out.println("Your Pound Sterling account balance is " + twoDigitDecimals(this.eurosBalance) + ".");
   		  System.out.println("");
   	   }
       }
       		
       case 3:
    	   boolean case3Loop = false;
      		while(!case3Loop) {
       			 System.out.println("==========");
       			 System.out.println("");
              	 System.out.println("Please select the amount in dollars to be withdrawn:");
          	   
              	 amountToWithdraw = ATM.getIntInput(scanner);
              	 if(amountToWithdraw <= this.eurosBalance) {
              		 case3Loop = true;
              		 boolean exitDollarWithdraw = false;
	              	 while(!exitDollarWithdraw) {
	                   System.out.println("");
	       	     	   System.out.println("1. Press to confirm that you want to withdraw " + amountToWithdraw + " dollars.");
	       	    	   System.out.println("");
	       	     	   System.out.println("8. Go back to menu.");
	       	     	   System.out.println("9. Exit the program.");
	       	
	       	     	   confirmAmountToWithdraw = ATM.getIntInput(scanner);
	       	     	   switch(confirmAmountToWithdraw) {
	       	     	   		case 1:
	       	     	   			this.dollarsBalance -= amountToWithdraw;
	       	     	   			createRegularStatementEntry("Withdraw", this.dollarsBalance, "dollars", amountToWithdraw);
	       	     	   			boolean exitConfirmWithdraw = false;
	       	     	   			while (!exitConfirmWithdraw) {
	       	     	   				System.out.println("==========");
	       	     	   				System.out.println("");
	       		     	   			System.out.println("Your new dollar account balance is " + twoDigitDecimals(this.dollarsBalance) + " dollars.");
	       		     	   			System.out.println("");
	       		     	   			System.out.println("8. Press to go back to the menu.");
	       		     	   			System.out.println("9. Exit the program.");
	       		     	   			int loopDollarWithdraw = ATM.getIntInput(scanner);
	       		     	   			if(loopDollarWithdraw == 8){
	       			            	 
	       		     	   			exitConfirmWithdraw = true;
	       		     	   			exitDollarWithdraw = true;
	       		     	   			menu(scanner);
	       		     	   			} else if(loopDollarWithdraw == 9) {
	       			            	 exitTheProgram();
	       		     	   			} else {
	       			            	 System.out.println("");
	       			            	 System.out.println("Invalid option, please try again.");
	       		     	   			}
	       	     	   			}
	       	     	   			break;
	       	     	   		case 8:
	       	     	   			exitDollarWithdraw = true;
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
              	 } else {
              		System.out.println("");
              		System.out.println("The selected amount is higher than your current balance.");
                   		  System.out.println("Your Pound Sterling account balance is " + twoDigitDecimals(this.eurosBalance) + ".");
                   		  System.out.println("");
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
   
   
   //////////////////////
   ////CURRENCY EXCHANGE
   /////////////////////
   
   
   private void exchangeCurrency(Scanner scanner){

	   currencyToSellText();
 	   
 	   int exchangeCurrencyChoice = ATM.getIntInput(scanner);
 	   switch (exchangeCurrencyChoice) {
 	   
 	   		//SELLING POUNDS
 	   
	 	   case 1:
	 		   boolean case1Exit = false;
	 		   while(!case1Exit){
	 			   currencyToBuyText("Pound Sterling", "Euro", "Dollar");
		 	 	   
		 	 	   int case1Choice = ATM.getIntInput(scanner);
		 	 	   switch(case1Choice) {
		 	 	   
		 	 	   		//SELLING POUNDS BUYING EUROS
		 	 	   
		 	 	   		case 1:
		 	 	   			boolean case11 = false;
		 	 	   			while(!case11) {
			 	 	   			insertAmountText("euros");
			 	 	   			
			 	 	   			double amountToConvert = ATM.getDoubleInput(scanner);
			 	 	   			if(amountToConvert == 8) {
			 	 	   				menu(scanner);
			 	 	   				case1Exit = true;
			 	 	   				case11 = true;
			 	 	   				
			 	 	   			}else if(amountToConvert == 9) {
			 	 	   				exitTheProgram();
			 	 	   			} else if(amountToConvert < 10) {
			 	 	   				System.out.println("");
			 	 	   				System.out.println("The minimum amount to convert is 10 euros.");
			 	 	   				
			 	 	   			} else {
			 	 	   				boolean catBoolean = false;
			 	 	   				while(!catBoolean){
				 	 	   				confirmAmountText(amountToConvert, "euros");
				 	 	   				int isConfirmedAmountToConvert = ATM.getIntInput(scanner);
				 	 	   				switch(isConfirmedAmountToConvert) {
				 	 	   				case 1:
				 	 	   					if (amountToConvert <= this.poundsBalance * gbpEur) {
				 	 	   						this.poundsBalance -= amountToConvert / gbpEur;
				 	 	   						this.eurosBalance += amountToConvert;
				 	 	   						
				 	 	   						createExchangeStatementEntry("Currency exchange", this.poundsBalance, "euros", "pounds",
													"GBP", "EUR", amountToConvert / gbpEur, amountToConvert, this.eurosBalance);
				 	 	   						
				 	 	   				
					   						   exchangedCurrencyBalance(amountToConvert, "Pound Sterling", this.poundsBalance, "pounds",
				 	 	   												 "Euro", this.eurosBalance, "euros");
				 	 	   						int afterExchangeChoice = ATM.getIntInput(scanner);
				 	 	   						if(afterExchangeChoice == 9) {
				 	 	   							exitTheProgram();
				 	 	   						} else {
				 	 	   							return;
				 	 	   						}
				 	 	   					} else {
				 	 	   						boolean nofBoolean = false;
				 	 	   						while(!nofBoolean) {
				 	 	   							notEnoughFunds("Pound Sterling", this.poundsBalance, "pounds", gbpEur, "euros");
				 	 	   							int notEnoughFundsChoice = ATM.getIntInput(scanner);
				 	 	   							switch(notEnoughFundsChoice) {
				 	 	   								case 7:
				 	 	   									nofBoolean = true;
				 	 	   									catBoolean = true;
				 	 	   									break;
				 	 	   								case 8:
				 	 	   									return;
				 	 	   								case 9:
				 	 	   									exitTheProgram();
				 	 	   								default:
				 	 	   									selectValidOption();
				 	 	   							}
				 	 	   						}
				 	 	   					}
				 	 	   					break;
				 	 	   				case 8:
				 	 	   					return;
				 	 	   				case 9:
				 	 	   					exitTheProgram();
				 	 	   				default:
				 	 	   				selectValidOption();
				 	 	   				}	
			 	 	   				}
			 	 	   			}
		 	 	   			}
		 	 	   			break;
		 	 	   			
		 	 	   		// SELLING POUNDS BUYING DOLLARS
		 	 	   			
		 	 	   		case 2:
		 	 	   		boolean case12 = false;
	 	 	   			while(!case12) {
		 	 	   			insertAmountText("dollars");
		 	 	   			
		 	 	   			double amountToConvert = ATM.getDoubleInput(scanner);
		 	 	   			if(amountToConvert == 8) {
		 	 	   				menu(scanner);
		 	 	   				case1Exit = true;
		 	 	   				case12 = true;
		 	 	   				
		 	 	   			}else if(amountToConvert == 9) {
		 	 	   				exitTheProgram();
		 	 	   			} else if(amountToConvert < 10) {
		 	 	   				System.out.println("");
		 	 	   				System.out.println("The minimum amount to convert is 10 dollars.");
		 	 	   				
		 	 	   			} else {
		 	 	   				boolean catBoolean = false;
		 	 	   				while(!catBoolean){
			 	 	   				confirmAmountText(amountToConvert, "dollars");
			 	 	   				int isConfirmedAmountToConvert = ATM.getIntInput(scanner);
			 	 	   				switch(isConfirmedAmountToConvert) {
			 	 	   				case 1:
			 	 	   					if (amountToConvert <= this.poundsBalance * gbpDol) {
			 	 	   						this.poundsBalance -= amountToConvert / gbpDol;
			 	 	   						this.dollarsBalance += amountToConvert;
			 	 	   						createExchangeStatementEntry("Currency exchange", this.poundsBalance, "dollars", "pounds",
												"GBP", "USD", amountToConvert / gbpDol, amountToConvert, this.dollarsBalance);
			 	 	   						
			 	 	   						exchangedCurrencyBalance(amountToConvert, "Pound Sterling", this.poundsBalance, "pounds",
			 	 	   												 "Dollar", this.dollarsBalance, "dollars");
			 	 	   						int afterExchangeChoice = ATM.getIntInput(scanner);
			 	 	   						if(afterExchangeChoice == 9) {
			 	 	   							exitTheProgram();
			 	 	   						} else {
			 	 	   							return;
			 	 	   						}
			 	 	   					} else {
			 	 	   						boolean nofBoolean = false;
			 	 	   						while(!nofBoolean) {
			 	 	   							notEnoughFunds("Pound Sterling", this.poundsBalance, "pounds", gbpDol, "dollars");
			 	 	   							int notEnoughFundsChoice = ATM.getIntInput(scanner);
			 	 	   							switch(notEnoughFundsChoice) {
			 	 	   								case 7:
			 	 	   									nofBoolean = true;
			 	 	   									catBoolean = true;
			 	 	   									break;
			 	 	   								case 8:
			 	 	   									return;
			 	 	   								case 9:
			 	 	   									exitTheProgram();
			 	 	   								default:
			 	 	   									selectValidOption();
			 	 	   							}
			 	 	   						}
			 	 	   						
			 	 	   						
			 	 	   					}
			 	 	   					break;
			 	 	   				case 8:
			 	 	   					return;
			 	 	   				case 9:
			 	 	   					exitTheProgram();
			 	 	   				default:
			 	 	   				selectValidOption();
			 	 	   				}	
		 	 	   				}
		 	 	   			}
	 	 	   			}
		 	 	   			break;
		 	 	   		case 8:
		 	 	   			return;
		 	 	   		case 9:
		 	 	   			exitTheProgram();
		 	 	   		default:
		 	 	   			selectValidOption();
		 	 	   			break;
		 	 	   }
		 	   }
	 		   break;
	 		   
	 		   // SELLING EUROS
	 		   
	 	   case 2:
	 		  boolean case2Exit = false;
	 		   while(!case2Exit){
	 			   currencyToBuyText("Euro", "Pound Sterling", "Dollar");
		 	 	   int case1Choice = ATM.getIntInput(scanner);
		 	 	   switch(case1Choice) {
		 	 	   
		 	 	   ///SELLING EUROS BUYING POUNDS
		 	 	   
		 	 	   		case 1:
		 	 	   			boolean case21 = false;
		 	 	   			while(!case21) {
			 	 	   			insertAmountText("pounds");
			 	 	   			
			 	 	   			double amountToConvert = ATM.getDoubleInput(scanner);
			 	 	   			if(amountToConvert == 8) {
			 	 	   				menu(scanner);
			 	 	   				case2Exit = true;
			 	 	   				case21 = true;
			 	 	   				
			 	 	   			}else if(amountToConvert == 9) {
			 	 	   				exitTheProgram();
			 	 	   			} else if(amountToConvert < 10) {
			 	 	   				System.out.println("");
			 	 	   				System.out.println("The minimum amount to convert is 10 pounds.");
			 	 	   			} else {
			 	 	   				boolean catBoolean = false;
			 	 	   				while(!catBoolean){
				 	 	   				confirmAmountText(amountToConvert, "pounds");
				 	 	   				int isConfirmedAmountToConvert = ATM.getIntInput(scanner);
				 	 	   				switch(isConfirmedAmountToConvert) {
				 	 	   				case 1:
				 	 	   					if (amountToConvert <= this.eurosBalance * eurGbp) {
				 	 	   						this.eurosBalance -= amountToConvert / eurGbp;
				 	 	   						this.poundsBalance += amountToConvert;
				 	 	   						createExchangeStatementEntry("Currency exchange", this.eurosBalance, "pounds", "euros",
													"EUR", "GBP", amountToConvert / eurGbp, amountToConvert, this.poundsBalance);
				 	 	   						
				 	 	   						exchangedCurrencyBalance(amountToConvert, "Euro", this.eurosBalance, "euros",
				 	 	   												 "Pound Sterling", this.poundsBalance, "pounds");
				 	 	   						int afterExchangeChoice = ATM.getIntInput(scanner);
				 	 	   						if(afterExchangeChoice == 9) {
				 	 	   							exitTheProgram();
				 	 	   						} else {
				 	 	   							return;
				 	 	   						}
				 	 	   					} else {
				 	 	   						boolean nofBoolean = false;
				 	 	   						while(!nofBoolean) {
				 	 	   							notEnoughFunds("Euro", this.eurosBalance, "euros", eurGbp, "pounds");
				 	 	   							int notEnoughFundsChoice = ATM.getIntInput(scanner);
				 	 	   							switch(notEnoughFundsChoice) {
				 	 	   								case 7:
				 	 	   									nofBoolean = true;
				 	 	   									catBoolean = true;
				 	 	   									break;
				 	 	   								case 8:
				 	 	   									return;
				 	 	   								case 9:
				 	 	   									exitTheProgram();
				 	 	   								default:
				 	 	   									selectValidOption();
				 	 	   							}
				 	 	   						}
				 	 	   						
				 	 	   						
				 	 	   					}
				 	 	   					break;
				 	 	   				case 8:
				 	 	   					return;
				 	 	   				case 9:
				 	 	   					exitTheProgram();
				 	 	   				default:
				 	 	   				selectValidOption();
				 	 	   				}	
			 	 	   				}
			 	 	   			}
		 	 	   			}
		 	 	   			break;
		 	 	   			
		 	 	   		// SELLING EUROS BUYING DOLLARS
		 	 	   			
		 	 	   		case 2:
		 	 	   		boolean case22 = false;
	 	 	   			while(!case22) {
		 	 	   			insertAmountText("dollars");
		 	 	   			double amountToConvert = ATM.getDoubleInput(scanner);
		 	 	   			if(amountToConvert == 8) {
		 	 	   				menu(scanner);
		 	 	   				case2Exit = true;
		 	 	   				case22 = true;
		 	 	   				
		 	 	   			}else if(amountToConvert == 9) {
		 	 	   				exitTheProgram();
		 	 	   			} else if(amountToConvert < 10) {
		 	 	   				System.out.println("");
		 	 	   				System.out.println("The minimum amount to convert is 10 dollars.");
		 	 	   				
		 	 	   			} else {
		 	 	   				boolean catBoolean = false;
		 	 	   				while(!catBoolean){
			 	 	   				confirmAmountText(amountToConvert, "dollars");
			 	 	   				int isConfirmedAmountToConvert = ATM.getIntInput(scanner);
			 	 	   				switch(isConfirmedAmountToConvert) {
			 	 	   				case 1:
			 	 	   					if (amountToConvert <= this.eurosBalance * eurDol) {
			 	 	   						this.eurosBalance -= amountToConvert / eurDol;
			 	 	   						this.dollarsBalance += amountToConvert;
			 	 	   						createExchangeStatementEntry("Currency exchange", this.eurosBalance, "dollars", "euros",
												"EUR", "USD", amountToConvert / eurDol, amountToConvert, this.dollarsBalance);
			 	 	   						
			 	 	   						exchangedCurrencyBalance(amountToConvert, "Euro", this.eurosBalance, "euros",
			 	 	   												 "Dollar", this.dollarsBalance, "dollars");
			 	 	   						int afterExchangeChoice = ATM.getIntInput(scanner);
			 	 	   						if(afterExchangeChoice == 9) {
			 	 	   							exitTheProgram();
			 	 	   						} else {
			 	 	   							return;
			 	 	   						}
			 	 	   					} else {
			 	 	   						boolean nofBoolean = false;
			 	 	   						while(!nofBoolean) {
			 	 	   							notEnoughFunds("Euro", this.eurosBalance, "euros", eurDol, "dollars");
			 	 	   							int notEnoughFundsChoice = ATM.getIntInput(scanner);
			 	 	   							switch(notEnoughFundsChoice) {
			 	 	   								case 7:
			 	 	   									nofBoolean = true;
			 	 	   									catBoolean = true;
			 	 	   									break;
			 	 	   								case 8:
			 	 	   									return;
			 	 	   								case 9:
			 	 	   									exitTheProgram();
			 	 	   								default:
			 	 	   									selectValidOption();
			 	 	   							}
			 	 	   						}
			 	 	   						
			 	 	   						
			 	 	   					}
			 	 	   					break;
			 	 	   				case 8:
			 	 	   					return;
			 	 	   				case 9:
			 	 	   					exitTheProgram();
			 	 	   				default:
			 	 	   				selectValidOption();
			 	 	   				}	
		 	 	   				}
		 	 	   			}
	 	 	   			}
		 	 	   			break;
		 	 	   		case 8:
		 	 	   			return;
		 	 	   		case 9:
		 	 	   			exitTheProgram();
		 	 	   		default:
		 	 	   			selectValidOption();
		 	 	   			break;
		 	 	   }
		 	   }
	 		   break;
	 		   
	 		   // SELLING DOLLARS
	 		   
	 	   case 3:
	 		  boolean case3Exit = false;
	 		   while(!case3Exit){
	 			   currencyToBuyText("Dollar", "Pound Sterling", "Euro");
		 	 	   
		 	 	   int case1Choice = ATM.getIntInput(scanner);
		 	 	   switch(case1Choice) {
		 	 	   
		 	 	   		//SELLING DOLLARDS BUYING POUNDS
		 	 	   
		 	 	 case 1:
	 	 	   			boolean case31 = false;
	 	 	   			while(!case31) {
		 	 	   			insertAmountText("pounds");
		 	 	   			
		 	 	   			double amountToConvert = ATM.getDoubleInput(scanner);
		 	 	   			if(amountToConvert == 8) {
		 	 	   				menu(scanner);
		 	 	   				case3Exit = true;
		 	 	   				case31 = true;
		 	 	   				
		 	 	   			}else if(amountToConvert == 9) {
		 	 	   				exitTheProgram();
		 	 	   			} else if(amountToConvert < 10) {
		 	 	   				System.out.println("");
		 	 	   				System.out.println("The minimum amount to convert is 10 pounds.");
		 	 	   			} else {
		 	 	   				boolean catBoolean = false;
		 	 	   				while(!catBoolean){
			 	 	   				confirmAmountText(amountToConvert, "pounds");
			 	 	   				int isConfirmedAmountToConvert = ATM.getIntInput(scanner);
			 	 	   				switch(isConfirmedAmountToConvert) {
			 	 	   				case 1:
			 	 	   					if (amountToConvert <= this.dollarsBalance * dolGbp) {
			 	 	   						this.dollarsBalance -= amountToConvert / dolGbp;
			 	 	   						this.poundsBalance += amountToConvert;
			 	 	   						createExchangeStatementEntry("Currency exchange", this.dollarsBalance, "pounds", "dollars",
												"USD", "GBP", amountToConvert / dolGbp, amountToConvert, this.poundsBalance);
			 	 	   						
			 	 	   						exchangedCurrencyBalance(amountToConvert, "Dollar", this.dollarsBalance, "dollars",
			 	 	   												 "Pound Sterling", this.poundsBalance, "pounds");
			 	 	   						int afterExchangeChoice = ATM.getIntInput(scanner);
			 	 	   						if(afterExchangeChoice == 9) {
			 	 	   							exitTheProgram();
			 	 	   						} else {
			 	 	   							return;
			 	 	   						}
			 	 	   					} else {
			 	 	   						boolean nofBoolean = false;
			 	 	   						while(!nofBoolean) {
			 	 	   							notEnoughFunds("Dollar", this.dollarsBalance, "dollars", dolGbp, "pounds");
			 	 	   							int notEnoughFundsChoice = ATM.getIntInput(scanner);
			 	 	   							switch(notEnoughFundsChoice) {
			 	 	   								case 7:
			 	 	   									nofBoolean = true;
			 	 	   									catBoolean = true;
			 	 	   									break;
			 	 	   								case 8:
			 	 	   									return;
			 	 	   								case 9:
			 	 	   									exitTheProgram();
			 	 	   								default:
			 	 	   									selectValidOption();
			 	 	   							}
			 	 	   						}
			 	 	   						
			 	 	   						
			 	 	   					}
			 	 	   					break;
			 	 	   				case 8:
			 	 	   					return;
			 	 	   				case 9:
			 	 	   					exitTheProgram();
			 	 	   				default:
			 	 	   				selectValidOption();
			 	 	   				}	
		 	 	   				}
		 	 	   			}
	 	 	   			}
	 	 	   			break;
		 	 	   			
		 	 	   		// SELLING DOLLARS BUYING EUROS
		 	 	   			
		 	 	   		case 2:
		 	 	   		boolean case32 = false;
	 	 	   			while(!case32) {
		 	 	   			insertAmountText("euros");
		 	 	   			
		 	 	   			double amountToConvert = ATM.getDoubleInput(scanner);
		 	 	   			if(amountToConvert == 8) {
		 	 	   				menu(scanner);
		 	 	   				case3Exit = true;
		 	 	   				case32 = true;
		 	 	   				
		 	 	   			}else if(amountToConvert == 9) {
		 	 	   				exitTheProgram();
		 	 	   			} else if(amountToConvert < 10) {
		 	 	   				System.out.println("");
		 	 	   				System.out.println("The minimum amount to convert is 10 euros.");
		 	 	   				
		 	 	   			} else {
		 	 	   				boolean catBoolean = false;
		 	 	   				while(!catBoolean){
			 	 	   				confirmAmountText(amountToConvert, "euros");
			 	 	   				int isConfirmedAmountToConvert = ATM.getIntInput(scanner);
			 	 	   				switch(isConfirmedAmountToConvert) {
			 	 	   				case 1:
			 	 	   					if (amountToConvert <= this.dollarsBalance * dolEur) {
			 	 	   						this.dollarsBalance -= amountToConvert / dolEur;
			 	 	   						this.eurosBalance += amountToConvert;
			 	 	   						createExchangeStatementEntry("Currency exchange", this.dollarsBalance, "euros", "dollars",
												"USD", "EUR", amountToConvert / dolEur, amountToConvert, this.eurosBalance);
			 	 	   						
			 	 	   						exchangedCurrencyBalance(amountToConvert, "Dollar", this.dollarsBalance, "dollars",
			 	 	   												 "Euro", this.eurosBalance, "euros");
			 	 	   						int afterExchangeChoice = ATM.getIntInput(scanner);
			 	 	   						if(afterExchangeChoice == 9) {
			 	 	   							exitTheProgram();
			 	 	   						} else {
			 	 	   							return;
			 	 	   						}
			 	 	   					} else {
			 	 	   						boolean nofBoolean = false;
			 	 	   						while(!nofBoolean) {
			 	 	   							notEnoughFunds("Dollar", this.dollarsBalance, "dollars", dolEur, "euros");
			 	 	   							int notEnoughFundsChoice = ATM.getIntInput(scanner);
			 	 	   							switch(notEnoughFundsChoice) {
			 	 	   								case 7:
			 	 	   									nofBoolean = true;
			 	 	   									catBoolean = true;
			 	 	   									break;
			 	 	   								case 8:
			 	 	   									return;
			 	 	   								case 9:
			 	 	   									exitTheProgram();
			 	 	   								default:
			 	 	   									selectValidOption();
			 	 	   							}
			 	 	   						}
			 	 	   						
			 	 	   						
			 	 	   					}
			 	 	   					break;
			 	 	   				case 8:
			 	 	   					return;
			 	 	   				case 9:
			 	 	   					exitTheProgram();
			 	 	   				default:
			 	 	   				selectValidOption();
			 	 	   				}	
		 	 	   				}
		 	 	   			}
	 	 	   			}
		 	 	   			break;
		 	 	   		case 8:
		 	 	   			return;
		 	 	   		case 9:
		 	 	   			exitTheProgram();
		 	 	   		default:
		 	 	   			selectValidOption();
		 	 	   			break;
		 	 	   }
		 	   }
	 		   break;
	 		   
	 		   
	 	   case 8:
	 		   return;
	 	   case 9:
	 		  exitTheProgram();
	 	   default:
	 		  selectValidOption();
	 		  exchangeCurrency(scanner);
	 		  break;
	 	   }
 		  
 		   
   }
   
   
   private void currencyToSellText() {
	   System.out.println("==========");
	   System.out.println("");
	   System.out.println("Please select the currency that you want to sell:");
	   System.out.println("1. Pound Sterling.");
       System.out.println("2. Euro.");
       System.out.println("3. Dollar.");
       System.out.println("");
       System.out.println("8. Go back to menu.");
 	   System.out.println("9. Exit the program.");
   }
   
   private void currencyToBuyText(String sellCurrency, String buyCurrency1, String buyCurrency2) {
	   System.out.println("==========");
	   System.out.println("You have chosen to sell " + sellCurrency + ".");
	   System.out.println("");
	   System.out.println("Please select the currency that you want to buy:");
	   System.out.println("1. " + buyCurrency1 + ".");
	   System.out.println("2. " + buyCurrency2 + ".");
	   System.out.println("");
	   System.out.println("8. Go back to menu.");
	   System.out.println("9. Exit the program.");
   }
   
   private void insertAmountText(String buyCurrency) {
	   System.out.println("==========");
	   System.out.println("You have chosen to buy " + buyCurrency + ".");
	   System.out.println("");
	   System.out.println("Please insert the amount of " + buyCurrency + " that you want to buy:");
	   System.out.println("");
	   System.out.println("8. Go back to menu.");
	   System.out.println("9. Exit the program.");
   }
   
   private void confirmAmountText(double amount, String buyCurrency) {
	   System.out.println("");
	   System.out.println("1. Press to confirm that you want to buy: " + amount + " " + buyCurrency + ".");
	   System.out.println("");
	   System.out.println("8. Go back to menu.");
	   System.out.println("9. Exit the program.");
   }
   
   private void exchangedCurrencyBalance(double amount, String sellCurrencyAccount, double balanceSellCurrency, String sellCurrency, 
		   						   String buyCurrencyAccount, double balanceBuyCurrency, String buyCurrency) {
	   System.out.println("==========");
	   System.out.println("The transaction has been made succesfully.");
	   System.out.println("");
	   System.out.println("You have bought " + amount + " " + buyCurrency + ".");
	   System.out.println("Your new " + sellCurrencyAccount + " account balance is " + twoDigitDecimals(balanceSellCurrency) + " " + sellCurrency + ".");
	   System.out.println("Your new " + buyCurrencyAccount + " account balance is " + twoDigitDecimals(balanceBuyCurrency) + " " + buyCurrency + ".");
	   System.out.println("");
	   System.out.println("8. Go back to menu.");
	   System.out.println("9. Exit the program.");
   }
   
   private void notEnoughFunds(String sellCurrencyAccount, double balanceSellCurrency, String sellCurrency, double exchange, String buyCurrency) {
	   System.out.println("==========");
	   System.out.println("");
	   System.out.println("You don't have enough enough funds to make this transaction.");
	   System.out.println("");
	   System.out.println("Your " + sellCurrencyAccount + " account balance is " + twoDigitDecimals(balanceSellCurrency) + " " + sellCurrency + ".");
	   System.out.println("Considering your current balance, you can buy up to " + twoDigitDecimals(balanceSellCurrency * exchange) + " " + buyCurrency + ".");
	   System.out.println("");
	   System.out.println("7. Insert another quantity.");
	   System.out.println("8. Go back to menu.");
	   System.out.println("9. Exit the program.");
   }
   
   private void selectValidOption () {
	   System.out.println("");
	   System.out.println("Please select a valid option:");
		System.out.println("");
   }
   
   ////////////
   //LAST MOVEMENTS STATEMENT
   ////////////
   
   private void lastMovements(Scanner scanner) {
	   printStatement();
	   boolean exit = false;
	   while(!exit) {
		   System.out.println("8. Go back to menu.");
		   System.out.println("9. Exit the program.");
		   int choice = ATM.getIntInput(scanner);
		   switch(choice) {
		   case 8:
			   return;
		   case 9:
			   exitTheProgram();
		   default:
			   selectValidOption();
		   }
	   }
   }
   
   public void printStatement() {
		for (int i = 0; i < transactions2DArray.size(); i++) {
	        if(transactions2DArray.get(i).get(0).equals("Currency exchange")){ //prints a currency exchange transaction
	        	System.out.println("");
				System.out.println(transactions2DArray.get(i).get(0) + " "  + transactions2DArray.get(i).get(4)+ "/" + transactions2DArray.get(i).get(5) + ".");
				System.out.println("Sold " + twoDigitDecimals((double) transactions2DArray.get(i).get(6)) + " " + transactions2DArray.get(i).get(3) + " --- balance after transaction: " + twoDigitDecimals((double) transactions2DArray.get(i).get(1)) + ".");
				System.out.println("Bought " + transactions2DArray.get(i).get(7) + " " + transactions2DArray.get(i).get(2) + " --- balance after transaction: " + twoDigitDecimals((double) transactions2DArray.get(i).get(8)) + ".");
				System.out.println("");
	        	
	        }
	        else { //prints a regular transaction (deposit or withdrawal)
	        	System.out.println("");
				System.out.println(transactions2DArray.get(i).get(0) + " of " + transactions2DArray.get(i).get(3) + " " + transactions2DArray.get(i).get(2) + ".");
				System.out.println("Balance after transaction: " + twoDigitDecimals((double) transactions2DArray.get(i).get(1)) + " " + transactions2DArray.get(i).get(2) + ".");
				System.out.println("");
	        }
		}
	}
			
   public static void createRegularStatementEntry(String transactionType, double balanceAfterTransaction, String currencyPlural, double amount) {
		ArrayList<Object> row = new ArrayList<>();
		row.add(transactionType);
		row.add(balanceAfterTransaction);
		row.add(currencyPlural);
		row.add(amount);
		transactions2DArray.add(row);
	}
   
   public static void createExchangeStatementEntry(String transactionType, double balanceAfterTransaction, String currencyPlural, String sellCurrencyPlural,
													String sellCurrencyName, String buyCurrencyName, double sellingAmount, double buyingAmount, double buyingCurrencyBalance) {
		ArrayList<Object> row = new ArrayList<>();
		row.add(transactionType);
		row.add(balanceAfterTransaction);
		row.add(currencyPlural);
		row.add(sellCurrencyPlural);
		row.add(sellCurrencyName);
		row.add(buyCurrencyName);
		row.add(sellingAmount);
		row.add(buyingAmount);
		row.add(buyingCurrencyBalance);
		transactions2DArray.add(row);
	}
	
	///////
   //CHANGE PIN METHOD
   ///////
   
   private void changePin(Scanner scanner){
	   int numberAttempts = 3;
	   int newPin = -1;
	   boolean exit = false;
	   while(!exit) {
		   if (numberAttempts >= 1) {
			   System.out.println("==========");
			   System.out.println("");
			   System.out.println("Please confirm your current pin:");
			   System.out.println("");
			   System.out.println("8. Go back to menu.");
			   System.out.println("9. Exit the program.");
			   
			   int insertedPin = ATM.getIntInput(scanner);
			   if(insertedPin == 8) {
				   return;   	
			   } else if(insertedPin == 9) {
				   exitTheProgram();
			   } else if(insertedPin == this.pin) {
				   boolean validPinEntered = false;
                   while (!validPinEntered){
					   System.out.println("");
					   System.out.println("Please insert a new 4-digit PIN:");
					   System.out.println("");
					   System.out.println("8. Go back to menu.");
					   System.out.println("9. Exit the program.");
					   newPin = ATM.getIntInput(scanner);
                       
                       if(ATM.isPin4Digits(newPin)){
                          validPinEntered = true;
                       } else{
                              
                          System.out.println("Invalid PIN format. PIN must be a 4-digit number");
                          }
                   }
                   boolean isPinConfirmed = false;
                   while (!isPinConfirmed){
                       System.out.println("==========");
                       System.out.println("Please confirm your new PIN:");
                       int confirmNewPin = ATM.getIntInput(scanner);
                       if(confirmNewPin == newPin){
                           this.pin = confirmNewPin;
                           System.out.println("==========");
                           System.out.println("Your PIN has been changed succesfully.");
                           System.out.println();
                           isPinConfirmed = true;
                           exit = true;
                           menu(scanner);
                       }
                   }
			   } else {
				   numberAttempts -=1;
				   System.out.println("");
				   System.out.println("Wrong number, you have " + numberAttempts + " more attempts.");
				   System.out.println("");
			   }
		   } else {
			   exitTheProgram();
		   }
	   }
   }
   
   
   // OTHER METHODS
   
   
   public void exitTheProgram() {
	   System.out.println("");
       System.out.println("==========");
       System.out.println("We hope to see you back soon.");
       System.out.println("Good bye!.");
       System.exit(0);
   }
   
   public String twoDigitDecimals(double number) {
	   DecimalFormat decimalFormat = new DecimalFormat("0.00");
	   String formattedNumber = decimalFormat.format(number);
	   return formattedNumber;
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