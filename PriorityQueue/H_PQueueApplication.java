
import java.util.*;
import java.util.Random;
public class H_PQueueApplication
{
    public static void main(String args[])
    {

        H_PQueue pq = new H_PQueue(20); // create a new priority queue
        Random rnd = new Random();


        for (int i = 0; i < 15; i++) // assign integers to the PQ
        {
            int x = 1+ rnd.nextInt(100);
            pq.Insert(x);
        }

        System.out.println("The elements in the priority queue:");
        pq.PrintPriorityQueue();

        System.out.println("Enter 1 for Extract Highest Priority, 2 for Insert");

        int s = Integer.parseInt(new Scanner(System.in).nextLine());
        while (s == 1 || s == 2)
        {
            if (s == 1)
            {
                int max = pq.EextractHeightestPriority();
                if (max != -9999999)
                {
                    System.out.println("The maximum element is:");
                    System.out.println(max);
                    System.out.println("The elements in the priority queue after extracting the max:");
                    pq.PrintPriorityQueue();
                };
            };
            if (s == 2)
            {
                System.out.println("Insert a new item to the priority queue:");
                int newItem = Integer.parseInt(new Scanner(System.in).nextLine());
                pq.Insert(newItem);
                System.out.println("The elements in the priority queue after inserting the new item:");
                pq.PrintPriorityQueue();
            };

            System.out.println("Enter 1 for Extract Highest Priority, 2 for Insert");
            s = Integer.parseInt(new Scanner(System.in).nextLine());

        }
    }
}