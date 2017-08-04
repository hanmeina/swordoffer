package queue;

import javax.print.attribute.Size2DSyntax;

import stack.EmptyStackException;

import stack.LLStack;

/**
 * 队列的相关问题
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
		System.out.println("是否栈中的每队相邻数字是否是连续的："+flag);
	} catch (EmptyStackException | EmptyQueueException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
//	 
}
  /**
   * 借助栈实现队列元素的逆置
   * @param llQueue
   * @return
   * @throws EmptyQueueException
   * @throws EmptyStackException
   * 时间复杂度为O(n)
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
   * 给定一个栈，判断栈中的每队相邻数字是否是连续的，奇数时忽略栈顶元素
   * @param stack
   * @return
   * @throws EmptyStackException
   * @throws EmptyQueueException
   * 空间复杂度O(n),时间复杂度O(n)
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
