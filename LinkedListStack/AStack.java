import java.util.*;

public class AStack  //LStack
{
    private LinkedList arr;

    public AStack()// public LStack()
    {
        arr = new LinkedList();
    }

    public void Push(char x) {
        arr.Append(x);
    }

    public char Pop() {
        return arr.Remove().item;
    }

    public void Print() {
        arr.PrintList();
    }

    public boolean isPalindrome() {
        Node node = arr.header;
        String palindromeCheck = String.valueOf(node.item);
        while (!(node.link == null)) {
            node = node.link;
            palindromeCheck = palindromeCheck + node.item;
        }
        int index = 0;
        int stringLength = palindromeCheck.length() - 1;
        while (index < stringLength) {
            if (palindromeCheck.charAt(index) != palindromeCheck.charAt(stringLength)) {
                return false;
            }
            index++;
            stringLength--;
        }
        return true;

    }

    public static void main(String args[]) {
        int num, flag;
        char p;
        AStack arrStack = new AStack();
        arrStack.Push('r');
        arrStack.Push('a');
        arrStack.Push('c');
        arrStack.Push('e');
        arrStack.Push('c');
        arrStack.Push('a');
        arrStack.Push('r');
        System.out.println("List of chars added");
        arrStack.Print();
        if (arrStack.isPalindrome() == true) {
            System.out.println(" \nis a palindrome");
        } else {
            System.out.println("\nnot a palindrome");
        }
        System.out.println("\nPoping first char");
        arrStack.Pop();
        arrStack.Print();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter 1 to pop, 2 to push, 3 to exit");
        flag = Integer.parseInt(new Scanner(System.in).nextLine());
        while (flag != 3) {
            if (flag == 1) {
                p = arrStack.Pop();
                System.out.printf("the item poped out is: %1s" + "\r\n", p);
                System.out.println("The items in the Stack  after poping are:");
                arrStack.Print();
            } else {
                if (flag == 2) {
                    System.out.println("Enter an char to push it into the Stack:");
                    p = sc.next().charAt(0);
                    arrStack.Push(p);
                    System.out.println("The items in the Stack  after pushing are:");
                    arrStack.Print();

                }
            }
            System.out.println("\nEnter 1 to pop, 2 to push, 3 to exit");
            flag = Integer.parseInt(new Scanner(System.in).nextLine());
        }
        System.out.println("End of testing. Goodbye!");
    }
}
