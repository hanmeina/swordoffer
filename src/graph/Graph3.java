package graph;

import java.lang.reflect.Array;
import java.util.Queue;
import java.util.Stack;

import queue.ArrayQueue;
import queue.EmptyQueueException;
import queue.QueueOverflowException;



/**
 * 邻接矩阵表示图，广度优先遍历
 * @author Administrator
 *
 */

public class Graph3 {
	private final int maxVertices = 20;
	private Vertex vertexList[]; 
    private int adjMatrix[][];
    private int vertexCount;
    private ArrayQueue theQueue;
    public Graph3(int vertexCount){
    	vertexList  = new Vertex[maxVertices];
	    adjMatrix = new int[maxVertices][maxVertices];
	    vertexCount = 0;
	   for(int y=0;y<maxVertices;y++){
		    for(int x=0;x<maxVertices;x++){
		    	adjMatrix[x][y] = 0;
		    }
	   }
	   theQueue = new ArrayQueue();
  }
    public void addVertex(char lab){
    	vertexList[vertexCount++] = new Vertex(lab);
    	
    }
  public  void addEdge(int start,int end){
	 
		  adjMatrix[start][end] = 1;
		  adjMatrix[end][start] = 1;
		  
	  
	  
	  
  }
  
  public void displayVertex(int v){
	  System.err.println(vertexList[v].label);
  }
  
  public void dfs() throws EmptyQueueException, QueueOverflowException{
	  vertexList[0].visited = true;
	  displayVertex(0);
	  theQueue.enQueue(0);
	  int v2;
	  while(!theQueue.isEmpty()){
		  int v1 = theQueue.deQueue();
          while((v2 =getAdjUnvisitedVertex(v1))!=-1){
        	  vertexList[v2].visited=true;
        	  displayVertex(v2);
        	  theQueue.enQueue(v2);
          }	  
		  
	  }
	  for(int j=0;j<vertexCount;j++){//初始化标记
		  vertexList[j].visited=false;
	  }
  }
  
  public int getAdjUnvisitedVertex(int v){
	  for(int j=0;j<vertexCount;j++){
		  if(adjMatrix[v][j]==1 && vertexList[j].visited==false){
			  return j;
		  }
		  
	  }
	  return -1;
  }
//  public  void removeEdge(int i,int j){
//	  if(i>=0 && i<vertexCount && j>0 && j<vertexCount){
//		  adjMatrix[i][j] = false;
//		  adjMatrix[j][i] = false;
//		  
//	  }
//	  
//	  
//  }
//  
//  public  boolean isEdge(int i,int j){
//	  if(i>=0 && i<vertexCount && j>0 && j<vertexCount){
//		 return  adjMatrix[i][j];
//		  
//	  }else{
//		  return false;
//	  }
//
//  }
  
}
