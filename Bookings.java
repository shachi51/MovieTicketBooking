package com.acc.movies;
import java.util.Scanner;
public class Bookings {

	public static void main(String[] args) {
		 //BookMyShow ob = new BookMyShow();

	        BookMyShow[] moviename = new BookMyShow[2];
	        //moviename[0] = ob;
	        Theatre a = new Theatre();
	        moviename[1] = a;

	        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
	        System.out.println("---------1.list of movies and their prices--------- \n-------2.access and book tickets through theaters---");

	        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	        Scanner d = new Scanner(System.in);
	        int h = d.nextInt();
	        switch (h) {
	            case 1: {
	                a.movies();
	                break;
	            }
	            case 2: {
	             
	                a.displayTheatre();
	            }
	        }
	        
	        System.out.println("Press 7 for adding refreshments");
	        a.viewRefreshments();
	        int r=d.nextInt();

	        if(r==7)

	        {

	        RefreshmentBill ob1=new RefreshmentBill();

	        System.out.println("Enter the quantity of coke");

	        int c=d.nextInt();

	        System.out.println("Enter the quantity of popcorn");

	        int pc=d.nextInt();

	        System.out.println("Enter the quantity of nuggets");

	        int ng=d.nextInt();

	        if(c==1 && pc==0 && ng==0)

	        {

	        double cost1=ob1.calcBill(c);

	        System.out.println("Cost="+cost1);//calculating cost for one coca cola

	        }

	        else if(c==1 && pc==1 && ng==0)//calculating cost for one coca cola and one sandwich

	        {

	        double cost2=ob1.calcBill(c,pc);

	        System.out.println("Cost="+cost2);

	        }

	        else if(c==1 && pc==1 && ng==1)//calculating cost for one coca cola ,one sandwich and one samosa

	        {

	        double cost3=ob1.calcBill(c,pc,ng);

	        System.out.println("Cost="+cost3);

	        }

	        }

	        else

	        {

	        System.out.println("Thankyou for visiting");

	        }

	    }

	}
