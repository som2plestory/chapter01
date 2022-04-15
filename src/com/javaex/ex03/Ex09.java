package com.javaex.ex03;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/* 양수 중 짝수이면 "짝수", 양수 중 홀수이면 "홀수", 음수이면 "음수", 0이면 "0"으로 출력 */
		   
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int n = sc.nextInt();
		
		if(n>0){
			if(n%2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else if(n<0) {
			System.out.println("음수입니다.");
		}else {
			System.out.println("0입니다.");
		}
		
		sc.close();
		
		
		/* Scanner sc = new Scanner(System.in); sc.close();
		 * System.out.println("숫자를 입력하세요");
		 * System.out.print("숫자:");
		 * 
		 * int num = sc.nextInt();
		 * 
		 * int(num>0) { //양수(짝수, 홀수)
		 * 
		 * 	if(num%2==0) { //짝수니?
		 * 		//짝수
		 * 		System.out.print("짝수");
		 *  }else {
		 *  	System.out.print("홀수");
		 *  }
		 *  
		 * }else if(num<0) { //음수니?
		 * 		//음수
		 * 		System.out.print("음수"); 
		 * }else {
		 * 		//0
		 * 		System.out.print("0");
		 * }
		 * 
		 * sc.close();
		 */
	}	
}
