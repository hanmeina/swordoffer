package find;

import java.util.Arrays;

/**
 * 查找数组中是否有重复元素
 * @author Administrator
 *
 */
public class CheckDuplicatesBruteForce {
   public static void main(String[] args) {
	  int[] a = {2,5,78,3,2,3};
	  checkDuplicatesBruteForce1(a);
}
   /**
    * 时间复杂度为O(n^2)
    * @param a
    */
   private static  void checkDuplicatesBruteForce(int[] a){
	   for(int i=0;i<a.length-1;i++){
		   for(int j=i+1;j<a.length;j++){
			   if(a[i]==a[j]){
				   System.out.println("Duplicates exist :"+a[i]);
				   return;
			   }
		   }
	   }
	   System.out.println("no dupliecates is given");
   }
   /**
    * 改进，先排序，再找
    * O(nlogn)
    * @param a
    */
   private static  void checkDuplicatesBruteForce1(int[] a){
	        Arrays.sort(a);
		   for(int j=0;j<a.length;j++){
			   if(a[j]==a[j+1]){
				   System.out.println("Duplicates exist :"+a[j]);
				   return;
			   }
		   }
	   
	   System.out.println("no dupliecates is given");
   }
}
