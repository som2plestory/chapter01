package com.javaex.ex03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* 
		 * 과목코드 1이면 R101호, 2: R202호, 3:R303호, 4:R404호, 
		 * 나머지 "상담원에게 문의하세요" 출력
		 */
		
		//if-else if-else(==) 사용해서 하기
		
		System.out.println("과목을 선택하세요");
		System.out.println("(1.자바 2.C 3.C++ 4.파이썬)");
		System.out.print("과목번호: ");
		int c = sc.nextInt();
		
		if (c==1) {
			System.out.println("R101호");
		}else if (c==2){
			System.out.println("R202호");
		}else if (c==3){
			System.out.println("R303호");
		}else if (c==4){
			System.out.println("R404호");
		}else {
			System.out.println("상담원에게 문의하세요");
		}
		
		sc.close();
		
		
		/*
		 * Scanner sc = new Scanner(System.in); 
		 * 		System.out.println("과목번호:"); 
		 * 		int code =
		 * sc.nextInt();
		 * 
		 * if(code==1) { 
		 * 		System.out.println("101호"); 
		 * }else if(code==2) {
		 * 		System.out.println("202호"); 
		 * }else if(code==3) { 
		 * 		System.out.println("303호");
		 * }else if(code==4) { 
		 * 		System.out.println("404호"); 
		 * }else {
		 * 		System.out.println("상담원"); 
		 * }
		 */
			
	}	
}
