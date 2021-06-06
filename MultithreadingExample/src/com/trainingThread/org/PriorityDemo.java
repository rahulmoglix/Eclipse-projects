package com.trainingThread.org;

public class PriorityDemo extends Thread
{
      public void run( )
      {
        for(int i = 0; i < 10; i++)
        {
              System.out.println(this.getName( ) + ": " + i);
       }        
     }

     public static void main(String args[])
     {
        PriorityDemo pd1 = new PriorityDemo();
        PriorityDemo pd2 = new PriorityDemo( );     

                                         // setting priorities       
       pd1.setPriority(Thread.MAX_PRIORITY-2); // 8
        pd2.setPriority(Thread.MIN_PRIORITY+2); // 3

                                // setting the names
pd1.setName("More");     // for 8  thread 
pd2.setName("Less");       // for 3 thread   

                         // to retrieve the priorities
System.out.println("More Priority is " +pd1.getPriority());                                                                               // prints 8

System.out.println("Less Priority is " + pd2.getPriority());                                                                                    // prints 3

pd2.start(); // wantedly pd2 is started first
pd1.start();    
   }
}               // you can use join() method also


/*
         The above for loop can replaced as follows:

 for(int i = 0; i < 10; i++)
{
           Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println(name + ": " + i);
 }
*/