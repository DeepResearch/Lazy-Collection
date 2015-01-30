package com.lazy.collection.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.lazy.collection.Callable1;
import com.lazy.collection.factory.LazyFactory;
import com.lazy.collection.impl.LazyCollection;
import com.lazy.collection.util.IOReader;

public class LazyCollectionTest {
	
	private static final String COMMA = ",";

	public static void main(String[] args) throws IOException {
		//This is a 456 MB File, which has 918090 rows and 154 columns
		//Time Taken : 16 Seconds
		//Tested in QuadCore Processor
		long start = System.currentTimeMillis();		
		final String fileName = "sample.csv";
		final BufferedReader reader = new BufferedReader(new FileReader(fileName));
		final LazyCollection<String> collection = LazyFactory.sequence(IOReader.lines(reader));
		final LazyCollection<double[]> matrix = collection.map(new Callable1<String, double[]>() {

			@Override
			public final double[] call(String input) throws Exception {
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
}
