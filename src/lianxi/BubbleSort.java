package lianxi;

public class BubbleSort {
    //ð������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] a = new int[]{1,13,2,34,100,56,78,90};
      int temp;
      //�����м����
//      for(int i=0;i<a.length-1;i++){//�ɴ�С,�Ƚ�a.length-1��
//    	  for(int j=i+1;j<a.length;j++){
//    		  if(a[i]<a[j]){
//    			  temp= a[j];
//    			  a[j] = a[i];
//    			  a[i] = temp;	 
//    		  }
//    	  }  
//      }
      
       //�������м����
      for(int i = a.length - 1; i > 0; --i){
          for(int j = 0; j < i; ++j){
              if(a[j] > a[j+1]){
                  System.out.println("[" + a[j] + "(" + j + "), " + a[j+1] + "(" + (j+1) + ")]");
                  a[j] ^= a[j+1];
                  a[j+1] ^= a[j];
                  a[j] ^= a[j+1];
                  print(a);
              }
              }
          }
//     
//   for(int x =0;x<a.length;x++){
//  		
//  		System.out.println(a[x]);
//  	}  
	}
	 private static void print(int[] a) {
         for (int i = 0; i < a.length - 1; ++i)
             System.out.print(a[i] + "\t");
         System.out.println(a[a.length - 1]);
     }
}
