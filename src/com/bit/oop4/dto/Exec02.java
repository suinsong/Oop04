package com.bit.oop4.dto;

import com.bit.oop4.vo.BookVO;

public class Exec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BookDTO bookDTO = new BookDTO();
		
		BookVO vo = new BookVO();
		
		vo.setStrTitle("Windows");
		vo.setStrAuthor("Alice");
		vo.setIntPrice(10);
		
		bookDTO.getDto().add(vo);
		
		vo = new BookVO();
		vo.setStrTitle("JAVA");
		vo.setStrAuthor("Christ");
		vo.setIntPrice(12);
		
		
		bookDTO.getDto().add(vo);
		
		System.out.print(bookDTO.toString());
		
	}

}
