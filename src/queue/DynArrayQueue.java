package queue;

import javax.xml.crypto.Data;

/**
 * ���ڶ�̬ѭ������ʵ�ֶ���
 * @author star
 * �ռ临�Ӷ�O(n)
 * ʱ�临�Ӷ�O(1)
 */
public class DynArrayQueue  {
   private int front;//��ͷ
   private int rear;//��β
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
	   if(front== -1) return 0;
	   int size = (capacity-front+rear+1)%capacity;
	   if(size==0){return capacity;}else{return size;}
	 
   }
   /**
    * ����Queue��capacity
    * ����ԭ��������
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
    * ���
    * @param data
    * @throws QueueOverflowException
    * ʱ�临�Ӷ�O(1)
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
