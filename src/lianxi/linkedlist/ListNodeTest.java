package lianxi.linkedlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListNodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ListNode headNode = new ListNode(10);
       ListNode  LsitNodeNext1 = new ListNode(20);
       ListNode  LsitNodeNext2 = new ListNode(30);
       ListNode  LsitNodeNext3 = new ListNode(40);
       ListNode  LsitNodeNext4 = new ListNode(50);
       ListNode  LsitNodeNext5 = new ListNode(60);
       ListNode  headNode2 = new ListNode(22);
       ListNode  LsitNodeNext7 = new ListNode(33);
       headNode.setNext(LsitNodeNext1);
           LsitNodeNext1.setNext(LsitNodeNext2);
           LsitNodeNext2.setNext(LsitNodeNext3);
           LsitNodeNext3.setNext(LsitNodeNext4);
          LsitNodeNext4.setNext(LsitNodeNext5);
           headNode2.setNext(LsitNodeNext7);
         // LsitNodeNext7.setNext(LsitNodeNext3);
          // LsitNodeNext5.setNext(LsitNodeNext2);
      //  ListNode nodeToinsert = new ListNode(50);
      //  ListNode newListnode = insertInLinkedList(headNode,nodeToinsert,4);
          // ListNode newListnode = deleteNodeFromLinkedList(headNode, 1);
         //System.out.println(ListLength(headNode)); 
//         while(newListnode!=null){
//       	  System.out.println(newListnode.getData());
//      	  newListnode = newListnode.getNext();
//         } 
      //  int length = ListLength(headNode);
        
     //  System.out.println("the length of the ListNode is :"+length);
           
         //  deleteLinkedList(headNode);
       //ListNode listNode = NthNodeFromEnd(headNode,1);
	   //System.out.println(listNode.getData());
          // boolean flag = doesLinkedListContainsLoop(headNode);
         //ListNode listNode = findBeginofLoop(headNode);
         
           //System.out.println(findLoopLength(headNode));
//           ListNode newNode  = new ListNode(23);
//           ListNode listNode = insertInSortedList(headNode, newNode);
//          ListNode listNode = reverseListNode(headNode);
//           while(listNode!=null){
//        	  System.out.println(listNode.getData());
//        	  listNode = listNode.getNext();
//          }
           
//        ListNode listNode = findIntersectingNode(headNode, headNode2) ;
//        System.out.println(listNode.getData());
//          ListNode  listNode = findMiddleListNode(headNode);
//          System.out.println(listNode.getData());
        	//printFromEnd(headNode);	 
//           int  even = isLinkedListLengthEven(headNode2);
//	       if(even == 0 ){
//	    	   System.out.println("��ż��");
//	       }else{
//	    	   System.out.println("������");
//	       }
           
           
           
