package swordoffer;

/**
 * ����ʽ����ģʽ
 * @author Administrator
 *
 */
public class Singleton {
	
	
  private static Singleton instance=null;
  private Singleton(){	  
  }
  public synchronized static Singleton getInstance(){
	  if(instance==null){
		 instance = new Singleton();
	  }
	  return instance;
  } 
 
}
