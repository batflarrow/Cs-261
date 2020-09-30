
//201951022
//Amitvikram Kaushalendra Dwivedi
import java.util.*;

public class amitTimeComplexity {

    public static long linearSearch(int ls[], int size, int x) {

        int[] abc = new int[size];
        for (int i = 0; i < size; i++)
            abc[i] = ls[i];

        long startTime = System.nanoTime();

        for (int i = 0; i < size; i++) {
            if (abc[i] == x) {
                // int index = i; // element found at index i
                break;
            }
        }

        long endTime = System.nanoTime();
        long executionTimeInNano = (endTime - startTime); // Total execution time in nano seconds
        return (executionTimeInNano / 1000); // divinding by 1000 for converting nanosecs to micro secs

    }

    public static long binarySearch(int bs[], int size, int item) {
        int[] abc = new int[size];
        for (int i = 0; i < size; i++)
            abc[i] = bs[i];
        int start = 0;
        int end = size - 1;
        double finalExecutionTime = 0;

        long startTime = System.nanoTime();
        Arrays.sort(abc);
        while (start <= end) {
            int mid = (start + end) / 2;

            if (abc[mid] == item) {
                // int index = mid;
                break;
            } else if (abc[mid] < item) {
                start = mid + 1;
                continue;
            } else if (abc[mid] > item) {
                end = mid - 1;
            }

        }
        long endTime = System.nanoTime();
        long executionTimeInNano = (endTime - startTime); // Total execution time in nano seconds
        finalExecutionTime = finalExecutionTime + executionTimeInNano;

        return (executionTimeInNano / 1000); // dividing by 1000 for converting nanosecs to micro secs

    }

    public static long insertionSort(int arr[], int size) {
        int[] abc = new int[size];
        for (int i = 0; i < size; i++)
            abc[i] = arr[i];

        long startTime = System.nanoTime();
        for (int i = 1; i < size; i++) {
            int sortedElement = abc[i];
            int k = i - 1;

            while (k >= 0 && abc[k] > sortedElement) {
                abc[k + 1] = abc[k];
                k--;
            }
            abc[k + 1] = sortedElement;
        }
        long endTime = System.nanoTime();
        long executionTimeInNano = (endTime - startTime);

        // Total execution time in nano seconds
        return executionTimeInNano / 1000; // divinding by 1000 for converting nanosecs to micro secs

    }

    public static long selectionSort(int arr[], int size) {
        int[] abc = new int[size];
        for (int i = 0; i < size; i++)
            abc[i] = arr[i];

        long startTime = System.nanoTime();
        for (int i = 0; i < (size - 1); i++) {
            int minElementIndex = i;
            for (int j = (i + 1); j < size; j++) {
                if (abc[j] < abc[minElementIndex]) {
                    minElementIndex = j;
                }
            }

            int t = abc[minElementIndex];
            arr[minElementIndex] = abc[i];
            abc[i] = t;
            // to swap min element and last element of sorted array
        }

        long endTime = System.nanoTime();
        long executionTimeInNano = (endTime - startTime); // Total execution time in nano seconds
        return (executionTimeInNano / 1000); // divinding by 1000 for converting nanosecs to micro secs

    }

    public static long bubbleSort(int arr[], int size) {
        int[] abc = new int[size];
        // Algorithm will be performed on this array and not the original array
        for (int i = 0; i < size; i++)
            abc[i] = arr[i];

        long startTime = System.nanoTime();

        int flag = 1;
        for (int i = 0; i < size - 1; i++) {
            flag = 0;
            for (int j = 0; j < size - i - 1; j++) {
                if (abc[j + 1] < abc[j]) {
                    int t = abc[j + 1];
                    abc[j + 1] = abc[j];
                    abc[j] = t;
                    // swapping adjacent elements to bring the largest element to last of the sorted
                    // array
                    flag = 1;
                }

            }
            if (flag == 0) // if flag remains 0 which means that no swapping has taken place inside the
                           // inner loop hence array is sorted and no more passes are needed
                break;
            else
                continue;

        }
        long endTime = System.nanoTime();
        long executionTimeInNano = (endTime - startTime); // Total execution time in nano seconds
        return (executionTimeInNano / 1000);// divinding by 1000 for converting nanosecs to micro secs

    }

