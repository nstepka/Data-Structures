import java.util.*;
public class hashTableClass {
	public int tableSize; 
	Node[] T;
    public hashTableClass()
    { 
    	System.out.println("Give the hash table size");
        tableSize = Integer.parseInt(new Scanner(System.in).nextLine());
        T = new Node[tableSize];
        for (int i = 0; i < tableSize; i++)
            T[i] = new Node(i*69);
    }

    public int hashFunction(int Key)
    { 
        return Key % tableSize; 
    }
    public Node Search(int Key)
    {
      int h = hashFunction(Key);
      Node current = T[h];
      while (current != null && current.item != Key)
         current = current.link;
      return current;
    }
    public void Insert(int newItem)
    {
        int h = hashFunction(newItem);
        Node current = T[h];
        Node newNode = new Node(newItem);
        newNode.link = T[h];
        T[h] = newNode;
    }
    public void Delete(int Key)
    { 
    	int h = hashFunction(Key);
    	if (T[h] == null) // The list is empty!
    		System.out.println("There is no such item!");
    	else
    	{  
    		if (T[h].item == Key) // The only node in the list is to be deleted.
    			T[h] = T[h].link;
    		else // The list has more than one node.
            { 
    			Node p = searchPrevious(Key);
    			if (p.link == null)
                     System.out.println("There is no such item!");
    			else 
    				p.link = p.link.link;
             } 
    	}
    }
    public Node searchPrevious(int key)
	{
    	int h = hashFunction(key);
		if (T[h] == null)
		{
			return T[h];
		}
		else
		{
			Node current = T[h];
			while (!(current.link == null) && (current.link.item != key))
			{
				current = current.link;
			}
			return current;
		}
	}
    public void PrintHashTable()
    {
        for (int i = 0; i <= tableSize - 1; i++)
        { 
        	if (T[i] == null)
        		System.out.println("T(" + i + "): " + "no item" + "\n");
             else
             { 
            	 Node current = T[i];
            	 System.out.print("T(" + i + "): " + current.item + ", ");
                 while (!(current.link == null))
                 { 
                	 current = current.link;
                     System.out.print(+current.item + ", ");
                 }
             System.out.println("\n");}
           	}
    	}
    public Node getMaxKey() {
        int item = T[0].item;
        for (Node n : T) {
            if (n != null) {
                Node current = n;
                while (current != null) {
                    if (current.item > item) {
                        item = current.item;
                    }
                    current = current.link;
                }
            }
        }
        return Search(item);
    }

    public double getAvgOfKeys() {
        int total = 0;
        int count = 0;
        for (Node n : T) {
            if (n != null) {
                Node current = n;
                while (current != null) {
                    total = total + current.item;
                    current = current.link;
                    count++;
                }
            }
        }
        return ((double) total) / ((double) count);
    }


}
