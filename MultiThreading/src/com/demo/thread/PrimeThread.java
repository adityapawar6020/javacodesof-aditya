package com.demo.thread;

import com.demo.beans.Prime;

public class PrimeThread extends Thread{
	
	private Prime pp;
	public PrimeThread(Prime p)
	{
	   pp=p;
	}

	public void run()
	{
		pp.findPrime();
	}
	
}
