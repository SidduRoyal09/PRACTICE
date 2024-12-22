package com.Practice;

class Thread1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

		System.out.println(Thread.currentThread().getName());
	}
}

class Thread2 implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(!(i%2==0)) {
				System.out.println(i);
			}
		}

		System.out.println(Thread.currentThread().getName());
	}
}

public class MyThread {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread2 t=new Thread2();
		Thread t2=new Thread(t);
		t1.setPriority(10);
		t2.setPriority(1);
		t1.start();
		t2.start();
		t1.setName("Thread_1");
		t2.setName("Thread_2");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(Thread.currentThread().getName());
	}

}
