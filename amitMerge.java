import java.util.*;
public class amitMerge {


 void merge(int arr[],int left,int mid,int right)
 {

int sizeOfLeftArray=mid-left+1;
int sizeOfRightArray=right-mid;


int leftArray[]=new int[sizeOfLeftArray];
int rightArray[]=new int[sizeOfRightArray];

// int j=left;
// int k=mid+1;
int j=0;
int k=0;

for(int i=left;i<=mid;i++)
{
    leftArray[j]=arr[i];
    j++;
}

for(int i=mid+1;i<=right;i++)
{
    rightArray[k]=arr[i];
    k++;
}

j=0;k=0;
int i=left;
    while(j<sizeOfLeftArray &&k<sizeOfRightArray) //sorting the elements
    {
            if(leftArray[j]<=rightArray[k])
            {
                arr[i]=leftArray[j];
                i++;
                j++;
            }
            else
            if(rightArray[k]<leftArray[j])
            {
                arr[i]=rightArray[k];
                i++;
                k++;
            }
    }

    while(j<sizeOfLeftArray)
    {
        arr[i]=leftArray[j];
        i++;
        j++;
    }
    
    while(k<sizeOfRightArray)
    {
        arr[i]=rightArray[k];
        i++;
        k++;
    }
    
 }

 void mergesort(int arr[],int l,int r)
{


if(l<r)
{
    int middle=(l+r)/2;
mergesort(arr,l,middle);
mergesort(arr,middle+1,r);

merge(arr,l,middle,r);
}


}


    public static void main(String args[])
    {

        Random rand = new Random();
        int size = 2000;
        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];
        // Generating a random array
        for (int i = 0; i < size; i++) {
            c[i] = rand.nextInt(15000+1);// rand.nextInt(x) generates random numbers between 0 and x-1 so the array c[]
                                      // contains random numbers between 0 and 4999

            a[i] = c[i];
        }

        Arrays.sort(a);// a[] contains elements in increasing order of the same random elements that
                       // are present in the array c[]

        for (int i = 0; i < size; i++) {
            b[size - i - 1] = a[i];// b[] contains elements in decreasing order of the same random elements that
                                   // are present in the array c[]
        }
            amitMerge obj=new amitMerge();
            double startTime;
            double endTime;

            double executionTimea3;
        double executionTimeb3;
        double executionTimec3;
        double n = 1000.0;
         
            startTime = System.nanoTime();
        obj.mergesort(a,0, size-1);
        endTime = System.nanoTime();
        executionTimea3 = (endTime - startTime)/n;

        startTime = System.nanoTime();
        obj.mergesort(b,0, size-1);
        endTime = System.nanoTime();
        executionTimeb3 = (endTime - startTime)/n;

        startTime = System.nanoTime();
        obj.mergesort(c,0, size-1);
        endTime = System.nanoTime();
        executionTimec3 = (endTime - startTime)/n;

            // for(int i=0;i<c.length;i++)
            // System.out.print(c[i]+" ");
            // System.out.println("**********************************************************");
            // obj.mergesort(c, 0, c.length-1);

            // // for(int i=0;i<c.length;i++)
            // // System.out.print(c[i]+" ");
        

            System.out.println("Execution Time for Merge Sort for array a[] is " + executionTimea3 + " micro sec");
            System.out.println("Execution Time for Merge Sort for array b[] is " + executionTimeb3 + " micro sec");
            System.out.println("Execution Time for Merge Sort for array c[] is " + executionTimec3 + " micro sec");
    }
    
}