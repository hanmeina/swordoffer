package huawei.test;

import java.util.Scanner;
/**
 * 写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）

输入描述:
输入一个十六进制的数值字符串。


输出描述:
输出该数值的十进制字符串。
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
