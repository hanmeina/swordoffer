package huawei.test;

import java.util.Scanner;
/**
 * ������һ�������⣺��ĳ�̵�涨����������ˮƿ���Ի�һƿ��ˮ��С��������ʮ������ˮƿ���������Ի�����ƿ��ˮ�ȣ�������5ƿ���������£�����9����ƿ�ӻ�3ƿ��ˮ���ȵ�3ƿ���ģ������Ժ�4����ƿ�ӣ���3���ٻ�һƿ���ȵ���ƿ���ģ���ʱ��ʣ2����ƿ�ӡ�Ȼ�������ϰ��Ƚ����һƿ��ˮ���ȵ���ƿ���ģ������Ժ���3����ƿ�ӻ�һƿ���Ļ����ϰ塣���С��������n������ˮƿ�������Ի�����ƿ��ˮ�ȣ� 

��������:
�����ļ�������10��������ݣ�ÿ������ռһ�У�������һ��������n��1<=n<=100������ʾС�����ϵĿ���ˮƿ����n=0��ʾ�����������ĳ���Ӧ��������һ�С�


�������:
����ÿ��������ݣ����һ�У���ʾ�����Ժȵ���ˮƿ�������һƿҲ�Ȳ��������0��
 * @author Administrator
 *
 */
public class Main1 {
	private static int counter = 0;  
    /** 
     * @param args 
     */  
    public static void main(String[] args)   
    {  
        String str ="sdSS**&HGJhadHCASch& ^^";  
        int i = stringNumbers(str);  
        System.out.println(i);  
    }  
      
    public static int stringNumbers(String str)  
    {  
        if (str.indexOf("java")==-1)  
        {  
            return 0;  
        }  
        else if(str.indexOf("java") != -1)  
        {  
            counter++;  
            stringNumbers(str.substring(str.indexOf("java")+4));  
            return counter;  
        }  
        return 0;  
    }  
}
