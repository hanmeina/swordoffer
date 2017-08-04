package lianxi;
/**
 * 查找特定的素数
 * @author Administrator
 *
 */
public class PrimeFinder implements Runnable{
   public long target;//要查找第几个素数
   public long prime;//用于存储找到的最后一个素数
   public boolean  finished = false;//是否找到目标
   private Thread runner;//存储一个线程对象                
   
    PrimeFinder(long inTarget) {
    	target = inTarget;
    	if(runner==null){
    		runner = new  Thread(this);
    		runner.start();
    	}

}
    
    public void run(){
    	long numPrimes = 0;//已找到多少个素数
    	long candidate = 2;//可能是素数的数字
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
