package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleSegment;
import com.lazy.primitive.FirstDouble;
import com.lazy.primitive.iterable.DoubleIterable;

public abstract class LazyDoubleCollection extends DoubleAbstractCollection implements DoubleIterable, FirstDouble, DoubleSegment{
	
	public double first(){
		return 0;
	}
	
	public double head(){
		return 0.0;
	}
	
	public LazyDoubleCollection tail(){
		return null;
	}
	
	public LazyDoubleCollection empty(){
		return null;
	}
	
	public LazyDoubleCollection cons(final double value){
		return null;
	}
	
	public long size(){
		return 0;
	}
	
	
}
