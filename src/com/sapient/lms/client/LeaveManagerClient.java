package com.sapient.lms.client;
import com.sapient.lms.modellayer.*;
import com.sapient.lms.service.*;
import java.util.Scanner;
public class LeaveManagerClient {
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		LeaveManager l=new LeaveManager();
		Leavedetails l1=new Leavedetails ();
		Leavedetails l2=new Leavedetails ();
        Employee e1=new Employee(100,"ayush","IT");
        Employee e2=new Employee(101,"ankur","BDA");
        //int a= sc.nextInt();
        System.out.println("enter user id");
        int id=sc.nextInt();
        System.out.println("enter 1 for applying leave");
        int condition=sc.nextInt();
        switch(condition){
        case 1:
        	if(id==100){
        	   System.out.print("how many leaves?");
        	   int no_of_days=sc.nextInt();
        	   l.apply_for_leave(e1,no_of_days);
        	}
        	else if(id==101){
        	   System.out.print("how many leaves?");
         	   int no_of_days=sc.nextInt();
         	   l.apply_for_leave(e2,no_of_days);
        	}
        	else{
        		System.out.println("invalid id");
        	}
            default: 
        	    System.out.println("thank you for your time");
        }
	}

}
