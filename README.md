# ATM Simulation (Java)


## Table of contents

- [Description](#description)
- [Objectives](#Objectives)
- [My process](#my-process)
  - [Built with](#built-with)
  - [What I learned](#what-i-learned)   
- [Author](#author)



## Description

This is a project to simulate an Automated Teller Machine to make basic operations such as deposits, withdrawals, currency exchanges, checking balances and statements, create a new account and change the PIN.<br>


## Objectives

Create a user-friendly text-based interface.<br>
Let the user choose either a pre-generated account with random currency figures or create a new account. Check if the PIN inserted/created is valid.<br>
Check if the user inserts a valid option and keep them in a loop if they choose a wrong option. Show them valid options again after every wrong option chosen. Handle InputMismatchException.<br>
Let the user check the accounts balance.<br>
Let the user make deposits, withdrawals and currency exchange opertations among three currency accounts, updating and informing the user about the new balance in each account and generating a transaction statement after every transaction.<br>
Let the user print an statement showing all transactions.<br>
Let the user change the PIN.

## My process

- Outline the sections of the ATM and create a tree with the options that would come up down the line. 
- Set up Eclipse IDE project and link it to GitHub.
- Create program entry letting user choose between new or existing account.
- Create Account class and display menu, then create a mathod for every menu option with accesory methods.
- Debug along the way.


### Built with

- Java 
- Eclipse IDE

### What I learned
How to use the Scanner class for user input.<br>
Exception handle, InputMismatchError in particular.<br>
The use of while loops, this app has plenty of them as it needs to keep asking users for the right option if the user selects the wrong option. <br>
OOP concepts, using classes, objects, inheritance, and encapsulation for an understandable and maintainable code.<br>
The importance of indentation and meaningful naming.<br>
How avoiding repeated code is key for a clean code, which I put into practice from the method "currencyExchange". <br>
In general, I've developed my problem solving skills figuring out solutions for managing user accounts, validating transactions, and handling tricky situations, like currency exchange operations. How to save the transaction history and then display it through the "last movements statement" was also a challenge.<br>
Considering that this is been my first relatively complex Java program as a beginner Java developer, I'm happy about the result. Specially the last part of the program. However, I consider I should have created a class for each menu option as the account class ended up being too long. That would have made the project easier to understand and cleaner. Some methods should have also been split in two to keep them simplerer. 


## Author

- github - [lopez-koade](https://github.com/lopez-koade)
