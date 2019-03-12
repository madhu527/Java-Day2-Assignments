 
public class Distance
{
float feet;
float inches;

public set(int feet,double inches)
{
this.feet=feet;
this.inches=inches;
{ 
public void Distance()
{
if(inches>=12)
{
feet=feet+1;
inches=inches-12;
}
System.out.println(+feet"+"feet"+" "+inches+"inches");
}

public Distance add(Distance c)
{
Distance d=new Distance()
d.feet=this.feet+c.feet;
d.inches=this.inches+c.feet;
return d;
}
}