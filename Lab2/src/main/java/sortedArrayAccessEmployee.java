import java.util.*;

public class sortedArrayAccessEmployee
{
    public static Employee[] arr;
    public int currentSize;

    public sortedArrayAccessEmployee(int scale)
    {
        arr = new Employee[scale];
        currentSize = 0;
    }

    public final int BinarySearch(double Key)
    {
        int k = 0;
        int lower = 0;
        int upper = currentSize - 1;
        while (lower < upper)
        {
            k = (lower + upper) / 2;
            if (Key == arr[k].id)
            {
                break;
            }
            if (Key < arr[k].id )
            {
                upper = k - 1;
            }
            else
            {
                lower = k + 1;
            }
        }
        if (lower == upper)
        {
            k = lower;
        }
        if (Key == arr[k].id)
        {
            return k;
        }
        else
        {
            System.out.println("The item cannot be found!");
            return -1;
        }
    }


    public final void insertion(Employee Item)
    {
        if (currentSize == 0)
        {
            arr[0] = Item;
        }
        /* find the position for inserting the given item */
        int position = 0;
        while (position < currentSize && Item.id > arr[position].id )
        {
            position++;
        }
        for (int i = currentSize; i > position; i--)
        {
            arr[i] = arr[i - 1];
        }
        arr[position] = Item;
        currentSize = currentSize + 1;

    }

    public final void deletion(double Key)
    {
        /* find the given item */
        int position = BinarySearch(Key);
        if (position != -1)
        {
            for (int i = position; i < currentSize - 1; i++)
            {
                arr[i] = arr[i + 1];
            }
            currentSize = currentSize - 1;
        };
    }

    public final double remove()
    {
        double x = arr[currentSize-1].id;
        currentSize--;
        return x;

    }
    public final void display()
    {
        if (currentSize != 0)
        {
            for (int i = 0; i < currentSize; i++)
            {
                System.out.println(arr[i]);
            }
        };

        System.out.println("The number of items is " + currentSize);
    }

    public double highest()
    {
        double highest = arr[0].salary;
        for(int i =1; i<currentSize; i++)
        {
            if(arr[i].salary>highest)
                highest=arr[i].salary;
        }
        return highest;

    }
    public double highest()
    {
        double highest = arr[0].salary;
        for(int i =1; i<currentSize; i++)
        {
            if(arr[i].salary>highest)
                highest=arr[i].salary;
        }
        return highest;

    }

    public double average()
    {
        double sum=0.0;
        for(int i=0; i<currentSize; i++)
            sum = sum +arr[i].salary;
        if( currentSize>0)
            return sum/currentSize;
        else
            return -999999.0;
    }

    public Employee smallestSalary(Employee node) {
        if (node == null) {
            return null;
        }
        if (node.Left == null) {
            return node;
        }
        return smallestSalary(node.Left);

    }
}
