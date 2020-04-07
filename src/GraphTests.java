public class GraphTests {

    public static void main(String[] args) {
        // Create graph
        MatrixGraph matrixGraph = new MatrixGraph(7);
        matrixGraph.addEdge(0,1, 1);
        matrixGraph.addEdge(0,2, 5);
        matrixGraph.addEdge(0,4, 3);
        matrixGraph.addEdge(1,4, 1);
        matrixGraph.addEdge(1,5, 7);
        matrixGraph.addEdge(2,3, 1);
        matrixGraph.addEdge(3,4, 1);
        matrixGraph.addEdge(3,6, 1);
        matrixGraph.addEdge(4,2, 1);
        matrixGraph.addEdge(4,3, 3);
        matrixGraph.addEdge(4,5, 3);
        matrixGraph.addEdge(4,6, 4);
        matrixGraph.addEdge(5,6, 1);

        matrixGraph.printGraph();

 //       int[] path=matrixGraph.Dijkstra(0);
 //       matrixGraph.printPath(path,6);
        AdjacencyGraph adjacencyGraph = new AdjacencyGraph();
        Vertex a=new Vertex("1");
        adjacencyGraph.addvertex(a);
        Vertex b=new Vertex("2");
        adjacencyGraph.addvertex(b);
        Vertex c=new Vertex("3");
        adjacencyGraph.addvertex(c);
        Vertex d=new Vertex("4");
        adjacencyGraph.addvertex(d);
        Vertex e=new Vertex("5");
        adjacencyGraph.addvertex(e);
        Vertex f=new Vertex("6");
        adjacencyGraph.addvertex(f);
        Vertex g=new Vertex("7");
        adjacencyGraph.addvertex(g);
        adjacencyGraph.newedge(a,b,1);
        adjacencyGraph.newedge(a,c,5);
        adjacencyGraph.newedge(a,e,3);
        adjacencyGraph.newedge(b,e,1);
        adjacencyGraph.newedge(b,f,7);
        adjacencyGraph.newedge(c,d,1);
        adjacencyGraph.newedge(d,e,1);
        adjacencyGraph.newedge(d,g,1);
        adjacencyGraph.newedge(e,c,1);
        adjacencyGraph.newedge(e,d,3);
        adjacencyGraph.newedge(e,f,3);
        adjacencyGraph.newedge(e,g,4);
        adjacencyGraph.newedge(f,g,1);
        adjacencyGraph.printGraph();
        adjacencyGraph.BFS(a);
        adjacencyGraph.Dijkstra(a);
        adjacencyGraph.printPath(g);
        adjacencyGraph.printPath(f);
        adjacencyGraph.printPath(c);
        adjacencyGraph.printPath(b);
        adjacencyGraph.printPath(d);
    }
}
