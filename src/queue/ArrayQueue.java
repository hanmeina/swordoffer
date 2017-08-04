package queue;

import java.lang.reflect.Array;

import javax.xml.crypto.Data;

/**
 * ���ڼ�ѭ������ʵ�ֶ���
 * @author star
 * �ռ临�Ӷ�O(n)
 * ʱ�临�Ӷ�O(1)
 */
public class ArrayQueue {
   private int front;//��ͷ
   private int rear;//��β
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
   //ʱ�临�Ӷ�O(1)
   public  boolean isEmpty(){
	   return (front==-1);
   } 
   //ʱ�临�Ӷ�O(1)
   public boolean isFull(){
	   return ((rear+1)%capacity ==front);
	 
   }
   //ʱ�临�Ӷ�O(1)
   public int getQueueSize(){
	   return ((capacity-front+rear+1)%capacity);
   }
   /**
    * ���
    * @param data
    * @throws QueueOverflowException
    * ʱ�临�Ӷ�O(1)
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
    * ����
    * @return
    * @throws EmptyQueueException
    * ʱ�临�Ӷ�O(1)
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
