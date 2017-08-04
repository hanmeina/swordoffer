package stack;

import java.util.Stack;

/**
 * ������ʵ��ջ
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
    * �ж�ջ�Ƿ�Ϊ��
    * @return
    */
   public boolean isEmpty(){
	   return (top==-1);
	   
   }
   /**
    * �ж�ջ�Ƿ�Ϊ��ջ
    * @return
    */
   public boolean isStackFull(){
	   //return (top == capacity-1);
	   return (top==array.length);
   }
   
   /**
    * ��ջ
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
    * ��ջ
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
	 * ɾ��ջ
	 */
	public void deleteStack(){
		top = -1;
	}
}
