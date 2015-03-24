# Lazy-Collection
Non-strict (lazy) Collections for Java where one can essentially form a sequence of functions and the evaluation is only performed on demand. It uses Java 7 as default JDK version.

This Project is targeting JDK 7, So there won't be lambda and java 8 stream support. If you are looking for lamda support and also with resuable java 8 Stream, Check out [Reusable-Java8-Streams](https://github.com/kishorenayar/Reusable-Java8-Streams).

A functional library for Java that has the following features. This library is heavily inspired from scala language.

 * Tries to be as lazy as possible.
 * Works with Iterable, Iterator, Arrays, etc.
 * Primitive lazy collections
 * Many more comming soon
 
## Quick Start

```java
import com.lazy.collection.factory.LazyFactory;
import com.lazy.collection.impl.LazyCollection;
LazyCollection<Double> collection = LazyFactory.sequence(1,2,3,4,5,6,7,8,9,10);
LazyCollection<Double> modifiedCollection = collection.map(new Callable1<Double, Double>() {

			@Override
			public Double call(Double input) throws Exception {				
				return input + 1.0;
			}
});
System.out.println("Count : "+modifiedCollection.size());
```
