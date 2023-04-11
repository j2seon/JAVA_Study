package com.greedy.section02.uses;


/**
 * <pre>
 * 회원 정보 조회를 담당하는 용도의 클래스
 * </pre>
 *
 */
public class MemberSelectManager {

	public MemberDTO[] selectAllMembers() {
		
		/* 원래라면 데이터 베이스나 파일에서 정보를 읽어와야겠지만 현재는 그런게 없으니 
		 * 앞에서 작성한 것을 이용
		 * */
		
		return new MemberDTO[] {
			new MemberDTO(1, "user01", "pass01", "user01", 20, '남'),
			new MemberDTO(2, "user02", "pass02", "user02", 16, '여'),   
			new MemberDTO(3, "user03", "pass03", "user03", 29, '남'),   
			new MemberDTO(4, "user04", "pass04", "user04", 30, '여'),   
			new MemberDTO(5, "user05", "pass05", "user05", 20, '남')   
		};
	}
	
}
