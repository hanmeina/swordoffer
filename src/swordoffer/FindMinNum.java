package swordoffer;

public class FindMinNum {
  public static void main(String[] args) {
	  int[] array={1,2,3,4,5};
	  System.out.println(findMinNum(array));
}
  public static Integer findMinNum(int[] array){
	  if(array==null){
		  return null;
	  }
	  int min = array[0];
	  for(int i=1;i<array.length;i++){
	      if(array[i]<min){
	    	  min = array[i];
	      }
	  }
	  return min;
	  
	  
  }
}
