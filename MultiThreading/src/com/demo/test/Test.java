package com.demo.test;

import com.demo.beans.Prime;
import com.demo.beans.Table;
import com.demo.thread.PrimeThread;
import com.demo.thread.TableThread;

public class Test {

	public static void main(String[] args) {
		Prime p = new Prime();
		Table t = new Table();
		
		PrimeThread pt = new PrimeThread(p);
		pt.start();
	try {
		pt.sleep(1000);
		} catch (InterruptedException e) {
		System.out.println("Error");
		}

		TableThread tt = new TableThread(t);
		tt.start();
		try {
			tt.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
		TableThread tt1 = new TableThread(t);
		tt1.start();
		try {
			tt1.sleep(1000);
		} catch (InterruptedException e) {
		     System.out.println("Error");
		}

	}

}
