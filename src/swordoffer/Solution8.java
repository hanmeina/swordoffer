package swordoffer;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж�����������
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
