
import java.util.*;

public class BST_DictionaryApplication
{

    public static void main(String args[])
    {

        int Key;
        int item;
        Node foundNode;

        /* create an empty binary tree */
        BST_Dictionary BT = new BST_Dictionary();
        System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for display, 5 to exit");

        int s = Integer.parseInt(new Scanner(System.in).nextLine());
        while (s == 1 || s == 2 || s == 3 || s == 4)
        {
            if (s == 1)
            {
                System.out.println("Enter an key of the node that you want to search:");
                Key = Integer.parseInt(new Scanner(System.in).nextLine());
                foundNode = BT.Search(Key);
                if (foundNode == null)
                {
                    System.out.println("There is nos such item.");
                }
                else
                {
                    System.out.println("The item is found:");
                    System.out.println(foundNode.item);
                }
            };
            if (s == 2)
            {
                System.out.println("Enter an item (it is an integer) that you want to insert:");
                item = Integer.parseInt(new Scanner(System.in).nextLine());
                BT.Insert(item);
                System.out.println("Displaying data of the current dictionary.");
                BT.DD.InOrder(BT.DD.getroot());
            };
            if (s == 3)
            {
                System.out.println("Enter the key of the node that you want to delete:");
                Key = Integer.parseInt(new Scanner(System.in).nextLine());
                if (!(BT.Delete(Key) == true))
                {
                    System.out.println("There is no such item.");
                }
                else
                {
                    System.out.println("The item is deleted");
                    System.out.println("Displaying data of the current dictionary.");
                    BT.DD.InOrder(BT.DD.root);
                }
            };
            if (s == 4)
            {
                BT.DD.InOrder(BT.DD.root);
            };
            System.out.println("Enter 1 for search, 2 for insertion, 3 for deletion, 4 for display, 5 to exit");
            s = Integer.parseInt(new Scanner(System.in).nextLine());
        }
        System.out.println("Goodbye!");
    }
}