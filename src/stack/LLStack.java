package stack;



import lianxi.linkedlist.ListNode;
import tree.BinaryTreeNode;

/**
 * ����ʵ��ջ
 * @author hanmeina
 *
 */
public class LLStack{
	
  private ListNode headNode;
  public LLStack(){
	  this.headNode = new ListNode();
  }
  /**
   * ��ջ
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
   * ��վ
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
   * ȡջ��Ԫ��
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
   * �ж�ջ�Ƿ�Ϊ��
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
   * ɾ��ջ
   * ʱ�临�Ӷ�O(n )
   */
  public void deleteStack(){
	  headNode = null;
  }
  /**
   * ��ջ
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
 * ��վ
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
