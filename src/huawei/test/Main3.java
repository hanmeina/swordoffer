package huawei.test;

import java.util.Scanner;
/**
 * д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��

��������:
����һ��ʮ�����Ƶ���ֵ�ַ�����


�������:
�������ֵ��ʮ�����ַ�����
 * @author Administrator
 *
 */
public class Main3 {
	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner scanner = new Scanner(System.in);  
        while (scanner.hasNextLine()) {  
            String input = scanner.nextLine();  
            fun(input);  
        }  
    }  
    public static void fun(String input) {  
        String subString = input.substring(2, input.length());  
        int result = 0;  
        for (int i = 0; i < subString.length(); i++) {  
            if (subString.charAt(i) >= 'A' && subString.charAt(i) <= 'F') {  
                result += result * 15 + subString.charAt(i) - 'A' + 10;  
            } else if (subString.charAt(i) >= 'a' && subString.charAt(i) <= 'f') {  
                result += result * 15 + subString.charAt(i) - 'a' + 10;  
            } else {  
                result += result * 15 + subString.charAt(i) - '0';  
            }  
        }  
        System.out.println(result);  
}}
