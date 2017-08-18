package singleton;
/**
 * 采用静态内部类的方式实现调用时创建单例模式
 * @author Administrator
 * 
 */
public class Singleton2 {
  private Singleton2(){}
  
  //采用静态内部类
  private static class InstanceHolder{
	  private static Singleton2  singleton2= new Singleton2();
  }
  public static Singleton2  getInstance(){
	  return InstanceHolder.singleton2;
  }

}
