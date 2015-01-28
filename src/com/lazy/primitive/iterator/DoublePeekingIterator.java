package com.lazy.primitive.iterator;

import com.lazy.primitive.iterable.DoubleIterator;


public class DoublePeekingIterator extends DoubleStatefulIterator{
	
	private final DoubleIterator iterator;
	
	public DoublePeekingIterator(final DoubleIterator iterator) {
		this.iterator = iterator;
	}
	
	protected double getNext(){
		 if (iterator.hasNext()) {
	            return iterator.next();
	     }
	     return finished();
	}

}