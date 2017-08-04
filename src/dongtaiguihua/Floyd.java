package dongtaiguihua;
/**
 * 求最短路径算法
 * 弗洛伊德算法
 * @author Administrator
 *
 */
public class Floyd {
  public static void main(String[] args) {
	
}
 public static void floyd(int c[][],int a[][],int n){
	 int i,j,k;
	 for( i=0;i<=n-1;i++){
		 for(j=0;i<=n-1;j++){
			 a[i][j] = c[i][j];
		 } 
	 }
	 
	 for( i=0;i<=n-1;i++){a[i][i] = 0;}
	 for(k=0;k<=n-1;k++){
		 for(i=0;i<=n-1;i++){
			 for(j=0;j<=n-1;j++){
				 if(a[i][k]+a[k][j]<a[i][j]){
					 a[i][j] = a[i][k]+a[k][j];
					 
				 }
				 
			 }
			 
		 } 
		 
	 }
 }
}
