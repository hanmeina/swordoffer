package swordoffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
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
//    while(headNode!=null){//��ͷ��β
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
 * �ӱ�β�������
 * @param headNode
 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)������ջ�ռ�
 */
public static void printFromEnd(ListNode headNode){
	 if(headNode == null){ return;}
	  printFromEnd(headNode.next);
	  System.out.println(headNode.val); 	 
}
/**
 * ��ջ��ʵ�֣�����ȳ�
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
