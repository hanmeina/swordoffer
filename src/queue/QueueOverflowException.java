package queue;

public class QueueOverflowException extends Exception {
	  private   String error;
		public QueueOverflowException(String error){
			this.error = error;
		  
	  }
}
