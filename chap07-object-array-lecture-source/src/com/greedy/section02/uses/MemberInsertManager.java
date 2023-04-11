package com.greedy.section02.uses;

public class MemberInsertManager {
	
	/**
	 * <pre>
	 * 여러명의 회원 정보를 한번에 등록할 수 있는 기능 제공
	 * </pre>
	 * @param memberDTOs 회원 정보를 객체 배열로 전달
	 */
	public void insert(MemberDTO[] members) {
		System.out.println("회원 등록합니다.");
		
		for (int i = 0; i < members.length; i++) {
			System.out.println(members[i].getName() + "님을 회원 등록에 성공했습니다.");
		}
		
		System.out.println("총 " + members.length + "명의 회원 등록에 성공했습니다.");
	}
	
	
}
