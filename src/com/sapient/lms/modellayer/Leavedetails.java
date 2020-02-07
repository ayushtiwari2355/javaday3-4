  package com.sapient.lms.modellayer;

public class Leavedetails {
	public int leaves;
   public Leavedetails(){
	   this.leaves=20;
   }
   public int getLeaves(int no_of_days){
	   System.out.println("you have applied for "+no_of_days+" days");
	   return leaves;
   }
   public int updateLeaves(int no_of_days){ 
	   leaves=leaves-no_of_days;
	   return leaves;
   }
   public void setLeaves(int leaves){
	   this.leaves=leaves;
    }
}
