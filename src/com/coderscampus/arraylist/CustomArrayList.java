package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {

	private final int initialCapacity = 10;
	private Object[] originalArray;
	private int size;

	// creating our variables

	public CustomArrayList() {
		originalArray = new Object[initialCapacity];
		size = 0;
	}

	@Override
	public String toString() {
		String something = ""; // we're returning a string so we have to create a string
		for (int i = 0; i < size; i++) {
			something = something + originalArray[i] + ", "; // String = previous + current (but we need to truncate) "something =+"
		}
		something = something.substring(0, something.length() - 2); // removing the last two characters - comma and space
		return something;
	}

	@Override
	public boolean add(T item) {
		for (Object element : originalArray) { // loops every time our array hits capacity
			if (size == initialCapacity) { // if the size of the array equals the initial capacity
				Object[] newArray = new Object[originalArray.length * 2]; // create a newItems array that equals old
				System.arraycopy(originalArray, 0, newArray, 0, originalArray.length); // then copy the original array and paste to new array
				originalArray = newArray;
			}
		}
		originalArray[size] = item; // adding new items
		size++; // incrementing array size
		return true;

	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= size || index < 0) {
	        throw new IndexOutOfBoundsException("Index out of bounds: " + size);
	    }
		
		return (T) originalArray[index];
	}

}