public class MergeSortV2 {


    public static void main(String args[])
    {
        int arr[] = {11,8,7,3,6,9};
        int n=arr.length;
        System.out.println("Before Sorting");
        printArr(arr);
        mergeSort(arr);
        System.out.println("After Sorting");
        printArr(arr);

    }
    public static void mergeSort(int arr[])
    {
        int inputlen= arr.length;
        if(inputlen<2)
        {
            return;
        }
        int mid = inputlen/2;
        int leftHalf[] = new int[mid];
        // let oringl lengh of arr  will be 9 so righ half array element to be 5 (Total leght - Mid ie 9-4=5)
        int righHalf[] = new int[inputlen-mid]; 
        //copying form main array to left half
        for(int i=0;i<mid;i++)
        {
            leftHalf[i]=arr[i];
        }
        //copying Righ half
        for(int i=mid;i<inputlen;i++)
        {
            //i will starts form 4 as it assigned to mid first index value in rightHalf should be 0 ie(4-4) as i increments by 1 index also increments 
            righHalf[i-mid]=arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(righHalf);
        merge(arr,leftHalf,righHalf);
        
    }
    public static void merge(int arr[],int leftHalf[],int rightHalf[])
    {
        int leftSize=leftHalf.length;
        int rightSize=rightHalf.length;
        int i=0,j=0,k=0;
        while(i<leftSize && j<rightSize)
        {
            if(leftHalf[i]<rightHalf[j])
            {
                arr[k]=leftHalf[i];
                i++;
            }
            else
            {
                arr[k]=rightHalf[j];
                j++;
            }
            k++;
        }
        while (i<leftSize) {
            arr[k]=leftHalf[i];
            k++;
            i++;
        }
        while (j<rightSize) {
            arr[k]=rightHalf[j];
            k++;
            j++;
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
