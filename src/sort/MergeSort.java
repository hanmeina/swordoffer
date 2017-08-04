package sort;
/**
 * �鲢����
 * @author Administrator
 * ��á����ƽ�����Ӷ�ΪO(nlogn)
 * 
 */
public class MergeSort{
	public static void main(String[] args) {
		int[] a = new int[]{4,7,9,8,10,2};
		int[] asort = mergeSort(a, 0, a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.println(asort[i]);
		}
	}
	/**
	 *  �鲢���򣬴�С����
     * �鲢�����㷨һ����Ҫ����
     * 1. �������
     * 2. �ұ�����
     * 3. �ϲ�
	 * @param a
	 * @param left
	 * @param right
	 * @return
	 */
	private static int[] mergeSort(int[] a,int left,int right){
		int mid;
		if(right > left){
			//mid = (left+right)/2;
		     mid=(left&right)+((left^right)>>1);
		     System.err.println("mid:"+mid);
			int[] temp = new int[a.length];
			mergeSort(a,left,mid);//�������
			mergeSort(a,mid+1, right);//�ұ�����
			merge(a,temp,left,mid,right);//�鲢
		}
		
		return a;		
	}

	private static void merge(int[] a, int[] temp, int left, int mid, int right) {
	   int i=left;
	   int j=mid+1;
	   int k=0;
	   while(i<=mid && j<=right){
		   if(a[i]<a[j]){
			   temp[k] =a[i];
			   i++;
		   }else{
			   temp[k]=a[j];
			   j++;
		   }
		   k++;
	   }
		// ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ����  
	   while(i<=mid){
		   System.out.println("i:"+i);
		   System.out.println("mid ..."+mid);
		   temp[k++] = a[i++];
	   }
		while(j<=right){
		    System.out.println("j:"+j);
		    System.out.println("k:"+k);
			temp[k++]=a[j++];
	
		}
		 // ����ʱ�����е����ݿ�����ԭ������  
		System.arraycopy(temp, 0, a, left, right-left+1);
	}
	
	
}