package edu.hadong.csee.java.lab07.prob2;
/**
 * This class define chicken menu rating</br>
 * This class has public string, double, integer and void method.</br>
 * public class declare each member to use it</br>
 * public method declare each memeber's value</br>
 * Each public void method call each member</br>
 * @author MG
 *
 */

public class FriedChickenMenu {

	private String name;
	private double price;
	private int stars;

	public FriedChickenMenu()
	{
		this.name="";
		this.price=0.0;
		this.stars=0;
	}
	public String get_name() 
	{
		return this.name;
	}

	public double get_price()
	{
		return this.price;
	}
	public int get_stars()
	{
		return this.stars;
	}

	public void set_name(String name)
	{
		this.name=name;
	}
	public void set_pricce(double price)
	{
		this.price=price;
	}
	public void set_stars(int stars) 
	{
		this.stars=stars;
	}
}



