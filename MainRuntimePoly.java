// 1.Dynamic Method Dispatch or Runtime Polymorphism in Java is a way by which Java Virtual Machine (JVM) determines which version of the same method in the inherited classes should be called ruing the runtime.
// 2.It follows dynamic or late binding where the method call will be done according to the type of object being referred to and not the reference variable.
// 3.Runtime polymorphism in Java isn't applicable to data members. Methods can be overridden but not data members.
// 4.Static binding focuses on the reference type and determines the method call during compilation itself. On the contrary, dynamic binding focuses on the type of object and the method call can be determined only during the runtime.
class A
{
    int x=10;
    public void m1()
    {
        System.out.println("Inside A");
    }
}
class B extends A
{
    int x=20;
    public void m1()
    {
        System.out.println("Inside B");
    }
}
class C extends A
{
    int x=30;
    public void m1()
    {
        System.out.println("Inside C");
    }
}
class MainRuntimePoly 
{
    public static void main(String args[])
    {
        A obja = new A();
        B objb = new B();
        C objc = new C();
        // obja.m1();
        // objb.m1();
        // objc.m1();
        A ref;
        ref = obja;
        ref.m1();
        System.out.println(ref.x);
        ref = objb;
        ref.m1();
        System.out.println(ref.x);
        ref=objc;
        ref.m1();
        System.out.println(ref.x);

        
    }
}