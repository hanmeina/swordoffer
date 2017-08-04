package lianxi;
/**
 * �����ض�������
 * @author Administrator
 *
 */
public class PrimeFinder implements Runnable{
   public long target;//Ҫ���ҵڼ�������
   public long prime;//���ڴ洢�ҵ������һ������
   public boolean  finished = false;//�Ƿ��ҵ�Ŀ��
   private Thread runner;//�洢һ���̶߳���                
   
    PrimeFinder(long inTarget) {
    	target = inTarget;
    	if(runner==null){
    		runner = new  Thread(this);
    		runner.start();
    	}

}
    
    public void run(){
    	long numPrimes = 0;//���ҵ����ٸ�����
    	long candidate = 2;//����������������
    	while(numPrimes<target){
    		if(isPrime(candidate)){
    			numPrimes++;
    			prime = candidate;
    		}
    		
    		candidate++;
    	}
    	finished = true;
    }
    boolean  isPrime(long checkNumber){
    	double root = Math.sqrt(checkNumber);
    	for(int i=2;i<=root;i++){
    		if(checkNumber % i ==0){
    			return false;
    		}
    	}
    	
    	return true;
    }
}
