import java.util.*;

public class amitQuick {

    void swap(int arr[], int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    int partition(int arr[], int first, int last,int size) {
        int pivot = arr[first];
        int i;
        if(first!=size-2)
        {
         i=first+1;
        }
        else
        i=first;
        int j=last;

        while(i<j)
     {  
       
        while (arr[i]<=pivot)
        {
            i++;
        } 

    
        while (arr[j]>pivot)
        {
            j--;
        } 
    
        if(i<j)
        swap(arr, i,j);
    
    }

    swap(arr,first,j);
    return j;
        // int i = -1, j;
        // for (j = 0; j < last; j++) {
        //     if (arr[j] <= pivot) {
        //         i++;
        //         swap(arr, i, j);
        //     } else
        //         continue;
        // }
        // swap(arr, i + 1, last);

        // return i + 1;
    }

    void quickSort(int arr[], int start, int end,int size) {
        if (start < end) {
            int pivotindex = partition(arr, start, end,size);
            quickSort(arr, start, pivotindex-1,size );
            quickSort(arr, pivotindex + 1, end,size);
        }
    }

    public static void main(String args[]) {
        Random rand = new Random();
        int size = 5;
        // int[] a = new int[size];
        // int[] b = new int[size];
        int[] c = new int[size];
        // c[size-1]=150000;
        // size--;
        // Generating a random array
        for (int i = 0; i < size; i++) {
            c[i] = rand.nextInt(15000 + 1);// rand.nextInt(x) generates random numbers between 0 and x-1 so the array
                                           // c[]
                                           // contains random numbers between 0 and 4999

            // a[i] = c[i];
        }

        // Arrays.sort(a);// a[] contains elements in increasing order of the same random elements that
        //                // are present in the array c[]

        // for (int i = 0; i < size; i++) {
        //     b[size - i - 1] = a[i];// b[] contains elements in decreasing order of the same random elements that
        //                            // are present in the array c[]
        // }
        amitQuick obj = new amitQuick();

        // for(int i=0;i<c.length;i++)
        // System.out.print(c[i]+" ");
        // double startTime;
        // double endTime;

        // double executionTimea3;
        // double executionTimeb3;
        // double executionTimec3;
        // double n = 1000.0;

        // startTime = System.nanoTime();
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
            System.out.println("--------------------------------------------------------------------------");
        obj.quickSort(c, 0, size-1,size);
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");
        
        // endTime = System.nanoTime();
        // executionTimea3 = (endTime - startTime) / n;

        // startTime = System.nanoTime();
        // obj.quickSort(b, 0, size - 1);
        // endTime = System.nanoTime();
        // executionTimeb3 = (endTime - startTime) / n;

        // startTime = System.nanoTime();
        // obj.quickSort(c, 0, size - 1);
        // endTime = System.nanoTime();
        // executionTimec3 = (endTime - startTime) / n;

        // for (int i = 0; i < c.length; i++)
        //     System.out.print(c[i] + " ");
        // System.out.println("**********************************************************");
        // obj.quickSort(c, 0, size - 1);

        // for (int i = 0; i < c.length; i++)
        // //     System.out.print(c[i] + " ");
        // System.out.println("Execution Time for Quick Sort for array a[] is " + executionTimea3 + " micro sec");
        // System.out.println("Execution Time for Quick Sort for array b[] is " + executionTimeb3 + " micro sec");
        // System.out.println("Execution Time for Quick Sort for array c[] is " + executionTimec3 + " micro sec");
    }
}
