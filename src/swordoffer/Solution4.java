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
	   //������ǰ������������ҵ���ǰ�ڵ�
	    treeNode.val = pre[preIndex];
	    preIndex++;
	    if(inStart==inEnd){//���ýڵ�û�к��ӽڵ��򷵻�
	    	return treeNode;
	    }
	    //����������������ҵ��ýڵ�
	    int inIndex = search(in,inStart,inEnd,treeNode.val);
	    //����������������нڵ�������ֱ�����������������
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
