package stack;



/**
 * 动态数组实现栈
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
    * 判断栈是否为空
    * @return
    */
   public boolean isEmpty(){
	   return (top==-1);
   }
   /**
    * 判断栈是否为满栈
    * @return
    */
   public boolean isStackFull(){
	   return (top == capacity-1);
	  // return (top==array.length);

   }
   
   /**
    * 入栈
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
    * 数组倍增（注意：倍增太多可能会导致内存溢出）
    */
   private void doubleStack(){
	   //新建一个比原数组大一倍的新数组
	   int[] newArray = new int[capacity*2];
	   //复制
	   System.arraycopy(array, 0, newArray, 0,capacity);
	   capacity = capacity*2;
	   array = newArray ;
   }
   /**
    * 出栈
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
	 * 删除栈
	 */
	public void deleteStack(){
		top = -1;
	}
}
