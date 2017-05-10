package com.bit.oop4.tostring;

public class Char01 {

	public static void main(String[] args) {
		
		char ch ='A';
		System.out.println(ch);
		
		//char는 덧셈 뺄셈 가능
		int num = ch-'A';
		System.out.println(num);
		
		
		System.out.printf("%d\n", ch-0);

		System.out.printf("%d\n", '0'-0);
		System.out.printf("%d\n", 'a'-0);
		
		
		System.out.println();
		System.out.println();
		
		//A부터 Z까지 아스키 코드 보기
		for (int i = 'A'; i <='Z'; i++) {
			System.out.println(i);
		}
	
		
		System.out.println();
		//A부터 Z까지 문자열로 보기
		for (char i = 'A'; i <='Z'; i++) {
			System.out.println(i);
		}
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
}
