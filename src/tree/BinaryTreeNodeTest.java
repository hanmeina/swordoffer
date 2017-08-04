package tree;

import java.nio.channels.ScatteringByteChannel;

import javax.naming.directory.SearchControls;
import javax.print.attribute.standard.Finishings;

import org.omg.CORBA.PUBLIC_MEMBER;

import queue.EmptyQueueException;
import queue.LLQueue;
import stack.EmptyStackException;
import stack.LLStack;

/**
 * �������ı����Լ��������
 * @author Administrator
 *
 */
public class BinaryTreeNodeTest {
   public static void main(String[] args) {
	BinaryTreeNode  root  =  new BinaryTreeNode();
	root.setData(1);
	BinaryTreeNode  left1  =  new BinaryTreeNode();
	left1.setData(2);
	root.setLeft(left1);
	BinaryTreeNode  right1  =  new BinaryTreeNode();
	right1.setData(3);
	root.setRigth(right1);
	BinaryTreeNode  left1left  =  new BinaryTreeNode();
	left1left.setData(4);
	BinaryTreeNode  left1right  =  new BinaryTreeNode();
	left1right.setData(5);
	left1.setLeft(left1left);
	left1.setRigth(left1right);	
	BinaryTreeNode  right1left  =  new BinaryTreeNode();
	right1left.setData(6);
	BinaryTreeNode  right1right  =  new BinaryTreeNode();
	right1right.setData(7);
	right1.setLeft(right1left);
	right1.setRigth(right1right);
//	try {
//		levelOrder(root);
//	} catch (EmptyQueueException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	//postOrder(root);
//	try {
//		preOrderNonRecursive(root);
//	} catch (EmptyStackException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	int data=findMax(root); 
//	System.out.println(data);
//	boolean  flag  = findInBinaryTreeUsingRecursion(root,7);
//	System.out.println(flag);
//	int size = sizeOfBinaryTree(root);
//	System.out.println(size);
	//deleteBinaryTree(root);
	//int height  = heightOfBinaryTree(root);
	//System.out.println(height);
	
	//int[] path = new int[256];
	//printPaths(root, path, 0);
	//int sum =sumTreeNodesData(root);
	//System.out.println(sum);
	//int[] inorder = new int[]{4,2,5,1,6,3};
	//int[] preOrder = new int[]{1,2,4,5,3,6};
	//BinaryTreeNode  binaryTreeNode = buildBinaryTreeNode(inorder, preOrder, 0, 5);
	
	//inOrder(binaryTreeNode);
	
//   BinaryTreeNode  node  = new BinaryTreeNode();
//   node.setData(10);
//   right1right.setRigth(node);
//   BinaryTreeNode  node2  = new BinaryTreeNode();
//   node.setData(9);
//   right1right.setLeft(node2);
//	BinaryTreeNode  node3 = LCA(root, node, node2);
//	System.out.println(node3.getData());
	char[] A = new char[]{'I','L','I','L','L'};
	BinaryTreeNode  binaryTreeNode = buildTreeFromPreOrder(A, 0);
	preOrder(binaryTreeNode);
}
   
   /**
    * Ҷ�ӽڵ��á�L����ʾ���ڲ��ڵ���I��ʾ��ÿ���ڵ�ֻ����0������2�����ӽڵ㡣����ǰ�����ILILL,����������
    * @param A
    * @param i
    * @return
    *  ʱ�临�Ӷ�O(n)
    */
   private static BinaryTreeNode buildTreeFromPreOrder(char[] A,int i){
	   if(A==null){return null;}
	   BinaryTreeNode  newNode = new  BinaryTreeNode();
	   newNode.setData(A[i]);
	   newNode.setLeft(null);
	   newNode.setRigth(null);
	   if(A[i]=='L'){
		   return newNode;
		   
	   }
	   i=i+1;//����������
	   newNode.setLeft(buildTreeFromPreOrder(A, i));
	   i=i+1;//����������
	   newNode.setRigth(buildTreeFromPreOrder(A, i));
	   return newNode;
   }
   /**
    * ���Ҷ������������ڵ�������������
    * @param root
    * @param a
    * @param b
    * @return
    */
   private static BinaryTreeNode LCA(BinaryTreeNode root,BinaryTreeNode a,BinaryTreeNode b){
	   BinaryTreeNode left,right;
	   if(root==null){ return null;}
	   if(root==a||root==b){
		   return root;
	   }
	   left = LCA(root.getLeft(), a, b);
	   right = LCA(root.getRigth(), a, b);
	   if(left!=null && right!=null){return root;}
	   else{return left!=null?left:right;}
   }
   
