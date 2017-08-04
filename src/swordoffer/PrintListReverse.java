package swordoffer;

import java.util.Stack;

import lianxi.linkedlist.ListNode;

/**
 *������ 5 �� ��β��ͷ��ӡ����
 *��Ŀ������һ�������ͷ��㣬��β��ͷ��������ӡ��ÿ������ֵ��
 * @author Administrator
 *
 */
public class PrintListReverse {
  public static void main(String[] args) {
	  ListNode node1=new ListNode();
	  ListNode node2=new ListNode();
	  ListNode node3=new ListNode();
	  node1.setData(1);
	  node2.setData(2);
	  node3.setData(3);
	  node1.setNext(node2);
	  node2.setNext(node3);	
	  printListNodeReverse(node1);
}
  //����һ(ʹ��ջ)
  public static void printListReverst(ListNode headNode){
	  Stack<ListNode>  stack =  new Stack<>();
	  while(headNode!=null){
		  stack.push(headNode);
		  headNode = headNode.getNext();
	  }
	  while(!stack.isEmpty()){
		  System.out.println(stack.pop().getData());
	  }
  }
  //���������ݹ�ʵ��
  public static void printListNodeReverse(ListNode headNode){
	  if(headNode!=null){
		  if(headNode.getNext()!=null){
			  printListNodeReverse(headNode.getNext());
		  }
	  }
	  System.out.println(headNode.getData());
	  
  }
}
