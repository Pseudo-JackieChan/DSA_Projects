package com.hansin;


public class Multi_Threading extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Thread Running "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		Multi_Threading obj=new Multi_Threading();
		obj.start();
	}

}
