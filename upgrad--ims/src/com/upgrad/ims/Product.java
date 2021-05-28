package com.upgrad.ims;

public class Product {
	int id;
	String name;
	String category;
	float salesPrice;
	float cost;
	int quantity;
	boolean active;


	 float getProfitOrLoss(float salesPrice, float cost){
		float value = salesPrice-cost;
		return value;
	}
	public static void activate()
	{
		active=true;
	}
	void deactivate(){
	 	active=false;
	}
//	boolean isBelowThreshold()
	//{

	//}


}

