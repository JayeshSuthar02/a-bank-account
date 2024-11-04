//Bank Program GUI use for.

import javax.swing.*;


class ATM {
    
   public static double balance;
   
       public void deposit(double amount) {
           if (amount > 0) {
               balance += amount;
               JOptionPane.showMessageDialog(null, "Successfully deposited: " + amount);
           } else {
               JOptionPane.showMessageDialog(null, "Deposit amount must be positive.");
           }
       }
   
       public void withdraw(double amount) {
           if (amount > 0 && amount <= balance) {
               balance -= amount;
               JOptionPane.showMessageDialog(null, "Successfully withdrew: " + amount);
           } else if (amount > balance) {
               JOptionPane.showMessageDialog(null, "Insufficient funds.");
           } else {
               JOptionPane.showMessageDialog(null, "Withdrawal amount must be positive.");
           }
       }
   
       public void checkBalance() {
           JOptionPane.showMessageDialog(null, "Current balance: " + balance);
       }
   
       public static void main(String[] args) {
           ATM atm = new ATM();
           String choice;
   
    JOptionPane.showMessageDialog(null,"..Welcome bank system..\n1. Full name\n2.PIN code\nNotes:- please enter step.");
    
    String a= JOptionPane.showInputDialog(null,"Enter account holder's name: ");
    int b= Integer.parseInt(JOptionPane.showInputDialog(null,"Enter PIN code: "));
  
    double d= Double.parseDouble(JOptionPane.showInputDialog(null,"Enter inital balance: "));
        balance = balance+d;
	JOptionPane.showMessageDialog(null,"ACCOUNT OPEN");
	
	JOptionPane.showMessageDialog(null,"Name: "+a+"\nCurrent balance: "+d+"\nNotes:- please press ok button");
	
	
        do {
            choice = JOptionPane.showInputDialog(null, "Welcome "+a+"!\nChoose an option:\n1. Deposit \n2. Withdraw \n3. Check balance \n4. Exit");
             
        
            if (choice == null) {
                break; // Allows user to exit by closing the dialog
            }

            switch (choice) {
                case "1":
                int c = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter PIN code: "));
                if(b==c)
                {
                    String depositStr = JOptionPane.showInputDialog(null, "Enter amount to deposit:");
                    try {
                        double depositAmount = Double.parseDouble(depositStr);
                        atm.deposit(depositAmount);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
                    }
                    break;
                }
                else
                JOptionPane.showMessageDialog(null, "invalid pin.."); 
                break;   

                case "2":
                int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter PIN code: "));
                  if(b==x)
                  {
                    String withdrawStr = JOptionPane.showInputDialog(null, "Enter amount to withdraw:");
                    try {
                        double withdrawAmount = Double.parseDouble(withdrawStr);
                        atm.withdraw(withdrawAmount);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Invalid input. Please enter a numeric value.");
                    }
                    break;
                }
                else
                JOptionPane.showMessageDialog(null, "invalid pin..");  
                break;  

                case "3":
                int y = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter PIN code: "));
                  if(b==y)
                  {
                    atm.checkBalance();
                    break;
                  }
                  else
                  JOptionPane.showMessageDialog(null, "invalid pin..");   
                  break; 

                case "4":
                    JOptionPane.showMessageDialog(null, "Thank you for using the bank program!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        
       
        } while (!"4".equals(choice));
    }
}