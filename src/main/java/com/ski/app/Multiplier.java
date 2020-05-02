package com.ski.app;

import com.ski.model.Variable;

public class Multiplier {
	
	public double multiply(Variable var1 , Variable var2) {
		System.out.println("In the mupltiply method");
		return var1.getValue() * var2.getValue();
	}

}
