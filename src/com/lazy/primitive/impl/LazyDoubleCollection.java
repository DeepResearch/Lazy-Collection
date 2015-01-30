package com.lazy.primitive.impl;

import com.lazy.primitive.DoubleCallable1;
import com.lazy.primitive.DoubleSegment;
import com.lazy.primitive.FirstDouble;
import com.lazy.primitive.factory.DoubleLazyFactory;
import com.lazy.primitive.iterable.DoubleIterable;

public abstract class LazyDoubleCollection extends DoubleAbstractCollection implements DoubleIterable, FirstDouble, DoubleSegment{
	
	public double first(){
		return DoubleLazyFactory.first(this);
	}
	
	public double head(){
		return DoubleLazyFactory.head(this);
	}
	
	public LazyDoubleCollection tail(){
		return DoubleLazyFactory.tail(this);
	}
	
	public LazyDoubleCollection empty(){
		return DoubleLazyFactory.empty();
	}
	
	public LazyDoubleCollection cons(final double value){
		return null;
	}
	
	public long size(){
		return DoubleLazyFactory.size(this);
	}
	
	public LazyDoubleCollection map(final DoubleCallable1 callable){
		return DoubleLazyFactory.map(this, callable);
	}
	
	
}
