/*** @author fpersil***/
package com.fpersil.Subscription;

public class Subscription {
	 
	private int price;	//Subscription price
	private int length;  //Subscription length
	
	/* Construtor to create a subscription */
	
	public Subscription (int p, int t) {
		
		price = p;
		length = t;
		
	}
	
	/** Calculate monthly subscription rounding up to nearest cent **/
	
	public double monthlyPrice() {
		if (length <= 0 || price <= 0) return 0;
		double result = (double) price/(double) length;
		double fraction = Math.IEEEremainder(result, 1.0);
		if (fraction > 0) return Math.floor(result) + 1;
		else return Math.floor(result);
	}
	
	/** Subscription cancel **/
	
	public void cancel () {length = 0; }
	
}