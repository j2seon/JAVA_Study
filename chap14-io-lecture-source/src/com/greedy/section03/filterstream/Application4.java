package com.greedy.section03.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.channels.NonWritableChannelException;

public class Application4 {

	public static void main(String[] args) {
		
		/* 객체 단위로 입출력을 하기 위한 ObjectInputStream / ObjectOutputStream
		 * */
		
		MemberVO[] outputMembers = {
				new MemberVO("user1","pass1", "홍길동","dd@dd.com",25,'남',1250.7),
				new MemberVO("user2","pass2", "이순신","df@dd.com",16,'남',1221.7),
				new MemberVO("user3","pass3", "유관순","le@dd.com",2,'여',1234.7)
		};
		
		
		ObjectOutputStream objout = null;
		
		try {
//			objout = new ObjectOutputStream(
//					    new BufferedOutputStream(
//							new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt",true)));
			if(new File("src/com/greedy/section03/filterstream/testObjectStream.txt").exists()) {
				/* 파일이 있는 경우 */
				objout = new MyOutputStream(
					    new BufferedOutputStream(
							new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt",true)));
			}else {
				/* 파일이 없는 경우 */
				objout = new ObjectOutputStream(
							new BufferedOutputStream(
									new FileOutputStream("src/com/greedy/section03/filterstream/testObjectStream.txt")));
			}
			
			for (int i = 0; i < outputMembers.length; i++) {
				objout.writeObject(outputMembers[i]);
			}
			
			objout.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(objout != null) {
				try {
					objout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/* VO에 serializable을 추가해주지 않으면 NotSerializable이 발생한다.
		 * --> 직렬화 처리를 해주지 않아서 발생하는 에러
		 * 
		 * 직렬화란?
		 * 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부에서도 사용할 수 있도록 
		 * 바이트(byte) 형태로 데이터를 변환하는 기술을 말한다
		 * 반대로 바이트로 변환된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고한다.
		 * 
		 * */
		
		MemberVO[] inputMembers = new MemberVO[3];
		
		ObjectInputStream objin = null;
		try {
			objin = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/com/greedy/section03/filterstream/testObjectStream.txt")));
			
			while (true) {
				System.out.println((MemberVO)objin.readObject());
			}
			
		} catch (EOFException e) {
			System.out.println("파일읽기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(objin != null) {
				try {
					objin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
