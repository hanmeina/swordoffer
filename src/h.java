import java.util.Scanner;

public class h {

	
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int length = scanner.nextInt();
	        int[] nums = new int[length];
	        for (int i = 0; i < length; i++) {
	            nums[i] = scanner.nextInt();
	        }

	        //��¼ÿ��λ������������еĳ���
	        int[] result = new int[length];      
	        for (int i = 0; i < length; i++) {
	            result[i] = 1;//��1��ʼ
	            for (int j = 0; j < i; j++) {
	                //�����iλ�ô���jλ�ã�����jλ�õ�����������еĳ���+1����Ŀǰiλ�õ�����������еĳ��ȣ������iλ�õ������������
	                if (nums[j] <= nums[i] &&
	                        result[j] + 1 > result[i]) {
	                    result[i] = result[j] + 1;
	                }
	            }
	        }
	        int max = 1;
	        for (int i : result)
	            max = i > max ? i : max;
	        System.out.println(max);
	    }
}
