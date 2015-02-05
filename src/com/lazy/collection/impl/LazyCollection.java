package com.lazy.collection.impl;

import java.util.AbstractCollection;

import com.lazy.collection.Callable1;
import com.lazy.collection.First;
import com.lazy.collection.Segment;
import com.lazy.collection.factory.LazyFactory;
import com.lazy.primitive.TypeDoubleCallable;
import com.lazy.primitive.impl.LazyDoubleCollection;

/**
 * 
 * @author kkishore
 *
 * @param <T>
 */
public abstract class LazyCollection<T> extends AbstractCollection<T> implements Iterable<T>, First<T>, Segment<T>{
	

	public T first(){
		return LazyFactory.first(this);
	}
	
	public T head(){
		return LazyFactory.head(this);
	}
	
	public LazyCollection<T> tail(){
		return LazyFactory.tail(this);
	}
	
	public LazyCollection<T> empty(){
		return LazyFactory.empty();
	}
	
	public LazyCollection<T> cons(final T value){
		//TODO
		return null;
	}
	
	@Override
	public int size() {
		return LazyFactory.size(this);
	}
	
	public void forEach(final Callable1<? super T, ?> runnable) {
		LazyFactory.forEach(this, runnable);
	}
	
	public <S> LazyCollection<S> map(final Callable1<? super T, ? extends S> callable){
		return LazyFactory.map(this, callable);
	}
	
	public LazyDoubleCollection mapToDouble(final TypeDoubleCallable callable){
		return LazyFactory.mapToDouble(this, callable);
	}

}
