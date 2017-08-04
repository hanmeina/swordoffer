package swordoffer;



/**
 * 面试题 3 二维数组中的查找
 * 判断数组中是否含有输入的整数
 * @author Administrator
 *
 */
public class Find {
   public static void main(String[] args) {
	   int[][] testarray=new int[4][4];
	   testarray[0][0]=1;
	   testarray[0][1]=2;
	   testarray[0][2]=8;
	   testarray[0][3]=9;
	   testarray[1][0]=2;
	   testarray[1][1]=4;
	   testarray[1][2]=9;
	   testarray[1][3]=12;
	   testarray[2][0]=4;
	   testarray[2][1]=7;
	   testarray[2][2]=10;
	   testarray[2][3]=13;
	   testarray[3][0]=6;
	   testarray[3][1]=8;
	   testarray[3][2]=11;
	   testarray[3][3]=15;
	   System.out.println(find(testarray, 1));
}
   
   public static boolean  find(int[][] a,int number){
	   if(a==null){return false;}
	   int column = a[0].length-1;
	   System.out.println("column:"+column);
	   int row =0;
	   while(row<a.length && column>=0){
		   if(a[row][column]==number){
			   return true;
		   }
		   if(a[row][column]>number){
			   column--;
		   }else{
			   row++;
		   }
	   }
	   return false;
   }
}
