package com.coderscampus.arraylist;

public class ArrayTestApplication {

	public static void main(String[] args) {
		
		CustomList<Integer> myCustomList = new CustomArrayList<>();
		
		for (int i = 1; i <= 40; i++) {
			myCustomList.add(i);
		}

		System.out.println("This is myCustomList: " + myCustomList);
		System.out.println("There are " + myCustomList.getSize() + " elements in myCustomList");
		System.out.println("The element in this index is: " + myCustomList.get(20));
		System.out.println(myCustomList.get(45));
		
	}

}
