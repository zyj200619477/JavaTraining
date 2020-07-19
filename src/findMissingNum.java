import java.util.*;
public class findMissingNum {
	public static void main(String[] args) {

		    // given input
		    int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 10, 13 };

		    // let's create another array with same length
		    // by default all index will contain zero
		    // default value for int variable
		    int max = 0;
		    for(int n : input) max = Math.max(max, n);
		    int[] register = new int[max + 1];

		    // now let's iterate over given array to
		    // mark all present numbers in our register
		    // array

		    for (int i : input) {
		      register[i] = 1;
		    }

		    // now, let's print all the absentees
		    System.out.println("missing numbers in given array");

		    for (int i = 1; i < register.length; i++) {
		      if (register[i] == 0) {
		        System.out.println(i);
		      }
		    }
		  
	}
	
	

}
