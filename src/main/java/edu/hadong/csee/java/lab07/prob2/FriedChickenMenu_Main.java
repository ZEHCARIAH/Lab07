package edu.hadong.csee.java.lab07.prob2;
/**
 * This class define FriedChicken menu rating</br>
 * This class has public class and public static void main method</br>
 * Main method deal with chiekenMenu's limit and call void method</br>
 * @author MG
 *
 */

public class FriedChickenMenu_Main {	// declare public class named by FriedChickenMenu_Main

	public static void main(String[] args) {	//declare public static void main method
		FriedChickenMenu menu1=new FriedChickenMenu("Cheese_mustard",16000.00,5);	//FriedChickenMenu's menu1 member equal FriedChickenMenu method address and has Cheese mustard (price limit: 16000.00, rating limit:5) 
		FriedChickenMenu menu2=new FriedChickenMenu("Honey_musatard",16000.00,5);	//FriedChickenMenu's menu2 member equal FriedChickenMenu method address and has Honey mustard (price limit: 16000.00, rating limit:5) 
		FriedChickenMenu menu3=new FriedChickenMenu("Spicey_chicken",16000.00,5);	//FriedChickenMenu's menu3 member equal FriedChcikenMenu method address and has Spicy chicken (price limit: 16000.00, rating limit:5) 

		menu1.set_stars(3);	//menu1 member call set_stars method having value three
		menu2.set_stars(4);	//menu2 member call set_stars method having value four
		menu3.set_stars(1);	//menu3 member call set_stars method having value one
		
		System.out.println(menu1.get_name()+"'s rating is "+menu1.get_stars());	//printout menu1 member's get_name method + 's rating + menu1's get_stars's method value
		System.out.println(menu2.get_name()+"'s rating is "+menu2.get_stars());	//printout menu2 member's get_name method + 's rating + menu2's get_stars's method value
		System.out.println(menu3.get_name()+"'s rating is "+menu3.get_stars());	//printout menu3 member's get_name method + 's rating + menu3's get_stars's method value
	}
}
