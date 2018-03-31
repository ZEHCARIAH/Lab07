package edu.handong.csee.java.lab07.prob1;

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