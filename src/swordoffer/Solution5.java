package swordoffer;

import java.util.Stack;

import javax.swing.Popup;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @author Administrator
 *
 */
public class Solution5 {
	static 	Stack<Integer>  stack1 = new Stack<Integer>();
    static    Stack<Integer> stack2 = new Stack<Integer>();	
    public static void main(String[] args) {
     push(1);
     push(2);
     push(3);
    
     System.out.println(pop());
     System.out.println(pop());
     push(4);
     System.out.println(pop()); 
     push(5);
     System.out.println(pop());
     System.out.println(pop()); 
      
     
	}
   public static  void push(int node) {
        stack1.push(node);
    }
    
    public static  int pop() {
    	if(!stack2.isEmpty()){
    		return stack2.pop();
    	}else{
    	while(!stack1.isEmpty()){
       	 stack2.push(stack1.pop());
        } 
    	}
		return stack2.pop();
    
    }
}
