package lianxi;

public class QuickSort1 {
	
	/**
	 * 用于两个数之间的交换
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(int[] a ,int i,int j){
		if(i==j) return ;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	/**
	 * 待排序的数据，
	 * @param array
	 * @param low
	 * @param high
	 */
	public static int partition(int[] array,int low,int high){
		int p_pox = low;
		int privot = array[p_pox];//设置的那个初始值
		for(int i = low+1;i<=high;i++){
			if(array[i] < privot){
				p_pox++;
				swap(array, p_pox, i);
			}			
		}
		
		swap(array, low, p_pox);
		return p_pox;//返回待排序数组中最后一个小于设定值的位置
	}
	/**
	 * 快速排序
	 * @param array
	 * @param low
	 * @param high
	 */
    public static void quickSort(int[] array,int low,int high){
    	if(low<high){
    		int privot = partition(array, low, high);
    		quickSort(array, low, privot-1);
    		quickSort(array, privot+1, high);
    	}
    }
	public static void main(String[] args) {
		
		int[] array= new int[]{11,123,134,55,66,78,34};
		quickSort(array, 0, array.length-1);
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}

	}

}
