package Recursion;

public class Palimdrome {
    public static boolean palim(int a) {
    	
    	int r=a;
    	int num=0;
    	while(a>0) {
    		int m=a%10;
    		num=num*10+m;
    		palim(a/10);
    	}
    	if(r==num) {
    		return true;
    	}
    	
    	
    	return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println( palim(121));
	}

}
