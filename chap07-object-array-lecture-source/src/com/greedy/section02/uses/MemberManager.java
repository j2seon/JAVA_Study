package com.greedy.section02.uses;

import java.util.HashMap;

/**
 * <pre>
 * 
 * 회원관리기능을 제공하는 용도의 클래스
 * 
 * </pre>
 *
 */
public class MemberManager {
	/**
	 * <pre>
	 * 여러 명의 회원 정보를 등록
	 * </pre>
	 */
	public void signUpMember() {
		/* 5명의 회원 정보를 담을 객체 배열 생성 */
		
		MemberDTO[] members = new MemberDTO[5]; // 현재 각 인덱스에는 null로 초기화 되어있다.
		
		/* 5명의 회원 정보를 각 인덱스에 할당 */
		
		members[0] = new MemberDTO(1, "user01", "pass01", "user01", 20, '남');
		members[1] = new MemberDTO(2, "user02", "pass02", "user02", 16, '여');
		members[2] = new MemberDTO(3, "user03", "pass03", "user03", 29, '남');
		members[3] = new MemberDTO(4, "user04", "pass04", "user04", 30, '여');
		members[4] = new MemberDTO(5, "user05", "pass05", "user05", 20, '남');
		
		MemberInsertManager manager = new MemberInsertManager();
		manager.insert(members);
		
	}
	/**
	 * <pre>
	 * 모든 회원 목록을 조회하여 정보를 출력
	 * </pre>
	 */
	public void printAllMembers() {
		MemberDTO[] selectedMembers = new MemberSelectManager().selectAllMembers();
		
		System.out.println("============= 가입된 회원 목록 ===========");
		for (MemberDTO member : selectedMembers) {
			System.out.println(member.toString());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("총 " + selectedMembers.length + "명의 회원이 가입되어 있습니다.");
	}

}
