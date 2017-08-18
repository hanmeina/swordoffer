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
public class Solution42 {
  public static void main(String[] args) {
	int[] pre = {1,2,4,3,5,6};
	int[] in = {4,2,1,5,3,6};
    TreeNode treeNode = reConstructBinaryTree(pre, in);
	preOrder(treeNode);
}
  
  public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	  
	  TreeNode treeNode  = constructCore(pre,0,pre.length-1, in,0,in.length-1);
      return treeNode;
  }

  public static TreeNode constructCore(int [] pre,int preStart,int preEnd,int [] in,int inStart,int inEnd) {
     
	  if(preStart>preEnd ||inStart>inEnd){return null;}
	   
	   //利用在前序遍历序列中找到当前节点
	   TreeNode root  = new TreeNode(pre[preStart]);
	    
	  for(int i=inStart;i<=inEnd;i++){
		  if(in[i] == pre[preStart]){
			//利用中序遍历序列中节点的索引分别建立左子树和右子树
			    root.left = constructCore(pre,preStart+1,preStart+i-inStart ,in, inStart, i-1);
			   root.right = constructCore(pre,preStart+i-inStart+1,preEnd,in, i+1, inEnd); 
		  }
	  }
	  
	 
	    return root;
     
      
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
