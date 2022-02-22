package week1.assignments;

public class TotalSum {
    static int sum = 199;
	
    static int getSum(int n) { 
      int result = 0;
      
      while(n > 10) {
        result += n %  10;
        n = n / 10;
      }
      return result + n;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	System.out.println(getSum(sum));
        int num = -10;
       System.out.println(Math.abs(num)); 
	}

}
