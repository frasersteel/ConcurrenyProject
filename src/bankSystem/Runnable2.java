package bankSystem;

public class Runnable2 implements Runnable {
	
	 private Customer cust;
	 private static final int DELAY = 1000;
	  
	 public Runnable2 (Customer c) {
		 cust=c;
	 }
	 public void run () {
		 try {
			 
			 Thread.sleep(DELAY);
			 System.out.println("Withdrawing money by " + cust.getName());
			 cust.getAccounts().get(0).withdraw(500);

			 
			 
		 }
		 catch (Exception e){}
	 }
	 
	}