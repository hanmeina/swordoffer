package sort;
/**
 * ��������
 * @author Administrator
 *  ʱ�临�Ӷ�O(n^2)
 */ 
public class InsertSort {
   public static void main(String[] args) {
	   int[] a = new int[]{4,7,9,8,10,2};
		int[] asort = insertionSort(a);
		for(int i=0;i<a.length;i++){
			System.out.println(asort[i]);
		}
}
   private static int[] insertionSort(int[] a){
	   for(int i=1;i< a.length;i++){//�ӵڶ���Ԫ�ؿ�ʼ
		   int currentValue= a[i];
		   int position = i;
		  for(int j=i-1;j>=0;j--){
			  if(a[j]>currentValue){
				  a[j+1] = a[j];
				  position -= 1;
			  }else{
				  break;
			  }
			 a[position] = currentValue; 
		  } 

	   }
	   return a;
   }
}
