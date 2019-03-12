

public class Complex1
{
double real;
double imaginary;

public double set(double real,double imaginary)
{
  this.real=real;
  this.imaginary=imaginary;
  }
  
public void display()
{
System.out.println(real +"+" +imaginary+"i");
}

 abstract public Complex sum(Complex c);
{
Complex c1=new Complex();
c1.real=this.real+c1.real;
c1.imaginary=this.imaginary+c1.imaginary;
return c1;
}
}