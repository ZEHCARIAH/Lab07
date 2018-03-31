package edu.handong.csee.java.lab07.prob3;
import java.util.Random;

public class Attendance_main {

	public static void main(String[] args) {
		Attendance student1=new Attendance();
		Attendance student2=new Attendance();
		Attendance student3=new Attendance("Lucas",2,"21700214",0);
		Attendance student4=new Attendance("Martha",3,"21500382",2);

		student1.set_name("Jess"); student1.set_year(4);student1.set_IDnumber("21400273");student1.set_miss(0);
		student2.set_name("Kent"); student2.set_year(1);student2.set_IDnumber("21800291");student2.set_miss(0);

		Random randomgeneration = new Random();

		student1.set_miss(randomgeneration.nextInt(10));
		student2.set_miss(randomgeneration.nextInt(10));
		student3.set_miss(randomgeneration.nextInt(10));
		student4.set_miss(randomgeneration.nextInt(10));





	
	