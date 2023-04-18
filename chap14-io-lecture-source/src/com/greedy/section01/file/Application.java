package com.greedy.section01.file;

import java.io.File;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		
		/* JDK 1.0부터 지원하는 API로 파일처리를 수행하는 대표적인 클래스이다.
		 * 
		 * 대상파일에 대한 정보로 인스턴스를 생성하고 
		 * 파일의 생성, 삭제 등의 처리를 수행하는 기능을 제공하고 있다.
		 * */
		
		File file = new File("src/com/greedy/section01/file/test.txt");
		try {
			/* 파일 생성 후 성공 실패 여부를 boolean으로 리턴 */
			boolean createSuccess = file.createNewFile();
			
			/* 최초 실행하면 새롭게 파일이 만들어지기 때문에 true를 반환하지만
			 * 파일이 한 번 생성되고 난 이후에는 새롭게 파일을 만들지 않기 때문에 false를 반환
			 * */
			
			System.out.println("createSuccess : " + createSuccess);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일의 크기 : " + file.length() + "byte");
		System.out.println("파일의 경로 : " + file.getPath());
		System.out.println("현재 파일의 상위 경로 : " + file.getParent());
		System.out.println("파일의 절대경로 : " + file.getAbsolutePath());
		
		/* 파일 삭제
		 * 파일삭제 후 성공 실패 여부를 boolean으로 반환한다.
		 * */
		boolean deleteSuccess = file.delete();
		System.out.println("deleteSuccess : " + deleteSuccess);
		
	}
}
