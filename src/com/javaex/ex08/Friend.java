package com.javaex.ex08;

public class Friend {

	
	//필드
	private String name;
	private String hp;
	private String school;
	
	//생성자
	public Friend() {}
	
	public Friend(String name, String hp, String school) {
		this.name = name;
		this.hp = hp;
		this.school = school;
	}

	//메소드 - gs
	
	//메소드 - 일반
	
	public String info() {
		return "이름 :" + this.name + " 핸드폰 :" + this.hp + " 학교 :" + this.school;
	}
	
	
	
	
	
	
	
	
}
