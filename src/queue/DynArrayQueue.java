package queue;

import javax.xml.crypto.Data;

/**
 * 基于动态循环数组实现队列
 * @author star
 * 空间复杂度O(n)
 * 时间复杂度O(1)
 */
public class DynArrayQueue  {
   private int front;//对头
   private int rear;//对尾
   private int capacity;
   private int[] array;
   
   public DynArrayQueue(){
	   capacity = 1;
	   front  = -1;
	   rear = -1;
	   array = new int[1];
	   
   }
   
   public static DynArrayQueue createDynArrayQueue(){
      return new DynArrayQueue();	   
   }
   //时间复杂度O(1)
   public  boolean isEmpty(){
	   return (front==-1);
   } 
   //时间复杂度O(1)
   public boolean isFull(){
	   return ((rear+1)%capacity ==front);
	 
   }
   //时间复杂度O(1)
   public int getQueueSize(){
	   if(front== -1) return 0;
	   int size = (capacity-front+rear+1)%capacity;
	   if(size==0){return capacity;}else{return size;}
	 
   }
   /**
    * 重置Queue的capacity
    * 复制原数组数据
    */
   private void resizeQueue(){
	   int initCapacity = capacity;
	   capacity*=2;
	   int[] oldArray = array;
	   array = new int[this.capacity];
	   for(int i=0;i<oldArray.length;i++){
		   array[i] = oldArray[i];
	   }
	   if(rear<front){
		   for(int i=0;i<front;i++){
			   array[i+initCapacity] = this.array[i];
			   array[i] = 0;
		   }
		   rear = rear+initCapacity;
	   }
   }
   /**
    * 入队
    * @param data
    * @throws QueueOverflowException
    * 时间复杂度O(1)
    */
   public void enQueue(int data) throws QueueOverflowException{
	   if(isFull()){
		  resizeQueue();
	   }else{
		   rear = (rear+1)&capacity;
		   array[rear] = data;
		   if(front==-1){
			   front = rear;
		   }
	   }
   }
   /**
    * 出对
    * @return
    * @throws EmptyQueueException
    * 时间复杂度O(1)
    */
   public int deQueue() throws EmptyQueueException{
	   int data = 0;
	   if(isEmpty()){
		   throw new EmptyQueueException("Queue Empty");   
	   }else{
		  data = array[front];
		  if(front==rear){
			  front = rear-1;
		  }else{
			  front = (front+1)%capacity;
		  }
		  
	   }
	   return data;
   }
}
