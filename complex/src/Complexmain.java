class Complexmain
{
public static void main(String[] args)
{
Complex obj1=new Complex();
obj1.set(2,3);
obj1.display();
Complex obj2=new Complex();
obj2.set(2,9);
obj2.display();
Complex c;
c=obj1.sum(obj2);
c.display();
}
}