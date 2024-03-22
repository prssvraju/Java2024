class Addition
{ 
    //anotation1
    @Deprecated
    public int sum(int a,int b)
    {
        return a+b;
    }
    public int sum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }
}
class AnotationEx
{
    public static void main(String args[])
    {
        int arr[]={3,4,5};
        Addition obj= new Addition();
        //anotation2
        @SuppressWarnings("deprecation")
        int sum =obj.sum(5,6);
        System.out.println(obj.sum(arr));
    }
}