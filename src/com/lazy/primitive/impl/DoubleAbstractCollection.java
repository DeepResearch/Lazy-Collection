package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleCollection;
import com.lazy.primitive.iterable.DoubleIterator;

public abstract class DoubleAbstractCollection implements DoubleCollection{
	
	protected DoubleAbstractCollection() {
		
	}
	
	public abstract DoubleIterator iterator();
	
	public abstract long size();
	
	public boolean isEmpty(){
		return size() == 0;
	}
		

}
