package swordoffer;

import lianxi.lianxi;


/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}��
 * �����������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
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
	   
	   //������ǰ������������ҵ���ǰ�ڵ�
	   TreeNode root  = new TreeNode(pre[preStart]);
	    
	  for(int i=inStart;i<=inEnd;i++){
		  if(in[i] == pre[preStart]){
			//����������������нڵ�������ֱ�����������������
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
