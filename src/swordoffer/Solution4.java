package swordoffer;

import lianxi.lianxi;


/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和
 * 中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author Administrator
 *
 */
public class Solution4 {
  public static void main(String[] args) {
	int[] pre = {1,2,4,3,5,6};
	int[] in = {4,2,1,5,3,6};
    TreeNode treeNode = reConstructBinaryTree(pre, in);
	preOrder(treeNode);
}
  
  public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	  if(pre == null||in == null){return null;}	 
	  TreeNode treeNode  = constructCore(pre, in,0,in.length-1);
      return treeNode;
  }
  static int preIndex = 0;
  public static TreeNode constructCore(int [] pre,int [] in,int inStart,int inEnd) {
     TreeNode treeNode  = new TreeNode(0);	  
	  if(inStart>inEnd){return null;}
	    if(treeNode == null){
	    	System.out.println("memory error!");
	    	return null;
	    }	
	   //利用在前序遍历序列中找到当前节点
	    treeNode.val = pre[preIndex];
	    preIndex++;
	    if(inStart==inEnd){//若该节点没有孩子节点则返回
	    	return treeNode;
	    }
	    //否则在中序遍历中找到该节点
	    int inIndex = search(in,inStart,inEnd,treeNode.val);
	    //利用中序遍历序列中节点的索引分别建立左子树和右子树
	    treeNode.left = constructCore(pre, in, inStart, inIndex-1);
	    treeNode.right = constructCore(pre, in, inIndex+1, inEnd);
	    return treeNode;
     
      
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
  
  public static  void preOrder(TreeNode  root){
	   if(root!=null){
		   System.out.println(root.val);
		   preOrder(root.left);
		   preOrder(root.right);
	   }
  }
  public static  void inOrder(TreeNode  root){
	   if(root!=null){
		 
		   inOrder(root.left);
		   System.out.println(root.val);
		   inOrder(root.right);
	   }
 }
}
