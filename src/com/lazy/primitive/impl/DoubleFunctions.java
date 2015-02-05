package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleCallable1;
import com.lazy.primitive.TypeDoubleCallable;

public class DoubleFunctions {
	
	public static double call(final DoubleCallable1 callable, final double value){
		try {
            return callable.call(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}
	
	public static <T> double call(final TypeDoubleCallable callable, final T value){
		try {
            return callable.toDouble(value);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}

}
