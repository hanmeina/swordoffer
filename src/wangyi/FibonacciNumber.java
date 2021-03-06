package wangyi;

import java.util.Scanner;

/**
 * Fibonacci数列是这样定义的： 
F[0] = 0 
F[1] = 1 
for each i ≥ 2: F[i] = F[i-1] + F[i-2] 
因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, …，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。 
输入描述: 
输入为一个正整数N(1 ≤ N ≤ 1,000,000)

输出描述: 
输出一个最小的步数变为Fibonacci数”

输入例子: 
15

输出例子: 
2
 * @author Administrator
 *
 */
public class FibonacciNumber {
	private static final int[] fibo = new int[32];
	static{
		fibo[0]=0;
		fibo[1]=1;
		for(int i=2;i<32;i++){
			fibo[i] = fibo[i-1]+fibo[i-2];
		}
	}
	
	
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while(scanner.hasNext()){
		int n = scanner.nextInt();
		for(int i=0;i<32;i++){
			if(fibo[i]<=n && n<=fibo[i+1]){
				int ans = Math.min(n-fibo[i], fibo[i+1]-n);
				System.out.println(ans);
				break;
			}
		}
	}
	scanner.close();
}
}
