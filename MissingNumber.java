package week1.assignments;

public class MissingNumber {
    static int[] arr = {1,2,3,4,6,7,8};
	static String findMissingNum(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			i++;
			if(i != arr[i-1])
			   return "missing number is "+ (i);
		    
		}
		return "nothing";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMissingNum(arr));
	}

}
