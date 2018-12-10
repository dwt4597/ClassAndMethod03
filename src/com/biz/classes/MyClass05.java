package com.biz.classes;

import java.util.*;

public class MyClass05 {
	List<String> intList;

	public MyClass05() {
		intList = new ArrayList();
	}

	public void push(String strnum) {
		
		intList.add(strnum);
	}

	public String show() {
		String intMulti = "";
		for (String i : intList) {
			intMulti += i;
		}
		return intMulti;
	}
}
