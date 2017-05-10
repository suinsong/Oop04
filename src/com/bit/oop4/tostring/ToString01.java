package com.bit.oop4.tostring;

public class ToString01 {

	public static void main(String[] args) {

		// 각 자리에 있는 숫자의 합은?
		int num = 4957264;

		// 1. 숫자열을 문자열로 변환시킴
		// 2. 문자열을 문자(char)배열로 만듦
		// 3. 문자(char) 배열 요소를 다시 숫자로 바꾸어서
		// 4. 반복문을 써서 합산

		// 숫자을 문자열로 변환
		String strNum = Integer.toString(num);

		// 문자열을 문자(char)배열로 만들기
		char[] charNum = strNum.toCharArray();

		int intSum = 0;
		for (int i = 0; i < charNum.length; i++) {
			System.out.print(charNum[i]+"\t");
			
			intSum += charNum[i] - '0';

		}

		System.out.println(intSum);

	}

}
