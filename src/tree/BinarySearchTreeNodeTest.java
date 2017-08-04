package tree;
/**
 * 二叉搜索树相关操作
 * @author Administrator
 *
 */
public class BinarySearchTreeNodeTest {

	
	public static void main(String[] args) {
		BinarySearchTreeNode  root = new BinarySearchTreeNode();
		root.setData(10);
		BinarySearchTreeNode  left1 = new BinarySearchTreeNode();
		left1.setData(6);
		BinarySearchTreeNode  right1 = new BinarySearchTreeNode();
		right1.setData(16);
		BinarySearchTreeNode  left1left = new BinarySearchTreeNode();
		left1left.setData(4);
		BinarySearchTreeNode  left1right = new BinarySearchTreeNode();
		left1right.setData(9);
		BinarySearchTreeNode right1left = new BinarySearchTreeNode();
		right1left.setData(13);
		root.setLeft(left1);
		root.setRight(right1);
		left1.setLeft(left1left);
		left1.setRight(left1right);
		right1.setLeft(right1left);
		
//		BinarySearchTreeNode  node = findMax(root);
//		System.out.println(node.getData());
        BinarySearchTreeNode node = insert(root, 8);
    	inOrder(node);
    
	}
	  /**
	    * 前序遍历(递归方式)
	    * @param root
	    * 时间复杂度O(n),空间复杂度O(n)
	    */
	   public static  void inOrder(BinarySearchTreeNode root){
		   if(root!=null){
			   
			   inOrder(root.getLeft());
			   System.out.println(root.getData());
			  inOrder(root.getRight());
		   }
	   }
	/**
	 * 在二叉搜索树中插入元素
	 * @param root
	 * @param data
	 * @return
	 * 时间复杂度O(n),空间复杂度O(n) 
	 */
	private static BinarySearchTreeNode insert(BinarySearchTreeNode root,int data){
		if(root==null){
			root = new BinarySearchTreeNode();
			if(root==null){
				System.out.println("memory error");
				return null;
			}else{
				root.setData(data);
				root.setLeft(null);
				root.setRight(null);
			}
			
			
		}else{
			if(data<root.getData()){
				root.setLeft(insert(root.getLeft(), data));
			}else if(data>root.getData()){
				root.setRight(insert(root.getRight(), data));
			}
		}
		return root;
	}
	
	/**
	 * 在二叉搜索树种查找最大元素
	 * @param root
	 * @return
	 * 时间复杂度O(n),空间复杂度O(n) 
	 */
	public static  BinarySearchTreeNode findMax(BinarySearchTreeNode root){
		if(root==null){return null;}
		else{
			if(root.getRight()==null){return root;}
			else{return findMax(root.getRight());}
		}
	}
	/**
	 * 在二叉搜索树种查找最小元素
	 * @param root
	 * @return
	 * 时间复杂度O(n),空间复杂度O(n) 
	 */
	public static  BinarySearchTreeNode findMin(BinarySearchTreeNode root){
		if(root==null){return null;}
		else{
			if(root.getLeft()==null){return root;}
			else{return findMin(root.getLeft());}
		}
	}
	
	
	/**
	 * 在二叉搜索树种查找元素
	 * @param root
	 * @param data
	 * @return
	 * 时间复杂度O(n),空间复杂度O(n) 
	 */
	private static  BinarySearchTreeNode  find(BinarySearchTreeNode  root,int data){
		if(root==null){ return null;}
		if(data<root.getData()){
			return find(root.getLeft(), data);
		}else if(data>root.getData()){
			return find(root.getRight(), data);
		}
		return root;
	}
}
