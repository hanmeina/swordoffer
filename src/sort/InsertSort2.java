package sort;

import java.util.Scanner;

/**
 *ʹ��������в�������
 * @author Administrator
 *
 */
public class InsertSort2 {
   public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	
	int x=scanner.nextInt();
	int f=scanner.nextInt();
	int d=scanner.nextInt();
	int p=scanner.nextInt();
	
	int day=0;//�������
	boolean flg=true;
	if(f*x > d){
		while(flg){
			if(d>day*x){
				day++;
			}else{
				day--;
				flg=false;
			}
		}	
	}else{
		d=d-f*x;
		while(flg){
			if(d>(day*x+day*p)){
				day++;
			}else{
				day--;
				flg=false;
				day+=f;
			}
		}
	}
	System.out.println(day);
}
 
}