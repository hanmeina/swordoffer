package huawei.test;
import java.util.Scanner;
 
public class Tests {
 
    static Scanner scanner = new Scanner(System.in);
 
    public static void count(String s) {
 
        int low, upper, num, others;
        low = upper = num = others = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num++;
                continue;
            }
            if (Character.isLowerCase(s.charAt(i))) {
                low++;
                continue;
            }
            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
                continue;
            } else {
                others++;
            }
        }
        System.out.println(" 大写字母的个数为：" + upper + "\n 小写字母的个数为：" + low+ "\n 数字的个数为： " + num + "\n 其他字符的个数为： " + others);
    }
 
    public static void subCounter(String str1, String str2) {
 
        int counter = 0;
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.substring(i, i + str2.length()).equalsIgnoreCase(str2)) {
                counter++;
            }
        }
        System.out.println("子字符串的个数为： " + counter);
 
    }
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入一个字符串:");
        String string = scanner.nextLine();
        count(string);
        System.out.println("-----------------------------");
        // 查询在这个字符串中存在多少个子字符串str。
        System.out.println("请输入一个您想查询的子字符串:");
        String str = scanner.nextLine();
        subCounter(string, str);
    }
}