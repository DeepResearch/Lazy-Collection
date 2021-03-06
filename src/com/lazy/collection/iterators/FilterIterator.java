package com.lazy.collection.iterators;

import java.util.Iterator;

import com.lazy.collection.Predicate;



public final class FilterIterator<T> extends StatefulIterator<T> {
	
    private final Iterator<? extends T> iterator;
    private final Predicate<? super T> predicate;

    public FilterIterator(final Iterator<? extends T> iterator, final Predicate<? super T> predicate) {
        this.iterator = iterator;
        this.predicate = predicate;
    }

    @Override
    protected final T getNext() {
        while (iterator.hasNext()) {
            T item = iterator.next();
            if (predicate.matches(item)) {
                return item;
            }
        }
        return finished();
    }
}