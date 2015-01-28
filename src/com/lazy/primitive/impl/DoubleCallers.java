package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleCallable1;

public class DoubleCallers {
	
	public static double call(final DoubleCallable1 callable, final double value){
		return DoubleFunctions.call(callable, value);
	}

}
