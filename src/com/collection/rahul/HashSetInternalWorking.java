package com.collection.rahul;

import java.util.HashMap;
import java.util.Set;

public class HashSetInternalWorking<E> {
	
	// A HashMap object 
    private transient HashMap map;

    // A Dummy value(PRESENT) to associate with an Object in the Map
    private static final Object PRESENT = new Object();
    
    // default constructor of HashSet class
    // It creates a HashMap by calling 
    // default constructor of HashMap class
    public  HashSetInternalWorking() {
        map = new HashMap<>();
    }

    // add method 
    // it calls put() method on map object
    // and then compares it's return value with null
    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }
    // Other methods in Hash Set
    
    
    public static void main(String[] args) {
		Set<String>  set= new java.util.HashSet<String>();
		
	}

}
