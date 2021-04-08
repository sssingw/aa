package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class testt {

	public static void main(String[] args) throws IOException{
		
		byte [] content  = new byte[1000];
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\성원\\Desktop\\testt.csv"));
		
		ArrayList <String> list  = new ArrayList<String>();
//		try {
			String line;
			
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				String [] arr = line.split("\n");
				String [] splitArr = new String[18];
								
				Arrays.sort(arr);
				
				for (int i = 0; i < arr.length; i++) {
					splitArr = arr[i].split(",");		 
					System.out.println(Arrays.toString(splitArr));
				}
				Arrays.sort(arr);  
				
				int num = 0;	
				int sum = 0;
				
				num = Integer.parseInt(splitArr[17]);		
					
					
					
					
		
			
				
//			}
//		}
////		for (int i = 0; i < list[i].length(); i++) {
////			String [] last = 
////		}
////}
//	
//	
//		
		
	}
	
	
	
}