import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> gList;

    public Graph() {
        gList = new ArrayList<Vertex>();
    }

    public void findNeighbors() {

        for (int i = 0; i < gList.size(); i++) {
            Vertex v = gList.get(i);
            System.out.println(v.name + "=>");
            for (Vertex x : v.vList) {
                System.out.println(v.vList.get(x.ID) + "=>");
            }

            System.out.println("null");
        }

    }

    public void printAdjacentList(Vertex v){
        v.printAdjacentList();
    }

    public Vertex search(int id){
        for(Vertex v : gList){
            if(v.ID == id){
                return v;
            }
        }
        return null;
    }

}
