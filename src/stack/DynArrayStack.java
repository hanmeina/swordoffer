package stack;



/**
 * ��̬����ʵ��ջ
 * @author hanmeina
 * @param <E>
 *
 */
public class DynArrayStack {
   private int top;
   private int capacity;
   private int[] array;
   public DynArrayStack(){
	   capacity = 1;
	   array = new int[capacity];
	   top = -1;
   }
   /**
    * �ж�ջ�Ƿ�Ϊ��
    * @return
    */
   public boolean isEmpty(){
	   return (top==-1);
   }
   /**
    * �ж�ջ�Ƿ�Ϊ��ջ
    * @return
    */
   public boolean isStackFull(){
	   return (top == capacity-1);
	  // return (top==array.length);

   }
   
   /**
    * ��ջ
    * @param data
    */
   public void push(int data){
	   if(isStackFull()){
		    doubleStack();
		   }else{
			   array[++top]=data;
		   }
   }
   
   /**
    * ���鱶����ע�⣺����̫����ܻᵼ���ڴ������
    */
   private void doubleStack(){
	   //�½�һ����ԭ�����һ����������
	   int[] newArray = new int[capacity*2];
	   //����
	   System.arraycopy(array, 0, newArray, 0,capacity);
	   capacity = capacity*2;
	   array = newArray ;
   }
   /**
    * ��ջ
    * @return
    */
	public int pop(){
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}else{
			return (array[top--]);
		}
		
	}
	/**
	 * ɾ��ջ
	 */
	public void deleteStack(){
		top = -1;
	}
}
