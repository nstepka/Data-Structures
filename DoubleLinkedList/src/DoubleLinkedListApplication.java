

import java.util.*;

public final class DoubleLinkedListApplication
{
    public static void main(String args[])
    {
        int Key, preKey;
        int NewItem;

        /* create an empty linked list */
        DoubleLinkedList LL = new DoubleLinkedList();

        /* create a linked list of 5 nodes */
        Random rnd = new Random();

        for (int i = 0; i < 5; i++)
        {
            NewItem = rnd.nextInt(101) ;
            LL.Append(NewItem);
        }

        /* print the list */
        System.out.println("The following are the items/integers in the current linked list from the header:");
//		LL.PrintList();
        LL.ShowLinkedList();

        System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for append, 5 for remove, 6 for exit");
        int s = Integer.parseInt(new Scanner(System.in).nextLine());
        while (s == 1 || s == 2 || s == 3 || s == 4 || s == 5 || s==6)
        {
            if (s == 1)
            {
                System.out.println("Enter an key/integer that you want to search:");
                Key = Integer.parseInt(new Scanner(System.in).nextLine());
                Node n = LL.Search(Key);
                if (n != null)
                {
                    System.out.printf("The item/integer is found: %1$s" + "\r\n", n.item);
                }
                else
                {
                    System.out.println("there is no such key!");
                }
            };
            if (s == 2)
            {
                System.out.println("Enter a new item/integer that you want to insert:");
                NewItem = Integer.parseInt(new Scanner(System.in).nextLine());
                System.out.println("Enter the preKey/integer that the new item will follow:");
                preKey = Integer.parseInt(new Scanner(System.in).nextLine());
                LL.Insert(NewItem, preKey);
                System.out.println("The items/integers of the current linked list from the header:");
                LL.ShowLinkedList();
            };
            if (s == 3)
            {
                System.out.println("Enter the key/integer of the item that you want to delete:");
                Key = Integer.parseInt(new Scanner(System.in).nextLine());
                LL.Delete(Key);
                System.out.println("The items/integers in the current linked list from the header.");
                LL.ShowLinkedList();
            };
            if (s == 4)
            {
                System.out.println("Enter the item/integer that you want to append:");
                NewItem = Integer.parseInt(new Scanner(System.in).nextLine());
                LL.Append(NewItem);
                System.out.println("The items/integers in the current linked list from the header");
                LL.ShowLinkedList();
            };
            if (s == 5)
            {
                Node RemoveNode = LL.Remove();
                if (RemoveNode != null)
                {
                    System.out.printf("The removed item is: %1$s" + "\r\n", RemoveNode.item);
                    System.out.println("The items/integers in the current linked list from the header");
                    LL.ShowLinkedList();
                }
                else
                {
                    System.out.println("The linked list is empty!");
                }
            };
            if (s == 6)
            {
                break;
            }

            System.out.println("\n");
            System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for append, 5 for remove, 6 for exit");
            s = Integer.parseInt(new Scanner(System.in).nextLine());
        }

        System.out.println("Goodbye!");

    }

}