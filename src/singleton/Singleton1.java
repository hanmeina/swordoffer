package singleton;
/**
 *不加锁的情况
 * @author Administrator
 *
 */
public class Singleton1 {
	//单例变量，在类加载时只初始化一次，保证线程安全
  private static Singleton1 singleton  =  new Singleton1();
  private Singleton1(){}
  public static Singleton1 getInstance(){
	  return singleton;
  }
}
