package com.sapient.collection;

import java.util.*;

public class Treeset {
	   public static void main(String []args){
           Set<User> users= new TreeSet<>(new UserNameAscComparator());
           User user1 = new User(1, "Kishan"); 
	   		User user2 = new User(2, "Vinay"); 
	   		User user3 = new User(12, "Hari"); 
	   		users.add(user1);
	   		users.add(user2);
	   		users.add(user3);
            Iterator<User> it= users.iterator();
	   }
}
