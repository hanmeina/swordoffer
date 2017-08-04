
public class Main {
  public static void main(String[] args) {
	  int n = 5;
	  int start = 1;
	  int end = n*(n+1);
	  for(int i=0; i<n; i++){
	      for(int j=i; j>0; j--)
	          System.out.print("--");
	      for(int j=0; j<n-i; j++)
	          System.out.print(start++ +"*");
	      for(int j=0; j<n-i; j++){
	          if(j == n-i-1)
	              System.out.print( (end - (n-j)+1) );
	          else
	              System.out.print( (end - (n-j)+1) + "*" );
	      }
	      end = end - (n- i)+1;
	      System.out.println();
}  
 
}
  }
