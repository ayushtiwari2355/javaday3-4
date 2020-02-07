package com.sapient.collection;
import java.util.*;

public class Sets {
   public static void main(String []args){
	 
	   		User user1 = new User(1, "Kishan"); 
	   		User user2 = new User(2, "Vinay"); 
	   		User user3 = new User(12, "Hari"); 
	   			 
	  		//System.out.println(user1); 
	   		//System.out.println(user2); 
	   	 
	   	//	System.out.println(user1 == user2); 
	   	//System.out.println(user1.equals(user2)); 
	  	 
	   	Set<User> set = new TreeSet<>(); 
	   	set.add(user1); 
	   	set.add(user2); 
	   	set.add(user3); 
	   //		System.out.println("Contains user2 "+set.contains(user2)); 
	   //		System.out.println(" Is empty >> "+set.isEmpty()); 
	   //		set.clear(); 
	    //		System.out.println(" Is empty >> "+set.isEmpty()); 
	    		 
	    		 
	    		System.out.println(set); 
	    		 
	    	} 
	    } 
	    
	    
	    class User implements Comparable<User>{ 
	    	 
	    	private int id; 
	    	private String name; 
	    	 
	    	public User(int id, String name) { 
	    		this.id = id; 
	    		this.name = name; 
	    	} 
	    	 
	  	 
	    	@Override 
	    	public String toString() { 
	    		return "{id: "+this.id+","+ "name: "+this.name+"}"; 
	    	} 
	    
	    
	    
	    
	    	@Override 
	    	public int hashCode() { 
	    		final int prime = 31; 
	    		int result = 1; 
	    		result = prime * result + id; 
	    		result = prime * result + ((name == null) ? 0 : name.hashCode()); 
	    		return result; 
	    	} 
	    
	    
	    
	    
	    	@Override 
	    	public boolean equals(Object obj) { 
	    		if (this == obj) 
	    			return true; 
	    		if (obj == null) 
	    			return false; 
	    		if (getClass() != obj.getClass()) 
	    			return false; 
	    		User other = (User) obj; 
	    		if (id != other.id) 
	    			return false; 
	    		if (name == null) { 
	    			if (other.name != null) 
	   				return false; 
	   		} else if (!name.equals(other.name)) 
	   			return false; 
	    		return true; 
	   	} 
	   
	    
	   
	    
	   	@Override 
	    	public int compareTo(User user) { 
	    		 
	    		return user.name.compareTo(this.name); 
	    	} 
	    	 
	   	 
	    } 

   

