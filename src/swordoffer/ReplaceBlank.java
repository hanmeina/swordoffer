package swordoffer;
/**
 * 面试题 4
 * 请实现一个函数，把字符串中的每个空格替换成“%20”。
 * @author Administrator
 *
 */
public class ReplaceBlank {
  public static void main(String[] args) {
	  String s="We are happy.";
	  System.out.println(replaceBlank(s));
}
  public static  String replaceBlank(String input){
	 if(input == null){
		 return null;
	 }
	 StringBuffer  outputBuffer = new StringBuffer();
	 for(int i=0;i<input.length();i++){
		 if(input.charAt(i)==' '){
			 outputBuffer.append("%20");
		 }else{
			 outputBuffer.append(String.valueOf(input.charAt(i)));
		 }
	 }
	  
	  return outputBuffer.toString();
	  
  }
}
