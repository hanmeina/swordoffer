package lianxi.linkedlist;

import java.util.List;

//单项链表类
public class ListNode {
  private int data;
  private ListNode next;
  private ListNode random;
  public ListNode(){

	  
  }
 
public ListNode(int data){
	  this.data = data;
	  
  }
public ListNode getRandom() {
	return random;
}
public void setRandom(ListNode random) {
	this.random = random;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public ListNode getNext() {
	return next;
}
public void setNext(ListNode next) {
	this.next = next;
}
  
}
