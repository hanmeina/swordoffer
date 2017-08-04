package interview;
/**
 * —°‘Ò≈≈–Ú
 * @author Administrator
 *
 */
public class SelectSort {
   public static void main(String[] args) {
	   int[] a = {4,2,1,6,3,6,0,-5,1,1};
	   selectSort(a);
		printArray(a);
}
   
   
   private static void selectSort(int[] a){
	   
	   for(int i=0;i<a.length;i++){
		   int min=i;
		   for(int j=i+1;j<a.length;j++){
			   if(a[j]<a[min]){
				   min = j;
				   swap(a, min, i);			   
			   }
			   
		   
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
