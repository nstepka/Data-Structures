public class H_PQueue {

    maxHeap PQ;
    public H_PQueue(int key)
    {
        this.PQ = new maxHeap(key);
    }

    public int EextractHeightestPriority()
    {
        return PQ.extractMax();
    }

    public void Insert(int item)
    {
        PQ.heapInsert(item);
    }

    public void PrintPriorityQueue()
    {
        PQ.printHeap();
    }


}
