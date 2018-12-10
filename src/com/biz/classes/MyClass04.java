package com.biz.classes;

import java.util.*;

public class MyClass04 {
	List<Integer> intList;

	public MyClass04() {
		intList = new ArrayList();
	}

	public void push(String num) {
		
		intList.add(Integer.valueOf(num));
	}

	public int show() {
		int intMulti = 1;
		for (int i : intList) {
			intMulti *= i;
		}
		return intMulti;
	}
}
