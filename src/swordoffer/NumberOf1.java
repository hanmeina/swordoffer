package swordoffer;
/**
 * ������ 10 ���������� 1  �ĸ���
��Ŀ����ʵ��һ������������һ��������������������Ʊ�ʾ�� 1 �ĸ���������
�� 9 ��ʾ�ɶ������� 1001���� 2 λ�� 1������������ 9��������� 2.
 * @author Administrator
 *
 */
public class NumberOf1 {
	public static void main(String[] args) {
		System.out.println(numberOf1(14));
		short s1=1 ;
	
	}
   public static int numberOf1(int n){
	  int count =0;
	  while(n!=0){
		  count++;
		  n = (n-1)&n;
	  }
	   
	   return count;
	   
   }
}
