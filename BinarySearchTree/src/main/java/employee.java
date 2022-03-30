import java.util.Scanner;
public class employee
{
    public int id;
    public String name;
    public double salary;

    public void Input()
    {
        System.out.println("Enter name: ");
        name = new Scanner(System.in).nextLine();
        System.out.println("Enter ID: ");
        id = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Enter Salary: ");
        salary = Double.parseDouble(new Scanner(System.in).nextLine());
    }
    public void Output()
    {
        System.out.printf("Name: %1s, ID: %2s, Grade: %3$.2f ", name, id, salary);
    }
    public String toString()
    {
        return String.format("Name: %s, ID: %s, Salary: $%.2f ", name, id, salary);
    }

}
