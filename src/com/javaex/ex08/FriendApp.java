package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Friend[] fArray = new Friend[3];
		
		String numLine;
		
		for(int i = 0; i < fArray.length; i++) {
			String name = sc.next();//입력
			String hp = sc.next();//입력
			String school = sc.next();//입력
			
			fArray[i] = new Friend(name, hp, school);	//위 next() 입력 값을 fArray[]배열안으로 Friend 생성자의
														// 매개변수로 넣음 즉 Friend 생성자의 name, hp, school 값이 
		}												// fArray[i]의 값으로 들어간다.
														// fArray[i]는 이름 핸드폰 학교 순으로 출력해야한다.
		
		for(int i = 0; i < fArray.length; i++) {
			System.out.println(fArray[i].info());		
		}
		
		
		
		
		
		
		sc.close();
	}

}
