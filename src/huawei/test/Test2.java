package huawei.test;

import java.util.Scanner;
/**
 * ��ʦ��֪����ĳĳͬѧ���У�������ߵ��Ƕ��٣�����������ģ����ʦ��ѯ�ʡ���Ȼ����ʦ��ʱ����Ҫ����ĳλͬѧ�ĳɼ�. 
��������:
�����������������ݡ�
ÿ�������һ��������������N��M��0 < N <= 30000,0 < M < 5000��,�ֱ����ѧ������Ŀ�Ͳ�������Ŀ��
ѧ��ID��Ŵ�1�ൽN��
�ڶ��а���N��������������N��ѧ���ĳ�ʼ�ɼ������е�i��������IDΪi��ѧ���ĳɼ�
��������M�У�ÿһ����һ���ַ�C��ֻȡ��Q����U������������������A,B,��CΪ'Q'��ʱ��, ��ʾ����һ��ѯ�ʲ�������ѯ��ID��A��B������A,B����ѧ�����У��ɼ���ߵ��Ƕ���
��CΪ��U����ʱ�򣬱�ʾ����һ�����²�����Ҫ���IDΪA��ѧ���ĳɼ�����ΪB��
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
