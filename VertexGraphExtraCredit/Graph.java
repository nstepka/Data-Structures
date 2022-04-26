import java.util.ArrayList;

public class Graph {
    ArrayList<Vertex> gList;

    public Graph() {
        this.gList = new ArrayList<Vertex>();
    }

    public void findNeighbors(Vertex v) {

        for (int i = 0; i < gList.size(); i++) {
            v = gList.get(i);
            System.out.print(v.name + "=>");
            for (int x = 0; x< v.vList.size(); x++) {
                System.out.print(v.vList.get(x).name + "=>");
            }

            System.out.println("null");
        }

    }

    public void printAdjacentList(){
        System.out.println("Adjacent List");
        System.out.println("--------------------------");
        for (int i = 0; i < gList.size(); i++) {
            Vertex vPrint = gList.get(i);
            System.out.print(vPrint.name + " => ");
            for (int x = 0; x< vPrint.vList.size(); x++) {
                System.out.print(vPrint.vList.get(x).name + " => ");
            }

            System.out.println("null");
        }
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
