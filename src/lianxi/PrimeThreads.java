package lianxi;

public class PrimeThreads {
  public static void main(String[] args) {
	PrimeThreads  primeThreads = new PrimeThreads(args);
}
  
  
  public PrimeThreads(String[] arguments){
	  PrimeFinder[] finder= new PrimeFinder[arguments.length];
	  for(int i=0;i<arguments.length;i++){
		  try{
			  long count = Long.parseLong(arguments[i]);
			  finder[i] = new PrimeFinder(count);
			  System.out.println("Looking for prime "+count);
		  }catch(NumberFormatException e){
			  System.out.println("error" + e.getMessage());
		  }
	  }
	  boolean  complete = false;
	  while(!complete){
		  //System.out.println("jinlaile");
		  complete = true;
		  for(int j=0;j<finder.length;j++){
			  if(finder[j]==null){
				  continue;
			  }
			  if(!finder[j].finished){
				  complete=false;
			  }else{
				 // System.out.println("hahahha");
				  displayResult(finder[j]);
				  finder[j] = null;
			  }
		  }
		  try{
			  Thread.sleep(1000);
		  }catch(InterruptedException e){
			  //do something
		  }
	  }
  }
  
  private void displayResult(PrimeFinder finder){
	  System.out.println("Prime" +finder.target +"is"+finder.prime);
  }
}
