class ArrayOpe
{
    public static void main(String args[])
    {
        int a[] = new int[]{3,6,7,8};
        int[] b = new int[5];

        //Assigning elements to b array
        for(int i=0;i<5;i++)
        {
            b[i]=i*2;
        }
        display(b);
        
    }
    public static void display(int a[])
    {
        for(int x:a)
        {
            System.out.println(x);
        }

    }
}