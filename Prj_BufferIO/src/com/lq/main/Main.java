package com.lq.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader infile;
		BufferedReader inbuff;
		
		FileWriter outfile;
		BufferedWriter outbuff;
		
		try {
			infile = new FileReader("D:\\smalltext\\1.txt");
			inbuff = new BufferedReader(infile);
			
			
			outfile = new FileWriter("D:\\smalltext\\1-copy.txt");
			outbuff = new BufferedWriter(outfile);
					
			String line;
			
			while( ( line = inbuff.readLine()) != null ) {			
				outbuff.write(line);			
				//outbuff.newLine();							
			}			
			
			outbuff.flush();
			
			inbuff.close();
			outbuff.close();
			
			infile.close();
			outbuff.close();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

		
		
		
		
		
		
	}

}
