package com.phase1project.lockedme;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

	

public class filecreation {
	public static void main(String[] args) throws IOException {
		
		  
		// File f1 = new File ("MyFolder") ;
		 File f2 = new File ("database1.txt");
		 File f3 = new File ("locker1.txt");
		 
		 //f1.mkdir();
		 if((!f2.exists())) {
			 f2.createNewFile();	 
		     f3.createNewFile();
		 System.out.println(" file is created");
		 }
		 else {
			System.out.println("file already exist"); 
		 }
	
	
  
	}
 
}
