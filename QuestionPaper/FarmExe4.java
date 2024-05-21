class Farm 
{  
    double length;// declaration of variables  
    double width;  
    double area;
    Farm (double l, double w)// method definition  
    {
        length = l;  width = w;
    }  
    /*Following is the method with parameter farm an object of  Farm.*/  
    void equals(Farm farm)
    {// method definition  
        if (farm.length * farm.width == length*width)  
        System.out.println("True");  
        else  
        System.out.println("False");
    } 
     

}  
class FarmExec4// class with main method  
{
    public static void main (String Str[]) 
    {
        Farm farm1 = new Farm (25, 10); //creating objects  
        Farm farm2 = new Farm(30, 20);  
        Farm farm3 = new Farm (15,40);  
        
        farm3. equals(farm1);// accessing methods  
        farm3. equals (farm2);  

        


    }  
}
