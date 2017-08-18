package swordoffer;
/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项。
     n<=39
 * @author Administrator
 *
 */
public class Solution7 {
  public static void main(String[] args) {
	 System.out.println(Fibonacci(39));
	  
}
  //循环实现
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
  //递归实现 ，速度慢
  
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