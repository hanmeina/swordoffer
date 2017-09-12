package lianxi;

import java.net.Inet6Address;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.MediaName;

public class main1 {  
 public static void main(String[] args) {
	 String s="(((())))((((()))))()";
	 
	 int max=0;
	 int b=0;
	 boolean  flag = true;
	while(flag){
		
	
		 int shengdu = 0;
		 String a = s.substring(b);
		 System.out.println(a);
		 if(a.length()==0){
			 flag=false;
		 }
	 for (int i = 0; i < a.length(); i++) {
		 char c = a.charAt(i);
		 if(c == '('){
			 shengdu=shengdu+1;
			 if(max<shengdu)
			 max = shengdu;
		 }else{
			 if(c == ')'){
				 shengdu=shengdu-1;
			 }else{
				 if(shengdu==0){ 
					 b=i;
					 break;
				 }
			 }
			 
		 }
	 }
	 
	 System.out.println(max);
	 max=0;
 }
}
}
