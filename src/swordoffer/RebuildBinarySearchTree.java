package swordoffer;

import java.io.BufferedWriter;
import java.util.Arrays;

import tree.BinaryTreeNode;

/**
 * 重建二叉树
 * 输入前序和中序，重建二叉树
 * @author Administrator1
 *
 */
public class RebuildBinarySearchTree{
     public static void main(String[] args) {
    	 int[] preSort={1,2,4,7,3,5,6,8};
    	 int[] inSort={4,7,2,1,5,3,8,6};
    	 try {
			BinaryTreeNode root=constructCore(preSort,inSort);
		    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
     
     public static BinaryTreeNode constructCore(int[] preorder,int[] inorder) throws Exception{
         if(preorder==null || inorder == null){
        	 return null;
         }   	 
         if(preorder.length!=inorder.length){
        	 throw new Exception("长度不一样，非法输入");
        	 
         }
    	 
         BinaryTreeNode  binaryTreeNode = new BinaryTreeNode();
         for(int i=0;i<inorder.length;i++){
        	   if(inorder[i]==preorder[0]){
        		   binaryTreeNode.setData(inorder[i]);
        		   System.out.println(binaryTreeNode.getData());
        		   binaryTreeNode.setLeft(constructCore(Arrays.copyOfRange(preorder,1,
        				   i+1), Arrays.copyOfRange(inorder, 0, i)));
        	       binaryTreeNode.setRigth(constructCore(Arrays.copyOfRange(preorder,i+
        	    		   1, preorder.length),Arrays.copyOfRange(inorder, i+1,
        	    				   inorder.length)));
        	   }
        	 
        	 
         }
    	 return binaryTreeNode;
    	 
     }
}
