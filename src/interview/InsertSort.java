package interview;
/**
 * 插入排序
 * @author Administrator
 *
 */
public class InsertSort {
   public static void main(String[] args) {
	   int[] a = {4,2,1,6,3,6,0,-5,1,1};
	    insertSort(a);
		printArray(a);
}
   private  static void insertSort(int[] a){
	   
	   for(int i=1;i<a.length;i++){//从第二个元素开始		 
		  
		  for(int j=i;j>0 && a[j]<a[j-1];j--){
			  swap(a, j, j-1);
		  } 
		   
	   }
   }
   
   private static void swap(int[] a, int i, int j) {
	    
	      int temp = a[i];
	      a[i] = a[j];
	      a[j] = temp;
	}
	public static void printArray(int[] a) {  
	    System.out.print("{");  
	    for (int i = 0; i < a.length; i++) {  
	        System.out.print(a[i]);  
	        if (i < a.length - 1) {  
	            System.out.print(", ");  
	        }  
	    }  
	    System.out.println("}");  
	}
}
