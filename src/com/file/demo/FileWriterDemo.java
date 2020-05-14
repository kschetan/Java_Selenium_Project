package com.file.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter wr= new FileWriter("abc.txt");
		wr.write(100);
		wr.write("urga\nsoftwaresolution");
		wr.write('\n');
		char[] ch1= {'a', 'b','c'};
		wr.write(ch1);
		wr.flush();
		wr.close();
	}

}
