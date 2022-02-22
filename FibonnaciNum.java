package week1.assignments;

public class FibonnaciNum {
    static int num = 6;
	static int res = 1;
    static int  findFib(int n) {
    	if(n<2) return n;
    	return findFib(n-1) + findFib(n-2);
    	
    }
	
	static int findFibRec(int n) {
	 int sum = 0;
	 int firstNum = 0;
	 int secondNum = 1;
	 for (int i = 2; i <= n; i++) {
	    sum = firstNum + secondNum;
	    firstNum = secondNum;
	    secondNum = sum;
	 }	
	 return sum; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println(findFib(num));
       System.out.println(findFibRec(num));
	}

}
