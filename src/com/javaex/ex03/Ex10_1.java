package com.javaex.ex03;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* 
		 * 과목코드 1이면 R101호, 2: R202호, 3:R303호, 4:R404호, 
		 * 나머지 "상담원에게 문의하세요" 출력
		 */
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		int c = sc.nextInt();
		
		if (c>=1 && c<5) {
			System.out.println("R" + c + "0" + c + "호");
		}else {
			System.out.println("상담원에게 문의하세요.");
		}
		
		sc.close();
	}	
}
