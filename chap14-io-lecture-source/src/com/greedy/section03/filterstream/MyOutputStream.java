package com.greedy.section03.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyOutputStream extends ObjectOutputStream{

	public MyOutputStream(OutputStream out) throws IOException {
		super(out);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		/* 헤더 저장할 때 아무것도 안하도록 변경*/
//		super.writeStreamHeader();
	}



	
}
