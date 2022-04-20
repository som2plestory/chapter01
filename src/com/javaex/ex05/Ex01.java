package com.javaex.ex05;

public class Ex01 {
	public static void main(String[] args) {
		
<<<<<<< HEAD
		//랜덤함수 기본
		/*
		 * double num = Math.random(); 
		 * System.out.println(num);
		 */
		
		//랜덤함수 예제 1~10까지의 수
		/*
		 * int num1 = (int)(Math.random()*10+1); 
		 * System.out.println(num1);
		 */
		
		
		//로또 번호 자동생성 6개 (1~45)
		
		
		int n1=(int)(Math.random()*45+1); 
		System.out.print(n1+"\t"); 
		int n2=(int)(Math.random()*45+1); 
	  	System.out.print(n2+"\t"); 
	  	int n3=(int)(Math.random()*45+1); 
	  	System.out.print(n3+"\t"); 
	  	int n4=(int)(Math.random()*45+1); 
	  	System.out.print(n4+"\t"); 
	  	int n5=(int)(Math.random()*45+1); 
	  	System.out.print(n5+"\t"); 
	  	int n6=(int)(Math.random()*45+1); 
	  	System.out.print(n6+"\t");
		 
		System.out.println("======================================");
		
		/*
		 * for(int i=1; i<=6 i++) 
		 * { System.out.println(ni[i]); }
		 */
			
=======
		double num  = Math.random();
		System.out.println(num);
>>>>>>> d0058a981ff08d84f422825d58e55400ce22f00a
		
	}
}
