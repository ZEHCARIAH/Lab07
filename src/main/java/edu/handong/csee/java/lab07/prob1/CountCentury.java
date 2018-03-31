package edu.handong.csee.java.lab07.prob1;
/**
 * This class define a CountCentury</br>
 * This class has public class, public method and public integer method</br>
 * public class declare integer year</br>
 * public CountCentury declare integer year value and declare call year</br>
 * public int member deal with if/else statement</br>
 * @author MG
 *
 */

public class CountCentury {
	int year;

	public CountCentury(){
		year=0;
	}

	public CountCentury(int year) {
		this.year=year;
	}
	public int Cal_CountCentury() {
		if(year%100==0)
			year=year/100;
		else
		{
			year=(year/100)+1;
		}
		return year;
	}
}