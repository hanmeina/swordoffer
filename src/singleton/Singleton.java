package singleton;
/**
 * 一种较为安全的单例模式
 * 通过加锁以及双重判断，不仅能在多线程环境中保证安全，而且在效率上也比单次判断高
 * @author hanmeina
 *
 */
public class Singleton {
   //私有的静态实例变量   volatile是禁止指令重排序优化
	private static volatile Singleton singleton = null;
	//私有构造
	private Singleton (){}
	//公共的静态访问方法
	public static Singleton getInstance(){
		if(singleton==null){//以效率为出发点，判断对象是否创建
			synchronized(Singleton.class){//同步块，保证只有一个线程进入
				if(singleton==null){//保证只有一个实例被创建
					singleton = new Singleton();
				}
			}
			
		}
		return singleton;
	}
}
