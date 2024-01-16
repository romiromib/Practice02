package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	/*
	두개의 숫자를 입력받아 큰수와 작은수를 분류하여 출력하세요
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		int no1 = sc.nextInt();
		System.out.print("숫자2: ");
		int no2 = sc.nextInt();
		int over;
		int less;
		
		if(no1>=no2) {
			over = no1;
			less = no2;
		}
		else {
			over = no2;
			less = no1;
		}
		
		System.out.print("큰수: "+over +"    작은수: "+ less +"입니다.");
		
		sc.close();
		
	}
}
