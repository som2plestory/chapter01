package com.javaex.ex03;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* 점수가 60점 이상이면 "합격입니다", 아니면(60점 미만이면) "불합격입니다."를 출력 */
		
		System.out.print("점수:");
		int point = sc.nextInt();
		
		if(point>=60) {
			//true일때만 실행되는 영역
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		sc.close();
	}
}