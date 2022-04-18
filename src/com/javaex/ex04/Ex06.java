package com.javaex.ex04;

import java.util.Scanner;

public class Ex06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//구구단 출력
		
		System.out.println("구구단");
		for ( int dan = 2; dan<=9; dan++) {
			System.out.println("");
			for ( int i = 1; i <=9; i++ ) {
				System.out.println(dan + " * " + i + " = " + dan*i);
			}
		}
		sc.close();
	}
}
