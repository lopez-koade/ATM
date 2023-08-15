package ATMPackage;
import java.util.InputMismatchException;
//import ATMPackage.Account;
import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {
        
        String userName = "user";
        int accountNumber;
        int pin = -1;
    
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit){
            
            System.out.println("==========");    
            System.out.println("Welcome to your bank's ATM");
            System.out.println("==========");    
            System.out.println("1. Press if you have an account (pre-generated accounts available)");
            System.out.println("2. Press to create an account");
            System.out.println("3. Exit");
        
            int existingOrNewAccount = getIntInput(scanner);
        
            switch(existingOrNewAccount){
                case 1:
                    boolean existingOrNewAccountExit = false;
                    while(!existingOrNewAccountExit) {
                	System.out.println("==========");
                    System.out.println("Insert your account number (press 1 or 2 for a mock account)");
                    accountNumber = getIntInput(scanner);
                    
                
                    switch(accountNumber){
                        
                        case 1:
                            Account user1Account = new Account("User1", 1, 7985, 432.36, 
                                731.96, 657.56);
                            
//                            change below boolean to false once the app is done
                            
                            boolean exitAccountNumber = true;
                            while (!exitAccountNumber){
                                System.out.println("==========");
                                System.out.println("Please insert your pin (7985)");
                                pin = getIntInput(scanner);
                                if(pin == user1Account.getPin()){
                                    System.out.println("Log in successful");
                                    exitAccountNumber = true;
                                }
                            }
                            user1Account.menu(scanner);
                            exit = true;
                            existingOrNewAccountExit = true;
                            break;
                            
                            case 2:
                            Account user2Account = new Account("User2", 2, 2824, 257.57, 632.42, 714.61);
                            exitAccountNumber = false;
                            while (!exitAccountNumber){
                                System.out.println("==========");
                                System.out.println("Please insert your pin (2824)");
                                pin = getIntInput(scanner);
                                if(pin == user2Account.getPin()){
                                    System.out.println("Log in successful");
                                    exitAccountNumber = true;
                                }
                            } 
                            user2Account.menu(scanner);
                            exit = true;
                            existingOrNewAccountExit = true;
                            break;
                    }
                    }
                    break;
                    
                case 2: 
                    int newPin = -1;
                    System.out.println("==========");
                    System.out.println("Please insert your name:");
                    userName = getStringInput(scanner);
                    
                    boolean validPinEntered = false;
                    while (!validPinEntered){
                        System.out.println("==========");
                        System.out.println("Please create a 4-digit pin:");
                        newPin = getIntInput(scanner);
                        
                        if(isPin4Digits(newPin)){
                           pin = newPin;
                           validPinEntered = true;
                        } else{
                               
                           System.out.println("Invalid PIN format. PIN must be a 4-digit number");
                           }
                    }
                    boolean isPinConfirmed = false;
                    while (!isPinConfirmed){
                        System.out.println("==========");
                        System.out.println("Please confirm your pin:");
                        int confirmNewPin = getIntInput(scanner);
                        if(confirmNewPin == newPin){
                            isPinConfirmed = true;
                        }
                    }
                    System.out.println("Your account has been created");
                    Account user3Account = new Account(userName, 3, pin, 0.00, 0.00, 0.00);
                    user3Account.menu(scanner);
                    
                    exit = true;
                    break;
                 
                case 3:
                    exit = true;
                    break;
                
                default:
                	System.out.println("");
                	System.out.println("Invalid option, please try again");
                	System.out.println("");
                	break;
            }        
        }
    }
    
    
   public static int getIntInput(Scanner scanner){
	   while(true){
		   try {
			   return scanner.nextInt();
		   } catch(InputMismatchException e){
			   System.out.println("Please provide a valid number:");
			   scanner.nextLine();
		   }
	   }
   }
   
   
   public static double getDoubleInput(Scanner scanner){
	   while(true){
		   try {
			   return scanner.nextDouble();
		   } catch(InputMismatchException e){
			   System.out.println("Please provide a valid number:");
			   scanner.nextLine();
		   }
	   }
   }

   
   public static String getStringInput(Scanner scanner) {
	   String userInput;
	   boolean isValid;
	   do {
		   userInput = scanner.next().trim();
		   isValid = userInput.matches("[a-zA-Z]+");
		   if(!isValid) {
			   System.out.println("Please provide valid letters:");
		   }
	   } while (!isValid);
		   
	   return userInput;
	   
   }
   
   
   public static boolean isPin4Digits (int number){
        String numberString = String.valueOf(number);
        return numberString.matches("^[0-9]{4}$");
    } 
}
        

