package swordoffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Administrator
 *请实现一个函数，将一个字符串中的空格替换成“%20”。
 *例如，当字符串为We Are Happy.
 *则经过替换之后的字符串为We%20Are%20Happy。
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
  * 时间复杂度为O(n^2)
  * @param str
  * @return
  * 不建议用这个
  */
 public static String replaceSpace(StringBuffer str){
	String  s = "";
	Pattern pattern = Pattern.compile("\\s");//空格的正则表达式
	Matcher  matcher = pattern.matcher(str);
	s = matcher.replaceAll("%20");	
	return s;
 } 
 
 /**
  * 时间复杂度为O(n)
  * @param str
  * @return
  * 从后往前替换空格
  * 有两个指针，p1指向原始字符的末尾，P2指向替换之后的末尾（p1+2*空格数），p1向前移动，
  * 逐个将它指向的字符复制到p2指向的位置，直到碰到第一个空格为止，
  * 碰到第一个空格之后，将p1向前移动一格，在p2之前插入字符串“%20”，
  * “%20”长度为3，，将p2移动3格，
  */
 public static  void replaceSpace2(char string[],int length){
 if(string==null || length<=0){
	 return ;
 }	
 //orignalLength 为string的原始长度
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
//newLength 为新string的长度
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
