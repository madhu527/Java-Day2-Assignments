

public class Complex
{
double real;
double imaginary;

public double set(double real,double imaginary)
{
  this.real=real;
  this.imaginary=imaginary;
return 0;
  }
  
public void display()
{
System.out.println(real +"+" +imaginary+"i");
}

  public Complex sum(Complex c)
{
Complex c1=new Complex();
c1.real=this.real+c.real;
c1.imaginary=this.imaginary+c.imaginary;
return c1;
}

}