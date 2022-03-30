import java.util.*;

public class LinkedList
{
    public Node header;

    public LinkedList()
    {
        header = null;
    }

    public final Node Search(int key)
    {
        Node current = header;
        while (current != null && current.item != key)
        {
            current = current.link;
        }
        return current;
    }

    public final double avgDataValues(){
        Node current = header;
        Double counter = 0.0;
        Double avg = 0.0;
        while(current != null) {

            counter++;
            avg = avg + current.item;
            if(current.link == null) {
                return avg/counter;
            }
            current = current.link;

        }

        return avg/counter;
    }

    public final Node largestNode(){
        int currentNodeItem = 0;
        Node current = header;
        while(current != null) {
            if(current.item > currentNodeItem) {
                currentNodeItem = current.item;
            }
            current = current.link;
        }
        Node currentToReturn = Search(currentNodeItem);
        Delete(Search(currentNodeItem).item);
        return currentToReturn;
    }

    public final void Append(int newItem)
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

    public final Node searchPrevious(int key)
    {
        if (header == null)
        {
            return header;
        }
        else
        {
            Node current = header;
            while (!(current.link == null) && (current.link.item != key))
            {
                current = current.link;
            }
            return current;
        }
    }

    public final void Insert(int newItem, int preKey)
    {
        Node current;
        Node newNode = new Node(newItem);
        current = Search(preKey);
        if (current == null)
        {
            System.out.println("there is no such preKey!");
        }
        else
        {
            newNode.link = current.link;
            current.link = newNode;
        }
    }


    public final void Delete(int key)
    {
        if (header == null) // The list is empty!
        {
            System.out.println("The list is empty!");
        }
        else
        {
            if (header.item == key) // header to be deleted.
            {
                header = header.link;
            }
            else
            {
                Node p = searchPrevious(key);
                if (p.link == null)
                {
                    System.out.println("There is no such item!");
                }
                else
                {
                    p.link = p.link.link;
                }
            }
        }
    }

    public final Node deleteLastNode(Node current){
        current = new Node(current.item);
        return current;
    }

    public final void ShowLinkedList()
    {
        if (header == null)
            System.out.println("The list is empty!");
        else
        {
            Node current = header;
            System.out.printf("%1$s->", current.item);
            while (!(current.link == null))
            {
                current = current.link;
                System.out.printf("%1$s->", current.item);

            }
            System.out.printf("null");
            System.out.println();
        }
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
            System.out.println(current.item);
            while (!(current.link == null))
            {
                current = current.link;
                System.out.println(current.item);
            }
        }
    }


}
