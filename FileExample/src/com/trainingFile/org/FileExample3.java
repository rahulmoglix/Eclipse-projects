package com.trainingFile.org;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample3 {
	
	public static void writeContent() throws IOException{
		String str="Hello File Handling";

		FileWriter fw=new FileWriter("test");
		for(int i =0;i<str.length();i++) {
			fw.write(str.charAt(i));
		}

		System.out.println("Successful");
		fw.close();
	}

	public static void readContent() throws IOException {
		int ch;
		
		FileReader fr=null;
		try {
			fr=new FileReader("test");
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		while((ch=fr.read())!=-1) {
			System.out.println((char)ch);
		}
		fr.close();

	}

	public static void main(String[] args) throws IOException {
		
		FileExample3.writeContent();
		FileExample3.readContent();
			
	}

}
