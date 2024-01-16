package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	/*
	두 개의 정수를 입력받아 큰수를 작은수로 나눈 몫과 나머지를 출력하는 프로그램을 작성하세요
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int fst = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int scd = sc.nextInt();
		int q;
		int r;
		
		if(fst>=scd) {
			q = fst/scd;
			r = fst%scd;
		}
		else {
			q = scd/fst;
			r = scd%fst;
		}
		
		System.out.println("몫:" + q );
		System.out.println("나머자: " + r );
		
		sc.close();
		
	}
}