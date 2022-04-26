import java.util.ArrayList;

public class Vertex {

    public char name;
    public int ID;

    ArrayList<Vertex> vList;

    public Vertex(char letter, int ID) {
        this.name = letter;
        this.ID = ID;
        this.vList = new ArrayList<Vertex>();

    }

    public void addVertex(Vertex vertexToAdd) {
        vList.add(vertexToAdd);
    }

    public void printAdjacentList() {
        vList.stream().forEach(s -> System.out.println("{ID: " + s.ID + " Name: " + s.name + "}"));
    }

    public String toString() {
        return "{ID: " + ID + " Name: " + name + "}";
    }

}
