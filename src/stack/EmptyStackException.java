package stack;

public class EmptyStackException extends Exception {
    private String error;
	public EmptyStackException(String error){
	  this.error = error;
  }
}
