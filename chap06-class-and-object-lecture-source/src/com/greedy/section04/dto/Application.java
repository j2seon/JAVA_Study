package com.greedy.section04.dto;

import java.util.Date;

public class Application {
	public static void main(String[] args) {
		
		/* 생성자를 이용한 초기화와 설정자를 이용한 초기화 비교 */
		
		/* 
		 * 1. 생성자를 이용한 초기화
		 * 장점 : setter메소드를 여러번 호출해서 사용하지 않고 단 한번의 호출로 인스턴스를 생성 및 초기화 할 수 있다.
		 * 단점 : 필드를 초기화 할때 매개변수의 갯수를 경우의 수 별로 모두 만들어줘야한다.
		 * 		 호출 시 인자가 많아지는 경우 어떠한 값이 어떤 필드를 의미하는지 한 눈으로 보기 힘들다.
		 * 
		 * 예) 아이디, 비밀번호, 이름이 모두 greedy인 경우
		 * new User("greedy","greedy","greedy");
		 * 
		 * 2. 생성자를 이용한 초기화
		 * 장점 : 필드를 초기화하는 각각의 값들이 어떤 필드를 초기화하는지 명확하게 볼 수 있다. 
		 * 
		 * 예) 아이디, 비밀번호, 이름이 모두 greedy인 경우
		 * User user = new User();
		 * user.setId("greedy");
		 * user.setPwd("greedy");
		 * user.setName("greedy");
		 * 
		 * 단점 : 하나의 인스턴스를 생성할 때 한 번의 호출로 끝나지 않는다.
		 * */
		
		UserDTO user1 = new UserDTO("greedy","greedy","greedy",new Date());
		
		
	}
}
