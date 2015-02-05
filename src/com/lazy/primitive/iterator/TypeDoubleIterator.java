package com.lazy.primitive.iterator;

import java.util.Iterator;

import com.lazy.primitive.TypeDoubleCallable;
import com.lazy.primitive.iterable.DoubleIterator;

import static com.lazy.primitive.impl.DoubleCallers.doubleCall;

public class TypeDoubleIterator<T> implements DoubleIterator{
	
	private Iterator<T> iterator;
	private TypeDoubleCallable callable;
	
	public TypeDoubleIterator(final Iterator<T> iterable, TypeDoubleCallable callable) {
		this.iterator = iterable;
		this.callable = callable;
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public double next() {
		return doubleCall(callable, iterator.next());
	}

}
