package swordoffer;
/**
 * 面试题 9 ：斐波那契数列
题目一：写一个函数，输入 n，求斐波那契数列的第 n 项
 * @author Administrator
 *
 */
public class Fibonacci {
  public static void main(String[] args) {
	System.err.println(fibonacci(1));
}
  public static long fibonacci(int n){
	  long result = 0;
	  long preOne = 0;
	  long preTwo = 1;
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
}
