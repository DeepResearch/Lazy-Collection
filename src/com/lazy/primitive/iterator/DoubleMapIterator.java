package com.lazy.primitive.iterator;

import com.lazy.primitive.DoubleCallable1;
import com.lazy.primitive.iterable.DoubleIterator;
import static com.lazy.primitive.impl.DoubleCallers.call;

public class DoubleMapIterator implements DoubleIterator{
	
	private final DoubleIterator iterator;
	private final DoubleCallable1 callable;
	
	public DoubleMapIterator(final DoubleIterator iterator, final DoubleCallable1 callable) {
		this.iterator = iterator;
		this.callable = callable;
	}

	@Override
	public boolean hasNext() {		
		return iterator.hasNext();
	}

	@Override
	public double next() {		
		return call(callable, iterator.next());
	}

}
