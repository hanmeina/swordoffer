package swordoffer;
//��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
//ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
//����������һ����ά�����һ���������ж��������Ƿ��и�������
public class Solution1 {
public static void main(String[] args) {
	int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
	//System.out.println(array[0].length);//�еĴ�С
//	System.out.println(array.length);//�еĴ�С
   boolean  flag = Find(7, array, array.length,array[0].length );
     System.out.println(flag);
}
public static  boolean Find(int target,int[][] array,int rows,int cols){
	boolean found = false;
	if(array!=null && rows>0 && cols>0){
		int row = 0;
		int col = cols-1;
		while(row<rows && col>=0){
            if(array[row][col]==target){
            	found = true;
            	break;
            }else if(array[row][col]>target){
            	col--;
            }else{
            	row++;
            }
		}
	}
	return found;
}
}
