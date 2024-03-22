interface myinter
{
    public void test();
    default public  void hello()
    {
        System.out.println("Hello");
    }
    static  public void hello2()
    {
        System.out.println("Hello2");
    }


}
class MyinterfaceImpl implements myinter{
    
    public void test()
    {
        System.out.println("Test");
    }


    public static void main(String args[])
    {
        myinter obj = new MyinterfaceImpl();
        obj.test();
        obj.hello();
        myinter.hello2();

    }
}