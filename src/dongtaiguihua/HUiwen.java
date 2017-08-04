package dongtaiguihua;
/**
 * 求最长回文子序列
 * @author Administrator
 *
 */
public class HUiwen {
   public static void main(String[] args) {
	int a[] = {1,2,3,4,3,5,6,1,1,3,4,2,2,1,6};
	int longestPalindromeSubSequence =longestPalindromeSubSequence(a, a.length);
	System.out.println("longestPalindromeSubSequence:"+longestPalindromeSubSequence);
}
   public static int longestPalindromeSubSequence(int a[],int n){
	   int max = 1;
	   int i,k,L[][] = new int[n][n];
	   for(i=1;i<n-1;i++){
		   L[i][i] = 1;
		   if(a[i] ==a[i+1]){
			   L[i][i+1] = 1;
			    max = 2;
		   }else{
			   L[i][i+1] =0;
		   }
		   
	   }
	   
	   for(k=3;k<=n;k++){
		   for(i=1;i<=n-k+1;i++){
			int  j=i+k-1;
			   if(a[i]==a[j]){
				   L[i][j] =  2+L[i+1][j-1];
				   max = k;
			   }else{
				   L[i][j] =  Math.max(L[i+1][j],L[i][j-1]);
			   }
		   }
	   }
	   
	   return max;
   }
}
