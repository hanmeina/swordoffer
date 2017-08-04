package interview;

import java.util.Arrays;

/**
 * ²éÕÒÖ§ÅäÊı
 * @author Administrator
 *
 */
public class ArrayTest {

	 public static void main(String[] args) {
		int[] a = {3,4,3,2,-1,3,3,3};
		int j = judge(a);
		if(j==-1){
			System.out.println("NO dominator");
			
		}else{
			System.out.println("The dominator is "+a[j]);
		
		}
	}
	 
	 private static int judge(int[] a){
		 Arrays.sort(a);
		 int counter =1;
		 for(int i=0;i<a.length-1;i++){
			 if(a[i] == a[i+1]){
				 counter++;
				 
				 if(((double)counter/a.length)>0.5){
					 return i;
				 }
			 }else{
				 counter = 1;
			 }
		 }
		 
		 return -1;
	 }
}
