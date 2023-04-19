package com.greedy.section03.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Application2 {

	public static void main(String[] args) {
		
		
		/* 형변환 보조스트림
		 * 기본 스트림이 byte 기반 스트림이고, 보조스트림이 char 기반 스트림인 경우에 사용
		 * */
		
		/* 표준스트림
		 * 자바에서는 콘솔이나 키보드 값은 표준 입출력 장치로부터 데이터를 입출력하기 위한 스트림을 표준 스트림형태로 제공하고 있다
		 * 
		 * System 클래스의 필드 in out err가 대상 데이터에 스트림을 읽어온다.
		 * 
		 * System.in(InputStream) : 콘솔로부터 데이터를 입력받는다
		 * System.out(PrintStream) : 콘솔로 데이터를 출력
		 * System.err(PrintStream) : 콘솔로 데이터를 출력
		 * */
		
		/* System.in 을 InputStreamReader로 변환하여 바이트 기반 스트림을 문자기반스트림으로 변환후 
		 * 버퍼를 이용한 보조스트림과 연결
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("문자열 입력 : ");
			String value = br.readLine();
			
			System.out.println("value : " + value);
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			if(br != null) {
				
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write("java");
			

		} catch (IOException e) {
			e.printStackTrace();
			
		}finally {
			if(bw != null) {
				
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
}
