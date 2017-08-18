package singleton;
/**
 * һ�ֽ�Ϊ��ȫ�ĵ���ģʽ
 * ͨ�������Լ�˫���жϣ��������ڶ��̻߳����б�֤��ȫ��������Ч����Ҳ�ȵ����жϸ�
 * @author hanmeina
 *
 */
public class Singleton {
   //˽�еľ�̬ʵ������   volatile�ǽ�ָֹ���������Ż�
	private static volatile Singleton singleton = null;
	//˽�й���
	private Singleton (){}
	//�����ľ�̬���ʷ���
	public static Singleton getInstance(){
		if(singleton==null){//��Ч��Ϊ�����㣬�ж϶����Ƿ񴴽�
			synchronized(Singleton.class){//ͬ���飬��ֻ֤��һ���߳̽���
				if(singleton==null){//��ֻ֤��һ��ʵ��������
					singleton = new Singleton();
				}
			}
			
		}
		return singleton;
	}
}
