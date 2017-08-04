package huawei.test;

import java.util.Scanner;
/**
 * 老师想知道从某某同学当中，分数最高的是多少，现在请你编程模拟老师的询问。当然，老师有时候需要更新某位同学的成绩. 
输入描述:
输入包括多组测试数据。
每组输入第一行是两个正整数N和M（0 < N <= 30000,0 < M < 5000）,分别代表学生的数目和操作的数目。
学生ID编号从1编到N。
第二行包含N个整数，代表这N个学生的初始成绩，其中第i个数代表ID为i的学生的成绩
接下来又M行，每一行有一个字符C（只取‘Q’或‘U’），和两个正整数A,B,当C为'Q'的时候, 表示这是一条询问操作，他询问ID从A到B（包括A,B）的学生当中，成绩最高的是多少
当C为‘U’的时候，表示这是一条更新操作，要求把ID为A的学生的成绩更改为B。
 * @author Administrator
 *
 */
public class Test2 {
	public static void main(String[] args) {
		
		String a ="aaa       aaa aaaa";
		trim(a);
	}
	

		public static void trim(String str){
			char[] aa = str.toCharArray();
			int e = aa.length;
			int num = 0;
			int flag= 0;
			for(int i=0;i<e;i++){
			if(aa[i]==' '){
			if(i==0){
			flag=1;
			}
			if(i==e-1){
			flag=2;  
			}
			num++;
			}else if(aa[i]!=' '){
			if(flag==1){
			for(int k=i;k<e;k++){
			aa[k-num]=aa[k];
			}
			e=e-num;
			i=i-num;
			flag=0;
			}else if(num>1){
			for(int m=i;m<e;m++){
			aa[m-num+1]=aa[m];
			}
			e=e-num+1;
			i=i-num+1;
			}
			num=0;
			}
			if(flag==2){
			e=e-num;
			}
			}


			for(int i=0;i<e;i++){
			System.out.print(aa[i]);
			}
			}
}
