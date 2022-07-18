package com.lq.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = new char[100];

		FileReader infile;
		FileWriter outfile;

		try {
			infile = new FileReader("D:\\smalltext\\1.txt");
			outfile = new FileWriter("D:\\smalltext\\c2.txt");

			int charsRead;

			int count = 0;

			while ((charsRead = infile.read()) != -1) {
				outfile.write(charsRead);						
				count++;
			}
			
			infile.close();
			outfile.close();		
			
			System.out.println( count );

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
