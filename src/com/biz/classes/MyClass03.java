package com.biz.classes;

import java.util.*;

public class MyClass03 {
	List<Integer> intList;

	public MyClass03() {
		intList = new ArrayList();
	}

	public void push(int num) {

		intList.add(num);
	}

	public int show() {
		int intMulti = 1;
		for (int i : intList) {
			intMulti *= i;
		}
		return intMulti;
	}
	
}
