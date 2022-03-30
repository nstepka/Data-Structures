public class minHeap {

    public int heapSize, capacity;
    public int[] Arr;
    public minHeap(int cap)
    {
        heapSize = 0;
        capacity = cap;
        Arr = new int[cap];
    }

    public void heapify(int parent)
    {
        int Lson, Rson, largest, temp;
        Lson = 2 * parent + 1;
        Rson = 2 * parent + 2;
        /* find the largest among A[parent], A[lson] and A[rson] */
        if ( Lson <= heapSize - 1 && Arr[Lson] > Arr[parent] )
        {
            largest = Lson;
        }
        else
        {
            largest = parent;
        }
        if (Rson <= heapSize - 1 && Arr[Rson] > Arr[largest] )
        {
            largest = Rson;
        }
        if (largest != parent)
        {
            temp = Arr[parent];
            Arr[parent] = Arr[largest];
            Arr[largest] = temp;
            heapify(largest);
        }

    }

    public void buildHeap()
    {
        for (int i = (heapSize - 2) / 2; i >= 0; i--)
        {
            heapify(i);
        }
    }


    public void displayHeap()
    {
        System.out.println("heapArray: "); // array format
        for(int m=0; m<heapSize; m++)
            if(Arr[m] != 0)
                System.out.print( Arr[m] + " ");
            else
                System.out.print( "-- ");
        System.out.println();
        // heap format
        int nBlanks = 32;
        int itemsPerRow = 1;
        int column = 0;
        int j = 0; // current item
        String dots = "...............................";
        System.out.println(dots+dots); // dotted top line
        while(heapSize > 0) // for each heap item
        {
            if(column == 0) // first item in row?
                for(int k=0; k<nBlanks; k++) // preceding blanks
                    System.out.print(' ');
            // display item
            System.out.print(Arr[j]);
            if(++j == heapSize) // done?
                break;
            if(++column==itemsPerRow) // end of row?
            {
                nBlanks /= 2; // half the blanks
                itemsPerRow *= 2; // twice the items
                column = 0; // start over on
                System.out.println(); // new row
            }
            else // next item on row
                for(int k=0; k<nBlanks*2-2; k++)
                    System.out.print(' '); // interim blanks
        } // end for
        System.out.println("\n"+dots+dots); // dotted bottom line
    } // end displayHeap()

    public void printHeap()
    {
        for (int i = 0; i <= heapSize - 1; i++)
        {
            System.out.println(Arr[i]);
        }

    }


    public int extractMax()
    {
        if (heapSize == 0)
        {
            System.out.println("Heap is empty");
            return -9999999;
        }
        else
        {
            int max = Arr[0];
            Arr[0] = Arr[heapSize - 1];
            heapSize = heapSize - 1;
            heapify(0);
            return max;
        }
    }

    public void heapInsert(int item)
    {
        if(heapSize == capacity){
            System.out.println("The heap is full!");
            return;
        }
        int parent;
        heapSize = heapSize + 1;
        int i = heapSize - 1;
        parent = (i - 1) / 2;
        while (i > 0 && Arr[parent] > item)
        {
            Arr[i] = Arr[parent];
            i = parent;
            parent = (i - 1) / 2;
        }
        Arr[i] = item;
    }

    public void heapSort()
    {
        int temp;
        // buildHeap();
        int keepSize = heapSize;
        for (int i = heapSize - 1; i >= 1; i--)
        {
            temp = Arr[heapSize-1];
            Arr[heapSize - 1] = Arr[0];
            Arr[0] = temp;
            heapSize = heapSize - 1;
            heapify(0);
        }
        heapSize = keepSize;
        printHeap();
    }
}
