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
	      
	    /**字符串中的单词从后到前排列 
	     * 先把字符串全部反转，在按空格分隔来反转各个单词*/  
	    public static String swapWord(String s)  
	    {  
	        char[] a = s.toCharArray();  
	        swap(a,0,a.length-1);//现在得到的是“anihC evol I”  
	          
	        int blank = -1;//前一个空格的位置  
	        for(int i=0;i<a.length;i++)  
	        {  
	            if(a[i]==' ')  
	            {  
	                int nextBlank = i;//后一个空格的位置  
	                swap(a,blank+1,nextBlank-1);  
	                blank=nextBlank;  
	            }  
	        }  
	          
	        return (new String(a));  
	          
	    }  
	    /**反转全部自定开始和结束位置的字符数组，包括字符数组中的空格*/  
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

