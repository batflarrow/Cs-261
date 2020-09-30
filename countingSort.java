import java.util.*;

public class countingSort {

    public void countingsort(int arr[], int size) {
        int max = 0;
        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < size; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < size; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i <= max; i++)
            count[i] = count[i] + count[i - 1];

        for (int i = size - 1; i >= 0; i--) {
            sortedArray[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < size; i++)
            arr[i] = sortedArray[i];
    }

    public static void main(String args[]) {

        countingSort obj = new countingSort();
        Random rand = new Random();
        int size = 10000;

        int[] c = new int[size];
        // Generating a random array
        for (int i = 0; i < size; i++)
            c[i] = rand.nextInt(15000 + 1);// rand.nextInt(x) generates random numbers between 0 and x-1 so the array
                                           // c[]
                                           // contains random numbers between 0 and 4999

        // for(int i=0;i<c.length;i++)
        // System.out.print(c[i]+" ");
        double startTime;
        double endTime;
        startTime = System.nanoTime();
        // for(int i=0;i<100;i++)
        obj.countingsort(c, size);
        endTime = System.nanoTime();
        double executionTime = (endTime - startTime) / 1000.0;
        System.out.println(" Execution  Time is " + executionTime);
        // System.out.println("****************************************");
        // for(int i=0;i<c.length;i++)
        // System.out.print(c[i]+" ");

    }

}
