/* 작성자: 이지희
작성일: 2022-04-13
설 명: 나이기록 프로그램
*/



package com.javaex.ex01;

public class Ex01 {

		public static void main(String[] args) {
			
			//변수선언 + 초기화
			int myAge = 25; 
			/*
			int myAge;
			myAge = 25;
			
			//메모리의 값을 출력하는 메소드
			*/
			
			
			/*
			 int myAge; //변수선언
			 myAge = 25; //초기화
			 */
			
			System.out.println(myAge);
			
			myAge = 26;
			System.out.println(myAge);
			
			byte no;
			no = -128;
			System.out.println(no);
			
			/* int 범위까지는 L을 붙이지 않아도 된다. */
			/* int 범위를 벗어나는 경우 L을 붙인다 */
			long no2;
			no2 = 2147483648L;
			System.out.println(no2);		
			
			////////////////////////-/////////////////////
			//변수선언, 초기화
			/////////////////////////////////////////////
			
			//변수가 여러개일 때 선언 후 초기화
			
			int var01; 
			int var02;
			int var03;
			
			// int var01, var02, var03; 
			
			var01 = 10;
			var02 = 20;
			var03 = 30;
			
			
			//변수가 여러개일때 변수+초기화
			
			int var04 = 10;
			int var05 = 20;
			int var06 = 30;
			//int var04 = 10, var05=20, var06=30;
			
			System.out.println(var01);
			System.out.println(var02);
			System.out.println(var03);
			System.out.println(var04);
			System.out.println(var05);
			System.out.println(var06);
			
			
		}
}
