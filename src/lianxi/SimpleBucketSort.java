package lianxi;

import java.util.Scanner;

//��򵥵�ͨ����
public class SimpleBucketSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] a = new int[11];//����0-10����
       int i,j,num=0,t=0;
       for(i = 0 ; i<a.length ; i++){
    	   a[i] = 0;
       }
      // int[] b = new int[5];
       System.out.println("�������м�����");
       Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			 num = scanner.nextInt();			
		  }
       for ( j=1 ; j <=num; j++) {
    	   System.out.println("�������"+j+"������");
		   Scanner scanner1 = new Scanner(System.in);
		   if (scanner1.hasNext()) {
			a[j] = scanner1.nextInt();				
		   }
		   a[t]++;
     	}
 

      
	}

}
