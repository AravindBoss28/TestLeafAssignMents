package week1.assignments;

public class FindPrime {
    
	static void checkPrime(int n) {
	 boolean flag = false; 
	 if(n < 2) {
	    System.out.println("given number is prime " + n);
	    return;
	  }	
	  
	  for (int i = 2; i <= n/2; i++) {
	    
		  if((n % i) == 0) {
		    System.out.println("given number is prime " + n);
		    flag = true;
		    return;
		  }
	  }
	  if(!flag) {
		  System.out.println("given number is not prime " + n);	  
	  }
	  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrime(23);
     
	}

}
