package com.greedy.section03.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application3 {

	public static void main(String[] args) {

		/* 외부데이터로부터 읽어오는 데이터를 바이트형 정수, 문자, 문자열로만 읽어오면
		 * 여러 데이터 타입을 취급하는 경우 별도로 처리를 해주어야한다.
		 * 정수를 입력받아 처리하려면 pasing을 해줘야한다.
		 * "10" -> Integer.parseInt("10")
		 *  
		 * */

		/* 데이터 자료형 별로 처리하는 기능을 추가한 보조스트림을 제공한다. 
		 * DataInputStream / DataOutputStream이다.
		 * */

		DataOutputStream dout = null;

		try {
			dout = new DataOutputStream(new FileOutputStream("src/com/greedy/section03/filterstream/score.txt"));

			/* 파일에 자료형별로 기록 */
			dout.writeUTF("졸려");
			dout.writeInt(95);
			dout.writeChar('a');

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(dout != null) {

				try {
					dout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* 데이터 형별로 읽어오는 DataInputStream */
		
		DataInputStream din = null;
		
		try {
			din = new DataInputStream(new FileInputStream("src/com/greedy/section03/filterstream/score.txt"));
			
			while (true) {
				/* 파일에 기록한 순서대로 읽어들이지 못하면 에러 발생 */
				System.out.println(din.readUTF() + ", " + din.readInt() + ", " + din.readChar());
				
				/* 이 상태(무한반복)로 읽어들이게 되면 파일이 더이상 읽을 것이 없는 경우 EOFException을 발생 
				 * */
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("파일읽기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(din != null) {

				try {
					din.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
