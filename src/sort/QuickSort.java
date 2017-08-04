package sort;
/**
 * 快速排序
 * @author Administrator
 *
 */
public class QuickSort {
	
  public static void main(String[] args) {
	  int[] array = { 4,7,9,8,10,2 };  
	   
      System.out.println("Before heap:");  
      printArray(array);  

     quickSort(array, 0, array.length-1);

      System.out.println("After heap sort:");  
      printArray(array);  
}
 private static void quickSort(int a[],int low,int high){
	 int pivot;
	 if(high>low){
		 pivot = Partition(a,low,high);
		 quickSort(a, low, pivot);
		 quickSort(a, pivot+1, high);
	 }
	 
 }
private static  int Partition(int[] a, int low, int high) {
// TODO Auto-generated method stub
    int left,right,pivot_item = a[low];
    left = low;
    right = high;
    while(left<right){
    	while(a[left]<=pivot_item){
    		left++;
    	}
    	while(a[right]>pivot_item){
    		right--;
    	}
    	if(left<right){
    		swap(a,left,right);
    	}
    	
    }
    System.out.println("right:"+right);
    System.out.println(a[right]);
    a[low] = a[right];
	a[right] = pivot_item;
	//
	return right;

} 
//数据交换
public static void swap(int[] array, int index1, int index2) {  
    int temp = array[index1];  
    array[index1] = array[index2];  
    array[index2] = temp;  
}  
public static void printArray(int[] array) {  
    System.out.print("{");  
    for (int i = 0; i < array.length; i++) {  
        System.out.print(array[i]);  
        if (i < array.length - 1) {  
            System.out.print(", ");  
        }  
    }  
    System.out.println("}");  
}  
}
