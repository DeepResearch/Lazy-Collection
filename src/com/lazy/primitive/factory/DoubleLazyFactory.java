package com.lazy.primitive.factory;

import com.lazy.primitive.impl.LazyDoubleCollection;
import com.lazy.primitive.iterable.DoubleIterator;

public class DoubleLazyFactory {
	
	public static LazyDoubleCollection empty(){
		return new LazyDoubleCollection() {
				
			@Override
			public DoubleIterator iterator() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
