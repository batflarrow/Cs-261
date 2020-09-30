
//201951022
//Amitvikram Kaushalendra Dwivedi
import java.util.*;

class amitheap {

    public void heapify(int arr[], int index, int size) {
        int smallestElementIndex = index;
        int left = (2 * index) + 1;
        int right = (2 * index) + 2;

        if (left < size && arr[smallestElementIndex] > arr[left]) {
            smallestElementIndex = left;
        }

        if (right < size && arr[smallestElementIndex] > arr[right]) {
            smallestElementIndex = right;
        }

        if (smallestElementIndex != index) {
            int c = arr[smallestElementIndex];
            arr[smallestElementIndex] = arr[index];
            arr[index] = c;
            heapify(arr, smallestElementIndex, size);
        }
    }

    public void makeHeap(int arr[], int size) {
        int firstNonLeafIndex = (size / 2) - 1;

        for (int i = firstNonLeafIndex; i >= 0; i--) {
            heapify(arr, i, size);
        }
    }

    public void heapifyForInsertion(int arr[], int lastindex) {
        int parent = (lastindex - 1) / 2;
        while (arr[lastindex] < arr[parent]) {
            int temp = arr[lastindex];
            arr[lastindex] = arr[parent];
            arr[parent] = temp;

            lastindex = parent;
            parent = (lastindex - 1) / 2;
        }

    }

    public void deleteRoot(int arr[], int size) {
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;

        heapify(arr, 0, size - 1);

    }

    public void insertionSort(int arr[], int size) {

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

    public void heapsort(int arr[], int size) {
        makeHeap(arr, size);

        for (int i = size - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String args[]) {

        amitheap obj = new amitheap();
        Random rand = new Random();
        int size = 6000;
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
        // // Random rand = new Random();
        // // int size = 4000;// wecan increase the size of dataset easily by increasing thisnumber
        // // // int[] a1 = new int[size];
        // // // int[] a2 = new int[size];
        // // int[] a3 = new int[size];

        // // // int[] b1 = new int[size];
        // // // int[] b2 = new int[size];
        // // int[] b3 = new int[size];

        // // // int[] c1 = new int[size];
        // // // int[] c2 = new int[size];
        // // // int[] c3 = new int[size];

        // // // Generating a random array
        // // for (int i = 0; i < size; i++) {
        // //     c1[i] = rand.nextInt(15000 + 1);// rand.nextInt(x) generates random numbers between 0 and x-1 so the array
        // //                                     // c[]
        // //     // contains random numbers between 0 and 15001
        // // }

        // System.arraycopy(c1, 0, c2, 0, size - 1);
        // c2[size - 1] = rand.nextInt(15000 + 1);
        // System.arraycopy(c2, 0, c3, 0, size);
        // System.arraycopy(c1, 0, a1, 0, size - 1);
        // System.arraycopy(c2, 0, a2, 0, size);
        // System.arraycopy(c3, 0, a3, 0, size);

        // obj.insertionSort(a1, size - 1);// a[] contains elements in increasing order of the same random elements that
        // // are present in the array c[]
        // obj.insertionSort(a2, size);
        // obj.insertionSort(a3, size);

        // for (int i = 0; i < size - 1; i++) {
        //     b1[size - i - 2] = a1[i];// b[] contains elements in decreasing order of the same random elements that
        //                              // are present in the array c[]
        // }

        // for (int i = 0; i < size; i++) {
        //     b2[size - i - 1] = a2[i];// b[] contains elements in decreasing order of the same random elements that
        //                              // are present in the array c[]
        // }
        // for (int i = 0; i < size; i++) {
        //     b3[size - i - 1] = a3[i];// b[] contains elements in decreasing order of the same random elements that
        //                              // are present in the array c[]
        // }

        // // int item = rand.nextInt(15001);// genearate a random number for carrying out the insertion operation

        // // we convert arrays to min heap for carrying out insertion and deletion
        // // operation
        // obj.makeHeap(a1, size - 1);
        // obj.makeHeap(a2, size);
        // obj.makeHeap(b1, size - 1);
        // obj.makeHeap(b2, size);
        // obj.makeHeap(c1, size - 1);
        // obj.makeHeap(c2, size);

        double startTime;
        double endTime;
        // double executionTimea;
        // double executionTimeb1;
        // double executionTimec1;

        // double executionTimea;
        // double executionTimeb2;
        // double executionTimec2;

        double executionTimea3;
        double executionTimeb3;
        double executionTimec3;
        double n = 1000.0;
        // Now we calculate time for insertion operation
        // double n = 1000.0;
        // startTime = System.nanoTime();
        // a1[size - 1] = item;
        // obj.heapifyForInsertion(a1, size - 1);
        // endTime = System.nanoTime();
        // executionTimea1 = (endTime - startTime) / n;

        // startTime = System.nanoTime();
        // b1[size - 1] = item;
        // obj.heapifyForInsertion(b1, size - 1);
        // endTime = System.nanoTime();
        // executionTimeb1 = (endTime - startTime) / n;

        // startTime = System.nanoTime();
        // c1[size - 1] = item;
        // obj.heapifyForInsertion(c1, size - 1);
        // endTime = System.nanoTime();
        // executionTimec1 = (endTime - startTime) / n;
        // /************************************************************************************* */
        // startTime = System.nanoTime();
        // obj.deleteRoot(a2, size);
        // endTime = System.nanoTime();
        // executionTimea2 = (endTime - startTime) / n;

        // startTime = System.nanoTime();
        // obj.deleteRoot(b2, size);
        // endTime = System.nanoTime();
        // executionTimeb2 = (endTime - startTime) / n;

        // startTime = System.nanoTime();
        // obj.deleteRoot(c2, size);
        // endTime = System.nanoTime();
        // executionTimec2 = (endTime - startTime) / n;

            // for(int i=0;i<c.length;i++)
            // System.out.print(c[i]+" ");

            // obj.heapsort(c, size);
            // System.out.println("\n*************************************************************************************");
            // for(int i=0;i<c.length;i++)
            // System.out.print(c[i]+" ");


        /************************************************************************************* */
        startTime = System.nanoTime();
        obj.heapsort(a, size);
        endTime = System.nanoTime();
        executionTimea3 = (endTime - startTime)/n;

        startTime = System.nanoTime();
        obj.heapsort(b, size);
        endTime = System.nanoTime();
        executionTimeb3 = (endTime - startTime)/n;

        startTime = System.nanoTime();
        obj.heapsort(c, size);
        endTime = System.nanoTime();
        executionTimec3 = (endTime - startTime)/n;

        // System.out.println("\n*************************************************************************************");

        // System.out.println("Execution Time for insertion for array a[] is " + executionTimea1 + " micro sec");
        // System.out.println("Execution Time for insertion for array b[] is " + executionTimeb1 + " micro sec");
        // System.out.println("Execution Time for insertion for array c[] is " + executionTimec1 + " micro sec");

        // System.out.println("*************************************************************************************");

        // System.out.println("Execution Time for deletion for array a[] is " + executionTimea2 + " micro sec");
        // System.out.println("Execution Time for deletion for array b[] is " + executionTimeb2 + " micro sec");
        // System.out.println("Execution Time for deletion for array c[] is " + executionTimec2 + " micro sec");

        // System.out.println("\n*************************************************************************************");

        System.out.println("Execution Time for Heap Sort for array a[] is " + executionTimea3 + " micro sec");
        System.out.println("Execution Time for Heap Sort for array b[] is " + executionTimeb3 + " micro sec");
        System.out.println("Execution Time for Heap Sort for array c[] is " + executionTimec3 + " micro sec");

    }

}