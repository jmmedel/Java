package ZExample_Array;

/*Following example shows search array element with Linear Search.*/
public class SearchArrayElements {
	   public static void main(String[] args) {
	      int[] a = { 2, 50, -2, 6, -3, 8, 0, -7, -9, 4 };
	      int target = 50;
	      
	      for (int i = 0; i <a.length; i++ ) {
	         if ( a[i] == target) {
	            System.out.println("Element found at index " + i);
	            break;
	         } else{
	        	 System.out.println("Element Not found");
	            
	         }
	      } // end of loop
	   }// end of main
	   
	}// end of class