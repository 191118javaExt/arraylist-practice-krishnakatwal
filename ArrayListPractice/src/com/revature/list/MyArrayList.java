package com.revature.list;

public class MyArrayList {
	private int[] arr = new int[10];
	private int count = 0;

	public void expand() {
		int[] newArray = new int[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			newArray[i] = arr[i];
		}
		arr = newArray;
	}

	public void add(int val) {
		if (count == arr.length - 1) {
			expand();
		}
			arr[count] = val;
			count++;
		
	}

	public void set(int index, int val) {
		arr[index] = val;

	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		int[] rmv = new int[count - 1];
		for (int j = 0; j < index; j++) {
			rmv[j] = arr[j];

		}
		for (int j = index; j < count - 1; j++) {
			rmv[j] = arr[j + 1];
		}
		count--;
		arr = rmv;

	}

	public int get(int index) {
		// TODO Auto-generated method stub
		return arr[index];
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder arrayString = new StringBuilder("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				arrayString.append(arr[i]);

			} else {
				arrayString.append(arr[i] + ",");

			}
		}
		arrayString.append("]");
		String newString = new String(arrayString);
		return newString;
	}
}
