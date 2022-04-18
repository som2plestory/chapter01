package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//구구단 출력
		
		int dan;
		int i =0;
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		dan = sc.nextInt();
		
		while(i<9) {
			i++;
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
		
		
		sc.close();
		
		
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * //구구단 출력
		 * 
		 * int dan; 
		 * int i =1; //초기값
		 * 
		 * System.out.println("단을 입력해주세요"); 
		 * System.out.print("단 : "); 
		 * dan = sc.nextInt();
		 * 
		 * while(i<9) { //조건식 
		 * System.out.println(dan + " * " + i + " = " + dan*i); 
		 * i++; // i = i+1; 증감식
		 * }
		 * 
		 * 
		 * sc.close();
		 */
	}
}
