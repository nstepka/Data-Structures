import java.util.*;

public class LinkedList
{
	public Node header;

	public LinkedList()
	{
		this.header = null;
	}


	public final void Append(char newItem)
	{
		Node newNode = new Node(newItem);
		newNode.link = header;
		header = newNode;
	}

	public final Node Remove()
	{
		Node x = header;
		if (header != null)
		{
			header = header.link;
		}
		return x;
	}





	public final void PrintList()
	{
		if (header == null)
		{
			System.out.println("The list is empty!");
		}
		else
		{
			Node current = header;
			System.out.print(current.item);
			while (!(current.link == null))
			{
				current = current.link;
				System.out.print(current.item);
			}
		}
	}


	public Node getHeader() {
		return header;
	}
}
