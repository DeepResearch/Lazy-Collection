package com.lazy.collection.factory;

import java.util.Iterator;

import com.lazy.collection.Callable1;
import com.lazy.collection.impl.LazyCollection;
import com.lazy.collection.iterators.ArrayIterator;
import com.lazy.collection.iterators.EmptyIterator;
import com.lazy.collection.iterators.MapIterator;
import com.lazy.collection.iterators.factory.IteratorFactory;


import static com.lazy.collection.impl.Unchecked.cast;

/**
 * 
 * @author kkishore
 *
 */
public class LazyFactory {
	
	public static <T> LazyCollection<T> empty(){
		return new LazyCollection<T>() {			
			@Override
			public final Iterator<T> iterator() {				
				return new EmptyIterator<>();
			}						
		};
	}
	
	public static <T> LazyCollection<T> lazyCollection(){
		return empty();
	}
	
	@SuppressWarnings("unused")
	@SafeVarargs
	private static <T> LazyCollection<T> internal(final T... items){
		return sequence(items);
	}
	
	@SafeVarargs
	public static <T> LazyCollection<T> sequence(final T... items){
		 if (items == null || items.length == 0) {
	            return empty();
	     }
		 return new LazyCollection<T>() {
			@Override
			public final Iterator<T> iterator() {				
				return new ArrayIterator<>(items);
			}
			 
		};
	}
	
	public static <T> LazyCollection<T> sequence(final Iterable<T> iterable){
		if (iterable == null) return empty();

        if (iterable instanceof LazyCollection) return cast(iterable);

        return new LazyCollection<T>() {
            public final Iterator<T> iterator() {
                return cast(iterable.iterator());
            }
        };
	}
	
	
	public static <T> LazyCollection<T> sequence(final Iterator<T> iterable){
		if (iterable == null) return empty();

        if (iterable instanceof LazyCollection) return cast(iterable);

        return new LazyCollection<T>() {
            public final Iterator<T> iterator() {
                return cast(iterable);
            }
        };
	}
	
	 public static <T> T first(final Iterable<? extends T> iterable) {
	        return head(iterable);
	 }
	 
	 public static <T> T head(final Iterable<? extends T> iterable) {
	        return IteratorFactory.head(iterable.iterator());
	 }
	 
	 public static <T> LazyCollection<T> tail(final Iterable<? extends T> iterable){
		 	return new LazyCollection<T>() {
		 		
				@Override
				public final Iterator<T> iterator() {				
					return IteratorFactory.tail(iterable.iterator());
				}
		 		
			};
	 }
	 
	 public static <T> LazyCollection<T> cons(final T t, final Iterable<? extends T> iterable){
		 //TODO
		 return null;
	 }
	
	 public static <T, S> LazyCollection<S> map(final Iterable<? extends T> iterable, final Callable1<? super T, ? extends S> callable){		 
		 return new LazyCollection<S>() {

			@Override
			public final Iterator<S> iterator() {				
				return new MapIterator<>(iterable.iterator(), callable);
			}
			 
		};		
	 }
	 
	 public static <T> int size(final Iterable<? extends T> iterable){
		 return IteratorFactory.size(iterable.iterator());
	 }
	
	 public static <T> void forEach(final Iterable<? extends T> iterable, final Callable1<? super T, ?> runnable) {
	        IteratorFactory.forEach(iterable.iterator(), runnable);
	 }

}
