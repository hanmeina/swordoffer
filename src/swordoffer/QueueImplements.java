package swordoffer;

import java.util.Stack;
/**
 * 用两个栈实现一个队列，对尾插入，对头删除节点
 * @author Administrator
 *
 * @param <T>
 */
public class QueueImplements<T> {
   private Stack<T> stack1 =  new Stack<>();
   private Stack<T> stack2 =  new Stack<>();
   public void appendTail(T t){
	   stack1.push(t);
   }
   public T deleteHead() throws Exception{
	   
	   if(stack2.isEmpty()){
		   while(!stack1.isEmpty()){
			   stack2.push(stack1.pop());
		   }
	   }
	   if(stack2.isEmpty()){
		   throw new Exception("队列为空，不能删除");
	   }
	   return stack2.pop();
   }
   public static void main(String[] args) throws Exception {
	QueueImplements<String> queueImplements  = new QueueImplements<>();
	queueImplements.appendTail("1");
	queueImplements.appendTail("2");
	queueImplements.appendTail("3");
	System.out.println();queueImplements.deleteHead();
}
}
