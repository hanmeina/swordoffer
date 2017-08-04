package lianxi.linkedlist;
//Ë«ÏòÁ´±í
public class DLLnode {
 private int data;
 private DLLnode  next;
 private DLLnode previous;
 public DLLnode(int data){
	 this.data = data;
 }
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public DLLnode getNext() {
	return next;
}
public void setNext(DLLnode next) {
	this.next = next;
}
public DLLnode getPrevious() {
	return previous;
}
public void setPrevious(DLLnode previous) {
	this.previous = previous;
}
 
}
