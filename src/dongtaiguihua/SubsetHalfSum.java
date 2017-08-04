package dongtaiguihua;
/**
 * 求N个元素的子集，其和刚好是n个元素的一半
 * @author Administrator
 *
 */
public class SubsetHalfSum {
  public static void main(String[] args) {
	  int a[]  = {3,2,4,19,3,7,13,10,6,11};
		int subHalfSum=subSetHalfSum(a, a.length);
		System.out.println("subHalfSum:"+subHalfSum);
}
  static int T[] = new int[10240];
  public static int subSetHalfSum(int a[],int n){
	  int k=0;
	  for(int i=0;i<n;i++){
		  k+=a[i];
	  }
	  System.out.println("k"+k);
	  System.out.println("k/2"+k/2);
	  T[0] = 1;
	  for(int i=1;i<=k;i++){//初始化表
		  T[i] = 0;
	  }
	  for(int i=0;i<n;i++){
		  for(int j=k-a[i];j>=0;j--){
			  if(T[j]==1){
				  T[j+a[i]] =1;
				  
			  }
		  }
	  }
	  return T[k/2];
	  
  }
}
