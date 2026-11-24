import reports.report_generate;
import transaction.Account;

public class LAB4_Package_Report{
  public static void main(String[] args){
    Account acc = new Account(892727,1234);
    report_generate r=new report_generate();
    
    r.generate_report(acc);
    
     }
 }   
 