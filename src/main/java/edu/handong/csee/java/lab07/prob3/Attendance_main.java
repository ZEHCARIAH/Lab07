package edu.handong.csee.java.lab07.prob3;
import java.util.Random;	
/**
 * This class define show some people attendance result</br>
 * This class has public static void main method</br>
 * void main method call four people's information and use if statement to show result</br>
 * @author MG
 *
 */

public class Attendance_main {	//declare public class named by Attendance_main

	public static void main(String[] args) {	//declare public static void main method 
		Attendance student1=new Attendance();	// Attendance student1 has Attendance method by using new Attendance
		Attendance student2=new Attendance();	// Attendance student2 has Attendance method by using new Attendance
		Attendance student3=new Attendance("Lucas",2,"21700214",0);	// Attendance student3 has Attendance method by using new Attendance including Lucas,2,"21700214",0
		Attendance student4=new Attendance("Martha",3,"21500382",2);	// Attendance student3 has Attendance method by using new Attendance including Martha,3,"21500382",2

		student1.set_name("Jess"); student1.set_year(4);student1.set_IDnumber("21400273");student1.set_miss(0);	//by declaring student1."something", student1 has information
		student2.set_name("Kent"); student2.set_year(1);student2.set_IDnumber("21800291");student2.set_miss(0);	//by declaring student2."something", student2 has information

		Random randomgeneration = new Random();	//Random randomgeneration can work Random's function by using New

		student1.set_miss(randomgeneration.nextInt(10));	//student1.set_miss has random value limit by 10(in randomgeneration)
		student2.set_miss(randomgeneration.nextInt(10));	//student2.set_miss has random value limit by 10(in randomgeneration)
		student3.set_miss(randomgeneration.nextInt(10));	//student3.set_miss has random value limit by 10(in randomgeneration)
		student4.set_miss(randomgeneration.nextInt(10));	//student4.set_miss has random value limit by 10(in randomgeneration)

		if(student1.get_miss()>6)	//if student.1's miss number has over value six, if statement work
		{
			System.out.println("I'm sorry"+student1.get_name()+"You failed this course");	//printout I'm sorry plus student1's name plus you failed this course
			System.out.println(student1.get_name()+"- number of absence:"+student1.get_miss());	//printout student1's name plus number of absence plus student1's absence number
		}
		else	
			System.out.println("We will see your grade: "+student1.get_miss());	//printout we will see your grade: plus student1's absence number

		if(student2.get_miss()>6)	//if student.2's miss number has over value six, if statement work
		{
			System.out.println("I'm sorry"+student2.get_name()+"You failed this course");	//printout I'm sorry plus student2's name plus you failed this course
			System.out.println(student2.get_name()+"- number of absence:"+student2.get_miss());	//printout student2's name plus number of absence plus student1's absence number
		}
		else
			System.out.println("We will see your grade: "+student2.get_miss());	//printout we will see your grade: plus student2's absence number

		if(student3.get_miss()>6)	//if student.3's miss number has over value six, if statement work
		{
			System.out.println("I'm sorry"+student3.get_name()+"You failed this course");	//printout I'm sorry plus student3's name plus you failed this course
			System.out.println(student3.get_name()+"- number of absence:"+student3.get_miss());	//printout student3's name plus number of absence plus student1's absence number
		}
		else
			System.out.println("We will see your grade: "+student3.get_miss());	//printout we will see your grade: plus student3's absence number

		if(student4.get_miss()>6)	//if student.3's miss number has over value six, if statement work
		{
			System.out.println("I'm sorry"+student4.get_name()+"You failed this course");	//printout I'm sorry plus student4's name plus you failed this course
			System.out.println(student4.get_name()+"- number of absence:"+student4.get_miss());	//printout student4's name plus number of absence plus student1's absence number
		}
		else
			System.out.println("We will see your grade: "+student4.get_miss());	//printout we will see your grade: plus student4's absence number
	}	
}



	
	