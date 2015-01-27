package com.lazy.collection.impl;

import com.lazy.collection.Callable1;

/**
 * 
 * @author kkishore
 *
 */
public final class Callers {
	
	public static <A, B> B call(final Callable1<? super A, ? extends B> callable, final A a) {
        return Functions.call(callable, a);
    }

}
