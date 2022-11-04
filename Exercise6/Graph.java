public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 11;
        int noEdges = 18;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "KL";
        myGraph.edge[0].dest = "Jehtro";

        // Edge 2
        myGraph.edge[1].src = "KL";
        myGraph.edge[1].dest = "Dapitilio";

        // Edge 3
        myGraph.edge[2].src = "KL";
        myGraph.edge[2].dest = "Jeremiah";

        // Edge 4
        myGraph.edge[3].src = "KL";
        myGraph.edge[3].dest = "Miguel";

        // Edge 5
        myGraph.edge[4].src = "KL";
        myGraph.edge[4].dest = "Aaron";
        
        // Edge 6
        myGraph.edge[5].src = "KL";
        myGraph.edge[5].dest = "Renzo";
        
        // Edge 7
        myGraph.edge[6].src = "KL";
        myGraph.edge[6].dest = "Nino";
        
        // Edge 8
        myGraph.edge[7].src = "KL";
        myGraph.edge[7].dest = "Eugene";
        
        // Edge 9
        myGraph.edge[8].src = "KL";
        myGraph.edge[8].dest = "Ryan";
        
        // Edge 10
        myGraph.edge[9].src = "KL";
        myGraph.edge[9].dest = "Stephen";
        
    
       
        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}
