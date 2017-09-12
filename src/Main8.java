
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Main8 {
public static void main(String[] args) {
  int[] streamNum ={5,9,8,7,16};
  int element = 3; 
  Map<Integer, Integer> map  = new TreeMap<>(new Comparator<Integer>() {
	  @Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
});
	for(int i=0;i<streamNum.length;i++){
	 int count =  	handshakeStream(streamNum[i]);
	 map.put(streamNum[i],count);
	}
	Map<Integer, Integer>  masp =   sortByValue(map);
	 Set<Integer> keySet = masp.keySet();
     Iterator<Integer> iter = keySet.iterator();   
    // int count=0;
     while (element--!=0) {
    	// count++;
         int key = iter.next();
         System.out.println(key + ":" + masp.get(key));
//         if(count==element){
//        	 break;
//         }
     }	
}
public static <K, V extends Comparable<? super V>> Map<K, V>   
sortByValue( Map<K, V> map )  
{  
List<Map.Entry<K, V>> list =  
    new LinkedList<Map.Entry<K, V>>( map.entrySet() );  
Collections.sort( list, new Comparator<Map.Entry<K, V>>()  
{  
    public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )  
    {  
        return (o2.getValue()).compareTo( o1.getValue() );  
    }  
} );  

Map<K, V> result = new LinkedHashMap<K, V>();  
for (Map.Entry<K, V> entry : list)  
{  
    result.put( entry.getKey(), entry.getValue() );  
}  
return result;  
}  
  static int  handshakeStream(int num){	 
		//调用int的封装类Integer中的二进制转换方法toBinaryString(int);
		System.out.println(Integer.toBinaryString(num));
	    String[] nums =Integer.toBinaryString(num).split("");
	    int count =0;
	    for( int i=0;i<nums.length;i++){
		  if(Integer.parseInt(nums[i])==1){
	          count++;
	         } 
	     }
	    System.out.println(count);
	    return count;
  }
}
