package queue;
/**
 * 用两个队列实现栈
 * @author Administrator
 *
 */
public class StackWithTwoQueues {
 private DynArrayQueue queue1;
 private DynArrayQueue queue2;
 public StackWithTwoQueues(){
	 queue1 = new DynArrayQueue();
	 queue2 = new DynArrayQueue();	 
 }
 
 public void push(int data) throws QueueOverflowException{
	 if(queue1.isEmpty()){
		 queue2.enQueue(data);
	 }
	 queue1.enQueue(data);
	 
 }
 
 public int pop() throws QueueOverflowException, EmptyQueueException{
	 int i = 0,size;
	 if(queue2.isEmpty()){
		 size = queue1.getQueueSize();
		 while(i<size-1){//将Queue1的n-1个元素移动到queue2
			 queue2.enQueue(queue1.deQueue()); 
			 i++;
		 }
		 return queue1.deQueue();//对queue1的最后一个元素执行出对，并返回
		 
	 }else{
		 size = queue2.getQueueSize();
		 while(i<size-1){
			 queue1.enQueue(queue2.deQueue());
			 i++;
		 }
		 return queue2.deQueue();
		 
	 }
	
 }
 
}
