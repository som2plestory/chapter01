package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		//산술연산자
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 정수/정수 → 정수
		System.out.println(a%b); // 나머지
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println("==========");
		System.out.println(7/3); //3
		System.out.println(7.0/2.0); //3.5
		System.out.println(7%2); //1
		System.out.println(7.0%2.0); //1.0
		System.out.println("==========");
		
		//부호연산자
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println("부호연산자");
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println("==========");
		
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a);
		System.out.println(++a); //8
		System.out.println(a); //8
		
		System.out.println(b); //2
		System.out.println(--b); // 2 → 1
		System.out.println(b); //1
		
		System.out.println(a); //8
		System.out.println(a++); //8
		System.out.println(a); //9
		
		System.out.println(b); //1
		System.out.println(b--); //1 출력 후 1 감소시켜 b가 0이 됨
		System.out.println(b); //0
		
		
	}
}
