package sort;
/**
 * 冒泡排序
 * @author Administrator
 * 时间复杂度O(n^2)
 */
public class BubbleSort {
   public static void main(String[] args) {
	int[] a = new int[]{4,7,9,8,10,2};
	int[] asort = bubbleSortImproved(a,a.length);
	for(int i=0;i<a.length;i++){
		System.out.println(asort[i]);
	}
	
}
   
   private static int[] bubbleSort(int[] a){
	   for(int i=0;i<a.length-1;i++){
		   for(int j=i+1;j<a.length;j++){
			   if(a[i]>a[j]){
				   int temp = a[i];
				   a[i] = a[j];
				   a[j] = temp;
			   }
			   
		   }
		   
	   }
	   return a;
	   
   }
   
   private static int[] bubbleSort1(int[] a,int n){
	   for(int i=n-1;i>=0;i--){
		   for(int j=0;j<n-1;j++){
			   if(a[j]>a[j+1]){
				   int temp = a[j];
				   a[j] = a[j+1];
				   a[j+1] = temp;
			   }
			   
		   }
		   
	   }
	   return a;
	   
   }
   
   
   
   //算法该进
   //判断标志位来结束算法
  //时间复杂度为O(n)
   private static int[] bubbleSortImproved(int[] a,int n){
	   int pass,i,temp;boolean swapped =true;
	   for(pass = n-1;pass>=0 && swapped;pass--){
		   swapped = false;
		   for(i = 0;i<pass;i++){
			   if(a[i]>a[i+1]){
				   temp = a[i];
				   a[i] = a[i+1];
				   a[i+1] = temp;
				   swapped = true;
			   }
		   }
	   }
	   
	   
	   return a;
	   
   }
   
}
