package swordoffer;

public class Solution22 {
	public static void main(String[] args) {
		 StringBuffer  stringBuffer = new StringBuffer();
		 stringBuffer.append("We Are Happy.");
	     String  string = replaceSpace(stringBuffer);
	     System.out.println(string);
	}
	public static String replaceSpace(StringBuffer str) {
        int spacenum = 0;//spacenumΪ����ո���
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                spacenum++;
        }
        int indexold = str.length()-1; //indexoldΪΪ�滻ǰ��str�±�
        int newlength = str.length() + spacenum*2;//����ո�ת����%20֮���str����
        int indexnew = newlength-1;//indexoldΪΪ�ѿո��滻Ϊ%20���str�±�
        str.setLength(newlength);//ʹstr�ĳ�������ת����%20֮��ĳ���,��ֹ�±�Խ��
        for(;indexold>=0 && indexold<newlength;--indexold){ 
                if(str.charAt(indexold) == ' '){  //
                str.setCharAt(indexnew--, '0');
                str.setCharAt(indexnew--, '2');
                str.setCharAt(indexnew--, '%');
                }else{
                    str.setCharAt(indexnew--, str.charAt(indexold));
                }
        }
        return str.toString();
    }
}
