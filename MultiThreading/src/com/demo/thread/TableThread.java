package com.demo.thread;

import com.demo.beans.Table;

public class TableThread extends Thread{

	private Table tt;
	
	public TableThread(Table t)
	{
		tt=t;
	}
	public void run()
	{
		tt.myTable();
	}
}
