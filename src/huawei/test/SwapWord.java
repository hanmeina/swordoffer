package huawei.test;


	import java.util.Scanner;  
	  
	public class SwapWord  
	{  
	    public static void main(String[] args)  
	    {  
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("Please enter a string, such as 'I love China'");  
	        String s = new String(sc.nextLine());  
	        System.out.println("the string that was swaped before was:");  
	        System.out.println(s);  
	        System.out.println("the swaped string:");  
	        
	       
	        System.out.println(swapWord(s));  
	    }  
	      
	    /**�ַ����еĵ��ʴӺ�ǰ���� 
	     * �Ȱ��ַ���ȫ����ת���ڰ��ո�ָ�����ת��������*/  
	    public static String swapWord(String s)  
	    {  
	        char[] a = s.toCharArray();  
	        swap(a,0,a.length-1);//���ڵõ����ǡ�anihC evol I��  
	          
	        int blank = -1;//ǰһ���ո��λ��  
	        for(int i=0;i<a.length;i++)  
	        {  
	            if(a[i]==' ')  
	            {  
	                int nextBlank = i;//��һ���ո��λ��  
	                swap(a,blank+1,nextBlank-1);  
	                blank=nextBlank;  
	            }  
	        }  
	          
	        return (new String(a));  
	          
	    }  
	    /**��תȫ���Զ���ʼ�ͽ���λ�õ��ַ����飬�����ַ������еĿո�*/  
	    public static void swap(char[] c,int begin, int end)  
	    {  
	        while(begin<end)  
	        {  
	            char temp = c[begin];  
	            c[begin]=c[end];  
	            c[end]=temp;  
	            begin++;  
	            end--;  
	        }  
	    }  
	}  

