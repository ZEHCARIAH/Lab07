package edu.handong.csee.java.lab07.prob3;
import java.util.Random;
/**
 * This class define show some people attendance result</br>
 * This class has public method and public void method</br>
 * public class declare private members</br>
 * public method deal with declared member and call each member</br>
 * public void method call declared each member</br>
 * @author MG
 *
 */

public class Attendance {	//declare public class named by Attendance
	private String name = "";	//declare private string  named by name
	private int year=0;	//declare private int variable named by year and have value zero
	private String IDnumber = "";	//declare private String  named by IDnumber
	private int miss =0;	//declare private int variable named by miss and have value zero


	public Attendance(){	//declare public method named by Attendance
		this.name="Null";	//by using this comment, named have Null value
		this.year=0;	//by using this comment, year has zero value 
		this.IDnumber="Null";	//by using this comment, IDnumber have Null value
		this.miss=0;	//by using comment, miss has zero value
	}

	public Attendance(String name, int year, String IDnumber, int miss)	//declare public method including String and year member
	{
		this.name=name;	//this.name equal name value
		this.year=year;	//this.year equal year value
		this.IDnumber=IDnumber;	//this.IDnumber equal IDnumber value
		this.miss=miss;	// this.miss equal miss value 
	}

	public String get_name() {	//declare public string method named by get_name
		return this.name;	//return this.name
	}

	public int get_year() {	//declare public integer method named by get_year
		return this.year;	//return this.year
	}

	public String get_IDnumber() {	//declare public string method named by get_IDnumber
		return this.IDnumber;	//return this.IDnumber
	}

	public int get_miss() {	//declare public integer method named by get_miss
		return this.miss;	//return this.miss
	}

	public void set_name(String name) {	//declare public void method named by set_name (including String name)
		this.name =name;	//this.name equal name
	}

	public void set_year(int year) {	//declare public void method named by set_year(including int year)
		this.year=year;	//this.year equal year
	}

	public void set_IDnumber( String IDnumber) {	//declare public void method named by set_IDnumber(including String IDnumber)
		this.IDnumber=IDnumber;	//this.IDnumber equal IDnumber
	}

	public void set_miss(int miss) {	//declare public void method named by set_miss(including int miss)
		this.miss=miss;	//this.miss equal miss
	}
}
