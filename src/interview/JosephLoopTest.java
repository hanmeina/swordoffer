package interview;

public class JosephLoopTest {
  public static void main(String[] args) {
	Boolean[] useJapa = new Boolean[30];
	for(int i=0;i<useJapa.length;i++){
		useJapa[i] = true;
	}
	
	int leftCount = useJapa.length;
	int countNum = 0;
	int index = 0;
	while(leftCount>1){
		countNum++;
		System.out.println("countNum:"+countNum);
		if(countNum==9){
			
			countNum=0;
			useJapa[index] = false;
			leftCount--;
		}
		index++;
		System.out.println("index:"+index);
		if(index ==useJapa.length){index=0;}
		
	}
	for(int i=0;i<useJapa.length;i++){
		System.out.println(i+"=="+useJapa[i]+"");
		
	}
}
}
