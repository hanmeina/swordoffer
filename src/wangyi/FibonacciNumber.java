package wangyi;

import java.util.Scanner;

/**
 * Fibonacci��������������ģ� 
F[0] = 0 
F[1] = 1 
for each i �� 2: F[i] = F[i-1] + F[i-2] 
��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ������Fibonacci�����е������ǳ�ΪFibonacci��������һ��N�����������Ϊһ��Fibonacci����ÿһ������԰ѵ�ǰ����X��ΪX-1����X+1�����ڸ���һ����N��������Ҫ���ٲ����Ա�ΪFibonacci���� 
��������: 
����Ϊһ��������N(1 �� N �� 1,000,000)

�������: 
���һ����С�Ĳ�����ΪFibonacci����

��������: 
15

�������: 
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
