package interview;
/**
 * 截取字符串，要求按字节长度截取一个字节数组形势的字符串，字符串包括中英文
 * @author Administrator
 *
 */
public class StringCut {
  public static void main(String[] args) {
	 String  str = "中国A我";
	 new StringCut().stringStr(str,5);
}

private void stringStr(String str, int i) {
	// TODO Auto-generated method stub
	byte[] b = new byte[1024];
	int num =0;
	b = str.getBytes();
	if(b[i-1]>0){
		System.out.println(new String(b,0,i));
	}else{
		for(int j=0;j<i;j++){
			if(b[j]>0){
				num++;
				num = num%2;
				
			}else{
				num=0;
			}
		}
		if(num==0){
			System.out.println(new String(b,0,i));
		}else{
			System.out.println(new String(b,0,i-1));
		}
	}
}
}
