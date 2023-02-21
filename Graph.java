import java.util.HashMap;

import java.util.*;
public class Graph {
    private HashMap<String,ArrayList<String>> adjlist=new HashMap<>();
    public boolean addvertex(String vertex){
        if(adjlist.get(vertex)==null){
         adjlist.put(vertex,new ArrayList<String>());
         return true;
        }
        return false;
    }
    public void printgraph(){
        System.out.println(adjlist);
    }
    public boolean addedge(String vertex1,String vretex2){
        if(adjlist.get(vertex1)!=null && adjlist.get(vretex2)!=null){
            adjlist.get(vertex1).add(vretex2);
            adjlist.get(vretex2).add(vertex1);
            return true;

        }
        return false;
    }
    public boolean removeedge(String vertex1,String vertex2){
         if(adjlist.get(vertex1)!=null && adjlist.get(vertex2)!=null){
        adjlist.get(vertex1).remove(vertex2);
        adjlist.get(vertex2).remove(vertex1);
        return true;

    }
    return false;

    }
    public boolean removevertex(String vertex){
        if(adjlist.get(vertex)==null)
        return false;
        for(String othervertex:adjlist.get(vertex)){
            adjlist.get(othervertex).remove(vertex);
        }
        adjlist.remove(vertex);
        return true;
    }
    public static void main(String args[]){
        Graph mygraph=new Graph();
        mygraph.addvertex("A");
        mygraph.printgraph();
        mygraph.addvertex("B");
        mygraph.addedge("A", "B");
        mygraph.printgraph();
        mygraph.addvertex("C");
        mygraph.addedge("B", "C");
        mygraph.addedge("A", "C");
        mygraph.printgraph();
        mygraph.removeedge("A", "B");
        mygraph.printgraph();
        mygraph.addvertex("D");
        mygraph.addedge("A", "B");
        mygraph.addedge("A", "D");
        mygraph.addedge("B", "D");
        mygraph.addedge("C", "D");
        mygraph.printgraph();
        System.out.println("Graph after removing vertex D");
        mygraph.removevertex("D");
        mygraph.printgraph();



    }
}
