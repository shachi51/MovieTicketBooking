package com.acc.movies;

public class RefreshmentBill {
	double calcBill (int a) //one coke
	{ 
		return a*50; 
		}
	double calcBill (int a, int b) //one coke and one popcorn
	{ 
		return a*50+b*80; 
		} 
	double calcBill(int a,int b,int c) //one coke,one popcorn and one nuggets  
	{ 
		return a*50+b*90+c*120;
		}
}
