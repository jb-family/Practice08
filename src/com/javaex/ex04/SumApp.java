package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		//코드를 작성하세요
		// 문자열 -> 숫자로 변경할땐 Integer.parseInt 사용.
		
		
		
		
		String[] num1 = numLine.split(" ");	
		// split()메소드로 공백으로 문자를 쪼개서 num1 배열에 넣는다.
		// 예를들어 100 200 300 입력
		// num1[0] = 100	배열에 저장
		// num1[1] = 200	배열에 저장
		// num1[2] = 300	배열에 저장
		// 공백을 3번해서 길이가 3이 된다. 길이만큼 반복 즉 3번 반복한다.

		// sum======================================= 
		// 0 = 0 + 100
		// 300 = 100 + 200
		// 600 = 300 + 300
		
		for(int i = 0; i < num1.length; i++ ) {
			int num = Integer.parseInt(num1[i]);
			sum = sum + num;
		}
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
