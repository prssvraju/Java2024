class PassValue1  
{  
    int func( int m, int n)// method definition  
    {
        m += 4;
        n -= 2;  
        return m+n;
    }  
}  
class FunExe// class containing the main method  
{
    public static void main (String args [])  
    {  
        int i = 2, j = 8;  
        PassValue1 Object1 = new PassValue1();  
        PassValue1 Object2 = new PassValue1();  
        System.out.println("Func output = " + Object1.func(i,j));
        System.out.println("i = " + i + ", j = " + j);  
        System.out.println("Func output = " + Object2.func(i,j));
        System.out.println ("i = " + i + ", j = " + j);  
    }  
} 
