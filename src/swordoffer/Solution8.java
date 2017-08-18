package swordoffer;
/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * @author Administrator
 *
 */
public class Solution8 {
  public static void main(String[] args) {
	System.out.println(JumpFloor(38));
}
  public static int JumpFloor(int target) {
     
	  if(target==1){
    	 return 1;
     }
     if(target==2){
    	 return 2;
     }
	  return JumpFloor(target-1)+JumpFloor(target-2);
  }
}
