package com.lazy.collection.iterators.factory;

import java.util.Iterator;
import java.util.NoSuchElementException;

import com.lazy.collection.Callable1;
import com.lazy.collection.impl.Callers;
import com.lazy.collection.iterators.MapIterator;
import com.lazy.collection.iterators.PeekingIterator;

/**
 * 
 * @author kkishore
 *
 */
public class IteratorFactory {
	
	public static <T, S> Iterator<S> map(final Iterator<? extends T> iterator, final Callable1<? super T, ? extends S> callable) {
        return new MapIterator<T, S>(iterator, callable);
    }
	
	public static <T> T head(final Iterator<? extends T> iterator) {
        if (iterator.hasNext()) {
            return iterator.next();
        }
        throw new NoSuchElementException();
    }
	
	public static <T> Iterator<T> tail(final Iterator<? extends T> iterator) {
        if (iterator.hasNext()) {
            iterator.next();
            return new PeekingIterator<T>(iterator);
        }
        throw new NoSuchElementException();
    }
	
	public static <T> void forEach(final Iterator<? extends T> iterator, final Callable1<? super T, ?> runnable) {
        while (iterator.hasNext()) {
            Callers.call(runnable, iterator.next());
        }
    }
	
	 public static <T> int size(final Iterator<? extends T> iterator) {
	        int count = 0;
	        while (iterator.hasNext()) {
	            iterator.next();
	            count++;
	        }
	        return count;
	 }

}
