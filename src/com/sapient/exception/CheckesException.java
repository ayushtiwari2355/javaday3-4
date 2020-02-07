package com.sapient.exception;
  import java.io.*;
public class CheckesException {
	public static void main(String []args){
		try{
			throwException(args[0]);
		}
		catch(IllegalArgumentException e){
			System.out.println("age is less " +e);
		}
		finally{
			System.out.println("finally");
		}
	}
   private static void throwException(String arg){
	   int age= Integer.parseInt(arg);
	   if(age<18){
		   throw new IllegalArgumentException("invalid age");
	   }
   }
}
