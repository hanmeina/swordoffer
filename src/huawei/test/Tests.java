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
        System.out.println(" ��д��ĸ�ĸ���Ϊ��" + upper + "\n Сд��ĸ�ĸ���Ϊ��" + low+ "\n ���ֵĸ���Ϊ�� " + num + "\n �����ַ��ĸ���Ϊ�� " + others);
    }
 
    public static void subCounter(String str1, String str2) {
 
        int counter = 0;
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            if (str1.substring(i, i + str2.length()).equalsIgnoreCase(str2)) {
                counter++;
            }
        }
        System.out.println("���ַ����ĸ���Ϊ�� " + counter);
 
    }
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("������һ���ַ���:");
        String string = scanner.nextLine();
        count(string);
        System.out.println("-----------------------------");
        // ��ѯ������ַ����д��ڶ��ٸ����ַ���str��
        System.out.println("������һ�������ѯ�����ַ���:");
        String str = scanner.nextLine();
        subCounter(string, str);
    }
}