   /**
    * ����������Ƚڵ�
    * @param root
    * @param node
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
  private static int  printAllAccestors(BinaryTreeNode root,BinaryTreeNode node){
	  if(root==null){return 0;}
	  if((root.getLeft()== node )|| (root.getRigth()==node)|| printAllAccestors(root.getLeft(), node)==1 || printAllAccestors(root.getRigth(), node)==1){
		  System.out.println(root.getData());
		  return 1;
	  }
   return 0;   
	  
  }
   
   
   
   static int preIndex = 0;
   /**
    * ���ݸ��������������ǰ�����������������
    * @param inorder
    * @param preOrder
    * @param inStart
    * @param inEnd
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
   private static BinaryTreeNode  buildBinaryTreeNode(int[] inorder,int[] preOrder,int inStart,int inEnd){
	BinaryTreeNode newNode = new  BinaryTreeNode();
	if(inStart>inEnd){return null;}
    if(newNode == null){
    	System.out.println("memory error!");
    	return null;
    }	   
	//������ǰ������������ҵ���ǰ�ڵ�
    newNode.setData(preOrder[preIndex]);
    preIndex++;
    if(inStart==inEnd){//���ýڵ�û�к��ӽڵ��򷵻�
    	return newNode;
    }
    //����������������ҵ��ýڵ�
    int inIndex = search(inorder,inStart,inEnd,newNode.getData());
    //����������������нڵ�������ֱ�����������������
    newNode.setLeft(buildBinaryTreeNode(inorder, preOrder, inStart, inIndex-1));
    newNode.setRigth(buildBinaryTreeNode(inorder, preOrder, inIndex+1, inEnd));
    return newNode;
   }
   
   private static int search(int[] inorder, int inStart, int inEnd, int data) {
	// TODO Auto-generated method stub
	  for(int i=inStart;i<=inEnd;i++){
		  if(inorder[i]==data){
			  return i;
		  }
	  } 
	return 0;
}

/**
    * ʵ�ֽ�һ��������侵����㷨
    * @param root
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
   private static  BinaryTreeNode mirrorBinaryTreeNode(BinaryTreeNode root){
	   BinaryTreeNode temp;
	   if(root==null){return null;}else{
       mirrorBinaryTreeNode(root.getLeft());
       mirrorBinaryTreeNode(root.getRigth());
       //�����ڵ��ڵ�����ָ��
       temp = root.getLeft();
       root.setLeft(root.getRigth());
       root.setRigth(temp);
	   }
	   return root;
   
   }
/**
 * ����������нڵ���֮��
 * @param root
 * @return
 * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
 */
  private static int sumTreeNodesData(BinaryTreeNode root){
	  if(root==null)return 0;
	  else {
		  return (root.getData()+sumTreeNodesData(root.getLeft())+sumTreeNodesData(root.getRigth()));
	  }
  }
   /**
    * �ж��Ƿ����·�������ݺ͵��ڸ���ֵ
    * @param root
    * @param sum
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    * 
    */
   public static boolean hasPathSum(BinaryTreeNode root,int sum){
	   if(root==null){
		   return sum==0;
		   }else{
			   int subSum = sum - root.getData();
			   return hasPathSum(root.getLeft(), subSum)||hasPathSum(root.getRigth(), subSum);			   
		   }
	   
       
   }
 
