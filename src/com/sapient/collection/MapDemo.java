package com.sapient.collection;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Map<Integer, User> map= new HashMap<>();
           User user1= new User(12,"ayush");
           User user2= new User(14,"abfgf");
           User user3= new User(54,"vc");
           User user4= new User(45,"gvrfd");
             map.put(1,user1);
             map.put(1,user2);
             map.put(1,user3);
             map.put(1,user4);


	}

}
