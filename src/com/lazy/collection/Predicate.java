package com.lazy.collection;

public interface Predicate<T> {
	
	public boolean matches(final T value);
}
