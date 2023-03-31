package com.greedy.section02.variable;



public class Application1 {

	public static void main(String[] args) {
		
		/* 변수의 사용목적 
		 * 
		 * 1. 값에 의미를 부여하기 위한 목적 (의미 전달이 쉬워야 코드를 읽기 쉽고, 협업 및 유지보수에 유리)
		 * 2. 한번 저장해둔 값을 재사용하기 위한 목적(값을 변경할 때도 간편하게 변경 가능)
		 * 3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다. (변하는 값을 저장하기 위한 공간)
		 * 
		 * */
		
		System.out.println("============ 값에 의미 부여 테스트 ============");
		System.out.println("보너스를 포한 한 급여 : " + (1000000 + 2000000) + "원");
		
		//타입 이름 = 값
		int bonus = 1000000;
		int salary = 2000000;
		
		System.out.println("보너스를 포한 한 급여 : " + (bonus + salary) + "원");

		System.out.println("============ 변수에 저장한 값 재사용 테스트 ============");
		
		System.out.println("1번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("2번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("3번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("4번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("5번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("6번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("7번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("8번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("9번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println("10번 고객에게 포인트를 100 포인트 지급하였습니다.");
		System.out.println();
		
		int point = 100;
		
		System.out.printf("1번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("2번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("3번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("4번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("5번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("6번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("7번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("8번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("9번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);
		System.out.printf("10번 고객에게 포인트를 %d 포인트 지급하였습니다.\n", point);		

		/* 시간에 따라 변경되는 값을 저장하고 사용할 수 있다. */
		/* 변수는 하나의 값을 저장하고 사용하기 위한 공간이기보다, 변하는 값을 저장하기 위한 공간이다. */
		
		int sum = 0;
		
		sum = sum + 10; //sum이라고하는 변수 공간에 0 + 10을 해서 다시 대입 그러면 기존의 sum변수에 10이 할당됨
		
		sum += 10;
		System.out.println("sum에 10을 더하면 현재 값은 ? : " + sum);
		
		
		
		
		
		
		Tv1[] tv1 = new Tv1[3];
		
		// 배열에 Tv1 객체 생성해서 저장
		for (int i = 0; i < tv1.length; i++) {
			tv1[i] = new Tv1();
			tv1[i].channel = 10+i;
		}
		
		
		System.out.println(tv1[0].channel);
		
		
		
		
	}
	

}
class Tv1{
    String color;
    int channel;
    boolean isPower;

    void power(){ //전원 메서드
        isPower = !isPower;
    }
    void channelUp(){ //채널 올리는 메서드
        ++channel;
    }
    void channelDown(){ //채널 내리는 메서드
        --channel;
    }
}