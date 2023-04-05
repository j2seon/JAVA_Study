package com.greedy.section01.array;

import java.util.Scanner;

public class Application2 {

	public static void main(String[] args) {

		
		/* 배열의 사용 방법
		 * 
		 * 배열의 선언
		 * 자료형[] 변수명;
		 * 자료형 변수명[];
		 * 
		 * */
		
		int[] arr; // int만 쓰겠다.
		
		/* 선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다. */
		int[] iarr;
		char[] carr;
		
		/* 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다. 
		 * new 연산자는 heap영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자
		 * */
		
		/* 배열을 할당할 시에는 반드시 배열의 크기를 지정해 주어야 한다. */
//		iarr = new int[];
		iarr = new int[5];
		carr = new char[10];
		
		/* 위의 선언과 할당을 동시에 할 수 있다.*/
		
		int[] iarr2 = new int[5];
		char[] carr2 = new char[10];
		
		/* heap메모리라는 이름으로 접근하는 것이 아닌 주소로 접근하는 영역이다. */
		System.out.println("iarr2 = " + iarr2);
		System.out.println("carr2 = " + carr2);
		
		/* hashCode() : 일반적으로 객체의 주소값을 10 진수로 변환하여 생성한 객체의 고유한 정수값을 반환한다.
		 * */
		System.out.println("iarr2의 hashCode : " + iarr2.hashCode());
		System.out.println("carr2의 hashCode : " + carr2.hashCode());
		
		System.out.println("iarr2의 길이 : " + iarr2.length );
		System.out.println("carr2의 길이 : " + carr2.length );

		Scanner sc = new Scanner(System.in);
		
		System.out.print("새로 할당할 배열의 길이를 입력하세요 : ");
		int size = sc.nextInt();
		
		double[] darr = new double[size];
		System.out.println("darr의 hashCode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		/* 배열의 사이즈를 변경한 것이 아니고, 새로운 배열을 생성하고 그 주소값을 레퍼런스 변수에 덮어쓴 것이다. */
		darr = new double[30];
		
		System.out.println("darr의 hashCode : " + darr.hashCode());
		System.out.println("darr의 길이 : " + darr.length);
		
		darr = null;
		
		/* NullPointException
		 * 아무것도 참조하지 않고 null 이라는 특수한 값을 참조하고 있는경우 참조연산자를 사용할 때 발생하는 에러
		 * */
		System.out.println("darr의 hashCode : " + darr.hashCode());
	}

}


abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춰");
    };
    void currentPos(){
        System.out.println(x + ", " + y);
    }

}
class Marine extends Unit {
    void move(int x, int y){
        //이동하는 메서드
        this.x = x;
        this.y = y;
    }
    void stipPack(){}
    
}

class Tank extends Unit{
    void move(int x, int y){
        //이동하는 메서드
    }
    void chageMode(){}
}
class DropShip extends Unit{
    void move(int x, int y){
        //이동하는 메서드
    }
    void load(){}
    void unload(){}
}
