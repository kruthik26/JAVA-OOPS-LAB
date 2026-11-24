/* 3. a) Develop a Java program to create an abstract class Energy Source with members Source ID, Source Name, and Energy Generated (in kWh).
Include an abstract method calculate Efficiency(). Derive the classes Solar Energy and Wind Energy from Energy Source and implement the method based on the following criteria: 
For Solar Energy, efficiency is calculated as (Energy Generated / 5000) × 100.
For Wind Energy, efficiency is calculated as (Energy Generated / 8000) × 100.
Display source details and efficiency percentage. Demonstrate dynamic method dispatch using an Energy Source reference.*/

abstract class Energy_source{
  int Source_id;
  String Source_name;
  double Energy_generated;
  
  Energy_source(int Source_id,String Source_name,double Energy_generated){
  this.Source_id=Source_id;
  this.Source_name=Source_name;
  this.Energy_generated=Energy_generated;
  }
  
  abstract double calculate_efficiency();
  
  void display(){
    System.out.println("Source id="+Source_id);
    System.out.println("Source name ="+Source_name);
    System.out.println("Energy Generated ="+Energy_generated);
    System.out.println("Efficiency Generated = "+calculate_efficiency()+"%");
  }
 }
 
class WindEnergy extends Energy_source{
     WindEnergy(int Source_id,String Source_name,double Energy_generated){
      super(Source_id,Source_name,Energy_generated);
  }
  
  double calculate_efficiency(){
    return (Energy_generated / 8000)* 100;
}
}

class SolarEnergy extends Energy_source{
     SolarEnergy(int Source_id,String Source_name,double Energy_generated){
      super(Source_id,Source_name,Energy_generated);
  }
  
  double calculate_efficiency(){
    return (Energy_generated / 5000)* 100;
}
}

public class LAB3a_EnergySource{
  public static void main(String[] args ){
  
     System.out.println("NAME : Kruthik D");
     System.out.println("USN : 1WN25CS115");
     
      Energy_source e;
      System.out.println("       Wind energy     ");
      e=new WindEnergy(101,"THUNGABHADRA",8993.56);
      e.display();
      
      System.out.println("       Solar energy     ");       
      e=new SolarEnergy(102,"BERME",5436.76);
      e.display();
      
}
}      
      

