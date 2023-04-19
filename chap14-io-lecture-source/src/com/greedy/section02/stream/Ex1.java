package com.greedy.section02.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fos = new FileOutputStream("src/com/greedy/section02/stream/test.txt");
			
			BufferedOutputStream bf = new BufferedOutputStream(fos,5);
			
			for (int i = '1'; i <= '9'; i++) {
				bf.write(i);
			}
			bf.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}
}
