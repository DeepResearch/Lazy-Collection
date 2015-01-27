package com.lazy.collection.impl;

import com.lazy.collection.Callable1;

/**
 * 
 * @author kkishore
 *
 */
public final class Functions {
	
	 public static <A, B> B call(final Callable1<? super A, ? extends B> callable, final A a) {
	        try {
	            return callable.call(a);
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }

}
