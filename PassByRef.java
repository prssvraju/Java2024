class Ref 
{  
    int n;  
    Ref(int x)// constructor method of class Ref  
    {n = x;}  
    int func(Ref Obt)  
    {
        Obt.n += 4; //Manipulation through object Obt  
        return Obt.n;  
    }
}  
class PassByRef {// class containing main method  
    public static void main (String args [])
    {  
        Ref refObj1 = new Ref(10);// new object of class Ref  
        System.out.println("Value returned by function = " + refObj1.func(refObj1));
        System.out.println("Value returned by function = " + refObj1.func(refObj1));
        Ref refObj2 = new Ref(20);  
        System.out.println("Value returned by function = " + refObj2.func(refObj2));  
        System.out.println("Value returned by function = " + refObj2.func(refObj2));  
    }  
}
