package lianxi.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class CLLNodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ѭ���б�
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
	 * ��ѭ������ֳ�����������ȵĲ���,����ż���ڵ�֮��
	 * @param headNode
	 * @param headNode1
	 * @param headNode2
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	 */
	public static List<CLLNode> splitList(CLLNode headNode,CLLNode headNode1,CLLNode headNode2){
	   List<CLLNode>  cllNodes = new ArrayList<>();
		CLLNode  slowPtr = headNode ,fastPtr = headNode;
	    if(headNode == null){return null;}
	    //������������������ڵ㣬��ôfastPtr.getNext()��
	     //�����ż������ôfastPtr.getNext().getNext()��ָ��head.
        while(fastPtr.getNext()!=headNode && fastPtr.getNext().getNext()!=headNode){
        	fastPtr = fastPtr.getNext().getNext();
        	slowPtr = slowPtr.getNext();        
        	
        }  
        //�����������ż����Ԫ�أ���ô������ƶ�һ��
        if(fastPtr.getNext().getNext()==headNode){
              fastPtr = fastPtr.getNext();       	
        }
        //����ǰ�벿�ֵ�headnodeָ��
        headNode1 = headNode;
        //���ú�벿�ֵ�headnodeָ��
        if(headNode.getNext()!=headNode){
        	headNode2 = slowPtr.getNext();
        }
         //�Ѻ�벿�ֱ�ɻ�
        fastPtr.setNext(headNode2);
        //��ǰ�벿�ֱ�ɻ�
		slowPtr.setNext(headNode1);
		
		cllNodes.add(headNode1);
		cllNodes.add(headNode2);
		return cllNodes;
	}
	
	/**
	 * ��ѭ������ĳ���
	 * @param headNode
	 * @return
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)����������ʱ����currentNode
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
	 * ���ѭ������
	 * @param headNode
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)��������ʱ����
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
   * ��ѭ������ı�β����ڵ�
   * @param headNode
   * @param nodeToInsert
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)��������ʱ����
   */
  public static  CLLNode   insertAtEndCll(CLLNode headNode,CLLNode nodeToInsert){
	   CLLNode  currentNode = headNode;
	   while(currentNode.getNext()!=headNode){//ѭ���ұ�β�ڵ�
		  //currentNode.setNext(currentNode.getNext());  
		   currentNode = currentNode.getNext();
		  System.out.println("A");
	   }
	   //�����½ڵ㣬���ҳ�ʼ����nextָ���Լ�
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
   * ��ѭ������ı�ͷ����ڵ�
   * @param headNode
   * @param nodeToInsert
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)��������ʱ����
   */
  public static  CLLNode   insertAtBeginCll(CLLNode headNode,CLLNode nodeToInsert){
	   CLLNode  currentNode = headNode;
	   while(currentNode.getNext()!=headNode){//ѭ���ұ�β�ڵ�
		  //currentNode.setNext(currentNode.getNext());  
		   currentNode = currentNode.getNext();
		  System.out.println("A");
	   }
	   //�����½ڵ㣬���ҳ�ʼ����nextָ���Լ�
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
   * ɾ��ѭ����������һ���ڵ�
   * @param headNode
   * @return
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)��������ʱ����
   */
  public static  void deleteLastNodeFromCll(CLLNode headNode){
	  CLLNode temp = headNode;
	  CLLNode currentNode = headNode;
	  if(headNode==null){
		  System.out.println("list Empty");
		  return ;
	  }
	  
	  while(currentNode.getNext()!=headNode){
		  temp = currentNode;//�ҵ���β�ڵ��ǰ���ڵ�
		  currentNode = currentNode.getNext();//�ұ�β�ڵ�
	  }
	   temp.setNext(headNode);
	   currentNode = null;
	  
	 printCircularListData(headNode); 
	 return ;
  }
  
  /**
   * ɾ��ѭ������ı�ͷ�ڵ�
   * @param headNode
   * @return
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)��������ʱ����
   */
  public static  void deleteFrontNodeFromCll(CLLNode headNode){
	  CLLNode temp = headNode;
	  CLLNode currentNode = headNode;
	  if(headNode==null){
		  System.out.println("list Empty");
		  return ;
	  }
	  
	  while(currentNode.getNext()!=headNode){
		  currentNode = currentNode.getNext();//�ұ�β�ڵ�
	  }
	   currentNode.setNext(headNode.getNext());
	   //���ı�ͷָ��
	   headNode =headNode.getNext();
	   temp = null;
	   printCircularListData(headNode); 
	   return ;
  }
  
}
