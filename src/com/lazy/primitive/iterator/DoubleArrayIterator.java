package com.lazy.primitive.iterator;

import java.util.NoSuchElementException;

import com.lazy.primitive.iterable.DoubleIterator;

public class DoubleArrayIterator implements DoubleIterator{
	
	private final double[] array;
	private int index = 0;
	
	public DoubleArrayIterator(final double[] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {		
		return index < array.length;
	}

	@Override
	public double next() {
		 if(hasNext()){
	            return array[index++];
	     }
	     throw new NoSuchElementException();
	}

}
