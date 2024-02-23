class AcessSpic {
      int a=10;
      int getA()
      {
        return a;
      }

    
}
 class MainClass
{
    public static void main(String args[])
    {
        AcessSpic obj= new AcessSpic();
        System.out.println("Welocme"+obj.getA());
    }
    
}
