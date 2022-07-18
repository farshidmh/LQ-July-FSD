package com.lq.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream infile;
		FileOutputStream outfile;

		try {
			infile = new FileInputStream("D:\\smalltext\\1.txt");
			outfile = new FileOutputStream("D:\\smalltext\\copy.txt");
			byte b;
			int byteCount = 0;			
			while ((b = (byte) infile.read()) != -1) {				
				outfile.write(b);				
				byteCount++;
			}
		
			System.out.println( byteCount );

			//infile.close();
			//outfile.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("Good Bye");
		}
		

	}

}
