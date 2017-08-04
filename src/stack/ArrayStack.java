package stack;

import java.util.Stack;

/**
 * 简单数组实现栈
 * @author hanmeina
 *
 */
public class ArrayStack {
  
   private int top;
   private int capacity;
   private int[] array;
   public ArrayStack(){
	   capacity = 1;
	   array = new int[capacity];
	   top = -1;
   }
   /**
    * 判断栈是否为空
    * @return
    */
   public boolean isEmpty(){
	   return (top==-1);
	   
   }
   /**
    * 判断栈是否为满栈
    * @return
    */
   public boolean isStackFull(){
	   //return (top == capacity-1);
	   return (top==array.length);
   }
   
   /**
    * 入栈
    * @param data
    */
   public void push(int data){
	   if(isStackFull()){
		   System.out.println("Stack overflow");
		   }else{
			   array[++top]=data;
		   }
   }
   /**
    * 出栈
    * @return
    */
	public int pop(){
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}else{
			return (array[top--]);
		}
		
	}
	/**
	 * 删除栈
	 */
	public void deleteStack(){
		top = -1;
	}
}
