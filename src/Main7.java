
import java.util.Scanner;

public class Main7{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
		int N = in.nextInt();
		int first_col = 1;
		for(int i = 1; i <= N; i++){
		System.out.print(first_col);
		int tmp = first_col;
		for(int j = i+1; j <= N; j++){
		tmp += j;
		System.out.print(" " + tmp);
		}
		System.out.println();
		first_col += i;
		}
		}
		in.close();
	}
}