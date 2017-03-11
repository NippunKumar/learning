package powerpack;

import javax.sql.rowset.spi.SyncResolver;

public class DeadLockTwoThreads {
	
	String st1 = "JAVA";
	String st2 = "Android";
			
	Thread t1 = new Thread("My Thread 1"){
		public void run(){
			while(true){
				synchronized (st1){
					synchronized(st2){
					
						System.out.println(" Strings are"+st1+" "+ st2);
					}
				}
				
			}
		}
	};
	Thread t2 = new Thread("my thread 2"){
		public void run(){
			while(true){
				synchronized(st2){
					synchronized(st2){
						System.out.println("The Strings are"+st2+" "+st1 );
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		DeadLockTwoThreads dtt = new DeadLockTwoThreads();
		dtt.t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dtt.t2.start();
	}
}
		