   /**
    * ����һ�������Ķ���������������θ��ڵ㵽Ҷ�ӽڵ��·��
    * @param root
    * @param path
    * @param pathLen
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
private static  void printPaths(BinaryTreeNode root,int[] path,int pathLen){
	if(root==null) return;
	//���ýڵ���ӵ�·��������
	path[pathLen] = root.getData();
	pathLen++;
	//��ǰΪҶ�ӽڵ㣬�������������·��
	if(root.getLeft()==null && root.getRigth()==null){
		printArray(path,pathLen);
	}else{
		//�������������������
		printPaths(root.getLeft(), path, pathLen);
		printPaths(root.getRigth(), path, pathLen);
	}
	
}
   
   
   
   private static void printArray(int[] path, int pathLen) {
	// TODO Auto-generated method stub
	 
	   for(int i=0;i<pathLen;i++){
		System.out.print(path[i]+"-->");	 
	  }
	  System.out.println();
}

/**
    * ���������ֱ��
    * @param root
    * @param diameter һ����̬����
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
   public static int diameterOfTree(BinaryTreeNode root,int diameter){
	   int left,right;
	   if(root==null)return 0;
	   left=diameterOfTree(root.getLeft(), diameter);
	   right = diameterOfTree(root.getRigth(), diameter);
	   if(left+right >diameter){
		   diameter = left+right;
	   }
	   return Math.max(left, right)+1;
   }
  /**
   * �ж��������Ľṹ�Ƿ���ͬ
   * @param root1
   * @param root2
   * @return
   * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
   */
 public static boolean  areStructurullySameTrees(BinaryTreeNode root1,BinaryTreeNode root2){
	 if(root1==null && root2==null){return true;}
	 if(root1==null || root2==null){return false;}
	 
	 return(root1.getData()==root2.getData()&&areStructurullySameTrees(root1.getLeft(), root2.getLeft())&& areStructurullySameTrees(root1.getRigth(), root2.getRigth()));
 }
/**
 * �ݹ���������ĸ߶ȣ���ȣ�
 * @param root
 * @return
 * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
 */
   public static int heightOfBinaryTree(BinaryTreeNode root){
	    int leftHeight=0,rightHeight=0;
	   if(root==null)
		   {return 0;
		   }else{
			   leftHeight = heightOfBinaryTree(root.getLeft());
			   rightHeight = heightOfBinaryTree(root.getRigth());
			   System.out.println("leftheight:"+leftHeight);
			   System.out.println("rightheight:"+leftHeight);
			   if(leftHeight>rightHeight){
				   return (leftHeight+1);
			   }else{
				   return (rightHeight+1);
			   }
		   }
	   
   }
   
