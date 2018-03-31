package edu.handong.csee.java.lab07.prob1;
/**
 * This class define a CountCentury</br>
 * This class has public class, public method and public integer method</br>
 * public class declare integer year</br>
 * public CountCentury declare integer year value and declare call year</br>
 * public int method deal with if/else statement</br>
 * @author MG
 *
 */

public class CountCentury {	//define public class 
	int year;	//declare integer year

	public CountCentury(){	//declare public CountCentury method
		year=0;	//give zero value to integer year
	}

	public CountCentury(int year) {	//define public CountCentury including int year
		this.year=year;	// by using this,unnamed year object can be refer 
	}
	public int Cal_CountCentury() {	//define public int CalCountCentury
		if(year%100==0)	//if integer year's molecule zero when divide 100
			year=year/100;	//year value equal year/100 value
		else
		{
			year=(year/100)+1;	//else integer year value equal (year/100)+1 value
		}
		return year;	//return integer year
	}
}