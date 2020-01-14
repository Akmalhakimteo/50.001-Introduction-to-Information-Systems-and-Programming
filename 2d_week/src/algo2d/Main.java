package algo2d;

public class Main {

    public static void main(String[] args) {
        // Create a graph given in the above diagram
        Graph g = new Graph(5);
        g.addEdges(1, 0);
        g.addEdges(0, 2);
        g.addEdges(2, 1);
        g.addEdges(0, 3);
        g.addEdges(3, 4);
        g.createSCC();
        System.out.println("Following are strongly connected components "+ "in given graph ");
        System.out.println(g.createSCC());
    	char five = '5';
    	int tryfive = (int) five;
    	System.out.println(five == tryfive);
    	
    	
    }
    
    
}
