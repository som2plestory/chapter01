package com.javaex.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* 점수를 입력 받아 점수가 60점 이상이면 "합격입니다"를 출력 */
		
		System.out.print("점수:");
		int point = sc.nextInt();
		if (point >= 60) {
			System.out.println("합격입니다.");
		}
		
		sc.close();
	}
}
