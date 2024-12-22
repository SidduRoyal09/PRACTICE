//sleep();
//yield();
//join();

package com.Practice;

class Thread3 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(500);
				System.out.println("2 * "+i+" = "+(2*i));
			}catch(Exception e) {
				
			}
		}
		System.out.println();
	}
}

public class MyThreadMethods  {

	public static void main(String[] args) {
		
		Thread3 t1=new Thread3();
		t1.start();
		for(int i=1;i<=10;i++) {
			try {
				t1.join();
				Thread.sleep(500);
				System.out.println("3 * "+i+" = "+(3*i));
			}catch(Exception e) {
				
			}
		}
	}

}
