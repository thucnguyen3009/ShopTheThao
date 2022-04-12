package com.test.helper;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws Exception {

		ExcelHelper excel = new ExcelHelper();
		excel.setExcelFile("data/TestData.xlsx", "Login");

		List<String> list = new ArrayList();
		List<String> list2 = new ArrayList();
		List<String> list3 = new ArrayList();

		for (int i = 0; i < 4; i++) {
			String username = excel.getCellData("username", i);
			String pass = excel.getCellData("password", i);
			String result = excel.getCellData("result", i);

			list.add(username);
			list2.add(pass);
			list3.add(result);

//			if(list != null) {
//				System.out.println(list.get(i)+","+list2.get(i)+","+list3.get(i));
//			}
		}
		for (int i = 1; i < 4; i++) {
			System.out.println(list.get(i) + "," + list2.get(i) + "," + list3.get(i));
		}
	}

}
