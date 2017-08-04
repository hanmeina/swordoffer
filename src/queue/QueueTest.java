package queue;

import javax.print.attribute.Size2DSyntax;

import stack.EmptyStackException;

import stack.LLStack;

/**
 * ���е��������
 * @author Administrator
 *
 */
public class QueueTest {
  public static void main(String[] args) throws EmptyStackException {
//	 LLQueue llQueue = new LLQueue();
//	 llQueue.enQueue(10);
//	 llQueue.enQueue(20);
//	 llQueue.enQueue(30);
//	 llQueue.enQueue(40);
//	 try {
//	 	LLQueue reverseQueue = reverseQueue(llQueue);
//		
//	     while(!reverseQueue.isEmpty()){
//	    	
//	     System.out.println(	"reverseQueue:"+reverseQueue.deQueue());
//	    	
//	    } 
//	     
//	 
//	 } catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	 LLStack stack = new LLStack();
	 stack.push(4);
	 stack.push(5);
	 stack.push(-2);
	 stack.push(-3); 
	 stack.push(11);
	 stack.push(10);
	 stack.push(5);
	 stack.push(6);
	 stack.push(20);
	 while(!stack.isEmpty()){
		 System.out.println(stack.pop());
		 
	 }
	 
	 try {
		boolean flag = checkStackPariwiseOrser(stack);
		System.out.println("�Ƿ�ջ�е�ÿ�����������Ƿ��������ģ�"+flag);
	} catch (EmptyStackException | EmptyQueueException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
//	 
}
  /**
   * ����ջʵ�ֶ���Ԫ�ص�����
   * @param llQueue
   * @return
   * @throws EmptyQueueException
   * @throws EmptyStackException
   * ʱ�临�Ӷ�ΪO(n)
   */
  public static  LLQueue reverseQueue(LLQueue llQueue) throws EmptyQueueException, EmptyStackException{
	 LLStack llStack  = new LLStack(); 
	 while(!llQueue.isEmpty()){
		 llStack.push(llQueue.deQueue());
	 }
	 while(!llStack.isEmpty()){
		 llQueue.enQueue(llStack.pop());		 
	 }
	 return llQueue;
	  
  }
  
  /**
   * ����һ��ջ���ж�ջ�е�ÿ�����������Ƿ��������ģ�����ʱ����ջ��Ԫ��
   * @param stack
   * @return
   * @throws EmptyStackException
   * @throws EmptyQueueException
   * �ռ临�Ӷ�O(n),ʱ�临�Ӷ�O(n)
   */
  public static boolean checkStackPariwiseOrser(LLStack stack) throws EmptyStackException, EmptyQueueException{
	   LLQueue queue  =  new LLQueue();
	   boolean pairwiseOrdered = true;
	

	   while(!stack.isEmpty()){
		   queue.enQueue(stack.pop());
	   }
	   while(!queue.isEmpty()){
		   stack.push(queue.deQueue());
	   }
	   while(!stack.isEmpty()){
		  // int initdata  = stack.pop();
		   int data2 = stack.pop();
		   queue.enQueue(data2);
		   if(!stack.isEmpty()){
			   int data3 = stack.pop();
			   queue.enQueue(data3);
			   if(Math.abs(data2-data3)!=1){
				   pairwiseOrdered = false;
			   }
			   
		   }
	   }
	   

	   while(!queue.isEmpty()){
		   stack.push(queue.deQueue());	   
	   }
	  return pairwiseOrdered;
  }
  
}
