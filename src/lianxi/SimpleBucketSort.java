package lianxi;

import java.util.Scanner;

//最简单的通排序
public class SimpleBucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a = new int[11];//代表0-10分数
       int i,j,num=0,t=0;
       for(i = 0 ; i<a.length ; i++){
    	   a[i] = 0;
       }
      // int[] b = new int[5];
       System.out.println("请输入有几个数");
       Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			 num = scanner.nextInt();			
		  }
       for ( j=1 ; j <=num; j++) {
    	   System.out.println("请输入第"+j+"个分数");
		   Scanner scanner1 = new Scanner(System.in);
		   if (scanner1.hasNext()) {
			a[j] = scanner1.nextInt();				
		   }
		   a[t]++;
     	}
 

      
	}

}
