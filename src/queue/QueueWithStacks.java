package queue;

import stack.EmptyStackException;
import stack.LLStack;
/**
 * 用两个栈实现队列
 * @author Administrator
 *
 */
public class QueueWithStacks {
 private LLStack stack1;
 private LLStack stack2;
 public QueueWithStacks(){
	 stack1 = new LLStack();
	 stack2 = new LLStack();
 }
 public boolean isEmpty() throws EmptyStackException{
	  if(stack2.isEmpty()){
		  while(!stack1.isEmpty()){
			  stack2.push(stack1.pop());
		  }
	  }
	  return stack2.isEmpty();
 }
 
 public void enQueue(int data){
	 stack1.push(data);
 }
 
 public int deQueue() throws EmptyStackException{
	 if(!stack2.isEmpty()){
		 return stack2.pop();
	 }else{
		 while(!stack1.isEmpty()){
			 stack2.push(stack1.pop());			 
		 }
		 return stack2.pop();
	 }
 }
 
 
}
