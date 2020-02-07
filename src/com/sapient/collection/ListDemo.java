package com.sapient.collection;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l= new ArrayList<>();
        l.add(12);
        l.add(23);
        l.add(34); 
        l.add(45);
        l.add(56);
        //System.out.println(l);
        ListIterator<Integer> i1=l.listIterator();
        //Iterator<Integer> i=l.iterator();
        while(i1.hasNext()){
        	int value=i1.next();
        	//System.out.println(value);
        }
        
         while(i1.hasPrevious()){
            int value=i1.previous();
             System.out.println(value);
           }
             
         
	}

}
