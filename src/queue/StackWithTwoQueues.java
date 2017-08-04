package queue;
/**
 * ����������ʵ��ջ
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
		 while(i<size-1){//��Queue1��n-1��Ԫ���ƶ���queue2
			 queue2.enQueue(queue1.deQueue()); 
			 i++;
		 }
		 return queue1.deQueue();//��queue1�����һ��Ԫ��ִ�г��ԣ�������
		 
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
