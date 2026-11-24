import reports.LAB4_PACKAGE_report_generate;
import transaction.LAB4_PACKAGE_Account;

public class LAB4_Package_Report{
  public static void main(String[] args){
  
  
     System.out.println("NAME : Kruthik D");
     System.out.println("USN : 1WN25CS115");

    LAB4_PACKAGE_Account acc = new LAB4_PACKAGE_Account(892727,1234);
    LAB4_PACKAGE_report_generate r=new LAB4_PACKAGE_report_generate();
    
    r.generate_report(acc);
    
     }
 }   
 