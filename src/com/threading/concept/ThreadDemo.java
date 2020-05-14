package com.threading.concept;

public class ThreadDemo {
	
	 public static void main(String[] args) {
	 	
	 	MyThread t=new MyThread();
	 	t.start();
	 	t.interrupt();
	 	System.out.println("main Thread");
	 	
	 }	
	 }


