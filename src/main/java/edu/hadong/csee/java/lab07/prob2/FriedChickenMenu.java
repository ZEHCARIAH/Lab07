package edu.hadong.csee.java.lab07.prob2;
/**
 * This class define chicken menu rating</br>
 * This class has public string, double, integer and void method.</br>
 * public class declare each member to use it</br>
 * public method declare each memeber's value</br>
 * another public method include string,double,int members</br>
 * Each public void method call each member</br>
 * @author MG
 *
 */

public class FriedChickenMenu {	//declare public class FriedChickenMenu

	private String name;	//declare private String named by name
	private double price;	//declare private double named by price
	private int stars;		//declare private integer named by starts

	public FriedChickenMenu()	//declare public method
	{
		this.name="";	//by using this, name's value can has ""
		this.price=0.0;	//by using this, price's value can has 0.0
		this.stars=0;	//by using this, stars's value can has 0
	}
	public FriedChickenMenu(String name, double price, int stars) {	//declare public method including 
		this.name=name;		//this.name equal name
		this.price=price;	//this.price equal price;
		this.stars=stars;	//this.stars equal stars
	}
	
	public String get_name() 	//declare public String method
	{
		return this.name;	//return this.name;
	}

	public double get_price()	//declare double method
	{
		return this.price;	//return this.price
	}
	public int get_stars()	//declare int method
	{
		return this.stars;	//return this.stars
	}

	public void set_name(String name)	//declare public void method and call String name
	{
		this.name=name;	//this.name equal name value
	}
	public void set_pricce(double price)	//declare public void method and call double price
	{
		this.price=price;	//this.price equal price value
	}
	public void set_stars(int stars)	//declare public void method and call int stars
	{
		this.stars=stars;	//this.stars equal stars
	}
}



