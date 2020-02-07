package com.sapient.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class HashMapDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		   Map <Integer, User> map= new HashMap<>();
           User user1= new User(12,"ayush");
           User user2= new User(14,"abfgf");
           User user3= new User(54,"vc");
           User user4= new User(45,"gvrfd");
             map.put(1,user1);
             map.put(2,user2);
             map.put(3,user3);
             map.put(4,user4);
          Set<Integer> keyset= map.keySet();
          System.out.println(map.get(0));
          Iterator<Integer> it=keyset.iterator();
          while(it.hasNext()){
        	  System.out.println(map.get(it.next()));
          }
          Collection<User> values= map.values();
          Iterator<User> userit=values.iterator();
          while(userit.hasNext()){
        	  System.out.println(userit.next());
          }
          Set<Map.Entry<Integer, User>> entrySet = map.entrySet();
          Iterator<Map.Entry<Integer, User>> iterator= entrySet.iterator();
          while(iterator.hasNext()){
        	  Map.Entry<Integer, User> entry= iterator.next();
        	  System.out.println(entry.getKey());
        	  System.out.println(entry.getValue());
        	 
          }
          System.out.println("please enter date of birth");
          Scanner sc= new Scanner(System.in);
String d=sc.nextLine();
          Date currentDate= new Date();
    	  System.out.println(currentDate);
    	  SimpleDateFormat dateformat= new SimpleDateFormat("dd-mm-yy");
    	  //String todayDate= dateformat.format(currentDate);
    	  //System.out.println(todayDate);
    	  Date date=dateformat.parse(d);
    	  System.out.println(date.getDay());
	}

}
