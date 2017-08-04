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
 * 二叉树的遍历以及相关问题
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
    * 叶子节点用“L”表示，内部节点用I表示，每个节点只有有0个或者2个孩子节点。给出前序遍历ILILL,构建二叉树
    * @param A
    * @param i
    * @return
    *  时间复杂度O(n)
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
	   i=i+1;//构建左子树
	   newNode.setLeft(buildTreeFromPreOrder(A, i));
	   i=i+1;//构建右子树
	   newNode.setRigth(buildTreeFromPreOrder(A, i));
	   return newNode;
   }
   /**
    * 查找二叉树中两个节点的最近公共祖先
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
    * 输出所有祖先节点
    * @param root
    * @param node
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
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
    * 根据给定的中序遍历和前序遍历来构建二叉树
    * @param inorder
    * @param preOrder
    * @param inStart
    * @param inEnd
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
    */
   private static BinaryTreeNode  buildBinaryTreeNode(int[] inorder,int[] preOrder,int inStart,int inEnd){
	BinaryTreeNode newNode = new  BinaryTreeNode();
	if(inStart>inEnd){return null;}
    if(newNode == null){
    	System.out.println("memory error!");
    	return null;
    }	   
	//利用在前序遍历序列中找到当前节点
    newNode.setData(preOrder[preIndex]);
    preIndex++;
    if(inStart==inEnd){//若该节点没有孩子节点则返回
    	return newNode;
    }
    //否则在中序遍历中找到该节点
    int inIndex = search(inorder,inStart,inEnd,newNode.getData());
    //利用中序遍历序列中节点的索引分别建立左子树和右子树
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
    * 实现将一个树变成其镜像的算法
    * @param root
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
    */
   private static  BinaryTreeNode mirrorBinaryTreeNode(BinaryTreeNode root){
	   BinaryTreeNode temp;
	   if(root==null){return null;}else{
       mirrorBinaryTreeNode(root.getLeft());
       mirrorBinaryTreeNode(root.getRigth());
       //交换节点内的两个指针
       temp = root.getLeft();
       root.setLeft(root.getRigth());
       root.setRigth(temp);
	   }
	   return root;
   
   }
/**
 * 求二叉树所有节点数之和
 * @param root
 * @return
 * 时间复杂度O(n),空间复杂度O(n) 
 */
  private static int sumTreeNodesData(BinaryTreeNode root){
	  if(root==null)return 0;
	  else {
		  return (root.getData()+sumTreeNodesData(root.getLeft())+sumTreeNodesData(root.getRigth()));
	  }
  }
   /**
    * 判断是否存在路径的数据和等于给定值
    * @param root
    * @param sum
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
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
    * 对于一个给定的二叉树，输出到搜游根节点到叶子节点的路径
    * @param root
    * @param path
    * @param pathLen
    * 时间复杂度O(n),空间复杂度O(n) 
    */
private static  void printPaths(BinaryTreeNode root,int[] path,int pathLen){
	if(root==null) return;
	//将该节点添加到路径数组中
	path[pathLen] = root.getData();
	pathLen++;
	//当前为叶子节点，因此输出到这里的路径
	if(root.getLeft()==null && root.getRigth()==null){
		printArray(path,pathLen);
	}else{
		//否则继续遍历两颗子树
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
    * 求二叉树的直径
    * @param root
    * @param diameter 一个静态变量
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
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
   * 判断两棵树的结构是否相同
   * @param root1
   * @param root2
   * @return
   * 时间复杂度O(n),空间复杂度O(n) 
   */
 public static boolean  areStructurullySameTrees(BinaryTreeNode root1,BinaryTreeNode root2){
	 if(root1==null && root2==null){return true;}
	 if(root1==null || root2==null){return false;}
	 
	 return(root1.getData()==root2.getData()&&areStructurullySameTrees(root1.getLeft(), root2.getLeft())&& areStructurullySameTrees(root1.getRigth(), root2.getRigth()));
 }
/**
 * 递归求二叉树的高度（深度）
 * @param root
 * @return
 * 时间复杂度O(n),空间复杂度O(n) 
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
    * 逆向逐层输出树中的元素
    * @param root
    * @throws EmptyQueueException
    * @throws EmptyStackException
    * 时间复杂度O(n),空间复杂度O(n) 
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
   * 使用后序遍历删除树
   * @param root
   * 时间复杂度O(n),空间复杂度O(n) 
   */
   public static void  deleteBinaryTree(BinaryTreeNode root){
	   if(root==null)return;
	   deleteBinaryTree(root.getLeft());
	   deleteBinaryTree(root.getRigth());
	   System.out.println("删除顺序："+root.getData());
	   root = null;//在Java中由垃圾回收机制进行清理
	   
   }
   /**
    * 获取二叉树节点个数
    * @param root
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
    */
   public static  int sizeOfBinaryTree(BinaryTreeNode root){
	   if(root==null){return 0;}
	   else return (sizeOfBinaryTree(root.getLeft())+1+sizeOfBinaryTree(root.getRigth()));
   }
   
   /**
    * 在二叉树中搜索某个元素
    * @param root
    * @param data
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
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
    * 查找二叉树中的最大元素的算法
    * @param root
    * @return
    * 时间复杂度O(n),空间复杂度O(n) 
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
    * 层次遍历
    * @param root
    * @throws EmptyQueueException
    * 时间复杂度O(n),空间复杂度O(n) 
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
    * 前序遍历(递归方式)
    * @param root
    * 时间复杂度O(n),空间复杂度O(n)
    */
   public static  void preOrder(BinaryTreeNode  root){
	   if(root!=null){
		   System.out.println(root.getData());
		   preOrder(root.getLeft());
		   preOrder(root.getRigth());
	   }
   }

   /**
    * 中序遍历(递归方式)
    * @param root
    * 时间复杂度O(n),空间复杂度O(n)
    */
   public static  void inOrder(BinaryTreeNode  root){
	   if(root!=null){
		 
		   inOrder(root.getLeft());
		   System.out.println(root.getData());
		   inOrder(root.getRigth());
	   }
   }
   /**
    * 后序遍历(递归方式)
    * @param root
    * 时间复杂度O(n),空间复杂度O(n)
    */
   public static  void postOrder(BinaryTreeNode  root){
	   if(root!=null){
		 
		   postOrder(root.getLeft());		 
		   postOrder(root.getRigth());
		   System.out.println(root.getData());
	   }
   }
   
   /**
    * 前序遍历(非递归方式，有错)
    * @param root
    * 时间复杂度O(n),空间复杂度O(n)
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
