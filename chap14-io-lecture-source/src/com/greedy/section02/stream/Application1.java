package com.greedy.section02.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Application1 {

	public static void main(String[] args) {
		
		/* 입출력 스트림
		 * 프로그래밍을 할 때 많은 종류의 데이터를 다루어야한다.
		 * 하지만 데이터는 프로그램 내부에 있을 수도 있지만, 프로그램 외부의 데이터를 가져와서 사용해야 할 수도 있다.
		 * 또한 프로그램에서 생성한 데이터를 외부로 출력할 수도 있다.
		 * 
		 * 외부데이터란 프로그램 외부에 존재하는 모든 데이터를 의미한다.
		 * 외부데이터는 하드디스크상의 파일이 될 수도 있고, 네트워크 상에 존재하는 자원이 될 수도 있다.
		 * 
		 * 외부데이터를 대상으로 작업할때 가장 먼저 해야할 일을 자바 프로그램과 외부데이터를 연결하는 것이다.
		 * 프로그램과 외부 데이터가 연결된 길을 스트림(stream)이라고 한다.
		 * 
		 * 스트림은 단방향이기 때문에 데이터를 읽어오기 위한 길은 입력스트림, 데이터를 출력하기 위한 길은 출력 스트림이라고 부른다.
		 *
		 * InputStream과 OutputStream은 1바이트 단위로 입/출력을 하고
		 * Reader와 Writer 계열은 글자를 (2바이트 또는 3바이트) 단위로 작업을 한다
		 * 
		 * MS949 인코딩에서는 한글 한글자를 2바이트로 취급하지만
		 * UTF-8에서는 한글 한글자를 3바이트로 취급한다.
		 * */
		
		FileInputStream fin = null;
		
		try {
			
			fin = new FileInputStream(new File("src/com/greedy/section02/stream/testInputStream.txt"));
			int value;
			
			/* read() : 파일에 기록된 값을 순차적으로 읽어오고 더이상 읽어올 데이터가 없는 경우 -1 반환
			 * */
			
			while ((value = fin.read()) != -1) {
				/* 값을 정수로 읽어온다. */
//				System.out.println(value);
				
				/* 문자로 출력하고 싶은 경우 */
				System.out.println((char) value);
			}
			
			/* testInputStream.txt 파일에 한글로 값을 변경하게 되면 한글이 깨져서 나온다.
			 * 한글은 한글자에 3 바이트이기 때문에 3바이트 데이터를 1바이트씩 읽어오면 글자가 깨진다. 
			 * */
			
			/* 1byte씩 읽어와야하는 경우도 존재하긴하지만 대부분의 경우 굉장히 비효율적이다.
			 * 그래서 byte 배열을 이용해서 한번에 데이터를 읽어오는 방법도 제공한다.
			 * */
			int fileSize = (int) new File("src/com/greedy/section02/stream/testInputStream.txt").length();
			System.out.println(fileSize);
			/* 파일의 길이만큼의 byte 배열을 생성 */
			byte[] barr = new byte[fileSize];
			
			fin.read(barr);
			
			for (int i = 0; i < barr.length; i++) {
				System.out.print((char) barr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(fin !=null) { // fin 인스턴스가 null이 아닌 경우 자원 반납을 해야한다.
				try {
					/* 자원 해제를 하는 경우에도 IOException()을 핸들링 해야한다.
					 * 이미 자원이 반납된 경우에 발생하는 Exception이다.
					 * */
					
					/* 자원을 반납해야하는 이유
					 * 1. 장기간 실행중인 프로그램에서 스트림을 닫지 않은 경우 다양한 리소스에서 누수(leak)가 발생한다.
					 * 2. 뒤에서 배우는 버퍼를 이용하는 경우 마지막에 flush()로 버퍼에 있는 데이터를 강제로 전송해야한다
					 * 	  만약 잔류데이터가 남은 상황에서 추가로 스트림을 사용한다면 데드락(deadlock)상태가 된다.
					 * 	  이는 판단하기 어렵고 의도하지 않은 상황에서도 이런 현상이 발생할 수 있기 때문에 마지막에서는 flush()를 
					 * 	  무조건 실행해 주는 것이 좋다.
					 * 
					 *    close() 메소드는 자원을 반납하며 flush()를 해 주기 때문에 close()만 제대로 해줘도 된다.
					 *    따라서 close()메소드는 외부 자원을 사용하는 경우 반드시 마지막에 호출해줘야한다.
					 * */
					
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
