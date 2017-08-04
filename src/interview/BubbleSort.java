package interview;
/**
 * √∞≈›≈≈–Ú
 * @author Administrator
 *
 */
public class BubbleSort {
   public static void main(String[] args) {
	int[] a = {4,2,1,6,3,6,0,-5,1,1};
	bubbleSort(a);
	printArray(a);
}
   
   private static void bubbleSort(int[] a){
	   boolean exchange;
	    for(int i=0;i<a.length-1;i++){
	    	exchange = false;
	    	for(int j=i+1;j<a.length;j++){
	    		if(a[i]>a[j]){
	    			swap(a,i,j);
	    			exchange = true;
	    		}
	    		
	    	} 	
	    	if(!exchange){
    			return;
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
