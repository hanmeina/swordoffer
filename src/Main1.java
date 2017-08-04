
public class Main1 {
 public static void main(String[] args) {
  int n=4;
	 for(int i =1; i<=n;i++){
         for(int j=1;j<=i;j++){
       	 if(j!=i){
        		 System.out.print(i+"*");
        	 }else{
        		 System.out.print(i);
        	 }       
         }
       System.out.println();
	 }
	 for(int i =n-1; i>=0;i--){
         for(int j=1;j<=i;j++){
        	 if(j!=i){
        		 System.out.print(i+"*");
        	 }else{
        		 System.out.print(i);
        	 }         
         }         
         System.out.println();
	 }
}
 }
