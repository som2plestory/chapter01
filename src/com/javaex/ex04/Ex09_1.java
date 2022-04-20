package com.javaex.ex04;

import java.util.Scanner;

public class Ex09_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int n = sc.nextInt();
			if(n==0) {
				System.out.println("종료");
				break;
			}else if(n%3==0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		sc.close();
	}
}
