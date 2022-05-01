package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Friend jws = new Friend();
		Friend ihr = new Friend();
		Friend ijj = new Friend();
		
		System.out.println("친구를 3명 등록해주세요.");
		Friend[] fArray = new Friend[3];
		
		fArray[0] = jws;
		fArray[1] = ihr;
		fArray[2] = ijj;
		
		
		String name;
		String hp;
		String school;
		
		
		for(int i = 0; i < fArray.length; i++) {
			name = sc.next();
			hp = sc.next();
			school = sc.nextLine();
			
			fArray[i].setName(name);
			fArray[i].setHp(hp);
			fArray[i].setSchool(school);
		
		}
		System.out.println(jws.info());
		System.out.println(ihr.info());
		System.out.println(ijj.info());
		
		
		
		
		sc.close();
	}

}
