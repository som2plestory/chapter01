package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* 숫자가 0보다 크면 "양수" 0보다 작으면 "음수" 0이면 "0입니다."를 출력 */

		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양수입니다.");
		}else if(num<0){
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		
		sc.close();
	}
}