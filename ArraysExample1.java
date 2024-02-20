import java.util.Arrays;
  public class ArraysExample1 
  {  
    public static void main(String[] args) 
    {  
        int [] intArray = new int[]{5,7,2,1,8,6,8,9};
        char [] charArray = new char [] {'u','y', 't','a', 'm','f'}; 
        float [] fArray = new float[] {3.4f,2.5f,8.5f,6.4f,9.5f,3.2f};
        Arrays.sort(charArray);
        for(char ch: charArray)
            System.out.print(ch + " ");
        System.out.println();
        Arrays.sort(intArray, 2,5);// sort from index 2 to 5
        for(int x: intArray)
            System.out.print(x + " ");
        System.out.println();
        Arrays.fill(fArray, 1,4, 2.2f);
        for(float y: fArray)
          System.out.print(y + " ");  
        System.out.println(); 
        
        
        int index = Arrays.binarySearch(charArray, 't');
        if(index>=0)  
            System.out.println("The key is at index value: " + index);
        else  
            System.out.println("The key value is not in the array.");
        for( float flo: fArray)  
            System.out.print(flo + " ");
        System.out.println();  
        float floatArray[] = Arrays.copyOf(fArray,8);  
        for(float y: floatArray)  
            System.out.print(y + " ");
        System.out.println();  

        System.out.println(Arrays.toString(intArray));  
        System.out.println(Arrays.hashCode(charArray));  
        System.out.println(Arrays.toString(fArray));  
        int array [] = Arrays.copyOfRange( intArray, 2,6);
        for (int x: array)  
            System.out.print(x +" ");  
        System.out.println();  



    }  
}
