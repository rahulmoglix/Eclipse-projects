package com.trainingFile.org;

import java.io.IOException;
import java.io.InputStreamReader;

public class FileExample {
	
	
	public static void main(String[] args) throws IOException {
		InputStreamReader cin=null;
		try {
			cin=new InputStreamReader(System.in);
			System.out.println("Enter characters");
			char c;
			do {
				c=(char)cin.read();
				System.out.println(c);
				
			}while(c!='q');
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			cin.close();
		}
	}
	
    }
