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
      * ��˫������ĳ���
      * @param headNode
      * @return
      * ʱ�临�Ӷ�O(n),�ռ临�Ӷ� O(1)  ������ʱ���� currentNode
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
      * ��������
      * @param headNode
      * @param nodeToInsert
      * @param position
      * @return
      * ʱ�临�Ӷ�O(n),�ռ临�Ӷ� O(1)  ������ʱ���� 
      */
	private static DLLnode DLLInsert(DLLnode headNode,DLLnode nodeToInsert,int position){
		if(headNode==null){//����Ϊ��ʱ����
			return nodeToInsert;
		}
		
		int size = getDLLLength(headNode);
		if(position>size+1 || position< 1){//����λ�ò��Ϸ�
			System.out.println("Position of nodeToInsert id invalid."+"The valid inputs are 1 to "+(size+1));
			return headNode;
		}
		
	   if(position ==1){//�ڱ�ͷ����
		   nodeToInsert.setNext(headNode);
           headNode.setPrevious(nodeToInsert);
           return nodeToInsert;
		   
	   }else{//���м����ĩβ����
		   DLLnode  previousNode = headNode;
		   int count =1;
		   while(count < position-1){//Ѱ�Ҳ���λ�õ�ǰ���ڵ�
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
	 * ɾ���ڵ�
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
		if(position==1){//ɾ������ĵ�һ���ڵ�
			DLLnode currentNode = headNode.getNext();
			headNode = null;
			currentNode.setPrevious(null);
			return currentNode;
		}else{//ɾ���м�ڵ�����һ���ڵ�
			DLLnode previousNode = headNode;
			int count=1;
			while(count<position-1){//Ѱ�Ҳ���λ�õ�ǰ���ڵ�
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
