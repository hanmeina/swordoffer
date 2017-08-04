package lianxi.linkedlist;

import java.time.Period;

public class DLLnodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DLLnode dlLnode1  =  new DLLnode(1);
      DLLnode dlLnode2 = new DLLnode(2);
      DLLnode dlLnode3 = new DLLnode(3);
      dlLnode1.setNext(dlLnode2);
      dlLnode2.setPrevious(dlLnode1);
      dlLnode2.setNext(dlLnode3);
      dlLnode3.setPrevious(dlLnode2);     
      //int length = getDLLLength(dlLnode1);
      //System.out.println("length"+length);
//    DLLnode  nodeToInsert = new DLLnode(10);
//    DLLnode insertNode = DLLInsert(dlLnode1,nodeToInsert,4);
//    System.out.println(getDLLLength(insertNode));
//    while(insertNode!=null){
//    	System.out.println(insertNode.getData());
//    	insertNode = insertNode.getNext();
//    }
    
   DLLnode deleteNode =  DLLDelete(dlLnode1, 1);
   while(deleteNode!=null){
 	   System.out.println(deleteNode.getData());
 	  deleteNode = deleteNode.getNext();
   }
	}
   
	
     /**
      * 求双向链表的长度
      * @param headNode
      * @return
      * 时间复杂度O(n),空间复杂度 O(1)  创建临时变量 currentNode
      */
	private static int getDLLLength(DLLnode headNode){
		int length=0;
		DLLnode currentNode = headNode;
		while(currentNode!=null){
			//System.out.println(currentNode.getData());
			length++;
			currentNode = currentNode.getNext(); 			
 		}
		return length;
		
	}
	
     /**
      * 插入链表
      * @param headNode
      * @param nodeToInsert
      * @param position
      * @return
      * 时间复杂度O(n),空间复杂度 O(1)  创建临时变量 
      */
	private static DLLnode DLLInsert(DLLnode headNode,DLLnode nodeToInsert,int position){
		if(headNode==null){//链表为空时插入
			return nodeToInsert;
		}
		
		int size = getDLLLength(headNode);
		if(position>size+1 || position< 1){//插入位置不合法
			System.out.println("Position of nodeToInsert id invalid."+"The valid inputs are 1 to "+(size+1));
			return headNode;
		}
		
	   if(position ==1){//在表头插入
		   nodeToInsert.setNext(headNode);
           headNode.setPrevious(nodeToInsert);
           return nodeToInsert;
		   
	   }else{//在中间或者末尾插入
		   DLLnode  previousNode = headNode;
		   int count =1;
		   while(count < position-1){//寻找插入位置的前驱节点
			   previousNode = previousNode.getNext();
			   count ++;
		   }
		   DLLnode  currentNode = previousNode.getNext();
		   nodeToInsert.setNext(currentNode);
		   if(currentNode!=null){
			   currentNode.setPrevious(nodeToInsert);
		   }
		  
		   previousNode.setNext(nodeToInsert);
		   nodeToInsert.setPrevious(previousNode);		   
	   }
	   return headNode;		
	}
	/**
	 * 删除节点
	 * @param headNode
	 * @param position
	 * @return
	 */
	public static DLLnode DLLDelete(DLLnode headNode,int position){
		int size = getDLLLength(headNode);
		if(position > size || position<1){
			System.out.println("Position of nodeToInsert id invalid."+"The valid inputs are 1 to "+size);
			return headNode;	
		}
		if(position==1){//删除链表的第一个节点
			DLLnode currentNode = headNode.getNext();
			headNode = null;
			currentNode.setPrevious(null);
			return currentNode;
		}else{//删除中间节点或最后一个节点
			DLLnode previousNode = headNode;
			int count=1;
			while(count<position-1){//寻找插入位置的前驱节点
				previousNode = previousNode.getNext();
				count++;
				
			}
			DLLnode currentNode = previousNode.getNext();
			DLLnode laterNode = currentNode.getNext();
			previousNode.setNext(laterNode);
			if(laterNode!=null){
				laterNode.setPrevious(previousNode);
				currentNode = null;				
			}
			return headNode;
		}
		
	}
	
}
