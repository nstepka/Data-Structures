
import java.util.*;

public class BinarySearchTreeApplication1
{

	public static void main(String args[])
	{

		int Key;
		int item;
		Node foundNode;

		/* create an empty binary tree */
		BinarySearchTree1 BT = new BinarySearchTree1();
		int[] a = {8,10,12,15,16,18,19,20,30};  //fill in the BST with some initial nodes		
		for(int x: a)
			BT.Insert(x);
		
		BT.InOrder(BT.root); //display the nodes in Inorder
		
		System.out.println("\nEnter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 to exit");
	
		int s = Integer.parseInt(new Scanner(System.in).nextLine());
		while (s == 1 || s == 2 || s == 3 || s == 4)
		{
			if (s == 1)
			{
				System.out.println("Enter an key of the node that you want to search:");
				Key = Integer.parseInt(new Scanner(System.in).nextLine());
			
				foundNode = BT.SearchRec(BT.root, Key);
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
				System.out.println("The data of the current binary search tree in in-order.");
				BT.InOrder(BT.root);
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
					System.out.println("The data of the current binary search tree in in-order.");
					BT.InOrder(BT.root);
				}
			};
			if (s == 4)
			{
				BT.InOrder(BT.root);
			};
			System.out.println("\nEnter 1 for search, 2 for insertion, 3 for deletion, 4 for in-order display, 5 to exit");
			s = Integer.parseInt(new Scanner(System.in).nextLine());
		}
		System.out.println("Goodbye!");
	}
}
