

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.LinkedList;  
import java.util.List;  
import java.util.Queue; 
		    public class Test {  
		                
		        public static void main(String[] args) {  
		            //int [] arr={4,2,5,3,7};  
		            //int [] arr={3,5,1,5,9,10,2,6};  
		            //int [] arr={16,15,11,8,5,3,2,1};                
		            int [] arr={4,2,5,3,7};  
		              	           
		            List<Integer> re=new ArrayList<Integer>();  
		            for(int i=0;i<arr.length;i++){  
		                re.add(arr[i]);  
		            }                              
		            Collections.sort(re);            
		            List<Integer> bb=new ArrayList<Integer>();  
		            int k=0;  
		            for(int i=0;i<arr.length/2;i++){  
		                bb.add(re.get(k));  
		                k+=2;  
		            }                
		            if((arr.length)%2!=0){  
		                bb.add(re.get(re.size()-1));          
		            }      
		            int[] res=new int[bb.size()];  
		            for(int u=0;u<bb.size();u++){  
		                res[u]=bb.get(u); 
		            }  
		        }  
}


