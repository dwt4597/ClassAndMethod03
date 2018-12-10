package com.biz.classes;

import java.util.*;

public class MyClass07 {
	String[] a;
	public void insert(String strnum) {
		a = strnum.split("");
		
	}

	public void show() {
		for (String i : a) {
			System.out.print(i+", ");
		}
		
		
	}
}
