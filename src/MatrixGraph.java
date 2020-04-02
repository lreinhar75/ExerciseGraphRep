import java.util.ArrayList;

public class MatrixGraph {

    MatrixGraph(int vertices) {
    }
    public void addEdge(int from, int to, int cost){
    }
    // A utility function to print the adjacency list
    // representation of graph
    public void printGraph() {
        /* //Uncomment when above functions are handled
        for (int fromv = 0; fromv < matrixgraph.length; fromv++) {
            System.out.print(" Edges from Vertex: " + (fromv));

           for (int tov = 0; tov < matrixgraph.length; tov++) {
                if (matrixgraph[fromv][tov] > 0)
                    System.out.print("  To  " + (tov ));
            }
            System.out.println("\n");
        }
        */

    }
    public int[] Dijkstra(int source) {
        int[] shortestdistance; //= new int[matrixgraph.length];
        int[] predecessor;// = new int[matrixgraph.length];
        boolean[] handled;// = new boolean[matrixgraph.length];
 //Code goes here

        return new int[7];
    }
    public int findMin(int[] dist, boolean[] done)
    {
        int vertex=0;
        int value=200;
        for (int i = 0; i < dist.length ; i++) {
            if (dist[i]<value && !done[i])
            {
                vertex=i;
                value=dist[i];
            }
        }
        return vertex;
    }

    public void printPath(int[] predecesor, int target)
    {
        int current=target;
        System.out.print("\n");
        while (current!=-1 && current!=predecesor[current])
        {
            System.out.print((current+1) + " from ");
            current=predecesor[current];
        }
    }
}

class AdjacencyGraph {

    public AdjacencyGraph() {
    }

    // A utility function to print the adjacency list
    // representation of graph
    public void printGraph() {
/* //Uncomment when above is made;
        Vertex currentv;

        for (int v = 0; v < vertices.size(); v++) {
            currentv = vertices.get(v);
            System.out.print("\n Edges from Vertex: " + currentv.Name );
            for (int e = 0; e < currentv.getOutEdges().size(); e++) {
                System.out.print("  To  " + currentv.getOutEdges().get(e).getTovertex().Name);
            }
            System.out.println("\n");
        }*/
    }

    public void addvertex(Vertex v) {
    }

    public void newedge(Vertex from, Vertex to, int dist) {

    }


}

class Vertex{
    public String Name;
public Vertex(String id){}
}

class Edge{

    public Edge(Vertex from, Vertex to){
    }
}

