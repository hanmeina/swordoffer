package lianxi;

public class HexHeader {
	String[] input = {"000A110D1D260219",
			"78700F1318141E0C",
			"6A197D45B0FFFFFF"};
   public static void main(String[] args) {
	 HexHeader header = new HexHeader();
	 for(int i=0;i<header.input.length;i++){
		 header.readLine(header.input[i]);
		 
	 }

   
  }
   
   private static void readLine(String code) {
		  try {
			for(int j=0;j+1<code.length();j+=2){
				  String sub = code.substring(j,j+2);
				  int num = Integer.parseInt(sub, 16);
				  if(num==255){
					  return;
				  }
				  System.out.print(num + " ");
			  }
		} finally{
			System.out.println("**");
		}
		  return; 
		
	}	
}
