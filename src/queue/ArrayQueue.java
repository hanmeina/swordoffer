package queue;

import java.lang.reflect.Array;

import javax.xml.crypto.Data;

/**
 * 基于简单循环数组实现队列
 * @author star
 * 空间复杂度O(n)
 * 时间复杂度O(1)
 */
public class ArrayQueue {
   private int front;//对头
   private int rear;//对尾
   private int capacity;
   private int[] array;
   public ArrayQueue(){}
   public ArrayQueue(int size){
	   capacity = size;
	   front  = -1;
	   rear = -1;
	   array = new int[size];
	   
   }
   
   public static ArrayQueue create(int size){
      return new ArrayQueue(size);	   
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
	   return ((capacity-front+rear+1)%capacity);
   }
   /**
    * 入队
    * @param data
    * @throws QueueOverflowException
    * 时间复杂度O(1)
    */
   public void enQueue(int data) throws QueueOverflowException{
	   if(isFull()){
		   throw new QueueOverflowException("Queue overflow");
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
