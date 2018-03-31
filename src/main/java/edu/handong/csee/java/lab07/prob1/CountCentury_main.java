package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

public class CountCentury_main {

	public static void main(String[] args) {


		int y=0;
		Scanner keyboard= new Scanner(System.in);

		System.out.println("Input year:");
		y=keyboard.nextInt();

		CountCentury year= new CountCentury(y);
		System.out.println(y +" is "+  year.Cal_CountCentury()+ "th century");


	}

}