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

public class Attendance {
	private String name = "";
	private int year=0;
	private String IDnumber = "";
	private int miss =0;


	public Attendance(){
		this.name="Null";
		this.year=0;
		this.IDnumber="Null";
		this.miss=0;
	}

	public Attendance(String name, int year, String IDnumber, int miss)
	{
		this.name=name;
		this.year=year;
		this.IDnumber=IDnumber;
		this.miss=miss;
	}

	public String get_name() {
		return this.name;
	}

	public int get_year() {
		return this.year;
	}

	public String get_IDnumber() {
		return this.IDnumber;
	}

	public int miss() {
		return this.miss;
	}

	public void set_name(String name) {
		this.name =name;
	}

	public void set_year(int year) {
		this.year=year;
	}

	public void set_IDnumber( String IDnumber) {
		this.IDnumber=IDnumber;
	}

	public void set_miss(int miss) {
		this.miss=miss;
	}
}
