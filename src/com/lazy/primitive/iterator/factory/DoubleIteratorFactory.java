package com.lazy.primitive.iterator.factory;

import java.util.NoSuchElementException;

import com.lazy.primitive.DoubleCallable1;
import com.lazy.primitive.impl.DoubleCallers;
import com.lazy.primitive.iterable.DoubleIterator;
import com.lazy.primitive.iterator.DoubleMapIterator;
import com.lazy.primitive.iterator.DoublePeekingIterator;

public class DoubleIteratorFactory {
	
	public static double head(final DoubleIterator iterator){
		if(iterator.hasNext()){
			return iterator.next();
		}
		throw new NoSuchElementException();
	}
	
	public static DoubleIterator tail(final DoubleIterator iterator){
		if(iterator.hasNext()){
			iterator.next();
			return new DoublePeekingIterator(iterator);
		}
		throw new NoSuchElementException();
	}
	
	public static long size(final DoubleIterator iterator){
		long count = 0;
		while(iterator.hasNext()){
			iterator.next();
			count++;			
		}
		return count;
	}
	
	public static void forEach(final DoubleIterator iterator, final DoubleCallable1 callable){
		while(iterator.hasNext()){
			DoubleCallers.call(callable, iterator.next());
		}
	}
	
	public static DoubleIterator map(final DoubleIterator iterator, final DoubleCallable1 callable){
		return new DoubleMapIterator(iterator, callable);
	}

}
