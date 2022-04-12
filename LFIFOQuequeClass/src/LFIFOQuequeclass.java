import java.util.Random;
import java.util.Scanner;

public class LFIFOQuequeclass {

    DoubleLinkedList dll;

    public LFIFOQuequeclass() {
        this.dll = new DoubleLinkedList();
    }

    public void enqueue(int x){
        dll.AppendToTail(x);
    }

    public void dequeue()
    {
        dll.RemoveFromHead();
    }
    public void Print()
    {
        dll.PrintList();
    }

    public static void main(String[] args) {

        LFIFOQuequeclass dLLQueue =new LFIFOQuequeclass();
        Random rnd = new Random(100);
        for(int i=0; i < 5; i++){
            dLLQueue.enqueue(rnd.nextInt(101));
        }
        dLLQueue.Print();
        System.out.println("dequeing");
        dLLQueue.dequeue();
        dLLQueue.Print();
        System.out.println("Enter a number to append");
        dLLQueue.enqueue(Integer.parseInt(new Scanner(System.in).nextLine()));
        dLLQueue.Print();
        System.out.println("removing a number");
        dLLQueue.dequeue();
        dLLQueue.Print();

    }

}
