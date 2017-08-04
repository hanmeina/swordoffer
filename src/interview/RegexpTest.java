package interview;
/**
 * 找出一个字符串中的数字
 * @author Administrator
 *
 */
public class RegexpTest {
  public static void main(String[] args) {
	String  s =  "1234fdgsfhght576vfbgfh89";
	String aString = s.replaceAll("[^0-9]","");
	//System.out.println(aString);
	test2();
}
  private static void  test2(){
	 String string = "2017-5-25 14:56";
	 String string2 = "";
	 String[] result = string.split("\\D");
	 for(int i=0;i<result.length;i++){
		 System.out.println(result[i]);
		 string2 +=result[i];
		 
		 
	 }
	 System.out.println(string2);
  }
}
