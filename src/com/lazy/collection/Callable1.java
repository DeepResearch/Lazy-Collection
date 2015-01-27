package com.lazy.collection;

/**
 * 
 * @author kkishore
 *
 * @param <Input>
 * @param <Output>
 */
public interface Callable1<Input, Output> {
	
	Output call(Input input) throws Exception;

}
