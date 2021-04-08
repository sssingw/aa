package p06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class p4 {

	public static void main(String[] args) {
		
		int [] Arr = {2, 33, 7, 5, 12, 34, 99, 25, 28, 53, 20};
		Arrays.sort(Arr);
		System.out.println(Arrays.toString(Arr));
			 				
		for (int i = Arr.length - 1; i >= 0 ; i--) {
			System.out.println(Arr[i]);
		}
	}
}