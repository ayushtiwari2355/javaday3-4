package com.sapient.lms.io;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class FileReaderDemo {
	public static void main(String[] args){
		File file= new File("C:\\text.txt");
		try(FileWriter fileWriter= new FileWriter(file)){
			 fileWriter.append("bnb nkml");
		}
		catch(FileNotFoundException e){
			System.out.printf("file not present in ", file.getName());
			e.printStackTrace();
		}
		catch(IOException e){
			System.out.println("sdfghj");
			e.printStackTrace();
		}
			try(FileReader fileReader= new FileReader(file)){
				int c=0;
				while(c!=-1){
                   System.out.print((char)c);	
                   c=fileReader.read();
                   }
				
			}
			catch(IOException e){
				System.out.println("sdfghj");
			}
		}
	}


