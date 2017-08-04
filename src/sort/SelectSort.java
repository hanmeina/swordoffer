package sort;
/**
 * 选择排序
 * @author Administrator
 * 时间复杂度O(n^2)
 */
public class SelectSort {
    public static void main(String[] args) {
    	int[] a = new int[]{4,7,9,8,10,2};
    	int[] asort = selection(a);
    	for(int i=0;i<a.length;i++){
    		System.out.println(asort[i]);
    	}
	}
    
   private static int[] selection(int[] a){
	   int temp,min;
	   for(int i=0;i<a.length-1;i++){
		    min  = i;
		    for(int j=i+1;j<a.length;j++){
		    	if(a[j]<a[min]){
		    	    min = j;
		    	    temp = a[min];
		    	    a[min] = a[i];
		    	    a[i] = temp;
		    		
		    	}
		    	
		    }	   
	   }
	   return a;
   }
}
