import java.util.*;  
public class VectorList
{  
    public static void main(String args[])  
    {  
        Vector vec = new Vector(7);// declaring vector  
        Integer [] anArray = new Integer[7];  
        System.out.println("Initial size:" + vec.size());  
        System.out.println("Initial capacity:" + vec.capacity());  
        vec.addElement(new Integer(7));// adding the integer value  
        vec.addElement(new Integer(10));  
        vec.addElement(new Integer(3));  
        vec.addElement(new Float(5.6));// adding the float value  
        vec.addElement(new Float(10.8));  
        vec.addElement(new Integer(23));  
        System.out.println("Enhanced capacity after addition:" + vec.capacity());  // displaying        the capacity after addition  
        vec.addElement(new Integer(5));  
        System.out.println("current capacity is:" + vec.capacity()); 
        System.out.println("First element:" + (Integer)vec.firstElement());  
        System.out.println("last element:" + (Integer)vec.lastElement());  
        System.out.println("Element at fourth position is:" + vec.get(4));  
    }  
}
