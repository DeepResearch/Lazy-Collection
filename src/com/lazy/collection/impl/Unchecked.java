package com.lazy.collection.impl;

/**
 * 
 * @author kkishore
 *
 */
public final class Unchecked {
	
	private Unchecked() {}

    @SuppressWarnings("unchecked")
    public static <T> T cast(final Object a) {
        return (T) a;
    }

}
