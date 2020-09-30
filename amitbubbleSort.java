import java.util.*;

class amitbubbleSort {

    public static void bubbleSort(int arr[], int size) {
        int flag = 1;
        for (int i = 0; i < size - 1; i++) {
            flag = 0;
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {

                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                    // arr[j + 1] = arr[j + 1] + arr[j];
                    // arr[j] = arr[j + 1] - arr[j];
                    // arr[j + 1] = arr[j + 1] - arr[j];
                    //swapping adjacent elements to bring the largest  element to last of the sorted array
                    flag = 1;
                }
               

            }
            for(int k=0;k<size;k++)
            System.out.print(arr[k]+" ");
            System.out.println("\n");
            if (flag == 0) // if flag remains 0 which means that no swapping has taken place inside the inner loop hence array is sorted and no more passes are needed
                break;
            else
                continue;
        }
    }


    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int size;
        int check = 1;
        do {
            System.out.println("Enter the size of the array in which you want to perform the bubble sort -");
            size = cin.nextInt();

            int arr[];
            arr = new int[size];
            System.out.println("Now enter the data of the array");

            for (int i = 0; i < size; i++)
                arr[i] = cin.nextInt();

            bubbleSort(arr, size);
            System.out.println("Array after performing bubble sort is:- ");

            for (int i = 0; i < size; i++)
                System.out.print(arr[i] + " ");
            System.out.println("\nPress 1. Enter a new data set and perform bubble sort on that data set");
            System.out.println("Press 2. to exit");
            check = cin.nextInt();
        } while (check == 1);


        cin.close();


    }


}