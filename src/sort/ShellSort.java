package sort;



/**
 * Ï£¶ûÅÅÐò
 * @author Administrator
 *
 */
public class ShellSort {
     public static void main(String[] args) {
    	 int[] a = new int[]{4,7,9,8,10,2};
    		int[] asort = shellSort(a);
    		for(int i=0;i<a.length;i++){
    			System.out.println(asort[i]);
    		}
	}
     
     private static int[] shellSort(int[] a){
        for(int increment=a.length/2;increment>0;increment/=2){
        	System.out.println("ÔöÁ¿Îª£º"+increment);
        	for(int i= increment;i<a.length;i++){
        		int temp = a[i];
        		for(int j=i-increment;j>=0;j -= increment){
        			if(a[j]>temp){
        				a[j+increment] = a[j];
        				
        			}else{
        				break;
        			}
        			a[j] = temp;
        		}
        	}
        }
    	 return a;
    	 
     }
}
