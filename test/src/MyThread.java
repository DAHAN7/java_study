
public class MyThread extends Thread{
private String threadName;
MyThread(String name){
	threadName = name;
}
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(threadName+"running"+i);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println(threadName+"interrupted.");
		}
	}
	public class ThreadExample{
		public static void main(String[]args) {
			MyThread thread1=new MyThread("Thread1");
			MyThread thread2=new MyThread("Thread2");
			
			thread1.start();
			thread2.start();
		}
	}
}
}
