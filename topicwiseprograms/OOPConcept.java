// Implement Bank class with deposit & withdraw methods.

package topicwiseprograms;

import java.util.Scanner;

class Bank {
        double balance;
        String accountNumber, accountHolder;
        
        Bank(String accountNumber, String accountHolder) {
                this.accountNumber = accountNumber;
                this.accountHolder = accountHolder;
                balance = 0;
        }

        double deposit(double amount) {
                if(amount <= 0) {
                        System.out.println("Invalid amount");
                        return balance;
                }
                balance += amount;
                return balance;
        }

        double withdraw(double amount) {
                if(amount > balance) {
                        System.out.println("Insuddicient balance");
                        return balance;
                }
                balance -= amount;
                return balance;
        }
}
public class OOPConcept {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter account holder name: ");
                String name = sc.nextLine();
                Bank bank = new Bank("12345", name);
                int ch = 0;
                do{
                        System.out.println("Welcome " + name + " to the bank. How can we help you? \n1- Deposit\n2- Withdraw\n3- Nothing, exit");
                        ch = sc.nextInt();
                        double amount = 0, balance = 0;

                        switch(ch) {
                                case 1:
                                        System.out.print("Enter amount to deposit: ");
                                        amount = sc.nextDouble();
                                        balance = bank.deposit(amount);
                                        System.out.println("You current balance is: " + balance);
                                        break;
                                
                                case 2:
                                        System.out.print("Enter amount to withdraw: ");
                                        amount = sc.nextDouble();
                                        balance = bank.withdraw(amount);
                                        System.out.println("You current balance is: " + balance);
                                        break;
                                
                                case 3:
                                        System.out.println("Thank you for using our services");
                                        break;

                                default:
                                        System.out.println("Invalid choice, please try again");
                        }
                } while(ch != 3);

                sc.close();
        }
}

// Output ->
// Enter account holder name: Nikhil Tiwari
// Welcome Nikhil Tiwari to the bank. How can we help you? 
// 1- Deposit
// 2- Withdraw
// 3- Nothing, exit
// 1
// Enter amount to deposit: 12342
// You current balance is: 12342.0
// Welcome Nikhil Tiwari to the bank. How can we help you?
// 1- Deposit
// 2- Withdraw
// 3- Nothing, exit
// 2
// Enter amount to withdraw: 34
// You current balance is: 12308.0
// Welcome Nikhil Tiwari to the bank. How can we help you?
// 1- Deposit
// 2- Withdraw
// 3- Nothing, exit
// 3