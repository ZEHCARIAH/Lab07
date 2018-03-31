package edu.handong.csee.java.lab07.prob3;
import java.util.Random;

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
}
