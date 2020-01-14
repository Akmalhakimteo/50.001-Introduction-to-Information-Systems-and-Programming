package algo2d;

import java.util.*;

public class Graph {
    private int _v; // number of vertices
    private LinkedList<Integer>[] adjList; // array of linked lists
    private LinkedList<LinkedList<Integer>> sccList = new LinkedList<>(); // linked list of integer arrays

    public Graph(int v) {
        _v = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++){
            adjList[i] = new LinkedList<>();
        }
    }

    public LinkedList<LinkedList<Integer>> getSCC(){
        return sccList;
    }

    private void DFS(int v, boolean[] visited, LinkedList<Integer> ls){
        visited[v] = true;
        ls.add(v);
        for (int n : adjList[v]) {
            if (!visited[n])
                DFS(n, visited, ls);
        }
    }

    private Graph transpose(){
        Graph g = new Graph(this._v);
        for (int i = 0; i < this._v; i++){
            for (Integer integer : adjList[i]) {
                g.adjList[integer].add(i);
            }
        }
        return g;
    }

    private void pushToStack(int v, boolean[] visited, Stack s){
        visited[v] = true;
        for (int n : adjList[v]) {
            if (!visited[n])
                pushToStack(n, visited, s);
        }

        s.push(v);
    }

    public void addEdges(int a, int b){
        adjList[a].add(b);
    }

    public LinkedList<LinkedList<Integer>> createSCC(){
        Stack s = new Stack();

        boolean[] boolean1 = new boolean[this._v];

        // mark the vertices as false for FIRST DFS
        for (int i = 0; i < this._v; i++){
            boolean1[i] = false;
        }

        // fill the stack in accordance to the vertices' finishing time
        for (int i = 0; i < this._v; i++){
            if (!boolean1[i]){
                pushToStack(i, boolean1, s);
            }
        }

        // get a transpose graph
        Graph g = this.transpose();

        boolean[] boolean2 = new boolean[this._v];

        // mark the vertices as false for SECOND DFS
        for (int i = 0; i < this._v; i++){
            boolean2[i] = false;
        }

        // do the second DFS in the order specified by stack
        while (!s.empty()){
            int vertex = (int)s.pop();
            if (!boolean2[vertex]){
                LinkedList<Integer> ls = new LinkedList<>();
                g.DFS(vertex, boolean2, ls);
                g.sccList.add(ls);
            }
        }
        System.out.println(g.sccList);
        return g.sccList;
    }
}
