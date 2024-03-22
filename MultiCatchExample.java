public class MultiCatchExample 
{  
    public static void main(String args[]) 
    {  
        try 
        {  
            int a = 0, c;  int b = 56;  
            int aray[] = {4,6,7,5};  
            System.out.println("a = " + a +"\tb = " + b);  
            c = b/a;  
            System.out.println ("The array elements are:");  
            for (int i = 0; i<5; i++)  
                System.out.println(aray[i] + " ");  
           
        } 
        catch (ArithmeticException ex) 
        {  
            System.out.println("Integer division by 0: " + ex);  
        } 
        catch (ArrayIndexOutOfBoundsException ae) 
        {  
            System.out.println("Array index out of bounds.:" + ae); 
        } 
    }
} 

