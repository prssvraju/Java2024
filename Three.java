class One{
    void m(){
        System.out.println("in super class");
    }
}
class Two extends One{
    void m(){
        System.out.println("in subclass ...");
    }
}

class Three
{
    public static void main(String ar[])
    {
        One t = new Two();
        t.m();
    }
}