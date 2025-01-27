class Complex
{
  int real;
  int imag;
Complex()
{
   real=0;
   imag=0;
}
Complex(int r,int i)
{
real=r;
imag=i;
}
void display()
{
  System.out.print(real+"+j"+imag);
}
 static Complex add(Complex c1,Complex c2)
{
  Complex c3=new Complex();
  c3.real=c1.real+c2.real;
  c3.imag=c1.imag+c2.imag;
  return(c3);
}
}
class Main
{
public static void main(String args[])
{
 Complex c1=new Complex(3,6);
 c1.display();
 Complex c2=new Complex(2,4);
 c2.display();
 Complex c3=Complex.add(c1,c2);
 c3.display();
}
}
