package com.lazy.collection.primitive.test;

import com.lazy.primitive.factory.DoubleLazyFactory;
import com.lazy.primitive.impl.LazyDoubleCollection;



public class LazyDoubleCollectionTest {

	public static void main(String[] args)  {
		final LazyDoubleCollection doubleCollection = DoubleLazyFactory.doubleSequence(1,2,3,4,5,6,7,8,9,10);		
		System.out.println("Size : "+doubleCollection.size());
	}

}
