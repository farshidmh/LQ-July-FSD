package com.lq.ex;

public class Main {

	public static void main(String[] args) {

		int monthNumber = 1;

		while (monthNumber <= 2) {

			String monthName="";
			int numberOfDays=0;

			switch (monthNumber) {

			case 1:
				monthName = "Jan";
				numberOfDays = 31;
				break;

			case 2:
				monthName = "Feb";
				numberOfDays = 28;
				break;

			}

			System.out.println(monthName + " has " + numberOfDays + " days");

			monthNumber++;
		}

	}

}
