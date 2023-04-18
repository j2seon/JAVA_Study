package com.greedy.section02.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application2 {
	
	public static void main(String[] args) {
		
		/* FileReader
		 * FileInputStream과 사용하는 방법이 거의 동일하다.
		 * 단, byte단위가 아닌 character단위로 읽어 들이는 부분이 차이점이다.
		 * 따라서 2바이트이던 3바이트이던 글자단위로 읽어오기 때문에 한글을 정상적으로 읽어올 수 있다.
		 * 
		 * */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/com/greedy/section02/stream/testReader.txt");
			
			int value;
			
//			while ((value = fr.read()) != -1) {
//				System.out.print((char) value);
//			}
			int length = (int) new File("src/com/greedy/section02/stream/testReader.txt").length();
			char[] carr = new char[length];
			
			fr.read(carr);
			
			for (int i = 0; i < carr.length; i++) {
				System.out.print(carr[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
