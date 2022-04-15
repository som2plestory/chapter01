package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		double v01 = 5/4;
		System.out.println(v01); 
		// 정수/정수 : 5/4 = 1 (소수점 밑 버림) → 실수변환 1.0                                                                                                 
		
		double v02 = (double)5 / 4;
		System.out.println(v02); // 1.25
		// 5.0/4 → 5.0/4.0 = 1.25
		
		double v03 = 5 / (double)4;
		System.out.println(v03); // 1.25
		// 5/4.0 → 5.0/4.0 = 1.25
		
		double v04 = (double)5 / (double)4;
		System.out.println(v04); // 1.25
		// 5.0/4.0 = 1.25
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05); // 1+1 = 2
		
		
		double a1= 100/24;
		System.out.println(a1); 
		// 100/24 = 4(소수점 밑 버림) → 4.0 실수변환
	
	}
}