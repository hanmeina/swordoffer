package singleton;
/**
 *�����������
 * @author Administrator
 *
 */
public class Singleton1 {
	//�����������������ʱֻ��ʼ��һ�Σ���֤�̰߳�ȫ
  private static Singleton1 singleton  =  new Singleton1();
  private Singleton1(){}
  public static Singleton1 getInstance(){
	  return singleton;
  }
}
