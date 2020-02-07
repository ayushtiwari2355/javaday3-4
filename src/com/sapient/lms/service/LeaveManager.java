package com.sapient.lms.service;
import com.sapient.lms.modellayer.*;
import java.util.Scanner;
public class LeaveManager {
	Leavedetails le=new Leavedetails();
	int remaining=le.leaves;
	public void apply_for_leave(Employee e,int no_of_days){
		//Scanner sc=new Scanner(System.in);
		//int initial=20;
		try{
			if(no_of_days>remaining){
				throw new IllegalArgumentException("invalid leaves");
			 }
			else{
				 //remaining=le.leaves-no_of_days;
				int z=le.getLeaves(no_of_days);
				System.out.println("your will get leaves for "+z+" days");
				 
			}
		}
		
			catch(IllegalArgumentException e1){
				System.out.println("leaves not applicable");
			}
		int r=le.updateLeaves(no_of_days);
		System.out.println("remaining leaves are "+r);
		  
		
		 }
		}
		


