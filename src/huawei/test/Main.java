package huawei.test;

import java.util.*;
public class Main {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner in = new Scanner(System.in);
	try {
		String l1 = in.nextLine();//第一行（N M）
		String l2 = in.nextLine();//第二行
		String[] score = l2.split(" ");//成绩数组--N个
		int height = Integer.parseInt(l1.split(" ")[1]);
		ArrayList<String> operList = new ArrayList<>();
		//根据M值，确定输入操作个数
		for(int i = 0; i < height; i++){
			operList.add(in.nextLine());
		}
		//依次执行各操作
		for(int i =0; i < operList.size(); i++){
			String[] oper = operList.get(i).split(" ");
			switch (oper[0]) {
			case "Q":
				String[] result = new String[Integer.parseInt(oper[2])-Integer.parseInt(oper[1])+1];
				int start = Integer.parseInt(oper[1]);
				int end = Integer.parseInt(oper[2]);
				//查询起始，末尾均不能越界
				if( start>0 && end<=Integer.parseInt(l1.split(" ")[0]) && start<=end){
					int n = 0;
					for(int m = start-1; m<end; m++){
						result[n++] = score[m];
					}
					//一次冒泡排序，最小值移动到最后一位
					for(int k=0; k<result.length-1; k++){
						if(Integer.parseInt(result[k])> Integer.parseInt(result[k+1])){
							String str = result[k];
							result[k] = result[k+1];
							result[k+1] = str;
						}
					}
					System.out.println( result[result.length-1]);
				}else{
					
					//System.out.println("查询失败");
				}
				break;
			case "U":
				int obj = Integer.parseInt(oper[1]);
				//更新地址不能越界
				if(obj>0 && obj<=Integer.parseInt(l1.split(" ")[0])){
					score[obj-1] = oper[2];
				}else{
					//System.out.println("更新对象不存在，更新失败");
				}
				break;
			default:
				break;
			}
		}
	} catch (Exception e) {
		
	}finally {
		//显示关闭输入流
		in.close();
	}
}
}