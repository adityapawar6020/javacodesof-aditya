

	public class Person {

      
    	  
    	private int pid ;
  		private String pname;
  		private String mobile;

  		public Person()
  		{
  			int pid=0;
  			 String name=null;
  			 String mobile=null;

  		}


  		public Person(int pid, String pname , String mobile)
    		{
  			this.pid=pid;
  			this.pname=pname;
  			this.mobile=mobile;
  		}


  		public void Setpid(int pid)
  		{
  			this.pid=pid;
  		}

  		public void Setpname(String pname)
  		{
  			this.pname=pname;
  		}
  		public void setmobile(String mobile)
  		{
  			this.mobile=mobile;
  		}
  	    public int getid()
  	    {
  	    	return this.pid;
  	    }
  	    public String getpname()
  	    {
  	    	return this.pname;
  	    }
  	    public String getmobile()
  	    {
  	    	return this.mobile;

  	    }


  		 public String toString()

  		 {
  			return "pid is  "+this.pid+"\n"+"name is "+this.pname+ "\n"+"mobile is " + this.mobile ; 
  		 }
    	  
    	  
      


}
	
	
	

