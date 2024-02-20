public class CallByRef {
    int x=10;
     public static CallByRef incrementByOne(CallByRef cbf)
    {
        cbf.x= cbf.x+1;
        return cbf;
    }
    public static void main(String args[])
    {
        
        CallByRef obj=new CallByRef();
        System.out.println("Value Before Incremnt is "+obj.x);
        incrementByOne(obj);
        System.out.println("Value After Incremnt is "+obj.x);
    }
}
