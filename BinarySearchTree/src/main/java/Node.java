public class Node
{
	public int item;
	public Node Left;
	public Node Right;

	public Node(int Item)
	{
		item = Item;
		Left = null;
		Right = null;
	}

	public void DisplayNode()
	{
		System.out.printf(item + " ");
	}
}
