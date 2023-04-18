package com.greedy.section02.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {
		
		
		/* FileOutputStream */
		
		/* 프로그램의 데이터를 파일로 내보내기 위한 용도의 스트림
		 * 1바이트 단위로 데이터를 처리한다.
		 * */
		
		FileOutputStream fout = null;
		
		try {
			/* FileNotFoundException을 핸들링 해줘야하지만
			 * 실행해도 예외는 발생하지 않는다
			 * OutputStream의 경우 대상파일이 존재하지 않으면 파일을 자동으로 생성해줌 
			 * */
			
			/* FileOutputStream(File,boolean) -> 이어쓰기
			 * false는 이어쓰기가 아닌 덮어쓰기이며, 기본값은 false인 덮어쓰기
			 * */
			fout = new FileOutputStream("src/com/greedy/section02/stream/testOutputStream.txt");
			
			fout.write(97);
			
			/* byte 배열을 이용해서 한번에 기록
			 * 10: 개행문자(엔터)
			 * */
			byte[] barr = {98,99,100,101,102,10};
			fout.write(barr);
			
			fout.write(barr, 1, 3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
	}
}
