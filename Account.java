package ATMPackage;
import java.util.Scanner;

public class Account {
    private String userName;
    private int accountNumber;
    private int pin;
    private double poundsBalance = 0.00;
    private double eurosBalance = 0.00;
    private double dollarsBalance = 0.00;
    

    
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
       
       boolean exitMenu = false;
       while(!exitMenu){
           
            System.out.println("==========");
            System.out.println("MENU");
            System.out.println("");
            System.out.println("1. Account Balance");
            System.out.println("2. Make a deposit");
            System.out.println("3. Make a withdrawal");
            System.out.println("4. Exchange currency");
            System.out.println("5. Last movements statement");
            System.out.println("6. Change pin");
            System.out.println("9. Exit");  
   
            
            int menuChoice = scanner.nextInt();
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
              }
        }
   }
       
   
   // METHODS
   
   public void checkBalance(Scanner scanner){
     
   }    

   
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