public class ThisEx {
     int x;
    //This using 
    // ThisEx(int x)
    // {
    //     this.x=x;

    // }    
    // public static void main(String[] args) {
    //     ThisEx obj = new ThisEx(10);
    //     System.out.println(obj.x);
    // }
    
    // invoking current class construction
    // ThisEx()
    // {
    //     System.out.println("Welcome");
    // }  
    // ThisEx(int x)
    // {
    //    this();
    //    this.x=x;
       
    // }
    // public static void main(String[] args) {
    //     ThisEx os = new ThisEx(10);    
    // }
    //Invoke current class method 
    //  public void m()
    //  {
    //     System.out.println("Inside M");
    //  }
    //  public void n()
    //  {

    //     System.out.println("Inside N");
    //     this.m();
    //  }

    //  public static void main(String[] args) {
    //     ThisEx os = new ThisEx(); 
    //     os.n();   
    // } 

    //Return the current class object

    // public ThisEx getThisExObj()
    // {
    //     return this;
    // }
    // public void getMessage()
    // {
    //     System.out.println("Hello");
    // }
    // public static void main(String[] args) {
        
    //     new ThisEx().getThisExObj().getMessage();

    // }

    //Pass an argument in the method call
    //Pass an argument in the constructor call

        int data;
        ThisEx(ThisEx obj)
        {
        
        }
        public static void main(String[] args) {
        
        }

}
