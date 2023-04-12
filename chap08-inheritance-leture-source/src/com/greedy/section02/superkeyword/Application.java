package com.greedy.section02.superkeyword;

import java.util.Date;

public class Application {
	
	public static void main(String[] args) {
	
		
		ProductDTO product1 = new ProductDTO();
		System.out.println(product1.getInformation());
		
		ProductDTO product2 = new ProductDTO("S-123456","삼성","갤럭시 폴드2", 2398000, new Date());
		System.out.println(product2.getInformation());
		
		ComputerDTO computer1 = new ComputerDTO();
		System.out.println(computer1.getInformation());
		
		ComputerDTO computer2 = new ComputerDTO("드래곤", 521, 12, "안드로이드");
		System.out.println(computer2.getInformation());
	
		
		
	}
}
