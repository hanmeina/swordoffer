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
 * ��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ������ü����������N��1��1000֮������������N��1000�������������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ�����
 
 
Input Param 
     n               ����������ĸ���     
 inputArray      n�����������ɵ����� 
     
Return Value
     OutputArray    ����������������
     ע������������֤�����������ȷ�ԣ�������������֤������������ֹһ�顣

 
 

��������:
������У���������������ĸ�������������Ӧ����������


�������:
���ض��У������Ľ��
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
	        //����arr1����
	        for(Iterator it=list1.iterator();it.hasNext();){
	            Integer i=(Integer) it.next();
	            //���arr2�����в�������ǰ��arr1������Ԫ��
	            if(!(list2.contains(i))){
	            	list2.add(i);
	            }
	        }
	        //���arr1�����е�Ԫ��
	        list1.clear();
	        //��arr2�е�Ԫ�ظ���arr1������
	        list1.addAll(list2);
	       
	        Collections.sort(list1); 
	        for(int i=0;i<list1.size();i++){
	        	System.out.println(list1.get(i));
	        }
	  
}
}
