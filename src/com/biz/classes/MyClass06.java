package com.biz.classes;

import java.util.*;

public class MyClass06 {
	List<String> intList;

	public MyClass06() {
		intList = new ArrayList();
	}

	public void push(int strnum) {
		
		intList.add(String.valueOf(strnum));
	}

	public String show() {
		String intMulti = "";
		for (String i : intList) {
			intMulti += i;
		}
		return intMulti;
	}
}
