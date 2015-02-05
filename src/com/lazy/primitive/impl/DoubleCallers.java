package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleCallable1;
import com.lazy.primitive.TypeDoubleCallable;

public class DoubleCallers {
	
	public static double call(final DoubleCallable1 callable, final double value){
		return DoubleFunctions.call(callable, value);
	}
	
	public static <T> double doubleCall(final TypeDoubleCallable callable, final T value){
		return DoubleFunctions.call(callable, value);
		
	}

}
