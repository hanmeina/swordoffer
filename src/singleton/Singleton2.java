package singleton;
/**
 * ���þ�̬�ڲ���ķ�ʽʵ�ֵ���ʱ��������ģʽ
 * @author Administrator
 * 
 */
public class Singleton2 {
  private Singleton2(){}
  
  //���þ�̬�ڲ���
  private static class InstanceHolder{
	  private static Singleton2  singleton2= new Singleton2();
  }
  public static Singleton2  getInstance(){
	  return InstanceHolder.singleton2;
  }

}
