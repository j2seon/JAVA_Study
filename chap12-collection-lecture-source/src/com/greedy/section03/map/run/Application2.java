package com.greedy.section03.map.run;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Application2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();

		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin:@127.0.0.1:1521:xe");
		prop.setProperty("user", "student");
		prop.setProperty("password", "student");
		
		System.out.println("prop : " + prop);
		
		/* store() : Properties 객체 안에 있는 값을 이용해서 파일을 생성할 수 있다. */
		
		/* Writer 객체는 자바에서 파일을 생성할 때 사용하는 클래스 중에 하나 */
		
		try {
			
			/* byte 기반 */
			prop.store(new FileOutputStream("driver.dat"), "jdbc driver");
			/* 문자 기반 */
			prop.store(new FileWriter("driver.txt"), "jdbc driver");		
			prop.storeToXML(new FileOutputStream("driver.xml"), "jdbc driver");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* 파일로 부터 읽어와서 Properties에 기록*/
		
		
		Properties prop2 = new Properties();
		
		System.out.println("prop2 : " + prop2);
		try {
			prop2.load(new FileInputStream("driver.dat"));
			prop2.load(new FileReader("driver.txt"));
			prop2.load(new FileReader("driver.xml"));
			
			/* Properties의 모든 키 값 목록을 대상 스트림에 내보내기 한다.*/
			prop2.list(System.out);
			
			System.out.println(prop.getProperty("driver"));
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("user"));
			System.out.println(prop.getProperty("password"));
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println("prop2 : " + prop2);
		
		
		
		
		
	}
}