   /**
    * �������������е�Ԫ��
    * @param root
    * @throws EmptyQueueException
    * @throws EmptyStackException
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
   public static void levelOrderTraverseInReverse(BinaryTreeNode root) throws EmptyQueueException, EmptyStackException{
	   LLQueue queue =   new LLQueue();
	   LLStack stack  = new LLStack();
	   BinaryTreeNode temp;
	   if(root==null){return;}
	   queue.enQueue(root);
	   while(!queue.isEmpty()){
		   temp = queue.deQueue1();
		   if(temp.getRigth()!=null){
			   queue.enQueue(temp.getRigth());
		   }
		   if(temp.getLeft()!=null){
			   queue.enQueue(temp.getLeft());
		   }
		   stack.push(temp);
	   }
	   while(!stack.isEmpty()){
		   System.out.println(stack.pop2().getData());
	   }
   }
  /**
   * ʹ�ú������ɾ����
   * @param root
   * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
   */
   public static void  deleteBinaryTree(BinaryTreeNode root){
	   if(root==null)return;
	   deleteBinaryTree(root.getLeft());
	   deleteBinaryTree(root.getRigth());
	   System.out.println("ɾ��˳��"+root.getData());
	   root = null;//��Java�����������ջ��ƽ�������
	   
   }
   /**
    * ��ȡ�������ڵ����
    * @param root
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
   public static  int sizeOfBinaryTree(BinaryTreeNode root){
	   if(root==null){return 0;}
	   else return (sizeOfBinaryTree(root.getLeft())+1+sizeOfBinaryTree(root.getRigth()));
   }
   
   /**
    * �ڶ�����������ĳ��Ԫ��
    * @param root
    * @param data
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
    public static Boolean  findInBinaryTreeUsingRecursion(BinaryTreeNode root,int data){
    	boolean temp = true;
    	if(root == null)
    	{
    		return !temp;
    		}else{
    			if(data == root.getData()){
    				return temp;
    			}else{
    				temp = findInBinaryTreeUsingRecursion(root.getLeft(), data);
    				if(temp){
    				return temp;
    				}else{
    					temp = findInBinaryTreeUsingRecursion(root.getRigth(), data);
    				}
    			}
    		}
    	return temp;
    }
   /**
    * ���Ҷ������е����Ԫ�ص��㷨
    * @param root
    * @return
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
   public static int findMax(BinaryTreeNode root){
	   int root_val,left,right,max = 0;
	   if(root!=null){
		   root_val = root.getData();
		   left = findMax(root.getLeft());
		   right = findMax(root.getRigth());
		   if(left>right){
			   max = left;
		   }else{
			   max = right;
		   }
		   if(root_val >max){
			   max = root_val;
		   }
		   
	   }
	   return max;
   }
   
   /**
    * ��α���
    * @param root
    * @throws EmptyQueueException
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n) 
    */
   public static void levelOrder(BinaryTreeNode root) throws EmptyQueueException{
         BinaryTreeNode  temp;
         LLQueue queue = new LLQueue();
         if(root==null){return;}
         queue.enQueue(root);
         while(!queue.isEmpty()){
        	 temp = queue.deQueue1();
        	System.out.println(temp.getData());
        	if(temp.getLeft()!=null){
        		queue.enQueue(temp.getLeft());
        		
        	}
        	if(temp.getRigth()!=null){
        		queue.enQueue(temp.getRigth());
        		
        	}
        	
         }
        queue.deQueue();
   }
   /**
    * ǰ�����(�ݹ鷽ʽ)
    * @param root
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n)
    */
   public static  void preOrder(BinaryTreeNode  root){
	   if(root!=null){
		   System.out.println(root.getData());
		   preOrder(root.getLeft());
		   preOrder(root.getRigth());
	   }
   }

   /**
    * �������(�ݹ鷽ʽ)
    * @param root
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n)
    */
   public static  void inOrder(BinaryTreeNode  root){
	   if(root!=null){
		 
		   inOrder(root.getLeft());
		   System.out.println(root.getData());
		   inOrder(root.getRigth());
	   }
   }
   /**
    * �������(�ݹ鷽ʽ)
    * @param root
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n)
    */
   public static  void postOrder(BinaryTreeNode  root){
	   if(root!=null){
		 
		   postOrder(root.getLeft());		 
		   postOrder(root.getRigth());
		   System.out.println(root.getData());
	   }
   }
   
   /**
    * ǰ�����(�ǵݹ鷽ʽ���д�)
    * @param root
    * ʱ�临�Ӷ�O(n),�ռ临�Ӷ�O(n)
    */
   public static void preOrderNonRecursive(BinaryTreeNode  root) throws EmptyStackException{
	   if(root == null){return;}
	   LLStack stack = new LLStack();
	   while(true){
		   while(root!=null){
			 System.out.println(root.getData());
			   stack.push(root);
			   root = root.getLeft();
		   }
		   if(stack.isEmpty()){
			   break;
		   }
		   root = stack.pop2();
         
		   root = root.getRigth();
		 
	   }
	   return;
   }
}
