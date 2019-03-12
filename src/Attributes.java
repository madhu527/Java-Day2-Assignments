


public class Attributes
{
  double employeeId;
  String employeeName;
  static double monthSalary;
  
   {
    public Attributes(double employeeId,String employeeName,double monthSalary);
this.employeeId=employeeId;
this.employeeName=employeeName;
this.monthSalary=monthSalary;
    {
     System.out.println("enter the id");
     employeeId=Scanner.nextInt;
     
      System.out.println("enter the name");
      employeeName=Scanner.nextString;

      System.out.println("enter the monthly_basic");
      monthSalary=Scanner.nextDouble;
      
   }
 
 
public static double getAnnualBasic(double monthSalary)
return 12*monthSalary;

}
}