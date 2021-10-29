package com.acc.movies;
import java.util.Scanner;
public class Theatre extends BookMyShow{
	private int noOfTickets;
	
	public void movies() {
		System.out.println("The movies available are");
		System.out.println("1.Conjuring -- Rs.100\n2.Titanic -- Rs.70 \n3.Fast and Furious -- Rs120 \n4.Avengers -- Rs.150");
		
	}
	
	public void displayTheatre() {
		System.out.println("-----Theatres available are------\n 1.PVR\n 2.INOX");
		int pvr;
		int inox;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("****PVR****");
			 System.out.println("****Select a movie****");
			 System.out.println("movie available are \n 1.Conjuring \n 2.Titanic ");
	            Scanner a = new Scanner(System.in);
	            int m = a.nextInt();
	            if(m==1) {
	            	System.out.println("Conjuring @ PVR");
	                System.out.println("Enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= noOfTickets-r;
	                int amount=100*r;
	                System.out.println("to continue to book for this movie press 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************************************************");
	                    System.out.println("theatre ------------------- PVR");
	                    System.out.println("movie --------------------- Conjuring");
	                    System.out.println("cost ---------------------- Rs."+amount);
	                    System.out.println("******************************************************");
	                }
	            }
	            if(m==2) {
	            	System.out.println("Titanic @ PVR");
	                 System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= noOfTickets-r;
	                int amount=70*r;
	                System.out.println("to continue to book for this movie press 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************************************************");
	                    System.out.println("theater ------------------- PVR");
	                    System.out.println("movie --------------------- Titanic");
	                    System.out.println("cost ---------------------- Rs"+amount);
	                    System.out.println("******************************************************");
	                }

	            }
		}
		if(n==2) {
			System.out.println("****INOX****");
			 System.out.println("****Select a movie****");
			 System.out.println("movie available are \n 1.Fast and Furious \n 2.Avengers ");
	            Scanner b = new Scanner(System.in);
	            int m = b.nextInt();
	            if(m==1) {
	            	System.out.println("Fast and Furious @ INOX");
	                System.out.println("Enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= noOfTickets-r;
	                int amount=120*r;
	                System.out.println("to continue to book for this movie press 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************************************************");
	                    System.out.println("theatre ------------------- INOX");
	                    System.out.println("movie --------------------- Fast and Furious");
	                    System.out.println("cost ---------------------- Rs."+amount);
	                    System.out.println("******************************************************");
	                }
	            }
	            if(m==2) {
	            	System.out.println("Avengers @ INOX");
	                 System.out.println("enter the number of tickets to be booked");
	                Scanner j = new Scanner(System.in);
	                int r = j.nextInt();
	                int left= noOfTickets-r;
	                int amount=150*r;
	                System.out.println("to continue to book for this movie press 1");
	                Scanner d = new Scanner(System.in);
	                int h = d.nextInt();
	                System.out.println("\n\n\n");
	                if (h == 1) {
	                    System.out.println("******************************************************");
	                    System.out.println("theater ------------------- INOX");
	                    System.out.println("movie --------------------- Avengers");
	                    System.out.println("cost ---------------------- Rs"+amount);
	                    System.out.println("******************************************************");
	                }

	            }
		}
		
	}
	public void viewRefreshments() {
	System.out.println("Coke");
	System.out.println("Popcorn");
	System.out.println("Cake");
	System.out.println("Nuggets");
	
	}
	
}
