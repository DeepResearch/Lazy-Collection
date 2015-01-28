package com.lazy.primitive;

import com.lazy.primitive.iterable.DoubleIterable;
import com.lazy.primitive.iterable.DoubleIterator;

public interface DoubleCollection extends DoubleIterable{
	
	public DoubleIterator iterator();
	
	public long size();
	
	boolean isEmpty();

}
