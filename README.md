# Lazy-Collection
Non-strict (lazy) Collections for Java where one can essentially form a sequence of functions and the evaluation is only performed on request. It uses Java 7 as default jdk version.

A functional library for Java that has the following features. This library is heavily inspired from scala language.

 * Tries to be as lazy as possible.
 * Works with Iterable, Iterator, Arrays, etc.
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
