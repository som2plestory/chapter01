package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * 8시간 이하 근무시 시간당 10000원, 
		 * 8시간 초과시 시간당 12000원일 때 
		 * 근무시간에 따른 임금 출력
		 */
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		if (time<=8) {
			System.out.println("임금은 " + 10000*time +"원 입니다.");
		}else {
			System.out.println("임금은 " + (80000+(time-8)*12000) + "원 입니다.");
		}
		
		sc.close();
	}	
	
	
	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.print("근무시간: "); 
	 * 
	 * int time = sc.nextInt();
	 * int pay; //if 안에서 생긴 변수는 {}끝나면 사라지므로 변수 선언 먼저
	 * 
	 * if(time<=8) { 
	 *		pay = time*10000; 
	 *
	 * }else { 
	 * 		pay = 8*10000 + (time-8)*12000;
	 * }
	 * 
	 * System.out.println("임금은 " + pay + "입니다."); 
	 * 
	 * sc.close();
	 */
}
