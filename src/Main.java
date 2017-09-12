
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
    	int N=0;
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        double [][]a =new double[N][];
        for(int i=0;i<N;i++){
        	for(int j=0;j<4;j++){
        		a[i][j] =sc.nextDouble();
        	}
        }
        for(int i=0;i<N;i++){
        	for(int j=0;(j+3)<4;j++){
        		double[] b= new double[N];
        		b[j]=Math.sqrt(a[i][j]*a[i][j+1]-a[i][j+2]*a[i][j+3]);
        		System.out.println(b[i]);
        	}
        }
    }
}