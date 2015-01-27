package com.lazy.collection.iterators;

import java.util.Iterator;

import com.lazy.collection.Callable1;

import static com.lazy.collection.impl.Callers.call;

/**
 * 
 * @author kkishore
 *
 * @param <T>
 * @param <S>
 */
public final class MapIterator<T, S> extends ReadOnlyIterator<S> {
	
    private final Iterator<? extends T> iterator;
    private final Callable1<? super T, ? extends S> callable;

    public MapIterator(final Iterator<? extends T> iterator, final Callable1<? super T, ? extends S> callable) {
        this.iterator = iterator;
        this.callable = callable;
    }

    public final boolean hasNext() {
        return iterator.hasNext();
    }

    public final S next() {
        return call(callable, iterator.next());
    }
}
