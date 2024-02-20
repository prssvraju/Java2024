class DynamicArray
{
    public static void main(String args[])
    {
        int arr[]= new int [4];
        for(int i=0;i<4;i++)
        {
            arr[i]=i*3;
        }
        display(arr);
        arr = new int[10];
        System.out.println("After changing array size");
        display(arr);

    }
    public static void display(int a[])
    {
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}
