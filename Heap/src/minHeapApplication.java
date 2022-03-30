import java.util.Random;
import java.util.Scanner;

public class minHeapApplication {

    public static void main(String args[]) {
        Random rnd = new Random();
        System.out.println("Enter the capacity of the heap: ");
        int size = Integer.parseInt(new Scanner(System.in).nextLine());
        minHeap H = new minHeap(10); // create a new heap H

//        for (int i = 0; i < 5; i++) {
//            int x = rnd.nextInt(1001);
//            H.heapInsert(x);
//            System.out.printf("%d ", x);
//        }
        H.heapInsert(20);
        H.heapInsert(27);
        H.heapInsert(56);
        H.heapInsert(56);
        H.heapInsert(44);
        H.heapInsert(77);
        H.heapInsert(91);
        H.heapInsert(82);
        H.heapInsert(98);
        H.heapInsert(73);
        H.displayHeap();
        System.out.println("Enter 1 for extractMin, 2 for heapInsert, 3 Heap Sort, 4 Exit");
        int s = Integer.parseInt(new Scanner(System.in).nextLine());
        while (s == 1 || s == 2 || s == 3 || s == 4) {
            if (s == 1) {
                int max = H.extractMax();
                if (max != -9999999) {
                    System.out.println("The maximum element is:");
                    System.out.println(max);
                    System.out.println("The elements in the array after extracting the max:");
                    H.heapSort();
                    H.displayHeap();
                }
                ;
            }
            ;
            if (s == 2) {
                System.out.println("Insert a new item to the heap:");
                int newItem = Integer.parseInt(new Scanner(System.in).nextLine());
                H.heapInsert(newItem);
                System.out.println("The elements in the array after inserting the new item:");
                H.displayHeap();
            }
            ;

            if (s == 3) {
                int ans;
                System.out.println("Warning: After heap sort, current heap will not be restored and the application will end!");
                System.out.println("Continue with sorting? 1 for yes, 2 for no: \n");
                ans = Integer.parseInt(new Scanner(System.in).nextLine());
                if (ans == 1) {
                    H.heapSort();
                    H.displayHeap();
                    System.out.println("Goodbye!");
                    return;
                }
            }
            ;
            if (s == 4) {
                System.out.println("Goodbye!");
                return;

            }
            ;
            System.out.println("Enter 1 for extractMax, 2 for heapInsert, 3 Heap Sort, 4 Exit");
            s = Integer.parseInt(new Scanner(System.in).nextLine());
        }
    }

}