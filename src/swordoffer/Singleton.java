package swordoffer;

/**
 * 懒汉式单例模式
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
