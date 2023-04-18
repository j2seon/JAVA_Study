package com.greedy.section03.uses;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application1 {
	
	public static void main(String[] args) {
		BufferedReader in = null;
		
		try {
			in = new BufferedReader(new FileReader("test.dat"));
			
			String s;
			
			while((s = in.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (FileNotFoundException | EOFException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
			try {
				if (in != null) { // 없으면 nullPointexception
					in.close();
				}
			} catch (IOException e) {}
		}
	}
}
