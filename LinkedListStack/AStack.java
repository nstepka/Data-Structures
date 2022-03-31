import java.util.*;

public class AStack  //LStack
{
    private LinkedList<String> arr;
    private int top;
    private int size;


    public AStack(int Size)// public LStack()
    {
        arr = new LinkedList<String>();
        size = Size;
        top = -1;
    }


    public boolean Empty()
    {
        return top == -1;
    }

    public boolean Full()
    {
        return top == size - 1;
    }

    public void Push(String x)
    {
        if (Full() == false)
        {
            top = top + 1;
            arr.add(x);
        }
        else
        {
            System.out.println("The stack is full!");
        }
    }

    public String Pop()
    {
        if (Empty() == false)
        {
            String x = arr.remove(top);
            top = top - 1;
            return x;
        }
        else
        {
            System.out.println("The stack is empty!");
            return null;
        }
    }

    public void Print()
    {
        if (top == -1)
        {
            System.out.println("The stack is empty!");
        }
        else
        {
            for (int i = top; i >=0; i--)
            {
                System.out.println(arr.get(i));
            }
        }
    }
    public boolean palindromeCheck(String string){
        int index = 0;
        int stringLength = string.length()-1;
        while(index<stringLength) {
            if(string.charAt(index) != string.charAt(stringLength)){
                return false;
            }
        index++;
        stringLength--;
        }
        return true;
    }

    public static void main(String args[])
    {
        int num, flag;
        String p;
        AStack arrStack = new AStack(5);
        Random rnd = new Random(100);
        for (int i = 0; i <= 4; i++)
        {
            num = rnd.nextInt(101);
            arrStack.Push(Integer.toString(num));
        }

        arrStack.Print();

        System.out.println("Enter 1 to pop, 2 to push, 3 to exit, 4 for palindrome check");
        flag = Integer.parseInt(new Scanner(System.in).nextLine());
        while (flag != 3)
        {
            if (flag == 1)
            {
                p = arrStack.Pop();
                System.out.printf("the item poped out is: %1s" + "\r\n", p);
                System.out.println("The items in the Stack  after poping are:");
                arrStack.Print();
            }
            else
            {
                if (flag == 2)
                {
                    System.out.println("Enter characters to push it into the Stack:");
                    arrStack.Push(new Scanner(System.in).nextLine());
                    System.out.println("The items in the Stack  after pushing are:");
                    arrStack.Print();

                }
                if(flag == 4)
                {
                    System.out.println("Enter a string to see if its a palindrome");
                    if(arrStack.palindromeCheck(new Scanner(System.in).nextLine())){
                        System.out.println("the word is a palindrome");
                    }
                    else{
                        System.out.println("Not a palindrome");
                    }
                }
            }
            System.out.println("Enter 1 to pop, 2 to push, 3 to exit, 4 for palindrome check");
            flag = Integer.parseInt(new Scanner(System.in).nextLine());
        }
        System.out.println("End of testing. Goodbye!");
    }
}

