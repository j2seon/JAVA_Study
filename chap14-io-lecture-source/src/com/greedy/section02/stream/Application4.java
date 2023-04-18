package com.greedy.section02.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Application4 {
	
	public static void main(String[] args) {
		
		/* FileWriter
		 * 
		 * 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림이다.
		 * 1. 글자단위로 데이터를 처리한다.
		 * */
		
		FileWriter fw = null;
		
		try {
			/* 두번째 인자로 true를 전달하면 이어쓰기가 된다 */
			fw = new FileWriter("src/com/greedy/section02/stream/testWriter.txt");
			
			fw.write(97);
			fw.write('A');
			fw.write(10);
			/* 문자열도 가능 */
			fw.write("허리아파 머리아파");
			fw.write(10);
			/* 문자 배열도 가능*/
			fw.write(new char[] {'a','p','p','l','e'});
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
