package edu.hadong.csee.java.lab07.prob2;


public class FriedChickenMenu_Main {

	public static void main(String[] args) {
		FriedChickenMenu menu1=new FriedChickenMenu("Cheese_mustard",16000.00,5);
		FriedChickenMenu menu2=new FriedChickenMenu("Honey_musatard",16000.00,5);
		FriedChickenMenu menu3=new FriedChickenMenu("Spicey_chicken",16000.00,5);

		menu1.set_stars(3);
		menu2.set_stars(4);
		menu3.set_stars(1);

		System.out.println(menu1.get_name()+"'s rating is "+menu1.get_stars());
		System.out.println(menu2.get_name()+"'s rating is "+menu2.get_stars());
		System.out.println(menu3.get_name()+"'s rating is "+menu3.get_stars());
	}
}
