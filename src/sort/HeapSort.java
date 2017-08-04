package sort;
 /**
  * 堆排序
  * @author Administrator
  *
  */
public class HeapSort {
   public static void main(String[] args) {
	   int[] array = { 4,7,9,8,10,2 };  
	   
       System.out.println("Before heap:");  
       printArray(array);  

       heapSort(array);  

       System.out.println("After heap sort:");  
       printArray(array);  
}
   //打印
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

   //数据交换
   public static void exchangeElements(int[] array, int index1, int index2) {  
       int temp = array[index1];  
       array[index1] = array[index2];  
       array[index2] = temp;  
   }  
	 
   /**
    * 堆排序的大概步骤如下:
    * 构建最大堆。
    * 选择顶，并与第0位置元素交换
    * 由于步骤2的的交换可能破环了最大堆的性质，第0不再是最大元素，需要调用maxHeap调整堆(沉降法)，如果需要重复步骤2
    *堆排序中最重要的算法就是maxHeap，该函数假设一个元素的两个子节点都满足最大堆的性质(左右子树都是最大堆)，
    *只有跟元素可能违反最大堆性质，那么把该元素以及左右子节点的最大元素找出来，如果该元素已经最大，
    *那么整棵树都是最大堆，程序退出，否则交换跟元素与最大元素的位置，
    *继续调用maxHeap原最大元素所在的子树。该算法是分治法的典型应用。
    *
    *
    */
    private static void heapSort(int[] array){
    	if(array ==null|| array.length<=1){
    		return;
    	}
    	
    	buildMaxHead(array);//构建最大堆。
    }
private static void buildMaxHead(int[] array) {
	if(array ==null|| array.length<=1){
		return;
	}
	int half=array.length/2;
	for(int i=half;i>=0;i--){
		maxHeap(array,array.length,i);//调整堆(沉降法)
	}
	
}
private static void maxHeap(int[] array, int heapsize, int index) {
	int left =index*2+1;
	int right = index*2+2;
	int largest = index;
	
	if(left<heapsize && array[left]>array[largest]){
		largest=left;
	}
	if(right<heapsize && array[right]>array[largest]){
		largest = right;
	}
	if(index!=largest){
		exchangeElements(array, index, largest);
	    maxHeap(array, heapsize, largest);
	}
}
}
