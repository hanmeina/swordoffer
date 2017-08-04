package sort;
 /**
  * ������
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
   //��ӡ
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

   //���ݽ���
   public static void exchangeElements(int[] array, int index1, int index2) {  
       int temp = array[index1];  
       array[index1] = array[index2];  
       array[index2] = temp;  
   }  
	 
   /**
    * ������Ĵ�Ų�������:
    * �������ѡ�
    * ѡ�񶥣������0λ��Ԫ�ؽ���
    * ���ڲ���2�ĵĽ��������ƻ������ѵ����ʣ���0���������Ԫ�أ���Ҫ����maxHeap������(������)�������Ҫ�ظ�����2
    *������������Ҫ���㷨����maxHeap���ú�������һ��Ԫ�ص������ӽڵ㶼�������ѵ�����(����������������)��
    *ֻ�и�Ԫ�ؿ���Υ���������ʣ���ô�Ѹ�Ԫ���Լ������ӽڵ�����Ԫ���ҳ����������Ԫ���Ѿ����
    *��ô�������������ѣ������˳������򽻻���Ԫ�������Ԫ�ص�λ�ã�
    *��������maxHeapԭ���Ԫ�����ڵ����������㷨�Ƿ��η��ĵ���Ӧ�á�
    *
    *
    */
    private static void heapSort(int[] array){
    	if(array ==null|| array.length<=1){
    		return;
    	}
    	
    	buildMaxHead(array);//�������ѡ�
    }
private static void buildMaxHead(int[] array) {
	if(array ==null|| array.length<=1){
		return;
	}
	int half=array.length/2;
	for(int i=half;i>=0;i--){
		maxHeap(array,array.length,i);//������(������)
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
