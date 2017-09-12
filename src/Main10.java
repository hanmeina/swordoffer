import java.util.ArrayList;
import java.util.List;


public class Main10 {
 static  List<Integer>  lists = new ArrayList<>();
  static int sum_ ;
	public static void main(String[] args) {
		TreeNode treeNode = new TreeNode(1);
		TreeNode treeNode1 = new TreeNode(2);
		TreeNode treeNode2 = new TreeNode(3);
		treeNode.left = treeNode1;
		treeNode.right = treeNode2;
		System.out.println(sumNumbers(treeNode));
	}
	static int sumNumbers(TreeNode root){
		sum_ = 0;
		if(root!=null){
			doSum(root);
		}
		return sum_;
	}
    static void doSum(TreeNode root){
     lists.add(root.val);
     if(root.left==null && root.right==null){
    	 CountOnePath();
    	 
     }else{
    	 if(root.left!=null){
    		 doSum(root.left);
    	 }
    	 if(root.right!=null){
    		 doSum(root.right);
    	 }
    	 
     }
   
    }
	static void CountOnePath(){
		int sum = 0;
		for(int i=0;i<lists.size();i++){
			sum = 10*sum +i;
		}
	  	sum_ +=sum;
	
	}
}

