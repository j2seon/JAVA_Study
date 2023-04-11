package com.greedy.section02.uses;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		/* DTO를 활용한 간단한 회원 관리용 프로그램
		 * 
		 * 구현가능 
		 * 1. 여러명의 회원정보를 받아 한번에 여러 회원 정보를 등록
		 * 2. 전체 회원 조회 시 여러 명의 회원 정보를 반환
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		MemberManager memberManager = new MemberManager();
		
		menu:
		while(true) {
			System.out.println("========== 회원 관리 프로그램 ===========");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 전체 조회");
			System.out.println("9. 프로그램 종료");
			
			int no = sc.nextInt();
			
			switch (no) {
			case 1: memberManager.signUpMember(); break;
			case 2: memberManager.printAllMembers(); break;
			case 9: System.out.println("프로그램을 종료합니다."); break menu;
			default: System.out.println("잘못된 번호를 입력하셨습니다."); break;
			}
			
		}
		
	}
	
}
