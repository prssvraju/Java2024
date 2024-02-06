public class MergeSort {
    public static void main(String args[])
    {
        int arr[] = {88,6,-2,1,9};
        int n=arr.length;
        System.out.println("Before Sorting");
        printArr(arr);
        mergeSort(arr, 0, n-1);
        System.out.println("After Sorting");
        printArr(arr);

    }
    public static void mergeSort(int arr[],int low,int high)
    {
        if(low>=high) // arr.legth<2 
        {
            return;
        }
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int arr[],int low,int mid,int high)
    {
        int merged[] = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i<=mid && j<=high) {
            if(arr[i]<=arr[j])
            {
                merged[k]=arr[i];
                i++;
            }
            else
            {
                merged[k]=arr[j];
                j++;
            }
            k++;
        }
        while (i<=mid) {
            merged[k]=arr[i];
            k++;
            i++;
        }
        while (j<=high) {
            merged[k]=arr[j];
            k++;
            j++;
        }
        for(i=0,j=low;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }


    }
    public static void printArr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
