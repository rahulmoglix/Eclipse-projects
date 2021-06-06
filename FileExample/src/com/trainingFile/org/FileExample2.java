package com.trainingFile.org;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileExample2 {

	public static void main(String[] args) {
		try {

			byte bwrite[]= {10,20,30,40,50};
			OutputStream os=new FileOutputStream("output.txt");
			for(int i=0;i<bwrite.length;i++) {
				os.write(bwrite[i]);
			}
			os.close();


			InputStream in=new FileInputStream("output.txt");
			int size=in.available();
			System.out.println("Size "+size);
			for(int i=0;i<size;i++) {
				System.out.println((char)in.read());
			}
			in.close();


		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}


    }
