package com.trainingThread.org;

import java.util.Iterator;

//class Counter implements Runnable{
//
//	Thread myThread;
//	
//	Counter(){
//		
//		myThread=new Thread(this,"My running thread");
//		System.out.println("My THread is created"+myThread);
//		myThread.start();
//	}
//	
//	public void run()  {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("Counter"+i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Thread is over");
//	}
//}
//
//public class Multithreading {
//	public static void main(String[] args) {
//		Counter c1=new Counter();
//		
//		try {
//			
//			while(c1.myThread.isAlive()) {
//				System.out.println("Main Thread will be alive till the child thread is live");
//				Thread.sleep(1000);
//			}
//			
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("Main thread is over now");
//	}
//}






class Counter extends Thread{

	Thread myThread;
	
	Counter(){
		super("Super thread");
		myThread=new Thread(this,"My running thread");
		System.out.println("My THread is created");
		start();
	}
	
	public void run()  {
		for (int i = 0; i < 10; i++) {
			System.out.println("Counter"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread is over");
	}
}

public class Multithreading {
	public static void main(String[] args) {
		Counter c1=new Counter();
		
		try {
			
			while(c1.myThread.isAlive()) {
				System.out.println("Main Thread will be alive till the child thread is live");
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Main thread is over now");
	}
}







//class Test extends Thread{
//	private static Object obj=new Object();
//	public void run() {
//		try {
//			System.out.println("Before Sleep");
//			Thread.sleep(2000);
//			System.out.println("Thread"+Thread.currentThread()+" ID"+Thread.currentThread().getId());
//			synchronized (obj) {
//				obj.wait();
//				System.out.println("After wait");
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
//
//
//public class Multithreading {
//	public static void main(String[] args) {
//		
//		//for (int i = 0; i < 10; i++) {
//			Test m1=new Test();
//			m1.start();
//			
//	//	}
//	}
//}





//class Test extends Thread{
//
//	public void run() {
//
//		try {
//			System.out.println("Thread"+Thread.currentThread()+" ID"+Thread.currentThread().getId());
//		} catch (Exception e) {
//
//			e.printStackTrace();
//		}
//	}
//
//
//}
//
//
//public class Multithreading {
//	public static void main(String[] args) {
//
//		for (int i = 0; i < 10; i++) {
//
//
//			Test m1=new Test();
//			m1.start();
//		}
//	}
//}
