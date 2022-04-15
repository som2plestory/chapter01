package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		
		//관계연산자
		int n1 = 5;
		int n2 = 3;
		
		System.out.println(n1<n2); // 5<3 f
		System.out.println(n1>n2); // 5>3 t
		
		System.out.println(n1<=n2); // 5<=3 f
		System.out.println(n1>=n2); // 5>=3 t
		
		System.out.println(n1==n2); // 5==3 f
		System.err.println(n1!=n2); // 5!=3 t
		
		boolean result = n1<n2;
		System.out.println(result);
	}
}
