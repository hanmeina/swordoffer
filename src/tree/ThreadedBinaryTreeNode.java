package tree;

/**
 * 线索二叉树的定义
 * @author Administrator
 *
 */
public class ThreadedBinaryTreeNode {
   private ThreadedBinaryTreeNode  left;
   private int ltag;
   private int data;
   private int rtag;
   private ThreadedBinaryTreeNode right;
public ThreadedBinaryTreeNode getLeft() {
	return left;
}
public void setLeft(ThreadedBinaryTreeNode left) {
	this.left = left;
}
public int getLtag() {
	return ltag;
}
public void setLtag(int ltag) {
	this.ltag = ltag;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public int getRtag() {
	return rtag;
}
public void setRtag(int rtag) {
	this.rtag = rtag;
}
public ThreadedBinaryTreeNode getRight() {
	return right;
}
public void setRight(ThreadedBinaryTreeNode right) {
	this.right = right;
}
   
}
