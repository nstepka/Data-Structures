import java.util.ArrayList;
import java.util.Scanner;

public class MainGraphVertex {
    public static Graph graph;
    public static Vertex v[] = new Vertex[6];

    public static void main(String[] args) {
        BuildGraph();

        int menuID = 0;
        while(menuID != 4) {

            display();
            menuID = Integer.parseInt(new Scanner(System.in).next());
            if(menuID == 1) {
                graph.printAdjacentList();
            }
            if(menuID == 2){
                System.out.print("Enter the ID of the vertex to search (0-5):");
                Vertex vSearch = graph.search(Integer.parseInt(new Scanner(System.in).next()));
                if(vSearch != null){
                    System.out.println(vSearch);

                }else{
                    System.out.println("Vertex not found");
                }
            }
            if(menuID == 3){
                System.out.println("Search");
                System.out.println("------");
                System.out.print("Enter the ID of the Vertex to print its neighbors: ");
                Vertex vSearch = graph.search(Integer.parseInt(new Scanner(System.in).next()));
                if(vSearch != null){
                    vSearch.printAdjacentList();
                } else {
                    System.out.println("Vertex not found");
                }

            }
        }

    }
    public static void display()
    {
        System.out.println("--------------------------");
        System.out.println("      1. Adjacent List");
        System.out.println("      2. Search");
        System.out.println("      3. Find Neighbors");
        System.out.println("      4. Exit");
        System.out.print("      Enter choice of 1-4:");
    }

    public static void BuildGraph(){
        graph = new Graph();
        v[0] = new Vertex('A', 0);
        v[1] = new Vertex('B', 1);
        v[2] = new Vertex('C', 2);
        v[3] = new Vertex('D', 3);
        v[4] = new Vertex('E', 4);
        v[5] = new Vertex('F', 5);
        for(int i = 0; i < 6; i++){
            graph.gList.add(v[i]);
        }
        //A=0 B=1 C=2 D=3 E=4 F=5
        //a connects to c
        v[0].addVertex(v[2]);
        //b connects to c and f
        v[1].addVertex(v[2]);
        v[1].addVertex(v[5]);
        //c connects to e
        v[2].addVertex(v[4]);
        //d connects to a and e
        v[3].addVertex(v[0]);
        v[3].addVertex(v[4]);
        //e connects to c and f
        v[4].addVertex(v[5]);
        v[4].addVertex(v[2]);
    }
}
