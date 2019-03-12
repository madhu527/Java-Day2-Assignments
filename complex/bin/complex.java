//Write the definition for a class called Complex that has floating point         
//properties for storing real and imaginary parts. 
//The class has the following behaviours/services/methods:
//void set(float, float) to set the specified value in object
//void disp() to display complex number object
//complex sum() to sum two complex numbers & return complex number
//1. Write the definitions for each of the above member functions.
//2. Write a ComplexTest class with main function to create three complex number objects. 
//Set the value in two objects and call sum() to calculate sum and assign it in third object.
// Display all complex numbers.

public class complex
{
double real;
double imaginary;
}
public complex(double real,double imaginary)
{
  this.real=real;
  this.imaginary=imaginary;
  {
   System.out.println("real");
   real=Scanner.nextDouble;

   System.out.println("imaginary");
   imaginary=Scanner.nextDouble;
  }
  public static void main(String []args)
  {
  complex r1=new complex(2,3);
  return real;
  complex r2=new imaginary(6,1);
  return imaginary;
  }
}
}
