package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요");
		System.out.print("년도: ");
		int year = sc.nextInt();
		System.out.println("올해: 2023 ");
		System.out.println("태어난해: "+ year);
		
		int result = 2023-year;
		System.out.println("나이: "+ result);
		
		System.out.println("============================="); 
		
		
		if(result>=20) {
			
			if( year%2!=0 && 40<=result ) {
				System.out.println("20살이상");
				System.out.println("건강검진해");
				System.out.print("암 검사");
			}
			else if( year%2!=0 && 40>result ) {
				System.out.println("20살이상");
				System.out.println("건강검진해");
				System.out.print("암 검사X");
			}
			else {
				System.out.println("20살이상");
				System.out.print("건강검진해 아님");
			}	
		}
		else {
			System.out.print("20살미만 ");
			System.out.print("건강검진대상이 아님");
		}
		sc.close();
	}

}
