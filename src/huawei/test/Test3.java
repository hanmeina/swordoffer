package huawei.test;

import java.util.Scanner;
/**
 * ������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ�������5ƿ���������£�����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ���ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ������Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ� 

��������:
�����ļ�������10��������ݣ�ÿ������ռһ�У�������һ��������n��1<=n<=100������ʾС�����ϵĿ���ˮƿ����n=0��ʾ�����������ĳ���Ӧ��������һ�С�


�������:
����ÿ��������ݣ����һ�У���ʾ�����Ժȵ���ˮƿ�������һƿҲ�Ȳ��������0��
 * @author Administrator
 *
 */
public class Test3 {

	    static int num2=0;//�ȵ���������  
	  
	    public static void main(String[] args){  
	        int[] num1 = new int[10];//��ƿ����  
	        int count = 0, temp;  
	        Scanner sc = new Scanner(System.in);  
	        while(count<10){  
	            temp = sc.nextInt();  
	            if(temp==0) break;  
	            num1[count] = temp;  
	            count++;  
	        }  
	  
	        for(int i=0;i<count;i++){  
	            num2 = 0;  
	            fun(num1[i]);  
	            System.out.println(num2);  
	        }  
	    }  
	  
	    public static void fun(int n){  
	        if(n==1){  
	            return;  
	        }if(n==2){  
	            num2++;  
	            return;  
	        }else if(n>=3){  
	            num2 = num2+n/3;  
	            fun(n/3+n%3);  
	        }  
	    }  
	}  

