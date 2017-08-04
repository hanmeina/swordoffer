package huawei.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
/**
 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作。
 
 
Input Param 
     n               输入随机数的个数     
 inputArray      n个随机整数组成的数组 
     
Return Value
     OutputArray    输出处理后的随机整数
     注：测试用例保证输入参数的正确性，答题者无需验证。测试用例不止一组。

 
 

输入描述:
输入多行，先输入随机整数的个数，再输入相应个数的整数


输出描述:
返回多行，处理后的结果
 * @author Administrator
 *
 */
public class Main2 {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	List<Integer> list1 = new ArrayList<>();
		int n = in.nextInt();
		while(n>0){
			list1.add(in.nextInt());
			n--;	
		}
		 List<Integer> list2=new ArrayList();
	        //遍历arr1容器
	        for(Iterator it=list1.iterator();it.hasNext();){
	            Integer i=(Integer) it.next();
	            //如果arr2容器中不包含当前的arr1容器的元素
	            if(!(list2.contains(i))){
	            	list2.add(i);
	            }
	        }
	        //清空arr1容器中的元素
	        list1.clear();
	        //把arr2中的元素赋给arr1容器中
	        list1.addAll(list2);
	       
	        Collections.sort(list1); 
	        for(int i=0;i<list1.size();i++){
	        	System.out.println(list1.get(i));
	        }
	  
}
}
