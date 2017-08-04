package queue;


import lianxi.linkedlist.CLLNode;
import tree.BinaryTreeNode;
/**
 * 基于链表实现队列
 * @author star
 *
 */
public class LLQueue{
	private CLLNode frontNode;//headNode;
	private CLLNode rearNode;//lastNode;
	
	public LLQueue(){
		this.frontNode =null;
		this.rearNode = null;
	}
	
	public static LLQueue createLLQueue(){
		return new LLQueue();
	}
	
	public boolean isEmpty(){
		return (frontNode==null);
	}
	/**
	 * 入队
	 * @param data
	 */
	public void enQueue(int data){
		CLLNode newNode  = new CLLNode(data);
		if(rearNode!=null){
			rearNode.setNext(newNode);
			
		}
		rearNode = newNode;
		if(frontNode==null){
			frontNode = rearNode;
		}
	}
	
	 /**
	  * 出对
	  * @return int
	  * @throws EmptyQueueException
	  */
	public int deQueue() throws EmptyQueueException{
		 int data = 0;
	  	if(isEmpty())
	  	{
	  		throw new EmptyQueueException("Queue empty!");
	  	}else{
	  		data = frontNode.getData();  
	  	    frontNode = frontNode.getNext();
	  	}	
	 return data;  	
	}

	public void enQueue(BinaryTreeNode root) {
		CLLNode newNode  = new CLLNode(root.getData());
		if(rearNode!=null){
			rearNode.setNext(newNode);
			
		}
		rearNode = newNode;
		if(frontNode==null){
			frontNode = rearNode;
		}
	}
	 /**
	  * 出对
	  * @return int
	  * @throws EmptyQueueException
	  */
	public BinaryTreeNode deQueue1() throws EmptyQueueException{
		BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
		int data = 0;
	  	 if(isEmpty())
	  	{
	  		throw new EmptyQueueException("Queue empty!");
	  	}else{
	  		data = frontNode.getData();  
	  	    frontNode = frontNode.getNext();
	  	    binaryTreeNode.setData(data);
	  	}	
	 return binaryTreeNode;  	
	}
}