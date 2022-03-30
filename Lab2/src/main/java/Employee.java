//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Employee {
    public int id;
    public String name;
    public float salary;

    public Employee() {
    }

    public Employee(int id, String name, float sal) {
        this.id = id;
        this.name = name;
        this.salary = sal;
    }

    public void Input() {
        System.out.println("Enter ID, Name and salary :");
        this.id = Integer.parseInt((new Scanner(System.in)).nextLine());
        this.name = (new Scanner(System.in)).nextLine();
        this.salary = Float.parseFloat((new Scanner(System.in)).nextLine());
    }

    public void Output() {
        System.out.printf("Name: %1s, ID: %2d, Salary: %3f ", this.name, this.id, this.salary);
    }

    public String toString() {
        return String.format("%1s %2d %3.2f\n", this.name, this.id, this.salary);
    }
}
