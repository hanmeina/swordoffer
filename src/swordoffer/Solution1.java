package swordoffer;
//在一个二维数组中，每一行都按照从左到右递增的顺序排序，
//每一列都按照从上到下递增的顺序排序。请完成一个函数，
//输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
public class Solution1 {
public static void main(String[] args) {
	int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
	//System.out.println(array[0].length);//列的大小
//	System.out.println(array.length);//行的大小
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
