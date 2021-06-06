package com.trainingThread.org;


class Count implements Runnable{

	Thread myThread;
	
	Count(){
		
		myThread=new Thread(this,"My running thread");
		System.out.println("My THread is created"+myThread);
		myThread.start();
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

public class Multithreading6 {
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

