package swordoffer;
/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 * @author Administrator
 *
 */
public class Solution6 {
public static void main(String[] args) {
	int[] array = {1,0,1,1,1};
	int min = minNumberInRotateArray(array);
	System.out.println(min);
}
public static  int minNumberInRotateArray(int [] array) {
	 int index1 =0;
	   int index2 = array.length-1;
	   int indexmid = index1;
	   while(array[index1]>=array[index2]){
		   if(index2-index1==1){
			   indexmid = index2;
			   break;
		   }
		   indexmid = (index1+index2)/2;
		   //����±�Ϊindex1 ,index2,indexmid ����ָ���������ͬ
		   //��ʹ��������ҷ�
		   
		   if(array[index1]==array[index2] && array[indexmid]==array[index2]){
			   return minInorder(array,index1,index2);
		   }
		   if(array[indexmid]>=array[index1]){
			   index1 = indexmid;
		   }else if(array[indexmid]<=array[index2]){
			   index2 = indexmid;
		   }
		   
	   }
		return array[indexmid];

}
private static int minInorder(int[] array, int index1, int index2) {
	// TODO Auto-generated method stub
	int result = array[index1];
	for(int i =index1+1;i<=index2;i++){
		if(result>array[i]){
			result = array[i];
		}
	}
	return result;
}
}
