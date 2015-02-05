package com.lazy.collection.primitive.test;

import com.lazy.collection.factory.LazyFactory;
import com.lazy.collection.impl.LazyCollection;
import com.lazy.primitive.TypeDoubleCallable;
import com.lazy.primitive.factory.DoubleLazyFactory;
import com.lazy.primitive.impl.LazyDoubleCollection;



public class LazyDoubleCollectionTest {

	public static void main(String[] args)  {
		LazyDoubleCollection doubleCollection = DoubleLazyFactory.doubleSequence(1,2,3,4,5,6,7,8,9,10);		
		System.out.println("Size : "+doubleCollection.size());
		final LazyCollection<String> collection = LazyFactory.sequence("1.0","2.0","3.0","4.0");
		doubleCollection = collection.mapToDouble(new TypeDoubleCallable() {
			
			@Override
			public <T> double toDouble(T value) {			
				return Double.parseDouble((String) value);
			}
		});		
	}

}
