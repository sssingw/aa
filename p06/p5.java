package p06;

import java.util.Arrays;
import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
				
	 int [][] Arr = {
						{70, 80, 100},
						{60, 70, 86},
						{54, 100, 82},   //Arr.length 행 길이 , Arr[i].length 열 길이
						{87, 95, 79}
					};
	 				
	
					int person_sum = 0;
					int person_min = 60;
					int person_max = 60;
					int persone_ave = 0;
					
					int subject_sum = 0;
					int subject_min = 0;
					int subject_max = 0;
					int subject_ave = 0;

					int i = 0;
					while (i < Arr.length) {
						for (int j = 0; j < Arr[i].length; j++) {
												
							person_sum = person_sum + Arr[i][j];      			// 한사람의 과목 합계
							person_min = Arr[i][0];      						// 맨 처음이 최소 점수 //맨 마지막이 최대 점수
							person_max = Arr[i][Arr[i].length - 1];
							}								
						
						persone_ave = person_sum / Arr[i].length;    			// 한 사람의 과목 평균
						Arrays.sort(Arr[i]);    								// 한 사람의 과목 점수 오름차순 정렬
												
						String [] person = {"Jeong", "Pyo  ", "CHoi ", "Mike "};
						for (int n = i; n <= i; n++) {																			
						System.out.println(person[n] + " : Sum  " + person_sum + " | "+ 
													" Average  " + persone_ave + " | "+
													" Minimum  " + person_min + " | "+
													" Maximum  " + person_max);
						} 
						i++;					
						person_sum = 0;
					}
					
					System.out.println("-----------------------------------------------------------------");
					
					int n = 0;
					while (n < Arr.length) {
						for (int j = 0; j < Arr[n].length; j++) {
							for (n = 0; n < Arr.length; n++) {
													
							subject_sum = subject_sum + Arr[n][j];      		// 한 과목의 점수합계
							subject_min = Arr[n][0];      						// 맨 처음이 최소 점수 //맨 마지막이 최대 점수
							subject_max = Arr[n][Arr[n].length - 1];
							}
						}
						subject_ave = subject_sum / Arr.length;    			// 한 과목의 점수평균
						Arrays.sort(Arr[n]);    								// 한 과목의 점수 오름차순 정렬
						
						String [] subject = {"Korean", "English", "Math"};
						for (int m = n; m <= n; m++) {																			
						System.out.println(subject[m] + " : Sum  " + subject_sum + " | "+ 
													" Average  " + subject_ave + " | "+
													" Minimum  " + subject_min + " | "+
													" Maximum  " + subject_max);
						} 
						n++;
						subject_sum = 0;
						
					}
			}
}
