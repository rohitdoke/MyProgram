package com.justimagine.MultiTreading;
import java.util.Collections;
public class RunnableClass implements Runnable {

	
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		RunnableClass thread = new RunnableClass();
		Thread t = new Thread(thread);
		t.start();

	}

}
