package com.lazy.primitive.factory;


import com.lazy.primitive.DoubleCallable1;
import com.lazy.primitive.impl.LazyDoubleCollection;
import com.lazy.primitive.iterable.DoubleIterable;
import com.lazy.primitive.iterable.DoubleIterator;
import com.lazy.primitive.iterator.DoubleArrayIterator;
import com.lazy.primitive.iterator.DoubleEmptyIterator;
import com.lazy.primitive.iterator.factory.DoubleIteratorFactory;

public class DoubleLazyFactory {
	
	public static LazyDoubleCollection empty(){
		return new LazyDoubleCollection() {
				
			@Override
			public final DoubleIterator iterator() {				
				return new DoubleEmptyIterator();
			}
		};
	}
	
	public static LazyDoubleCollection lazyDoubleCollection(){
		return empty();
	}
	
	public static LazyDoubleCollection doubleSequence(final double... values){
		if(values == null || values.length == 0){
			return empty();
		}
		return new LazyDoubleCollection() {
			
			@Override
			public final DoubleIterator iterator() {				
				return new DoubleArrayIterator(values);
			}
		};
	}
	
	public static LazyDoubleCollection sequence(final DoubleIterable iterable){
		return sequence(iterable.iterator());
	}
	
	public static LazyDoubleCollection sequence(final DoubleIterator iterator){
		if (iterator == null) return empty();        

        return new LazyDoubleCollection() {
            public final DoubleIterator iterator() {
                return iterator;
            }
        };
	}	
	
	public static double first(final DoubleIterable iterable){
		return head(iterable);
	}
	
	public static double head(final DoubleIterable iterable){
		return DoubleIteratorFactory.head(iterable.iterator());
	}
	
	public static LazyDoubleCollection tail(final DoubleIterable iterable){
		return new LazyDoubleCollection() {
			
			@Override
			public DoubleIterator iterator() {
				return DoubleIteratorFactory.tail(iterable.iterator());
			}
		};
	}
	
	public static LazyDoubleCollection map(final DoubleIterable iterable, final DoubleCallable1 callable){
		return new LazyDoubleCollection() {
			
			@Override
			public DoubleIterator iterator() {			
				return DoubleIteratorFactory.map(iterable.iterator(), callable);
			}
		};
	}
	
	public static long size(final DoubleIterable iterable){
		return DoubleIteratorFactory.size(iterable.iterator());
	}

}
