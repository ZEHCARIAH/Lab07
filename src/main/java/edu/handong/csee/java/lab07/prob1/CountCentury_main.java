package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;
/**
 * This class define a CountCentury</br>
 * This class has public class and public static void main method</br>
 * Main method call CountCentury and printout result </br>
 * @author MG
 *
 */

public class CountCentury_main {	//define public class named by CountCentury_Main	

	public static void main(String[] args) {	//define static void main method 


		int y=0;	//declare integer y is zero
		Scanner keyboard= new Scanner(System.in);	// data can be entered from the keyboard using

		System.out.println("Input year:");	//printout Input year:
		y=keyboard.nextInt();	//integer y can type to use keyboard

		CountCentury year= new CountCentury(y);	//CountCentury's integer year equal integer y by using new comment 
		System.out.println(y +" is "+  year.Cal_CountCentury()+ "th century");	//printout year and year's century by using Cal_CountCentury method	


	}
}
