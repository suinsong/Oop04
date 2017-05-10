package com.bit.oop4.exec;

import com.bit.oop4.vo.BookVO;

public class Exec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookVO book = new BookVO();
		
		book.setStrTitle("HelloJava");
		book.setStrAuthor("John");
		book.setIntPrice(10);
		
		
		
		String mess=book.toString();//문자열로 저장 
		BookVO vo2 =book; //book의 인스턴스로 저장
		
		System.out.println("first:"+mess);
		System.out.println("second:"+vo2);
		
		vo2.setStrTitle("aaaaa");
		System.out.println("after change:" + book.toString());
		
		System.out.println();
		
		//!!이 두 문장은 같은 일을 함!!!
		System.out.println(book.toString());
		System.out.println(book);
		
		
		String num= Integer.toString(30);
		
		System.out.println(Integer.toString(30));
		System.out.println(30);
	}

}
