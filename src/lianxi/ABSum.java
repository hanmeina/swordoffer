package lianxi;

import java.lang.invoke.SwitchPoint;

public class ABSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int a=	Integer.parseInt(printBits(2));
//	int b = Integer.parseInt(printBits(3));
//	System.out.println(a+" "+b);
//	System.out.println(a | b);
//		System.out.println(aplusb(15, 2));
//		
		
		
		System.out.println(addBinary1("10", "0"));
		
		
	}
	
//	public int aplusb(int a, int b) {
//        // write your code here, try to do it without arithmetic operators.
//       
//    
//    
//    }
 
	//十进制转二进制
	 public static String printBits(int n){
	      
	       StringBuffer result = new StringBuffer();
	        int temp = 0;
	        while(n!=0){
	            temp = n % 2;
	            n = n / 2;
	            result.insert(0,temp);
	        }
	        return result.toString();
	  }
	 
	
	 //给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
	  public static int aplusb(int a, int b) {
	        // write your code here, try to do it without arithmetic operators.
	       if(b==0){
	           return a;
	       }else{
	           int c = a^b;
	           int d = (a&b)<<1;
	           return aplusb(c,d);
	       }
	       
	    }
	  
	  public  static String addBinary1(String a, String b) {
	        // Write your code here
	    
	    String result = " ";
	    int alen = a.length() - 1;
	    int blen = b.length() - 1;
	    int sum = 0;
	    while(alen >= 0 || blen >= 0){
	        if(alen >= 0){
	        	System.out.println(a.substring(alen,alen+1));
	            sum += Integer.parseInt(a.substring(alen,alen+1));
	            alen--;
	        }
	         if(blen >= 0){
	        	 System.out.println(b.substring(blen,alen+1));
	            sum += Integer.parseInt(b.substring(blen,blen+1));
	            blen--;
	        }
	        if(sum == 2){
	            result = "0"+result;
	            System.out.println("sum==2："+result);
	            sum=1;
	        }else if(sum == 0 || sum ==1){
	        	
	            result = sum + "" + result;
	            System.out.println("sum==0|1："+result);
	            sum =0;
	        }else if(sum == 3){
	            result = "1" +result;
	            sum = 1;
	            
	        }
	        
	        
	    }
	    if(sum == 1) result = "1" + result;
	    return result;
	    
	    
	    }
	    
	    
	    
	
	 
}
