package swordoffer;
/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和
 * 中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author Administrator
 *
 */
public class Solution44 {
	public static void main(String[] args) {
		int[] pre = {1,2,4,3,5,6};
		int[] in = {4,2,1,5,3,6};
	    TreeNode treeNode = reConstructBinaryTree(pre, in);
		preOrder(treeNode);
	}
	 public static  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
         TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
    //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
    private static  TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
          
        if(startPre>endPre||startIn>endIn)
            return null;
        TreeNode root=new TreeNode(pre[startPre]);
          
        for(int i=startIn;i<=endIn;i++)
            if(in[i]==pre[startPre]){
                root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
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
}
