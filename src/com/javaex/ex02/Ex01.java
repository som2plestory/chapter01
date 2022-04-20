package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String name = "달콤";
		char c2 = 'A';
		String str = "굿모닝";
		String var01 = str + i;
	
		
		System.out.println(str);
		System.out.println("안녕하세요");		
		System.out.print("안녕");
		System.out.println("하세요");
	
		System.out.println(str + str + "안녕");
		System.out.println(str + i);

		System.out.println(i + i);
		System.out.println(d + d);
		System.out.println(i + d);
		System.out.println(var01);
		System.out.println(str + " " + i);
		System.out.println(str + " 올해는 " + i + "년");
		System.out.println(str + " " + d);
		
		// char type은 코드값을 더함
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c2 + c2);
		
		System.out.println(s);
		System.out.println(s + s);
		
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("=============================================");
		
		//개행문자
		System.out.println("안녕\n하세요.");
		System.out.println("안녕\t하세요.");
		System.out.println("\"안녕 하세요.\"");
		System.out.println("안녕\\하\\세요.");
		System.out.println("안녕안녕안녕안녕안녕앙녕안녕안녕\t하세여");
	}

}
