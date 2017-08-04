package graph;

import java.util.ArrayList;

import lianxi.linkedlist.ListNode;
/**
 * аз╫с╠М
 * @author Administrator
 *
 */
public class Graph2 {
    private ArrayList<Integer> vertices;
    private ListNode[] edges;
    private int vertexCount = 0;
    public Graph2(int vertexCount){
    	this.vertexCount = vertexCount;
    	vertices = new ArrayList<>();
    	edges = new ListNode[vertexCount];
    	for(int i=0;i<vertexCount;i++){
    		vertices.add(i);
    		edges[i] = new ListNode();
    	}
    }
    
    public void addEdge(int source,int destination){
    	int i = vertices.indexOf(source);
    	int j = vertices.indexOf(destination);
//    	for(i != -1,j != -1){
//    		 edges[i].insertAtBegining(destination);
//  		 edges[i].insertAtBegining(source);
//    	} 
    }
}
