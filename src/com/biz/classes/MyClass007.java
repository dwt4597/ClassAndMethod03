package com.biz.classes;

import java.util.*;

public class MyClass007 {
	List<String> intList;

	public MyClass007() {
		intList = new ArrayList();
	}

	public void insert(String strnum) {

		intList.add(strnum);
	}

	public void show() {
		// 리스트만큼 반복하면서
		String intMulti = "";
		for (String i1 : intList) {
			// 각 항목의 문자열을 분해하고
			String[] i2 = i1.split("");
			// 분해된 문자열 만큼 또 반복하면서
			for (String s22 : i2) {
				// 각 글자와 , 를 출력하고
				System.out.println(s22 + ", ");
			}
			// 다 출력되면 글자수를 출력
			System.out.println("-" + i2.length + "글자");
		}
	}
}
