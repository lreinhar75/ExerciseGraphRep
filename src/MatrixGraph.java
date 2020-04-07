import java.util.ArrayList;

public class MatrixGraph {
    boolean[][] connections;
    int[][] weights;
    MatrixGraph(int vertices) {
        connections= new  boolean[vertices][vertices];
        for (int i=0;i<vertices;i++) {
            for (int j = 0; j < vertices; j++) {
                connections[i][j] = false;
            }
        }
        weights=new int[vertices][vertices];
    }
    public void addEdge(int from, int to, int cost){
        connections[from][to]=true;
        weights[from][to]=cost;
    }
    // A utility function to print the adjacency list
    // representation of graph
    public void printGraph() {
         //Uncomment when above functions are handled
        for (int fromv = 0; fromv < connections.length; fromv++) {
            System.out.print(" Edges from Vertex: " + (fromv));

           for (int tov = 0; tov < connections.length; tov++) {
                if (connections[fromv][tov])
                    System.out.print("  To  " + (tov ));
            }
            System.out.println("\n");
        }
    }

/*    public int[] Dijkstra(int source) {
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
    }*/
}

class AdjacencyGraph {
    ArrayList<Vertex> Vertices;
    public AdjacencyGraph() {
        // construct a list of Vertices
        Vertices=new ArrayList<Vertex>();
    }

    // A utility function to print the adjacency list
    // representation of graph
    public void printGraph() {
 //Uncomment when above is made;
        Vertex currentv;

        for (int v = 0; v < Vertices.size(); v++) {
            currentv = Vertices.get(v);
            System.out.print("\n Edges from Vertex: " + currentv.Name );
            for (int e = 0; e < currentv.getOutEdges().size(); e++) {

                System.out.print("  To  " + currentv.getOutEdges().get(e).getTovertex().Name);
            }
            System.out.println("\n");
        }
    }

    public void addvertex(Vertex v) {
        Vertices.add(v);
        // add vertex to graph
    }

    public void newedge(Vertex from, Vertex to, int dist) {
        if(!(Vertices.contains(from) && Vertices.contains(to)))
            return;
        Edge  e= new Edge(from,to);

            e.weight=dist;
      // make new edge
    }
    public void BFS(Vertex start )
    {

    }


}

class Vertex{
    public String Name;
    public ArrayList<Edge> OutEdges;
    public int color=0;
    public Vertex prev=null;
    public int level = 0;
    public Vertex(String id){
        Name=id;
        OutEdges=new ArrayList<Edge>();
    }
    public void addOutEdge(Edge outedge){
         OutEdges.add(outedge);
    }
    public ArrayList<Edge> getOutEdges(){
        return OutEdges;
    }
}

class Edge{
    Vertex fromvertex;
    Vertex tovertex;
    int weight =1;
    public  Vertex getTovertex(){// Fill in
         return tovertex; }
    public Edge(Vertex from, Vertex to){
        fromvertex=from;
        tovertex=to;
        fromvertex.addOutEdge(this);
    }
}

