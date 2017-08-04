package lianxi;

public class Quicksort {

	 /**
	  * ����ָ������a������������ֵ 
	  * @param a
	  * @param i
	  * @param j
	  */
	public static void swap(int[] a,int i,int j){
		if(i==j) return;
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	/**
	 * �����������
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	public static int partition(int array[],int low,int high){
		//��ǰλ��Ϊ��һ��Ԫ�����ڵ�λ��
		int p_pos = low;
		//���õ�һ��Ԫ��Ϊ��
		int prvot = array[p_pos];
		for(int i = low+1;i<=high;i++){
			if(array[i]<prvot){
				p_pos++;
				System.out.println("p_pox:"+p_pos);
				System.out.println("i:"+i);
				swap(array, p_pos, i);
				
			}
			
		}
		swap(array, low, p_pos);
		System.out.println("pox��"+p_pos);
		return p_pos;
	}
	
	  /**
     * ��������ʵ��
     * @param array
     * @param low
     * @param high
     */
    public static void quickSort(int array[], int low, int high) {
 
        if (low < high) {
 
            int pivot = partition(array, low, high);
 
            quickSort(array, low, pivot - 1);
 
            quickSort(array, pivot + 1, high);
 
        }
 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= new int[]{45,18,53,72,30,48,93,15,36};
		quickSort(array, 0, array.length-1);
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
