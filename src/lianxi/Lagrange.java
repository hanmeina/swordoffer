package lianxi;

import java.util.Scanner;

public class Lagrange {
	
	static int flag = 0;
	
	public static float lagrange(float x0[],float y0[],int n, float x) {
		int i,j;
		float p[] = new float[100];
		float y = 0;
		for(i=0;i<n;i++){
			p[i] = y0[i];
			for(j=0;j<n;j++) {
				if(i!=j) p[i] *= (x-x0[j])/(x0[i]-x0[j]);
			}
			y += p[i];
		}
		return y;
	}
	public static void newton(float x0[],float y0[],int n) {
		int i,j;
		float p[] = new float[100];
		
		for(i=1;i<n;i++){
			p[0] = y0[i];
			for(j=0;j<n;j++) {
				p[j+1] = (p[j] - y0[j])/(x0[i] - x0[j]);
				y0[i] = p[i];
			}
		}
	}
	public static void main(String args[]){
		boolean flag1 = true;
		while(flag1){
			Scanner as = new Scanner(System.in);
			System.out.println("-----------------------------------------------------");
			System.out.println("-------------------插值法求解近似值-------------------");
	        System.out.println("-------------------请选择插值方法---------------------");
	        System.out.println("--------------------1、拉格朗日-----------------------");
	        System.out.println("--------------------2、牛顿插值-----------------------");
	        System.out.println("--------------------退出请按0-------------------------");
	        System.out.println("-----------------------------------------------------");
	        flag=as.nextInt();
	        if(flag == 0) {
	        	flag1=false;
	        	System.out.println("您已退出程序！欢迎下次使用。");
	        }
	        if(flag == 1){
	        	int n = 1;
	        	float x = 0;
	        	System.out.println("请输入n:");
	        	n = as.nextInt();
	        	System.out.println("请输入对应数组x0:");
	        	//System.out.println(n);
	        	float x0[] = new float[n];
	        	float y0[] = new float[n];
	        	for(int i=0;i<n;i++){
	        		x0[i] = as.nextFloat();
	        	}
	        	System.out.println("请输入对应数组y0:");
	        	for(int i=0;i<n;i++){
	        		y0[i] = as.nextFloat();
	        	}
	        	System.out.println("请输入值x:");
	        	x = as.nextFloat();
	        	System.out.println("多项式解为："+lagrange(x0,y0,n,x));
	        }
	        if(flag == 2){
	        	int i, n = 0;
	        	float x = 0,b;
	        	System.out.println("请输入n:");
	        	n = as.nextInt();
	        	System.out.println("请输入对应数组x0:");
	        	//System.out.println(n);
	        	float x0[] = new float[n];
	        	float y0[] = new float[n];
	        	for(i=0;i<n;i++){
	        		x0[i] = as.nextFloat();
	        	}
	        	System.out.println("请输入对应数组y0:");
	        	for(i=0;i<n;i++){
	        		y0[i] = as.nextFloat();
	        	}
	        	System.out.println("请输入x的值");
	        	x = as.nextFloat();
	        	newton(x0, y0, n);
	        	b = y0[n-1];
	        	for(i=n-2;i>=0;i--){
	        		b = b*(x - x0[i]) + y0[i];
	        	}
	        	System.out.println("多项式解为："+b);
	        	//5
	        	//x0=0.4 0.55 0.65 0.8 0.9
	        	//y0=0.41075 0.5781 0.69675 0.88811 1.02652
	        	//x=0.596 x=0.895
	        }
		}
	}

}
//n=4
//x0={0.5616 0.5628 0.5640 0.5652}
//y0={0.8274 0.8265 0.8257 0.8249}
//x=0.5635