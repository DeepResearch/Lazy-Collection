package com.lazy.primitive.iterator;

import com.lazy.primitive.DoubleSegment;
import com.lazy.primitive.iterable.DoubleIterator;

public class DoubleSegmentIterator implements DoubleIterator{
	
	private DoubleSegment segment;
	
	private DoubleSegmentIterator(DoubleSegment segment){
		this.segment = segment;
	}
	
	public static DoubleSegmentIterator iterator(final DoubleSegment segment){
		return new DoubleSegmentIterator(segment);
	}

	@Override
	public boolean hasNext() {		
		return !segment.isEmpty();
	}

	@Override
	public double next() {
		final double head = segment.head();
        segment = segment.tail();
        return head;
	}
	
}
