class Prime{
public static void main(String[] args){
       	if(args.length>=1){
	System.out.println("Entered number is: "+args[0]);
	int num=Integer.parseInt(args[0]);
         boolean isPrime=true;
        for(int i=2;i<num;i++){
   	  if(num%i==0){
         	isPrime=false;
         	 break;
     	 }
   	}
   	if(isPrime){
	System.out.println("table of :"+num);
    	for(int i=1;i<=10;i++){
   	System.out.println(num*i);
    	 }
   	 }else{
	 	System.out.println(num/10);
	}
       }else{
		System.out.println("Error");
        }
  }
}
