import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class File {

	public static void main(String[] args) throws IOException {
		
		byte [] content = new byte[1000];
		FileInputStream input = new FileInputStream("C:\\Users\\성원\\Desktop\\test.csv");
		
		input.read(content);
		String allLine = new String(content);
		System.out.println(allLine);
		
		String [] arr = allLine.split("\n");
		System.out.println(Arrays.toString(arr));
		
	
		
		for(int i = 0; i <arr.length; i++) {
			if (arr[i].contains("\"")) {
				splitQuote(arr[i]);
			} else {
				splitComma(arr[i]);
			}
					
		}
		input.close();
	} 

	public static void splitQuote(String a) {
		String [] arr1 = a.split("\"");
		arr1[0].substring(0,arr1[0].length());           //서울 1번쨰, 종로구 마포구 2번째, 30 3번쨰
		System.out.println(Arrays.toString(arr1));
		
	} 
	public static void splitComma (String b) {
		String [] arr1 = b.split(",");
	}
	
	

}
