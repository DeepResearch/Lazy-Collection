package com.lazy.collection.impl;

import java.util.Iterator;

import com.lazy.collection.Segment;
import com.lazy.collection.iterators.SegmentIterator;


/**
 * 
 * @author kkishore
 *
 * @param <T>
 */
public abstract class AbstractSegment<T> implements Segment<T>, Iterable<T> {
  
	@Override
    public Segment<T> empty() {
        return Segment.constructors.emptySegment();
    }

    @Override
    public Segment<T> cons(T head) {
        return Segment.constructors.segment(head, this);
    }

    @Override
    public Iterator<T> iterator() {
        return SegmentIterator.iterator(this);
    }
    
}