package lianxi;
/**
 * ��������
 * @author Administrator
 *
 */
public class FastSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] array= new int[]{11,123,134,55,66,78,34};
	quicksort(array, 0, array.length-1);
	for(int i =0;i<array.length;i++){
		System.out.println(array[i]);
	}
	}
 
	static void quicksort(int[] array,int start,int end){
		if(start<end){
		int key = array[start];//���ó�ʼ�Ĳο�ֵ
		int i= start,j;//��ʼ��i,j
		for(j=start+1;j<=end;j++){
			if(array[j]<key){
				int temp = array[j];
				array[j] = array[i+1];
				array[i+1] = temp;
				i++;
			}
		}
			array[start] = array[i];//������Ԫ���뵥Ԫ
			array[i] = key;
			quicksort(array, start, i-1);
			quicksort(array, i+1, end);
		}
		
		
		
	}

	
}
