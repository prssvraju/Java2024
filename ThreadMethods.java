
//Illustration of Lambda expression, method reference, and anonymous class 
public class ThreadMethods 
{ 
    public static void main(String[] args) 
    {  
        // Method reference  
        new Thread (ThreadMethods::Method1).start();  
        //The following line is Lambda expression  
        new Thread(() -> Method2 ()).start();  
        //The anonymous inner class or conventional method  
        new Thread( new Runnable()  
                    {
                        public void run()  
                        {
                            Method3();
                        }  
                    }).start();  
    }  
    static void Method1 ()  
    {
        System.out.println("It is method reference thread.");  
    }  
    static void Method2 ()  
    {
        System.out.println("It is Lambda expression method thread.");  
    }  
    static void Method3 ()  
    {
        System.out.println("It is conventional method thread.");  
    }
} 

