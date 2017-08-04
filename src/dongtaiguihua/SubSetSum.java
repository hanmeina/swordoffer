package dongtaiguihua;
/**
 * ×Ó¼¯ºÏ
 * @author Administrator
 *
 */
public class SubSetSum {
  public static void main(String[] args) {
	  int a[]  = {3,2,4,19,3,7,13,10,6,11};
	  int subSum=subSetSum(a, a.length, 17);
	System.out.println("subSum:"+subSum);
}
  public static int subSetSum(int a[] ,int n,int  T){
	 int i,j;
	 int M[][] = new int[n+1][T+1];
	 M[0][0]=0;
	 for(i=1;i<=T;i++){
		 M[0][i]=0;
	 }
	 for(i=1;i<=n;i++){
		 for(j=0;j<=T;j++){
			 M[i][j] = M[i-1][j] | M[i-1][j-a[i]];
		 }
	 }
	 
	 return M[n][T];
	  
	  
  }
}
