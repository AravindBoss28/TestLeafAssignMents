package week1.assignments;

public class FindInterSection {
    static int[] arr = {2,3,4,5,6,7,8,9};
    static int[] arr2 = {9,10,11,12};
	static int findInterSection(int[] arr,int [] arr2) {
      int res = 0;
      for (int i = 0; i < arr.length; i++) {
    	  for (int j = 0; j < arr2.length; j++) {
    	    if(arr[i] == arr2[j]) return arr[i];  		
    	  }		
	  }
      return res;
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	System.out.println(findInterSection(arr, arr2));
 
	}

}
