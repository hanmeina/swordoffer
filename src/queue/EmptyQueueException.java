package queue;

public class EmptyQueueException extends Exception {
   private String error;
	public EmptyQueueException(String error){
		this.error = error;
	
}
}
