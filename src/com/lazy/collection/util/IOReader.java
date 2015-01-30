package com.lazy.collection.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

import com.lazy.primitive.iterable.DoubleIterator;

public class IOReader {
	
	public static Iterator<String> lines(final BufferedReader reader){
		return new Iterator<String>() {
			String lines = "";
			
			@Override
			public boolean hasNext() {
				try {
					lines = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return lines != null;
			}

			@Override
			public String next() {
				return lines;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
	
	public static DoubleIterator doubleLines(final BufferedReader reader){
		return new DoubleIterator() {
			String lines = "";
			@Override
			public double next() {
				return Double.parseDouble(lines);
			}
			
			@Override
			public boolean hasNext() {
				try {
					lines = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return lines != null;
			}
		};
	}

}
