package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
	
	public void Checkout(String string)  {
	   System.out.println("checkout method from shopping cart "+ string);
	}

	public int quantity()
	{
		System.out.println();
		return 2;
	}
}
