package swordoffer;
/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
 * �����������һ��n����̨���ܹ��ж�����������
 * @author Administrator
 *
 */
public class Solution9 {
  public static void main(String[] args) {
	System.out.println(JumpFloorII(4));
}
  public static  int JumpFloorII(int target) {    
	  return 1<<--target;
  }
} 