//           ListNode listNode = reversePairIterative(headNode);
//            while(listNode!=null){
//      	    System.out.println(listNode.getData());
//      	     listNode = listNode.getNext();
//             }
//          
//          ListNode  node1 = new ListNode(1);
//          ListNode  node2= new ListNode(2);
//          ListNode  node3 = new ListNode(3);
//          ListNode  node4= new ListNode(3);
//          ListNode  node5 = new ListNode(1);
//
//          node1.setNext(node2);
//          node2.setNext(node3);
//          node3.setNext(node4);
//          node4.setNext(node5);
//         boolean  flag = isPalindromeListNode(node1);
//        System.out.println(flag);
//           ListNode  listNode = reverseBlockOfKnodesInLinkedList(headNode,5);
//           while(listNode!=null){
//    	    System.out.println(listNode.getData());
//    	     listNode = listNode.getNext();
//           }
         ListNode listNode =  fractionlNodes(headNode, 4);
       	    System.out.println(listNode.getData());
         
	}
	/**
	 * Ѱ�ҷ����ڵ�
	 * @param headNode
	 * @param k
	 * @return
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	 */
	private static ListNode fractionlNodes(ListNode headNode,int k){
		ListNode modularNode=new ListNode();
		if(headNode==null){ return headNode;}
		if(k<=0){return null;}
        int i =1;
        for(;headNode!=null;headNode = headNode.getNext()){
        	if(i%k==0){
        		if(modularNode!=null){
        			modularNode = headNode;
        	    }else{
        		   modularNode = modularNode.getNext();
        	   }
        	}
        	i++;
        }
        return modularNode;
	}
	/**
	 * Ѱ�ҷ����ڵ�
	 * @param headNode
	 * @param k
	 * @return
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	 */
	private static ListNode fractionlNodes1(ListNode headNode,int k){
		ListNode modularNode = null;
		if(headNode==null){ return headNode;}
		if(k<=0){return null;}
        int i =1;
        for(;headNode!=null;headNode = headNode.getNext()){
        	if(i%k==0){
        		if(modularNode!=null){
        			modularNode = headNode;
        	    }else{
        		   modularNode = modularNode.getNext();
        	   }
        	}
        	i++;
        }
        return modularNode;
	}
	
	/**
	 * �ӱ�βѰ��ģ�ڵ�(����Ҵ������β��ʼ�ĵ�K��Ԫ������)
	 * @param headNode
	 * @param k
	 * @return
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	 */
	private static ListNode modularNodesfromEnd(ListNode headNode,int k){
		ListNode modularNode  = headNode;
		if(headNode==null){ return headNode;}
		if(k<=0){return null;}
        int i=0;
        for(i=0;i<k;i++){
        	if(headNode!=null){
        		headNode = headNode.getNext();
        	}else{
        	   return null;
        	}
        }
        
     while(headNode!=null){
    	 modularNode = modularNode.getNext();
    	 headNode = headNode.getNext();
     }
        return modularNode;
	}
	/**
	 * Ѱ��ģ�ڵ�
	 * @param headNode
	 * @param k
	 * @return
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	 */
	private static ListNode modularNodes(ListNode headNode,int k){
		ListNode modularNode  = null;
		if(headNode==null){ return headNode;}
		if(k<=0){return null;}
        int i =1;
        for(;headNode!=null;headNode = headNode.getNext()){
        	if(i%k==0){
        		modularNode = headNode;
        	}
        	i++;
        }
        return modularNode;
	}
	/**
	 * ��������
	 * @param headNode
	 * @return
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(n)
	 * 1.ɨ��ԭ��ʹ��ɢ�б�����ÿ���ڵ�x������һ���½ڵ�Y�������ݵ���x������
	 * ��x��Ϊ����������Ԫ�飨x,y������ɢ�б�
	 * 2���ٴ�ɨ�裬����������ĸ���ָ��
	 */
	private static ListNode Clone(ListNode headNode){
		ListNode x= headNode,y = null;
		Map<ListNode, ListNode>  Ht = new HashMap<>();
		while(x!=null){
			y = new ListNode();
			y.setData(x.getData());
			y.setNext(null);
			y.setRandom(null);
			Ht.put(x, y);
			x = x.getNext();
			
		}
	x= headNode;
	while(x!=null){
		y = Ht.get(x);
		y.setNext(Ht.get(x.getNext()));
		y.setRandom(Ht.get(x.getRandom()));
		x = x.getNext();		
	}
	//����������ı�ͷ�����ڵ�Y
	 return Ht.get(headNode);
	}
	
	/**
	 * ���������а���K���ڵ�Ŀ�
	 * @param headNode
	 * @param k
	 * @return
	 */
	public static ListNode reverseBlockOfKnodesInLinkedList(ListNode headNode,int k){
		ListNode tempNode = null,nextNode = null,currentNode = headNode,newHead = null;
		if(k==0 || k==1){return headNode;}
		//���ñ�ͷ�ڵ�
		if(hasKnodes(currentNode,k-1)){
			newHead = GetKPlusOneThNode(k-1, headNode);
			System.out.println("newHead.getData()"+newHead.getData());
		}else{
			newHead = headNode;
		}
		
	
		if(currentNode!=null && hasKnodes(currentNode, k)){
			System.out.println("currentNode1:"+currentNode.getData());
			tempNode = GetKPlusOneThNode(k, currentNode);
			System.out.println("temp:"+tempNode.getData());
			int i =0;
			//����K���ڵ������
			while(i<k){				
				nextNode = currentNode.getNext();
				
				System.out.println("nextNode:"+nextNode.getData());
				currentNode.setNext(tempNode);
				System.out.println("currentNode2:"+currentNode.getData());
				tempNode = currentNode;
				
				System.out.println("tempNode:"+tempNode.getData());
				currentNode = nextNode;
				System.out.println("currentNode3:"+currentNode.getData());
				i++;
				
			}
			
		}
		//newHead.setNext(tempNode);
		return newHead;
	}
	private static ListNode  GetKPlusOneThNode(int k,ListNode headNode){
		ListNode kthNode = headNode;
        if(headNode==null){return headNode;}
        int i;
		for(i=0;kthNode!=null && (i<k);i++,kthNode = kthNode.getNext());
			
		 if(i==k && kthNode!=null){
				return kthNode;
		 }
		
		return headNode.getNext();
	}
	/**
	 * ��������Ƿ���K���ڵ�
	 * @param headNode
	 * @param k
	 * @return
	 */
	static boolean hasKnodes(ListNode headNode,int k){
		int i;
		for(i=0;headNode!=null && (i<k);i++,headNode = headNode.getNext());
			System.out.println("i:"+i);
			System.out.println("k:"+k);
			if(i==k){
				System.out.println(i==k);
				return true;
			}
		
		return false;
		
	}
	/**
	 * ���������е����ڽڵ�
	 * @param headNode
	 * @return
	 * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	 */ 
	public static ListNode  exchangeAdjacentNodes(ListNode headNode){
		ListNode currentNode,tempNode,nextNode;
         currentNode = headNode;
         if(currentNode==null  || currentNode.getNext()==null){
        	 return currentNode;
         }
         headNode = currentNode.getNext();
         while(currentNode!=null && currentNode.getNext()!=null){
             nextNode = currentNode.getNext();
             currentNode.setNext(nextNode.getNext());
             tempNode  = currentNode.getNext();
             nextNode.setNext(currentNode);
             if(tempNode!=null && tempNode.getNext()!=null ){
            	 System.out.println("currentNode.getData():"+currentNode.getData());
            	 System.out.println("currentNode.next().getData():"+currentNode.getNext().getData());
            	 System.out.println("currentNode.next().next().getData():"+currentNode.getNext().getNext().getData());
            	 currentNode.setNext(currentNode.getNext().getNext());
            	
             }
             currentNode = tempNode;
           
        	 
         }
         return headNode;
         
	}
	/**
	 * �ж������Ƿ��ǻ���
	 * @param headNode
	 */
	public static boolean isPalindromeListNode(ListNode  headNode){
		//boolean flag = false;
		//System.out.println(ListLength(headNode));
		
		if(headNode == null && headNode.getNext() == null){return false;}
		//��ȡ������м�ڵ�
		ListNode middleNode = findMiddleListNode(headNode);
		//������ĺ�벿������
		ListNode reverseNode = reverseListNode(middleNode.getNext());
	    //middleNode.setNext(reverseNode);
	
		//System.out.println(reverseNode.getData());
		
	    ListNode currentNode = headNode;
	   
		  //�Ƚ������ǰ�벿�ֺͺ�벿��
			while( currentNode!=middleNode && reverseNode!=null && currentNode.getData() == reverseNode.getData() ){
				//System.err.println(currentNode.getNext().getData());
				System.out.println("currentNode.getData() == reverseNode.getData():"+(currentNode.getData()== reverseNode.getData()));
				

						currentNode = currentNode.getNext();			
						reverseNode = reverseNode.getNext();
					
						if(reverseNode==null){
							System.out.println("ѭ���������");
						}else{
							System.out.println();
						}
			
			} 
			
		return reverseNode == null;
           
	}
	 /**
	  * �����������
	  * @param headNode
	  * @return
	  * �����汾
	  */
	 private static ListNode reversePairIterative(ListNode headNode){
		
		  ListNode temp1  = null;
		  ListNode temp2  = null;
		 while(headNode != null && headNode.getNext() != null){
		
			 if(temp1 !=null){
				 temp1.getNext().setNext(headNode.getNext());					
			   }
			 
		  System.out.println("headNode:"+headNode.getData());
		 temp1 = headNode.getNext();
		 System.out.println("temp1:"+temp1.getData());
		 headNode.setNext(headNode.getNext().getNext());
		 temp1.setNext(headNode);
		 if (temp2 == null) {
			 temp2 = temp1;		
	     	}
	
		 headNode = headNode.getNext();
		 
		 }
		 return temp2;	  
	 }
	 
	
	/**
	  * �����������
	  * @param headNode
	  * @return
	  * �ݹ�汾
	  * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
	  */
	 private static ListNode reversePairRecursive(ListNode headNode){
		 
		  ListNode temp  = null;
		  if(headNode == null && headNode.getNext() == null){
			  return null;//�ݹ�Ļ��������ǵ�ǰ����Ϊ�ջ�ֻ��һ��Ԫ��
		  }else{
			  //���õ�һ��
			  temp = headNode.getNext();
			  headNode.setNext(temp.getNext());
			  temp.setNext(headNode);
			  headNode = temp;
			    //�������µĲ��ּ����ݹ���øú���
			     if(headNode.getNext().getNext()!=null){		  
			      headNode.getNext().setNext(  reversePairRecursive(headNode.getNext().getNext()));
			      }
			     return headNode;
		  }
		  
		  
	 }
	
	 
	 
	 
	//�������� ��ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)����������ʱ����currentNode
	public static int ListLength(ListNode headNode){
		int length = 0; 
		ListNode  currentNode = headNode;
		//System.out.println("����Ԫ��ֵΪ��"+currentNode.getData());
		while(currentNode!=null){
			length++;
			currentNode = currentNode.getNext();
			if(currentNode==null){
				//System.out.println("ѭ���������");
			}else{
				//System.out.println("����Ԫ��ֵΪ��"+currentNode.getData());
			}
			
		}
		return length;
	}
	
	//����ڵ�
	public static  ListNode insertInLinkedList(ListNode headNode,ListNode nodeToInsert ,int position){
	   if(headNode==null){//������Ϊ�գ�ֱ�Ӳ���
		   return nodeToInsert;
		   
	   }
	   int size = ListLength(headNode);
	   if(position>size+1 || position <1){
		   System.out.println("POsition of node to insert is invaid .The invalid inputs are 1 to"+(size+1));
		   return headNode;
	   }
	   
	   if(position==1){//�������ͷ����
		   nodeToInsert.setNext(headNode);
		   return nodeToInsert;
	   }else{//�������м����ĩβ����
		   ListNode previousNode = headNode;
		   int count = 1;
		   while(count<position-1){//ѭ�������Ҳ���ڵ��ǰ���ڵ�
			   
			   previousNode = previousNode.getNext();
			   count ++;
		   }
		   //�������м����
		   ListNode  currentNode = previousNode.getNext();
		   nodeToInsert.setNext(currentNode);
		   previousNode.setNext(nodeToInsert);   
	   }
	   return headNode;
	  
	}
	   //ɾ���ڵ�
		public static  ListNode deleteNodeFromLinkedList(ListNode headNode,int position){
		   int size = ListLength(headNode);
		   if(position>size || position <1){
			   System.out.println("POsition of node to insert is invaid .The invalid inputs are 1 to"+size);
			   return headNode;
		   }
		   
		   if(position==1){//�������ͷɾ��
			   ListNode currentNode=headNode.getNext();
			   headNode=null;
			   return currentNode;
		   }else{//�������м����ĩβɾ��			
			   ListNode previousNode = headNode;
			   int count = 1;
			   while(count<position-1){//ѭ��������ɾ���ڵ��ǰ���ڵ�
				   
				   previousNode = previousNode.getNext();
				   count ++;
			   }
			   //�������м�ɾ��
			   ListNode  currentNode = previousNode.getNext();
			 //  System.out.println(currentNode.getData());
			   previousNode.setNext(currentNode.getNext());
			   currentNode=null;
		   }
		   return headNode;
		  
		}
		
  //ɾ����������	
  public static void deleteLinkedList(ListNode head){
   	  ListNode auxilaryNode,iterator = head;
   	  while(iterator != null){
   		  auxilaryNode = iterator.getNext();
   		  iterator = null;
   		  iterator = auxilaryNode;
   	  }
   	  System.out.println(ListLength(iterator));
  }
  /**
   * �ҵ�����ĵ�����n���ڵ�
   * @param head
   * @param NthNode
   * @return
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
   */
  public  static ListNode NthNodeFromEnd(ListNode head,int NthNode){
	  ListNode  pTemp = head,pNthNode=null;
	  for(int count=1;count<NthNode;count++){
		  if(pTemp!=null){
			  pTemp = pTemp.getNext();//pTempָ������N���ڵ�
		  }
	  }
	  while(pTemp!=null){
		  if(pNthNode==null){
			  pNthNode=head;
		  }else{
			  pNthNode = pNthNode.getNext();
		  }
		  pTemp = pTemp.getNext();
	  }
	  if(pNthNode!=null){
		  return pNthNode;
	  }
	  return null;
  }
  
  /**
   * �ж��������Ƿ�������������ҵ�����ʼ�Ľڵ㣨�����ж���������������<���νṹ>��
   * �������Ľڵ�ָ��������������ֵ�Ԫ��<��ţ�ͽṹ>��
   * @param headNode
   * @return
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
   * ������һ���������ܣ������ܻ�����ڹ�
   */
  public static boolean doesLinkedListContainsLoop(ListNode headNode){
	  ListNode slowPtr = headNode,fastPtr = headNode;

	  if(headNode==null){
		  return false;
	  }
	  
	
	while(fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
		slowPtr = slowPtr.getNext();
		fastPtr = fastPtr.getNext().getNext();
		if(slowPtr==fastPtr){

			return true;
			
		}
	  
	}
	

	
//	slowPtr = slowPtr.getNext();
//	fastPtr = fastPtr.getNext().getNext();
//	while(slowPtr!=fastPtr && fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
//		slowPtr = slowPtr.getNext();
//		fastPtr = fastPtr.getNext().getNext();
//		if(slowPtr==fastPtr){
//			return true;
//	}
//
//	}
	return false;
  }
  
  
  /**
   * �ж��������Ƿ�������������ҵ�����ʼ�Ľڵ�
   * @param headNode
   * @return
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
 
   */
  public static ListNode findBeginofLoop(ListNode headNode){
	  ListNode slowPtr = headNode,fastPtr = headNode;
	  boolean  loopExists = false;
	  if(headNode==null){
		  return null;//����Ϊ��
	  }
	  
	//�ж��������Ƿ������
	while(fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
		slowPtr = slowPtr.getNext();
		fastPtr = fastPtr.getNext().getNext();
		if(slowPtr==fastPtr){
			loopExists = true;
			break;
		}
	  
	}
	//������
	if(loopExists){
		slowPtr = headNode;
		while(slowPtr!=fastPtr){
			fastPtr = fastPtr.getNext();
			slowPtr = slowPtr.getNext();
			
		}
		return slowPtr;//���ػ���ʼ�Ľڵ�
	}
   return null;//��������
  }
  
  /**
   * �ж��������Ƿ�����������ҷ��ػ��ĳ���
   * @param headNode
   * @return
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
 
   */
  public static int findLoopLength(ListNode headNode){
	  ListNode slowPtr = headNode,fastPtr = headNode;
	  boolean  loopExists = false;
	  int counter= 1;//ͳ�ƻ��ĳ���
	  if(headNode==null){
		  return 0;//�����
	  }
	  
	//�ж��������Ƿ������
	while(fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
		slowPtr = slowPtr.getNext();
		fastPtr = fastPtr.getNext().getNext();
		if(slowPtr==fastPtr){
			loopExists = true;
			break;
		}
	  
	} 
	//������
	if(loopExists){
		fastPtr = fastPtr.getNext();
		while(slowPtr!=fastPtr){
			counter ++;
			fastPtr = fastPtr.getNext();
		}
		return counter;//���ػ��Ĵ�С
	}
   return 0;//��������
  }
  /**
   * �����������в���һ���ڵ�
   * @param headNode
   * @param newNode
   * @return
   * ѭ�����������ҵ���ȷλ�ã�����ڵ�
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
   */
  public  static ListNode insertInSortedList(ListNode headNode,ListNode newNode){
	  ListNode  current = headNode;
	  ListNode temp = null;
	  if(headNode == null){return newNode;}
	  //�����ڵ㣬�ҵ����½ڵ�����ֵ��Ľڵ�
	  while(current!=null && current.getData()<newNode.getData()){
		  temp = current;
		  current = current.getNext();
	  }
	  //�ڸýڵ�ǰ����ڵ�
	  newNode.setNext(current);
	  temp.setNext(newNode);
	  return headNode;

	  
  }
  /**
   * ���õ�������
   * @param headNode
   * @return
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
   */
  public static ListNode  reverseListNode(ListNode headNode){
	  ListNode  temp = null,nextNode = null;
	  while(headNode!=null){
		  nextNode = headNode.getNext();
		  headNode.setNext(temp);
		  temp = headNode;
		   headNode = nextNode;
		   
	  }
	  return temp;
  }
  /**
   * ������������ĺϲ���
   * @param list1
   * @param list2
   * @return
   * ʱ�临�Ӷ�ΪO(max(m,n)) ,�ռ临�Ӷ�ΪO(1)
   */
  public static ListNode findIntersectingNode(ListNode list1,ListNode list2){
	  ListNode  head1 = list1,head2 = list2;
	  int l1 = 0,l2 = 0,diff = 0;//��������ĳ��ȣ�����������֮��
	  while(head1!=null){
		  l1++;
		  head1 = head1.getNext();
	  }
	  while(head2!=null){
		  l2++;
		  head2 = head2.getNext();
	  }
	  
	  if(l1<l2){
		  head1 = list2;
		  head2 = list1;
		  diff = l2 - l1;
	  }else{
		  head1 = list1;
		  head2 = list2;
		  diff = l1-l2;
		  
	  }
	  
	  //�ýϳ��������ƶ�diff��
	  for(int i = 0;i<diff;i++){
		  head1  = head1.getNext();		  
	  }
	  
	  //Ȼ����������ͬʱ�ƶ���ֱ�������������ָ��ֵ��ȵ����
	  
	  while(head1!=null && head2!=null){
		  if(head1 == head2){
			  return head1;
		  }
		  head1 = head1.getNext();
		  head2 = head2.getNext();
	  }
	  return null;  
  }
  
  /**
   * ����������м�ڵ�
   * @param headNode
   * @return
   * ʹ������ָ�룬һ����һ��������������һ�������βʱ���ڶ���ָ��պõ����м�ڵ�
   * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)
   */
 private static ListNode findMiddleListNode(ListNode headNode){
	 ListNode ptr1x ,ptr2x;
	 ptr1x = ptr2x =headNode;
	 int i = 0;//��������ָ����ƶ�
	 //����ѭ����ֱ����һ��ָ�뵽���β���ǵڶ�ָ������м�ڵ�
	 while(ptr1x.getNext()!=null){
		 if(i == 0){
			 ptr1x = ptr1x.getNext();//ֻ���Ƶ�һ��ָ��
			 i = 1;
		 }else if(i == 1){
			 ptr1x = ptr1x.getNext();//����ָ�붼����
			 ptr2x = ptr2x.getNext();
			 i = 0;
		 }
		 
	 }
	 return ptr2x;//�����м�ڵ�
	 
	 
 }
 /**
  * �ӱ�β�������
  * @param headNode
  * ʱ�临�Ӷ�ΪO(n) ,�ռ临�Ӷ�ΪO(1)������ջ�ռ�
  */
 public static void printFromEnd(ListNode headNode){
	 if(headNode == null){ return;}
	  printFromEnd(headNode.getNext());
	  System.out.println(headNode.getData()); 	 
 }
 /**
  * �ж�����������������ż��
  * @param headNode
  * @return
  * ��һ�������ָ��ÿ������ƶ������ڵ㣬������ָ��ֵΪ��,����������ż������ָ���β����������������
  * ʱ�临�Ӷ�O(n/2)Լ����O(n) ,�ռ临�Ӷ�ΪO(1)
  */
 private static int isLinkedListLengthEven(ListNode headNode){
	
	 while(headNode!=null && headNode.getNext()!=null){
		 headNode = headNode.getNext().getNext();
	 }
	 if(headNode==null){return 0;	 
	 }
	 return 1;
 }
 /**
  * �ϲ�������������Ϊһ��������
  * @param listNode1
  * @param listNode2
  * @return
  * ʱ�临�Ӷ�ΪO(n)
  */
 private static ListNode  MergeList(ListNode listNode1,ListNode listNode2){
	 ListNode resultNode = null;
	 if(listNode1 == null){return listNode2;}
	 if(listNode2==null){return listNode1;}
     if(listNode1.getData()<=listNode2.getData()){
    	 resultNode = listNode1;
    	 resultNode.setNext(MergeList(listNode1.getNext(), listNode2));
     }else{
    	 resultNode = listNode2;
    	 resultNode.setNext(MergeList(listNode1, listNode2.getNext()));
     }
     return resultNode;
 }
  
 

}
