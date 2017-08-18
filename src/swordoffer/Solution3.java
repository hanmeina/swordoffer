package swordoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * @author Administrator
 *
 */
public class Solution3 {
public static void main(String[] args) {
	ListNode headNode = new ListNode(10);
    ListNode  LsitNodeNext1 = new ListNode(20);
    ListNode  LsitNodeNext2 = new ListNode(30);
    ListNode  LsitNodeNext3 = new ListNode(40);
    ListNode  LsitNodeNext4 = new ListNode(50);
    ListNode  LsitNodeNext5 = new ListNode(60);
    headNode.next = LsitNodeNext1;
        LsitNodeNext1.next = LsitNodeNext2;
        LsitNodeNext2.next = LsitNodeNext3;
        LsitNodeNext3.next = LsitNodeNext4;
       LsitNodeNext4.next = LsitNodeNext5;
//    while(headNode!=null){//从头到尾
//      System.out.println(headNode.val);
//      headNode = headNode.next;
//    }
       //printFromEnd(headNode);
   ArrayList<Integer> list  =   printListFromTailToHead(headNode);
 for(int i=0;i<list.size();i++){
	 System.out.println(list.get(i));
 }
}
/**
 * 从表尾输出链表
 * @param headNode
 * 时间复杂度为O(n) ,空间复杂度为O(1)，用于栈空间
 */
public static void printFromEnd(ListNode headNode){
	 if(headNode == null){ return;}
	  printFromEnd(headNode.next);
	  System.out.println(headNode.val); 	 
}
/**
 * 用栈来实现，后进先出
 * @param listNode
 * @return
 */
public static   ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    Stack<Integer> stack= new Stack<>();
    while(listNode!=null){
    	stack.push(listNode.val);
    	listNode = listNode.next;
    }
    ArrayList<Integer> arrayList = new ArrayList<>();

    while(!stack.empty()){
    	arrayList.add(stack.pop());
    	//System.out.println(stack.pop());
    
    }	
	return arrayList;
}
}
