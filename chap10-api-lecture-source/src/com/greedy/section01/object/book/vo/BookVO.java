package com.greedy.section01.object.book.vo;

import java.util.Objects;

public class BookVO {
	private int number;
	private String title;
	private String author;
	private int price;
	
	public BookVO() {}
	
	public BookVO(int number, String title, String author, int price) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	/* 해쉬코드를 재정의하면 같은 해쉬코드로 나옴*/
	@Override
	public int hashCode() {
		return Objects.hash(author, number, price, title);
	}
	
//	@Override
//	public int hashCode() {
//		/* 곱셈 연상을 누적시켜야 하기 때문에 0이 아닌 값으로 초기화 */
//		
//		int result = 1;
//		final int PRIME = 31;
//		
//		
//	}
	
	

	@Override
	public boolean equals(Object obj) {
		/* 두 인스턴스의 주소가 같으면 이후 다른 내용을 비교할 것도 없이 true */
		if (this == obj)
			return true;
		
		/* this는 인스턴스가 생성되면 주소값이 저장된다 null 일 수 없다 */
		if (obj == null)
			return false;
		
		/* 클래스가 같은 지 비교 */
		if (getClass() != obj.getClass())
			return false;
		
		
		BookVO other = (BookVO) obj;
		return Objects.equals(author, other.author) && number == other.number && price == other.price
				&& Objects.equals(title, other.title);
	}
	
	
	
}
