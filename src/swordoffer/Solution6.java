package swordoffer;
/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
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
		   //如果下标为index1 ,index2,indexmid 三个指向的数字相同
		   //则使用书序查找法
		   
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
