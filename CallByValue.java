

public class CallByValue {

    public static int incrementByOne(int n)
    {
        return n+1;
    }
    public static void main(String args[])
    {
        int x=10;
        System.out.println("Value Before Incremnt is "+x);
        incrementByOne(x);
        System.out.println("Value After Incremnt is "+x);
    }
    
}
