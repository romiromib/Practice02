package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	/*
	숫자(정수) 3개를 입력받아 가장 작은 수를 출력하세요
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int no1 =sc.nextInt();
		System.out.print("숫자2: ");
		int no2 =sc.nextInt();
		System.out.print("숫자3: ");
		int no3 =sc.nextInt();
		
		int no;
		
		if(no1<no2&&no1<no3) {
			no=no1;
		}
		else if(no2<no1&&no2<no3) {
			no=no2;
		}
		else {
			no=no3;
		}
		System.out.println("가장 작은수는"+ no +"입니다.");
		
		sc.close();
		
	}

}
