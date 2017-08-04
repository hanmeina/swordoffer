package sort;
/**
 * 归并排序
 * @author Administrator
 * 最好、最坏和平均复杂度为O(nlogn)
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
	 *  归并排序，从小到大
     * 归并排序算法一般需要三步
     * 1. 左边排序
     * 2. 右边排序
     * 3. 合并
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
			mergeSort(a,left,mid);//左边排序
			mergeSort(a,mid+1, right);//右边排序
			merge(a,temp,left,mid,right);//归并
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
		// 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）  
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
		 // 将临时数组中的内容拷贝回原数组中  
		System.arraycopy(temp, 0, a, left, right-left+1);
	}
	
	
}