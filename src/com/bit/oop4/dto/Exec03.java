package com.bit.oop4.dto;

import com.bit.oop4.vo.BookVO;

public class Exec03 {

	public static void main(String[] args) {

		int num1 = 10;

		int num2 = 20;

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

		BookVO vo1 = new BookVO();
		vo1.setStrTitle("JAVA");
		vo1.setStrAuthor("NAMIRO");
		vo1.setIntPrice(13);

		System.out.println("vo1: " + vo1.toString());

		BookVO vo2 = new BookVO();
		vo2 = vo1; //이 두개가 같아져버림

		vo2.setStrTitle("WINDOW");
		
		
		
		System.out.println("vo2: " + vo2.toString());
		System.out.println("vo1: " + vo1.toString());

	}

}
