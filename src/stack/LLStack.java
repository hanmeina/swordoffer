package stack;



import lianxi.linkedlist.ListNode;
import tree.BinaryTreeNode;

/**
 * 链表实现栈
 * @author hanmeina
 *
 */
public class LLStack{
	
  private ListNode headNode;
  public LLStack(){
	  this.headNode = new ListNode();
  }
  /**
   * 入栈
   * @param data
   */
  public void push(int data){
	  if(headNode==null){
		  headNode = new ListNode(data);
	  }else if(String.valueOf(headNode.getData())==null){
		  headNode.setData(data);
	  }else{
		  ListNode listNode = new ListNode(data);
		  listNode.setNext(headNode);
		  headNode = listNode;
	  }
	  
  }
  
  /**
   * 出站
   * @return
   * @throws EmptyStackException
   */
  public int pop() throws EmptyStackException{
	  if(headNode==null){
		  throw new EmptyStackException("Stack is empty");
	  }else{
		  int data = headNode.getData();
		  headNode = headNode.getNext();
		  return data;
	  }
	  
  }
  /**
   * 取栈顶元素
   * @return
   */
  public int top(){
	  if(headNode==null){
		  return 0;
	  }else{
		  return headNode.getData();
	  }
  }
  /**
   * 判断栈是否为空
   * @return
   */
  public boolean isEmpty(){
	  if(headNode==null){
		  return  true;
		  }else{
			  return false;
		  }
	  
  }
  /**
   * 删除栈
   * 时间复杂度O(n )
   */
  public void deleteStack(){
	  headNode = null;
  }
  /**
   * 入栈
   * @param root
   */
public void push(BinaryTreeNode root) {
	// TODO Auto-generated method stub
	  if(headNode==null){
		  headNode = new ListNode(root.getData());
	  }else if(String.valueOf(headNode.getData())==null){
		  headNode.setData(root.getData());
	  }else{
		  ListNode listNode = new ListNode(root.getData());
		  listNode.setNext(headNode);
		  headNode = listNode;
	  }
}
/**
 * 出站
 * @return
 * @throws EmptyStackException
 */
public BinaryTreeNode pop2() throws EmptyStackException{
	BinaryTreeNode binaryTreeNode = new BinaryTreeNode();
	  if(headNode==null){
		  throw new EmptyStackException("Stack is empty");
	  }else{
		  int data = headNode.getData();
		  headNode = headNode.getNext();
		  binaryTreeNode.setData(data);
		  return binaryTreeNode;
	  }
	  
}
}
