import pack.A;
import pack.B;
import pack2.X;
import pack2.Y;
class Main
{
  public static void main(String[] args)
  {
  System.out.println("This is main program");
  A a = new A();
  B b = new B();
  X x = new X();
  Y y = new Y();
  System.out.println(a.getA());
  System.out.println(b.getB());
  System.out.println("============");
  System.out.println(x.getX());
  System.out.println("============");
  System.out.println(y.getY());
}
}