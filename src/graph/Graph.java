package graph;

import java.util.Stack;



/**
 * 邻接矩阵表示图，深度优先遍历
 * @author Administrator
 *
 */
class Vertex{
	public char  label;
	public boolean visited;
	public Vertex(char lab){
		label = lab;
		visited = false;
		
	}
}
public class Graph {
	private final int maxVertices = 20;
	private Vertex vertexList[]; 
    private int adjMatrix[][];
    private int vertexCount;
    private Stack theStack;
    public Graph(int vertexCount){
    	vertexList  = new Vertex[maxVertices];
	    adjMatrix = new int[maxVertices][maxVertices];
	    vertexCount = 0;
	   for(int y=0;y<maxVertices;y++){
		    for(int x=0;x<maxVertices;x++){
		    	adjMatrix[x][y] = 0;
		    }
	   }
	   theStack = new Stack();
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
  
  public void dfs(){
	  vertexList[0].visited = true;
	  displayVertex(0);
	  theStack.push(0);
	  while(!theStack.isEmpty()){
		  int v = getAdjUnvisitedVertex((int) theStack.peek());
		  if(v==-1){
			  theStack.pop();
		  }else{
			  vertexList[v].visited=true;
			  displayVertex(v);
			  theStack.push(v);
			  
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
