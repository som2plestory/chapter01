package com.javaex.ex01;

public class Ex10 {
	
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&& 연산자");
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false /* && true */); //false
		System.out.println(false /* && false */); //false
		//Dead code : ∧논리에서 false가 먼저오면 당연히 결과는 false이므로 경고 표시
		
		//논리 연산자 기본 ||
		System.out.println("|| 연산자");
		System.out.println(true /* || true */); //true
		System.out.println(true /* || false */); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		//Dead code : ∨논리에서 true 존재 → true	
		
		//논리 연산자 기본 !
		System.out.println("! 연산자");
		System.out.println(!true); //false
		System.out.println(!false); //true
		
		//논리 연산자 응용
		System.out.println("응용");
		System.out.println( (a>b)&&(a<b)); 
		// (5>7)∧(5<7) → F∧T → F 
		System.out.println( (a>b)&&(a>b));
		// (5>7)∧(5>7) → T∧T → T
		
		System.out.println("==========");
		System.out.println((a>b)||(a<b));
		// (5>7)∨(5<7) → F∨T → T
		
		//논리 연산자 기본!
		System.out.println("==========");
		System.out.println(a>b); //(5>7) → false
		System.out.println(!(a>b)); //~(5>7) → ~false → true
		
		System.out.println(a<b); // (5<7>) → true
		System.out.println(!(a<b)); // ~(5<7) → ~true → false
		
		
	}
}
