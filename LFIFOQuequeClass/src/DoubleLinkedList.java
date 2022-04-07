
import java.util.*;

public class DoubleLinkedList
{
    public Node header;
    public Node tail;

    public DoubleLinkedList()
    {
        header = null;
        tail = null;
    }

    public void AppendToHead(int newItem)
    {
        Node newNode = new Node(newItem);
        if (header == null)
        {
            header = newNode;
            tail = newNode;
        }
        else
        {
            newNode.Flink = header;
            header.Blink = newNode;
            header = newNode;
        }
    }

    public Node RemoveFromHead()
    {
        Node x = header;
        if (header != null)
        {
            if (header == tail)
            {
                header = null;
                tail = null;
            }
            else
            {
                header = header.Flink;
                header.Blink = null;
            }
        }
        else
        {
            System.out.println("the double linked list is empty");
        }
        return x;
    }

    public void AppendToTail(int newItem)
    {
        Node newNode = new Node(newItem);
        if (tail == null)
        {
            tail = newNode;
            header = newNode;
        }
        else
        {
            newNode.Blink = tail;
            tail.Flink = newNode;
            tail = newNode;
        }
    }

    public Node RemoveFromTail()
    {
        Node x = tail;
        if (tail != null)
        {
            if (header == tail)
            {
                header = null;
                tail = null;
            }
            else
            {
                tail.Blink.Flink = null;
                tail = tail.Blink;
            }
        }
        else
        {
            System.out.println("the double lined list is empty");
        }
        return x;
    }

    public Node Search(int key)
    {
        Node current;
        current = header;
        while (current != null && current.item != key)
        {
            current = current.Flink;
        }
        return current;
    }

    public void Insert(int newItem, int preKey)
    {
        Node newNode = new Node(newItem);
        Node current = Search(preKey);
        if (current == null)
        {
            System.out.println("there is no such preKey!");
        }
        if (current != null)
        {
            if (current == tail)
            {
                newNode.Blink = current;
                current.Flink = newNode;
            }
            else
            {
                newNode.Flink = current.Flink;
                newNode.Blink = current;
                current.Flink.Blink = newNode;
                current.Flink = newNode;
                if (newNode.Flink == null)
                {
                    tail = newNode;
                }
            }
        }
    }

    public void Delete(int key)
    {
        Node p = Search(key);
        if (p == null)
        {
            System.out.println("there is no such a key.");
        }
        if (p != null)
        {
            if (p != header && p != tail)
            {
                p.Blink.Flink = p.Flink;
                p.Flink.Blink = p.Blink;
            };
            if (p == header && p == tail)
            {
                header = null;
                tail = null;
            };
            if (p == header && p != tail)
            {
                header = header.Flink;
                header.Blink = null;
            };
            if (p != header && p == tail)
            {
                p.Blink.Flink = null;
                tail = p.Blink;
            }
        }
    }
    public void PrintList()
    {
        Node current = header;
        if (current == null)
        {
            System.out.println("The list is empty!");
            return;
        }
        System.out.printf("(header)%1s <==> ", current.item);
        while (!(current.Flink == null))
        {
            current = current.Flink;
            if (current.Flink == null)
                System.out.printf("%1s(tail)", current.item);
            else
                System.out.printf("%1s <==> ", current.item);
        }
        System.out.println("\n");

    }
}