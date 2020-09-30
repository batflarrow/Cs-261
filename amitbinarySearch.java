import java.util.*;


class amitbinarySearch {

    public static int binarySearch(int bs[], int size, int item) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (bs[mid] == item)
                return mid;
            else if (bs[mid] < item) {
                start = mid + 1;
                continue;
            } else if (bs[mid] > item) {
                end = mid - 1;
            }


        }
        return -1; // -1 is returned only when element is not found

    }
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

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in); // for taking input


        int size;
        int check = 1;
        do {
            System.out.println("Enter the size of the array in which you want to perform the Binary serach: -");
            size = cin.nextInt();

            int bs[];
            bs = new int[size];
            System.out.println("Now enter the data of the array in any order, but since binary search can only be performed on sorted order of data, the array will first get sorted automaticaly");

            for (int i = 0; i < size; i++)
                bs[i] = cin.nextInt();
            insertionSort(bs, size);
            System.out.println("Array in sorted order is :- ");
            for (int i = 0; i < size; i++)
                System.out.print(bs[i] + " ");

            System.out.println("\nSince the array is now sorted Binary search can be performed on it");
            do {
                int item;

                System.out.println("Enter the data item to be searched in the above array");
                item = cin.nextInt();

                int result = binarySearch(bs, size, item);

                if (result == -1) {
                    System.out.println("data item not found in the above array");
                } else {
                    System.out.println("Item is present in the given data at the position " + (result + 1));
                }
                System.out.println("Press 1. to find a new item in the same data ");
                System.out.println("Press 2. to enter a new data set and find something in that data set");
                System.out.println("Press 3. to exit");
                check = cin.nextInt();
            } while (check == 1);
        } while (check >= 1 && check <= 2);




cin.close();
    }



}