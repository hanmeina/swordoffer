package swordoffer;
/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n��
 * �������쳲��������еĵ�n�
     n<=39
 * @author Administrator
 *
 */
public class Solution7 {
  public static void main(String[] args) {
	 System.out.println(Fibonacci(39));
	  
}
  //ѭ��ʵ��
  public static int Fibonacci(int n) {
   
	  int result = 0;
	  int  preOne = 0;
	  int  preTwo = 1;
	  if(n==0){
		  return preOne;
	  }
	  if(n==1){
		  return preTwo;
	  }
	  for(int i=2;i<=n;i++){
		  result = preOne+preTwo;
		  preOne = preTwo;
		  preTwo = result;
	  }
	  return result;
}
  //�ݹ�ʵ�� ���ٶ���
  
  public static int Fibonacci2(int n) {
	   
	  int result = 0;
	  int  preOne = 0;
	  int  preTwo = 1;
	  if(n==0){
		  return preOne;
	  }
	  if(n==1){
		  return preTwo;
	  }
	 
	  return Fibonacci2(n-1)+Fibonacci2(n-2);
}
}