package com.java8.api;

import java.util.ArrayList;
import java.util.Collection;

public class ParallelStreamSequentialStream {
	
	public void sequentialStreamPerformance(Collection <Minion> minions) {
	    long t1 = System.currentTimeMillis();
	    long count;

	    count = minions.stream()
	                   .filter(x-> (x.getNumberOfEyes() == 1))
	                   .filter(x-> x.getFavouriteFruit().equals("Banana"))
	                   .filter(x-> x.getName().startsWith("B"))
	                   .count();

	    long t2 = System.currentTimeMillis();
	    System.out.println("Count = " + count + " Normal Stream takes " + (t2-t1) + " ms");
	}
	
	void parallelStreamPerformance(Collection <Minion> minions) {
	    long t1 = System.currentTimeMillis();
	    long count;

	    count = minions.parallelStream()
	                   .filter(x-> (x.getNumberOfEyes() == 1))
	                   .filter(x-> x.getFavouriteFruit().equals("Banana"))
	                   .filter(x-> x.getName().startsWith("B"))
	                   .count();

	    long t2 = System.currentTimeMillis();
	    
	    System.out.println("Count = " + count + " Parallel Stream takes " + (t2-t1) + " ms");
	}
	
	public static void main(String[] args) {
		Collection<Minion> minions= new ArrayList<>();
		minions.add(new Minion("Banana", 1, "Bikash"));
		minions.add(new Minion("Banana", 1,"vivek"));
		minions.add(new Minion("Banana", 1,"Bimal"));
		
		ParallelStreamSequentialStream testParallelStream=new ParallelStreamSequentialStream();
		testParallelStream.sequentialStreamPerformance(minions);
		
		testParallelStream.parallelStreamPerformance(minions);
		
	}

}
