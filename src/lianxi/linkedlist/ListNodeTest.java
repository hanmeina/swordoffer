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
//	    	   System.out.println("是偶数");
//	       }else{
//	    	   System.out.println("是奇数");
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
	 * 寻找分数节点
	 * @param headNode
	 * @param k
	 * @return
	 * 时间复杂度为O(n) ,空间复杂度为O(1)
	 * 时间复杂度为O(n) ,空间复杂度为O(1)
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
	 * 寻找分数节点
	 * @param headNode
	 * @param k
	 * @return
	 * 时间复杂度为O(n) ,空间复杂度为O(1)
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
	 * 从表尾寻找模节点(与查找从链表表尾开始的第K个元素类似)
	 * @param headNode
	 * @param k
	 * @return
	 * 时间复杂度为O(n) ,空间复杂度为O(1)
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
	 * 寻找模节点
	 * @param headNode
	 * @param k
	 * @return
	 * 时间复杂度为O(n) ,空间复杂度为O(1)
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
	 * 复制链表
	 * @param headNode
	 * @return
	 * 时间复杂度为O(n) ,空间复杂度为O(n)
	 * 1.扫描原表，使用散列表，对于每个节点x，创建一个新节点Y，其数据等于x的数据
	 * 将x作为主键，将二元组（x,y）存入散列表。
	 * 2，再次扫描，设置新链表的各个指针
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
	//返回新链表的表头，即节点Y
	 return Ht.get(headNode);
	}
	
	/**
	 * 逆置链表中包含K个节点的块
	 * @param headNode
	 * @param k
	 * @return
	 */
	public static ListNode reverseBlockOfKnodesInLinkedList(ListNode headNode,int k){
		ListNode tempNode = null,nextNode = null,currentNode = headNode,newHead = null;
		if(k==0 || k==1){return headNode;}
		//设置表头节点
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
			//进行K个节点的逆置
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
	 * 检查链表是否含有K个节点
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
	 * 交换链表中的相邻节点
	 * @param headNode
	 * @return
	 * 时间复杂度为O(n) ,空间复杂度为O(1)
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
	 * 判断链表是否是会文
	 * @param headNode
	 */
	public static boolean isPalindromeListNode(ListNode  headNode){
		//boolean flag = false;
		//System.out.println(ListLength(headNode));
		
		if(headNode == null && headNode.getNext() == null){return false;}
		//获取链表的中间节点
		ListNode middleNode = findMiddleListNode(headNode);
		//将链表的后半部分逆置
		ListNode reverseNode = reverseListNode(middleNode.getNext());
	    //middleNode.setNext(reverseNode);
	
		//System.out.println(reverseNode.getData());
		
	    ListNode currentNode = headNode;
	   
		  //比较链表的前半部分和后半部分
			while( currentNode!=middleNode && reverseNode!=null && currentNode.getData() == reverseNode.getData() ){
				//System.err.println(currentNode.getNext().getData());
				System.out.println("currentNode.getData() == reverseNode.getData():"+(currentNode.getData()== reverseNode.getData()));
				

						currentNode = currentNode.getNext();			
						reverseNode = reverseNode.getNext();
					
						if(reverseNode==null){
							System.out.println("循环链表结束");
						}else{
							System.out.println();
						}
			
			} 
			
		return reverseNode == null;
           
	}
	 /**
	  * 逐对逆置链表
	  * @param headNode
	  * @return
	  * 迭代版本
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
	  * 逐对逆置链表
	  * @param headNode
	  * @return
	  * 递归版本
	  * 时间复杂度为O(n) ,空间复杂度为O(1)
	  */
	 private static ListNode reversePairRecursive(ListNode headNode){
		 
		  ListNode temp  = null;
		  if(headNode == null && headNode.getNext() == null){
			  return null;//递归的基本情形是当前链表为空或只有一个元素
		  }else{
			  //逆置第一对
			  temp = headNode.getNext();
			  headNode.setNext(temp.getNext());
			  temp.setNext(headNode);
			  headNode = temp;
			    //链表余下的部分继续递归调用该函数
			     if(headNode.getNext().getNext()!=null){		  
			      headNode.getNext().setNext(  reversePairRecursive(headNode.getNext().getNext()));
			      }
			     return headNode;
		  }
		  
		  
	 }
	
	 
	 
	 
	//求链表长度 ，时间复杂度为O(n) ,空间复杂度为O(1)，引入了临时变量currentNode
	public static int ListLength(ListNode headNode){
		int length = 0; 
		ListNode  currentNode = headNode;
		//System.out.println("链表元素值为："+currentNode.getData());
		while(currentNode!=null){
			length++;
			currentNode = currentNode.getNext();
			if(currentNode==null){
				//System.out.println("循环链表结束");
			}else{
				//System.out.println("链表元素值为："+currentNode.getData());
			}
			
		}
		return length;
	}
	
	//插入节点
	public static  ListNode insertInLinkedList(ListNode headNode,ListNode nodeToInsert ,int position){
	   if(headNode==null){//若链表为空，直接插入
		   return nodeToInsert;
		   
	   }
	   int size = ListLength(headNode);
	   if(position>size+1 || position <1){
		   System.out.println("POsition of node to insert is invaid .The invalid inputs are 1 to"+(size+1));
		   return headNode;
	   }
	   
	   if(position==1){//在链表表头插入
		   nodeToInsert.setNext(headNode);
		   return nodeToInsert;
	   }else{//在链表中间或者末尾插入
		   ListNode previousNode = headNode;
		   int count = 1;
		   while(count<position-1){//循环遍历找插入节点的前驱节点
			   
			   previousNode = previousNode.getNext();
			   count ++;
		   }
		   //在链表中间插入
		   ListNode  currentNode = previousNode.getNext();
		   nodeToInsert.setNext(currentNode);
		   previousNode.setNext(nodeToInsert);   
	   }
	   return headNode;
	  
	}
	   //删除节点
		public static  ListNode deleteNodeFromLinkedList(ListNode headNode,int position){
		   int size = ListLength(headNode);
		   if(position>size || position <1){
			   System.out.println("POsition of node to insert is invaid .The invalid inputs are 1 to"+size);
			   return headNode;
		   }
		   
		   if(position==1){//在链表表头删除
			   ListNode currentNode=headNode.getNext();
			   headNode=null;
			   return currentNode;
		   }else{//在链表中间或者末尾删除			
			   ListNode previousNode = headNode;
			   int count = 1;
			   while(count<position-1){//循环遍历找删除节点的前驱节点
				   
				   previousNode = previousNode.getNext();
				   count ++;
			   }
			   //在链表中间删除
			   ListNode  currentNode = previousNode.getNext();
			 //  System.out.println(currentNode.getData());
			   previousNode.setNext(currentNode.getNext());
			   currentNode=null;
		   }
		   return headNode;
		  
		}
		
  //删除整个链表	
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
   * 找到链表的倒数第n个节点
   * @param head
   * @param NthNode
   * @return
   * 时间复杂度为O(n) ,空间复杂度为O(1)
   */
  public  static ListNode NthNodeFromEnd(ListNode head,int NthNode){
	  ListNode  pTemp = head,pNthNode=null;
	  for(int count=1;count<NthNode;count++){
		  if(pTemp!=null){
			  pTemp = pTemp.getNext();//pTemp指向倒数第N个节点
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
   * 判断链表中是否包含环，并且找到环开始的节点（或者判断链表是正常结束<蛇形结构>，
   * 还是最后的节点指向链表中最早出现的元素<蜗牛型结构>）
   * @param headNode
   * @return
   * 时间复杂度为O(n) ,空间复杂度为O(1)
   * 龟兔在一个环上赛跑，兔子总会赶上乌龟
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
   * 判断链表中是否包含环，并且找到环开始的节点
   * @param headNode
   * @return
   * 时间复杂度为O(n) ,空间复杂度为O(1)
 
   */
  public static ListNode findBeginofLoop(ListNode headNode){
	  ListNode slowPtr = headNode,fastPtr = headNode;
	  boolean  loopExists = false;
	  if(headNode==null){
		  return null;//链表为空
	  }
	  
	//判断链表中是否包含环
	while(fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
		slowPtr = slowPtr.getNext();
		fastPtr = fastPtr.getNext().getNext();
		if(slowPtr==fastPtr){
			loopExists = true;
			break;
		}
	  
	}
	//环存在
	if(loopExists){
		slowPtr = headNode;
		while(slowPtr!=fastPtr){
			fastPtr = fastPtr.getNext();
			slowPtr = slowPtr.getNext();
			
		}
		return slowPtr;//返回环开始的节点
	}
   return null;//环不存在
  }
  
  /**
   * 判断链表中是否包含环，并且返回环的长度
   * @param headNode
   * @return
   * 时间复杂度为O(n) ,空间复杂度为O(1)
 
   */
  public static int findLoopLength(ListNode headNode){
	  ListNode slowPtr = headNode,fastPtr = headNode;
	  boolean  loopExists = false;
	  int counter= 1;//统计环的长度
	  if(headNode==null){
		  return 0;//链表空
	  }
	  
	//判断链表中是否包含环
	while(fastPtr.getNext()!=null && fastPtr.getNext().getNext()!=null){
		slowPtr = slowPtr.getNext();
		fastPtr = fastPtr.getNext().getNext();
		if(slowPtr==fastPtr){
			loopExists = true;
			break;
		}
	  
	} 
	//环存在
	if(loopExists){
		fastPtr = fastPtr.getNext();
		while(slowPtr!=fastPtr){
			counter ++;
			fastPtr = fastPtr.getNext();
		}
		return counter;//返回环的大小
	}
   return 0;//环不存在
  }
  /**
   * 在有序链表中插入一个节点
   * @param headNode
   * @param newNode
   * @return
   * 循环遍历链表，找到正确位置，插入节点
   * 时间复杂度为O(n) ,空间复杂度为O(1)
   */
  public  static ListNode insertInSortedList(ListNode headNode,ListNode newNode){
	  ListNode  current = headNode;
	  ListNode temp = null;
	  if(headNode == null){return newNode;}
	  //遍历节点，找到比新节点中数值大的节点
	  while(current!=null && current.getData()<newNode.getData()){
		  temp = current;
		  current = current.getNext();
	  }
	  //在该节点前插入节点
	  newNode.setNext(current);
	  temp.setNext(newNode);
	  return headNode;

	  
  }
  /**
   * 逆置单项链表
   * @param headNode
   * @return
   * 时间复杂度为O(n) ,空间复杂度为O(1)
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
   * 查找两个链表的合并点
   * @param list1
   * @param list2
   * @return
   * 时间复杂度为O(max(m,n)) ,空间复杂度为O(1)
   */
  public static ListNode findIntersectingNode(ListNode list1,ListNode list2){
	  ListNode  head1 = list1,head2 = list2;
	  int l1 = 0,l2 = 0,diff = 0;//两个链表的长度，两个链表长度之差
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
	  
	  //让较长链表先移动diff步
	  for(int i = 0;i<diff;i++){
		  head1  = head1.getNext();		  
	  }
	  
	  //然后两个链表同时移动，直到出现两个后继指针值相等的情况
	  
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
   * 查找链表的中间节点
   * @param headNode
   * @return
   * 使用连个指针，一个比一个快两倍，当第一个到达表尾时，第二个指针刚好到达中间节点
   * 时间复杂度为O(n) ,空间复杂度为O(1)
   */
 private static ListNode findMiddleListNode(ListNode headNode){
	 ListNode ptr1x ,ptr2x;
	 ptr1x = ptr2x =headNode;
	 int i = 0;//控制两个指针的移动
	 //不断循环，直到第一个指针到达表尾，那第二指针就是中间节点
	 while(ptr1x.getNext()!=null){
		 if(i == 0){
			 ptr1x = ptr1x.getNext();//只后移第一个指针
			 i = 1;
		 }else if(i == 1){
			 ptr1x = ptr1x.getNext();//两个指针都后移
			 ptr2x = ptr2x.getNext();
			 i = 0;
		 }
		 
	 }
	 return ptr2x;//返回中间节点
	 
	 
 }
 /**
  * 从表尾输出链表
  * @param headNode
  * 时间复杂度为O(n) ,空间复杂度为O(1)，用于栈空间
  */
 public static void printFromEnd(ListNode headNode){
	 if(headNode == null){ return;}
	  printFromEnd(headNode.getNext());
	  System.out.println(headNode.getData()); 	 
 }
 /**
  * 判断链表长度是奇数还是偶数
  * @param headNode
  * @return
  * 让一个链表的指针每次向后移动两个节点，最后，如果指针值为空,则链表长度是偶数，若指向表尾，则链表长度是奇数
  * 时间复杂度O(n/2)约等于O(n) ,空间复杂度为O(1)
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
  * 合并连个有序链表为一个新链表
  * @param listNode1
  * @param listNode2
  * @return
  * 时间复杂度为O(n)
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
