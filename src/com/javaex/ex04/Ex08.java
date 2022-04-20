package com.javaex.ex04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			for(int i = 0; i<6; i++) {
				for(int n=0; n<=i; n++) {
				System.out.print("*");
				}
				System.out.println("");
			}
		
		sc.close();
	}
}