package com.lq.ex;

public class Main {

	public static void main(String[] args) {

/*
		String[] daysOfWeek = {"Sun","Mon","Tue","Wed","Thur","Fri","Sat"};
		
		System.out.println("Days of the week are: ");
		
		for( int i =0; i<7; i++ ) 
		{
			System.out.println( daysOfWeek[i] );		
		}
		
		for( int i = 6 ; i>=0 ; i-- )
		{
			System.out.println( daysOfWeek[i] );		
			
		}
		*/
		/*
		int a = 4;
		int b = 20;
		int c = 30;
				
		if( a>5 || c>20  && b>10  ) {	
			System.out.println(" Hello ");
		} else {
			System.out.println(" Bye ");
		}
		*/
		/*
		int a = 8;
		
		if(  a % 2 == 0  ) {
			
			System.out.println(" Even ");
			
		}else {
			
			System.out.println(" Odd ");
			
		}
		*/
		/*
		for(int i = 1;i<=100; i++ )
		{
			if( i> 60 || i < 50 ) {
				System.out.println(i);	
			}			
		}
		*/
		/*
		for(int i = 1;i<=50;i++) 
		{	
			if(  i%2==0 ) {
				System.out.println(i + " EVEN");
			}else {
				System.out.println(i + " ODD");
			}
		}
*/
		/*
		int n =20;
		int count = 0;
		
		while( count<n  ) {
			
			System.out.print("*");
			
			count++; //count = count + 1;
			
		}
		*/
		
		/*
		int k = 0;		
		while( k<=20 ) {			
			k++;			
			if(   k%2!=0  ) {		
				continue;				
			}		
			System.out.println(k);		
		}
		
		

		int n =20;
		int count = 30;
		
		do {
			System.out.print("+");		
			count++;
		} while( count < n ) ; 
		
		*/
		
		
		int a = 5;
		
		/*
		if(  a == 1  ) {
			System.out.println("A");
		}else if( a==2  ) {
			System.out.println("B");
		}else if( a==3  ) {
			System.out.println("C");
		}else if( a==4  ) {
			System.out.println("D");
		}else {
			System.out.println("Other");
		}
		*/
		
		switch( a ) {
		
		case 1:
			System.out.println("A");
			break;
		
		case 2:
			System.out.println("B");
			break;
			
		case 3:
			System.out.println("C");
			break;
			
		case 4:
			System.out.println("D");
			break;
		
			default:
				System.out.println("Other");
				break;

		}
		
		
		
		

		
		

	}

}

