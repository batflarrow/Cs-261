import java.util.*;

class amitinsertionSort {

    public static void insertionSort(int arr[], int size) {
        for (int i = 1; i < size; i++) {
            int sortedElement = arr[i];
            int k = i - 1;

            while (k >= 0 && arr[k] > sortedElement) {
                arr[k + 1] = arr[k];
                k--;
            }
            arr[k + 1] = sortedElement;
        }


    }


    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int size;
        int check = 1;
        do {
            System.out.println("Enter the size of the array in which you want to perform the insertion sort -");
            size = cin.nextInt();

            int arr[];
            arr = new int[size];
            System.out.println("Now enter the data of the array");

            for (int i = 0; i < size; i++)
                arr[i] = cin.nextInt();

            insertionSort(arr, size);
            System.out.println("Array after performing insertion sort is:- ");

            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
            System.out.println("\nPress 1. Enter a new data set and perform insertion sort on that data set");
            System.out.println("Press 2. to exit");
            check = cin.nextInt();
        } while (check == 1);



cin.close();

    }


}