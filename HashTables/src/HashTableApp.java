import java.util.Random;
import java.util.Scanner;

public class HashTableApp {
	private static char ShowMenu()
	{
		System.out.println("\nEnter the letter of operation: \n(o)Output\n(i)Insert\n(s)Search\n(d)Deletion\n(m)findMax\n(e)Exit\n");
		return new Scanner(System.in).next().charAt(0);
	}
	public static void main(String[] args)
	{
		Random rand = new Random();
		System.out.println("Testing Hash Table \n");
		char sel = ' ';
		hashTableClass hT= new hashTableClass();
		
		while (sel != 'E' && sel != 'e')
		{
			sel = ShowMenu();
			switch (sel)
			{
				case 'i':
				case 'I':
					System.out.print("Enter a number to insert: ");
					int x = Integer.parseInt(new Scanner(System.in).nextLine());
					hT.Insert(x);
					break;
				case 's':
				case 'S':
					int k;
					System.out.print("Enter the number to search: ");
					k = Integer.parseInt(new Scanner(System.in).nextLine());
					Node ret = hT.Search(k);

					if (ret == null)
					{
						System.out.println("Not found!");
					}
					else
					{
						System.out.printf("The number %1$s is found.\r\n", k);
					}
					break;
				case 'o':
				case 'O':
					System.out.println("The current data in the hash table:  ");
					hT.PrintHashTable();
					break;
				case 'd':
				case 'D':
					int del;
					System.out.print("Enter the number to delete: ");
					del = Integer.parseInt(new Scanner(System.in).nextLine());
					System.out.println("Before delete, the hash table is:");
					hT.PrintHashTable();
					hT.Delete(del);
					System.out.println("After delete, the hash table is:");
					hT.PrintHashTable();
					break;
				case 'e':
				case 'E':
				System.out.println("End of the testing. Goodbye!\n");
					break;
				case 'm':
				case 'M':
					System.out.println("The max number is " + hT.getMaxKey().item);
					break;
				case 'a':
				case 'A':
					System.out.println("The average of the keys is " + hT.getAvgOfKeys());
					break;

				default:
					System.out.println("Invalid input!");
					break;
			}
		}

	}

}
