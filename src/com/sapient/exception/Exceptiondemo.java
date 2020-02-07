package com.sapient.exception;

public class Exceptiondemo {
    public static void main(String args[]){
    	int []array={12,23,34,45};
    	try{
    		System.out.print(Integer.parseInt("asd"));
         	System.out.print(array[7]);
        }
    	//catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
    		//System.out.println("array out of bound");
    		//System.out.println(e instanceof ArrayIndexOutOfBoundsException);
    		//System.out.println(e instanceof NumberFormatException);

    	//}
    	catch(Exception e){
    		System.out.println(e);
    		
    	}
    	
    	}
}
