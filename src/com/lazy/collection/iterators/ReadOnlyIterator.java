package com.lazy.collection.iterators;

import java.util.Iterator;

/**
 * 
 * @author kkishore
 *
 * @param <T>
 */
public abstract class ReadOnlyIterator<T> implements Iterator<T> {
	
	 public final void remove() {
	        throw new UnsupportedOperationException();
	    }

}
