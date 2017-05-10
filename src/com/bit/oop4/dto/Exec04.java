package com.bit.oop4.dto;

import com.bit.oop4.vo.BookVO;

public class Exec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=30;
		System.out.println("num1 : "+num1);
		
		
		setInt(num1);//값만 주고 마는 것!! /리턴을 안 받았으니깐 값 변화 ㄴㄴ
		num1=setInt(num1);// 값을 주고 결괴를 되돌려 받는것!!
		
		System.out.println("num1 : "+num1);
		
		
		
		BookVO vo= new BookVO();
		vo.setIntPrice(14);
		vo.setStrAuthor("NAME");
		vo.setStrTitle("HELLOJAVA");
		
		System.out.println("First : "+ vo.toString());
		setRef(vo);
		System.out.println("Second : "+ vo.toString());
		
		
	
	
	}

	static int setInt(int num) {
		num = 100;
		return num;
	}

	static void setRef(BookVO vo1) {

		vo1.setStrTitle("WELCOME");
	}

}
