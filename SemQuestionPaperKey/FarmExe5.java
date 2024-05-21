class Farm  
{   
    // declaration of variables  
    private double length;
    private double width;  
    Farm (double l, double w) //Parametric constructor  
    {
        System.out.println("Constructor1 called");  
        length = l;  
        width = w;
    }  
    Farm (double w)// Constructor with one parameter  
    {
        System.out.println("Constructor2 called");  
        length = 60.0;// Length has default value 60  
        width = w;
    }  
    Farm()// Constructors with default values  
    {
        System.out.println("Constructor3 called");  
        length = 60.0; //Both the dimensions have default values  
        width = 20.;
    }  
    double area()
    {
        return length*width;
    }  
}// End of class Farm  
class FarmExe5 
{ 
    // class with main method  
    public static void main (String args [])
    {  
        Farm farm1 = new Farm(50.0, 20.0);
        // calls constructor1  
        Farm farm2 = new Farm (30.0);
        // calls constructor2  
        Farm farm3 = new Farm();
        // creating an object, calls constructor3 
        double farmArea1,farmArea2,farmArea3;
        farmArea1 = farm1.area();  
        farmArea2 = farm2.area();  
        farmArea3 = farm3.area();  
        System.out.println ("Area of farm1 = " + farmArea1);  
        System.out.println ("Area of farm2 = " + farmArea2);  
        System.out.println ("Area of farm3 = " + farmArea3);  
    }  
} 



