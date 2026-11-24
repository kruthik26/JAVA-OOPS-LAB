package reports;
import transaction.Account;

public class LAB4_PACKAGE_report_generate{
  public void generate_report(Account acc){
     System.out.println("ACCOUNT NUMBER: "+acc.accno);
     System.out.println("Balance: "+acc.balance);
     acc.deposit(567);
     acc.withdrawal(456);
     System.out.println("Balance: "+acc.balance);
 }
}