package lianxi.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class CLLNodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建循环列表
         CLLNode  headNode = new CLLNode(4);
         CLLNode  cllNode1 = new CLLNode(15);
         CLLNode  cllNode2 = new CLLNode(7);
         CLLNode  cllNode3 = new CLLNode(40);
         CLLNode  cllNode4 = new CLLNode(23);
         CLLNode  cllNode5 = new CLLNode(69);
         headNode.setNext(cllNode1);
         cllNode1.setNext(cllNode2);
         cllNode2.setNext(cllNode3);
         cllNode3.setNext(cllNode4);
         cllNode4.setNext(cllNode5);
         cllNode5.setNext(headNode);
        // int length = CircularListLength(headNode);
        // System.out.println(length);
      // printCircularListData(headNode);
       //  CLLNode  nodeToInsert = new CLLNode(50);
       // CLLNode cllNode =   insertAtEndCll(headNode, nodeToInsert);
         //CLLNode cllNode =   insertAtBeginCll(headNode, nodeToInsert);
	   // printCircularListData(cllNode);
        // deleteLastNodeFromCll(headNode);
       //  deleteFrontNodeFromCll(headNode);
         
       //CLLNode headNode = new CLLNode(0);
       CLLNode headNode1 = new CLLNode(0);
       List<CLLNode> cllNodes = splitList(headNode,headNode1,headNode1);
       System.out.println("cllNodes.size():"+cllNodes.size());
       for(CLLNode cllNode :cllNodes){
    	   printCircularListData(cllNode);
    	   System.out.println("-------------------------");
       }
         
         
	}
	
	/**
	 * 将循环链表分成两个长度相等的部分,奇数偶数节点之分
	 * @param headNode
	 * @param headNode1
	 * @param headNode2
	 * 时间复杂度为O(n) ,空间复杂度为O(1)
	 */
	public static List<CLLNode> splitList(CLLNode headNode,CLLNode headNode1,CLLNode headNode2){
	   List<CLLNode>  cllNodes = new ArrayList<>();
		CLLNode  slowPtr = headNode ,fastPtr = headNode;
	    if(headNode == null){return null;}
	    //如果链表中有奇数个节点，那么fastPtr.getNext()，
	     //如果是偶数，那么fastPtr.getNext().getNext()将指向head.
        while(fastPtr.getNext()!=headNode && fastPtr.getNext().getNext()!=headNode){
        	fastPtr = fastPtr.getNext().getNext();
        	slowPtr = slowPtr.getNext();        
        	
        }  
        //如果链表中有偶数个元素，那么再向后移动一次
        if(fastPtr.getNext().getNext()==headNode){
              fastPtr = fastPtr.getNext();       	
        }
        //设置前半部分的headnode指针
        headNode1 = headNode;
        //设置后半部分的headnode指针
        if(headNode.getNext()!=headNode){
        	headNode2 = slowPtr.getNext();
        }
         //把后半部分变成环
        fastPtr.setNext(headNode2);
        //把前半部分变成环
		slowPtr.setNext(headNode1);
		
		cllNodes.add(headNode1);
		cllNodes.add(headNode2);
		return cllNodes;
	}
	
	/**
	 * 求循环链表的长度
	 * @param headNode
	 * @return
	 * 时间复杂度为O(n) ,空间复杂度为O(1)，引入了临时变量currentNode
	 */
	public  static  int CircularListLength(CLLNode headNode){
		int length = 0;
		
		 CLLNode currentNode = headNode;
		 while(currentNode!=null){
			 length ++;
           currentNode = currentNode.getNext();
           if(currentNode==headNode){
        	          break;
           }
		 }
		
		return length;
		
	}
	/**
	 * 输出循环链表
	 * @param headNode
	 * 时间复杂度为O(n) ,空间复杂度为O(1)，创建临时变量
	 */
  public static void  printCircularListData(CLLNode headNode){
	  CLLNode  currentNode = headNode;
	  while(currentNode!=null){
		  System.out.println(currentNode.getData());
	     currentNode = currentNode.getNext();
	     if(currentNode==headNode)  break;
	  }
	  System.out.println("("+currentNode.getData()+")headNode");
  }
  /**
   * 在循环链表的表尾插入节点
   * @param headNode
   * @param nodeToInsert
   * 时间复杂度为O(n) ,空间复杂度为O(1)，创建临时变量
   */
  public static  CLLNode   insertAtEndCll(CLLNode headNode,CLLNode nodeToInsert){
	   CLLNode  currentNode = headNode;
	   while(currentNode.getNext()!=headNode){//循环找表尾节点
		  //currentNode.setNext(currentNode.getNext());  
		   currentNode = currentNode.getNext();
		  System.out.println("A");
	   }
	   //创建新节点，并且初始化其next指向自己
	   nodeToInsert.setNext(nodeToInsert);
	   if(headNode == null){
		   headNode = nodeToInsert;
		   System.out.println("B");
		  return headNode; 
	   }else{
		  
		   nodeToInsert.setNext(headNode);
		   currentNode.setNext(nodeToInsert);
		   System.out.println("c");
	   }   
      return headNode;	   
  }
  /**
   * 在循环链表的表头插入节点
   * @param headNode
   * @param nodeToInsert
   * 时间复杂度为O(n) ,空间复杂度为O(1)，创建临时变量
   */
  public static  CLLNode   insertAtBeginCll(CLLNode headNode,CLLNode nodeToInsert){
	   CLLNode  currentNode = headNode;
	   while(currentNode.getNext()!=headNode){//循环找表尾节点
		  //currentNode.setNext(currentNode.getNext());  
		   currentNode = currentNode.getNext();
		  System.out.println("A");
	   }
	   //创建新节点，并且初始化其next指向自己
	   nodeToInsert.setNext(nodeToInsert);
	   if(headNode == null){
		   headNode = nodeToInsert;
		   System.out.println("B");
		  return headNode; 
	   }else{
		  
		   nodeToInsert.setNext(headNode);
		   currentNode.setNext(nodeToInsert);
		   headNode = nodeToInsert;
		   System.out.println("c");
	   }   
      return headNode;	   
  }
  /**
   * 删除循环链表的最后一个节点
   * @param headNode
   * @return
   * 时间复杂度为O(n) ,空间复杂度为O(1)，创建临时变量
   */
  public static  void deleteLastNodeFromCll(CLLNode headNode){
	  CLLNode temp = headNode;
	  CLLNode currentNode = headNode;
	  if(headNode==null){
		  System.out.println("list Empty");
		  return ;
	  }
	  
	  while(currentNode.getNext()!=headNode){
		  temp = currentNode;//找到表尾节点的前驱节点
		  currentNode = currentNode.getNext();//找表尾节点
	  }
	   temp.setNext(headNode);
	   currentNode = null;
	  
	 printCircularListData(headNode); 
	 return ;
  }
  
  /**
   * 删除循环链表的表头节点
   * @param headNode
   * @return
   * 时间复杂度为O(n) ,空间复杂度为O(1)，创建临时变量
   */
  public static  void deleteFrontNodeFromCll(CLLNode headNode){
	  CLLNode temp = headNode;
	  CLLNode currentNode = headNode;
	  if(headNode==null){
		  System.out.println("list Empty");
		  return ;
	  }
	  
	  while(currentNode.getNext()!=headNode){
		  currentNode = currentNode.getNext();//找表尾节点
	  }
	   currentNode.setNext(headNode.getNext());
	   //更改表头指针
	   headNode =headNode.getNext();
	   temp = null;
	   printCircularListData(headNode); 
	   return ;
  }
  
}
