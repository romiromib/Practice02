package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	/*
	나이를 입력받아 19세이상 65세 미만이면 "1번그룹" 그 이외에는 "2번그룹"으로 출력하는 프로그램을 작성하세요. 
	*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		int age = sc.nextInt();
		String no;
		
		if(19<=age&&age<65) {
			no = "1번";
		}
		else {
			no = "2번";
		}
		
		System.out.println(no+"그룹 입니다.");
		sc.close();
		
	}

}