    public static void main(String args[]) {
        // Scanner cin = new Scanner(System.in);

        Random rand = new Random();
        int size = 10069;
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

        // int item = c[rand.nextInt(size)];// get a random item present in the array
        long sumTimeOf100RunsFora = 0;
        long sumTimeOf100RunsForb = 0;
        long sumTimeOf100RunsForc = 0;
        // perforiming algorithm 100 times and in the end dividing the total time by 100
        // to get the average execution time
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsFora += linearSearch(a, size, a[size-1]);
        }
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForb += linearSearch(b, size, b[size-1]);
        }

        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForc += linearSearch(b, size, c[size-1]);
        }
        System.out.println(
                "The Execution time of linary search algorithm  for array a[] which contains item in increasing order is "
                        + sumTimeOf100RunsFora / 100 + " micro seconds."
                        + "\nThe Execution time of linary Search algorithm for array b[] which contains item in decreasing order is "
                        + sumTimeOf100RunsForb / 100 + " micro seconds."
                        + "\nThe Execution time of linear search algorithm for array c[] which contains item in random order is "
                        + sumTimeOf100RunsForc / 100 + " micro seconds.");

        System.out.println("********************************************************************************");

        //item = c[rand.nextInt(size)];// get a random item present in the array
        sumTimeOf100RunsFora = 0;
        sumTimeOf100RunsForb = 0;
        sumTimeOf100RunsForc = 0;
        // perforiming algorithm 100 times and in the end dividing the total time by 100
        // to get the average execution time
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsFora += binarySearch(a, size, a[size-1]);
        }
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForb += binarySearch(b, size, b[size-1]);
        }

        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForc += binarySearch(b, size, c[size-1]);
        }

        System.out.println(
                "The Execution time of binary search algorithm for array a[] which contains item in increasing order is "
                        + sumTimeOf100RunsFora / 100 + " micro seconds."
                        + "\nThe Execution time of binary Search algorithm for array b[] which contains item in decreasing order is "
                        + sumTimeOf100RunsForb / 100 + " micro seconds."
                        + "\nThe Execution time of binear search algorithm for array c[] which contains item in random order is "
                        + sumTimeOf100RunsForc / 100 + " micro seconds.");
        System.out.println("********************************************************************************");

        sumTimeOf100RunsFora = 0;
        sumTimeOf100RunsForb = 0;
        sumTimeOf100RunsForc = 0;
        // perforiming algorithm 100 times and in the end dividing the total time by 100
        // to get the average execution time
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsFora += selectionSort(a, size);
        }
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForb += selectionSort(b, size);
        }

        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForc += selectionSort(c, size);
        }
        System.out.println(
                "The Execution time of Selection Sort algorithm  for array a[] which contains item in increasing order is "
                        + sumTimeOf100RunsFora / 100 + " micro seconds."
                        + "\nThe Execution time of Selection Sort algorithm for array b[] which contains item in decreasing order is "
                        + sumTimeOf100RunsForb / 100 + " micro seconds."
                        + "\nThe Execution time of Selection Sort algorithm for array c[] which contains item in random order is "
                        + sumTimeOf100RunsForc / 100 + " micro seconds.");

        System.out.println("********************************************************************************");
        sumTimeOf100RunsFora = 0;
        sumTimeOf100RunsForb = 0;
        sumTimeOf100RunsForc = 0;
        // perforiming algorithm 100 times and in the end dividing the total time by 100
        // to get the average execution time
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsFora += insertionSort(a, size);
        }
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForb += insertionSort(b, size);
        }

        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForc += insertionSort(c, size);
        }
        System.out.println(

                "The Execution time of Insertion Sort algorithm  for array a[] which contains item in increasing order is "
                        + sumTimeOf100RunsFora / 100 + " micro seconds."
                        + "\nThe Execution time of Insertion Sort algorithm for array b[] which contains item in decreasing order is "
                        + sumTimeOf100RunsForb / 100 + " micro seconds."
                        + "\nThe Execution time of Insertion Sort algorithm for array c[] which contains item in random order is "
                        + sumTimeOf100RunsForc / 100 + " micro seconds.");

        System.out.println("********************************************************************************");
        sumTimeOf100RunsFora = 0;
        sumTimeOf100RunsForb = 0;
        sumTimeOf100RunsForc = 0;
        // perforiming algorithm 100 times and in the end dividing the total time by 100
        // to get the average execution time
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsFora += bubbleSort(a, size);
        }
        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForb += bubbleSort(b, size);
        }

        for (int i = 1; i <= 100; i++) {
            sumTimeOf100RunsForc += bubbleSort(c, size);
        }

        System.out.println(
                "The Execution time of Bubble Sort algorithm  for array a[] which contains item in increasing order is "
                        + sumTimeOf100RunsFora / 100 + " micro seconds."
                        + "\nThe Execution time of Bubble Sort algorithm for array b[] which contains item in decreasing order is "
                        + sumTimeOf100RunsForb / 100 + " micro seconds."
                        + "\nThe Execution time of Bubble Sort algorithm for array c[] which contains item in random order is "
                        + sumTimeOf100RunsForc / 100);

    }

}