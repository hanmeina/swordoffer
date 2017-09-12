import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;
/**
 * 中兴机试题，全排列，输出最小的一个，首位不从0开始
 * @author Administrator
 *
 */
public class Mian6 {
	
	    
    static List<int[]> allSorts = new ArrayList<int[]>();         
    public static void permutation(int[] nums, int start, int end) {
        if (start == end) { // 当只要求对数组中一个数字进行全排列时，只要就按该数组输出即可
            int[] newNums = new int[nums.length]; // 为新的排列创建一个数组容器
            for (int i=0; i<=end; i++) {
                newNums[i] = nums[i];
            }
            allSorts.add(newNums); // 将新的<a href="https://www.baidu.com/s?wd=%E6%8E%92%E5%88%97%E7%BB%84%E5%90%88&tn=44039180_cpr&fenlei=mv6quAkxTZn0IZRqIHckPjm4nH00T1YkrjT3uH7-uWnvuHm4ujn10ZwV5Hcvrjm3rH6sPfKWUMw85HfYnjn4nH6sgvPsT6KdThsqpZwYTjCEQLGCpyw9Uz4Bmy-bIi4WUvYETgN-TLwGUv3EnHRYnjf1nHcsnH6YPHD4rHDYPs" target="_blank" class="baidu-highlight">排列组合</a>存放起来
        } else {
            for (int i=start; i<=end; i++) {
                int temp = nums[start]; // 交换数组第一个元素与后续的元素
                nums[start] = nums[i];
                nums[i] = temp;
                permutation(nums, start + 1, end); // 后续元素递归全排列
                nums[i] = nums[start]; // 将交换后的数组还原
                nums[start] = temp;
            }
        }
    }
         
    public static void main(String[] args) {
    	  long lockingKey = 709;
    	  BigDecimal bigDecimal = new BigDecimal(lockingKey);
    	  String string  =bigDecimal.toString();
    	  String[] charArray = string.split("");
    	  int[] numArray = new int[charArray.length];  
    	 for(int i=0; i<charArray.length;i++){  
    		 numArray[i]=  Integer.parseInt(charArray[i]) ; 
    	 }
        
        permutation(numArray, 0, numArray.length - 1);
        int[][] a = new int[allSorts.size()][]; // 你要的二维数组a
        allSorts.toArray(a);
         
       List<String>  list = new ArrayList<>();
       
        // 打印验证
        for (int i=0; i<a.length; i++) {
            int[] nums = a[i];
            StringBuffer  stringBuffer = new StringBuffer();
            for (int j=0; j<nums.length; j++) {           
               System.out.print(nums[j]+"**");
               stringBuffer.append(nums[j]);               
            }
          list.add(stringBuffer.toString());
          System.out.println();
        }
    
        int min = Integer.parseInt(list.get(0));
        for(int i=1;i<list.size();i++){
        	System.out.println(list.get(i)+"--");
        if(Integer.parseInt(list.get(i))>Math.pow(10, numArray.length-1)){
        	if(Integer.parseInt(list.get(i))<min){
        		 min= Integer.parseInt(list.get(i));
        	}
        }	
        }
        System.out.println(min+"min");
        System.out.println(a.length);
    }
}