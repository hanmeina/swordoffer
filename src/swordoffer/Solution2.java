package swordoffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Administrator
 *��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20����
 *���磬���ַ���ΪWe Are Happy.
 *�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class Solution2 {
 public static void main(String[] args) {
	 StringBuffer  stringBuffer = new StringBuffer();
	 stringBuffer.append("We Are Happy.");
  // String s =	replaceSpace(stringBuffer);
	 String str = "we are happy";
     char[] charOld = str.toCharArray();
     char[] charNew = new char[100];
     for (int j = 0; j < charOld.length; j++) {
         charNew[j] = charOld[j];
     }
	 replaceSpace2(charNew, 100);
    System.out.println(charNew);
}
 /**
  * ʱ�临�Ӷ�ΪO(n^2)
  * @param str
  * @return
  * �����������
  */
 public static String replaceSpace(StringBuffer str){
	String  s = "";
	Pattern pattern = Pattern.compile("\\s");//�ո��������ʽ
	Matcher  matcher = pattern.matcher(str);
	s = matcher.replaceAll("%20");	
	return s;
 } 
 
 /**
  * ʱ�临�Ӷ�ΪO(n)
  * @param str
  * @return
  * �Ӻ���ǰ�滻�ո�
  * ������ָ�룬p1ָ��ԭʼ�ַ���ĩβ��P2ָ���滻֮���ĩβ��p1+2*�ո�������p1��ǰ�ƶ���
  * �������ָ����ַ����Ƶ�p2ָ���λ�ã�ֱ��������һ���ո�Ϊֹ��
  * ������һ���ո�֮�󣬽�p1��ǰ�ƶ�һ����p2֮ǰ�����ַ�����%20����
  * ��%20������Ϊ3������p2�ƶ�3��
  */
 public static  void replaceSpace2(char string[],int length){
 if(string==null || length<=0){
	 return ;
 }	
 //orignalLength Ϊstring��ԭʼ����
 int originalLength =0;
 int numberOfBlank = 0;
 int i=0;
  while(string[i]!='\0'){
	  ++originalLength;
	  if(string[i]==' '){
	  ++numberOfBlank;
	  }
	  ++i;
  }
  System.out.println("originalLength:"+originalLength);
//newLength Ϊ��string�ĳ���
  int newLength = originalLength+2*numberOfBlank;
  System.out.println("newLength:"+newLength);
  if(newLength>length){return ;}
  int indexOfOriginal = originalLength;
  int indexOfNew = newLength;
  while(indexOfOriginal>=0 && indexOfNew>indexOfOriginal){
	  if(string[indexOfOriginal]==' '){
		  string[indexOfNew--]='0';
		  string[indexOfNew--]='2';
		  string[indexOfNew--]='%';
	  }else{
		  string[indexOfNew--] = string[indexOfOriginal];
	  }
	  --indexOfOriginal;
  }
  
 } 
}
