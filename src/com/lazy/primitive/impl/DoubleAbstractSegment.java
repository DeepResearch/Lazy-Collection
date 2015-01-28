package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleSegment;
import com.lazy.primitive.iterable.DoubleIterable;
import com.lazy.primitive.iterable.DoubleIterator;

public abstract class DoubleAbstractSegment implements DoubleSegment, DoubleIterable{
	
	public DoubleSegment empty(){
		return DoubleSegment.doubleConstructors.emptySegment();
	}
	
	public DoubleSegment cons(final double head){
		return DoubleSegment.doubleConstructors.cons(head, this);
	}
	
	public DoubleIterator iterator(){
		return null;
	}

}
