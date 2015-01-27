package com.lazy.collection.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.lazy.collection.Callable1;
import com.lazy.collection.factory.LazyFactory;
import com.lazy.collection.impl.LazyCollection;

public class LazyCollectionTest {
	
	private static final String COMMA = ",";

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		final String fileName = "D:\\Program Files\\Java 8\\Workspace\\Jml-lib\\Sample1.csv";
		final BufferedReader reader = new BufferedReader(new FileReader(fileName));
		LazyCollection<String> collection = LazyFactory.sequence(lines(reader));
		LazyCollection<double[]> matrix = collection.map(new Callable1<String, double[]>() {

			@Override
			public double[] call(String input) throws Exception {
				final String[] features = input.split(COMMA);
				final int size = features.length;
				final double[] res = new double[size];
				for(int i = 0; i < size; i++){
					res[i] = Double.parseDouble(features[i]);
				}
				return res;
			}
		});
		System.out.println(matrix.size());
		long end = System.currentTimeMillis();
		System.out.println("Time Taken : "+(end - start));
		reader.close();
	}
	
	private static Iterable<String> lines(final BufferedReader reader){
		return new Iterable<String>() {
			
			@Override
			public Iterator<String> iterator() {				
				return new Iterator<String>() {
					String nextLine = null;
					@Override
					public void remove() {
						// TODO Auto-generated method stub
						throw new UnsupportedOperationException();
					}
					
					@Override
					public String next() {						
						return nextLine;
					}
					
					@Override
					public boolean hasNext() {
						try {
							nextLine = reader.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						return nextLine != null;
					}
				};
			}
		};
	}
	
	

}
