package swordoffer;
/**
 * ������ 4
 * ��ʵ��һ�����������ַ����е�ÿ���ո��滻�ɡ�%20����
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
