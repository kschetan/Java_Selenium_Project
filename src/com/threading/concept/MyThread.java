package com.threading.concept;

public class MyThread extends Thread{
	public void run()
	{
		{
		//System.out.println("Child Thread");
		try {
		for (int i=0;i<10;i++)
		{
			System.out.println("Lazy Thread Child Thread");
		
		    Thread.sleep(2000);
		}
		}catch(InterruptedException e) 
		{
		System.out.println("interrupted tread");	
		}
	}
	}
}


