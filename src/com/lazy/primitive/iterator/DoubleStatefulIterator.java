package com.lazy.primitive.iterator;

import java.util.NoSuchElementException;

import com.lazy.collection.iterators.State;
import com.lazy.primitive.DoublePeekable;
import com.lazy.primitive.iterable.DoubleIterator;


public abstract class DoubleStatefulIterator implements DoubleIterator, DoublePeekable{
	
	private State state = State.Ready;
	private double current;
	
	protected abstract double getNext() throws Exception;
	
	protected double finished(){
		state = State.Finished;
		return 0;
	}
	
	public final boolean hasNext() {
        try {
            if (state.equals(State.Ready)) {
                current = getNext();
                if(state.equals(State.Finished)){
                    return false;
                }
                state = State.Loaded;
            }
            return !state.equals(State.Finished);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final double next() {
        if (hasNext()) {
            return pop();
        }
        throw new NoSuchElementException();
    }

    public final double peek() {
        if (hasNext()) {
            return current;
        }
        throw new NoSuchElementException();
    }

    private double pop() {
        state = State.Ready;
        return current;
    }

}
