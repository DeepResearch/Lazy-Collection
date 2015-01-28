package com.lazy.primitive.iterator;

import java.util.NoSuchElementException;

import com.lazy.primitive.iterable.DoubleIterator;

public class DoubleEmptyIterator implements DoubleIterator{

	@Override
	public boolean hasNext() {		
		return false;
	}

	@Override
	public double next() {
		throw new NoSuchElementException();
	}

}
