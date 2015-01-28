package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleCallable1;

public class DoubleFunctions {
	
	public static double call(final DoubleCallable1 callable, final double value){
		try {
            return callable.call(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}

}
