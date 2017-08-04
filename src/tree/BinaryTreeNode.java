package tree;
/**
 * 二叉树的数据结构
 * @author Administrator
 *
 */
public class BinaryTreeNode {
   private int data;
   private BinaryTreeNode left;
   private BinaryTreeNode rigth;
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public BinaryTreeNode getLeft() {
	return left;
}
public void setLeft(BinaryTreeNode left) {
	this.left = left;
}
public BinaryTreeNode getRigth() {
	return rigth;
}
public void setRigth(BinaryTreeNode rigth) {
	this.rigth = rigth;
}
  
}
