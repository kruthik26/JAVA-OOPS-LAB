/*4. Develop a Java program to create a package transaction containing a class Account with members Account Number and Balance.
Include methods for deposit and withdrawal. 
Create another package reports containing a class to generate transaction reports. 
Import both packages into a main application.  */



package transaction;

public class LAB4_PACKAGE_Account{
 public int accno;
 public double balance;
 
  public Account(int accno,double balance){
   this.accno=accno;
   this.balance=balance;
  }
  
  public double deposit(double amt){
     if(amt<=0){
      System.out.println("Invalid Amount");
      return balance;
      }else{
        System.out.println("Deposited amount : "+amt);
        balance+=amt;
        return  balance;
      }
   }
   
  public double withdrawal(double amt){
   if(amt<=0){
      System.out.println("Invalid Amount");
      return balance;
      }else{
        System.out.println("Withdrawed amount : "+amt);
        balance-=amt;
        return  balance;
      }
   }
   
  }