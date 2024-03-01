class ArrayAssign
{
    public static void main(String args[])
    {
        int[] arr1,arr2;
        arr1 = new int[4];
        arr2 = new int[4];
        for(int i=0;i<4;i++)
        {
            arr1[i]=2*i;
        }
        System.out.println("Array Element in Arr1");
        display(arr1);
        System.out.println("Array Element in Arr2 Before Assigning");
        display(arr2);
        arr2=arr1;
        System.out.println("Array Element in Arr2 Assigning Assigning");
        display(arr2);

        for(int i=0;i<4;i++)
        {
            arr1[i]+=5;
        }
        System.out.println("Array Element in ---After +5 in Arr1----");
        System.out.println("Array Element in Arr1");
        display(arr1);
        System.out.println("Array Element in Arr2");
        display(arr2);

    }

    public static void display(int a[])
    {
        for(int x:a)
        {
            System.out.println(x);
        }
    }
}