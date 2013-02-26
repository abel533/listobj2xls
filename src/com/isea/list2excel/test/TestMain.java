package com.isea.list2excel.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.isea.list2excel.ExpListObjExcelVS;

public class TestMain {

	public static void main(String[] args) throws Exception{
		List<Object> list = new ArrayList<Object>();
		
		TestObj testObj = new TestObj();
		testObj.setAge(26);
		testObj.setBirthday(new Date());
		testObj.setCountry("CHINA");
		testObj.setMoney(1000.0);
		testObj.setName("User1");
		testObj.setStr1("1");
		testObj.setStr2("2");
		testObj.setStr3("3");
		testObj.setStr4("4");
		testObj.setStr5("5");
		testObj.setStr6("6");
		list.add(testObj);
		testObj = new TestObj();
		testObj.setAge(26);
		testObj.setBirthday(new Date());
		testObj.setCountry("US");
		testObj.setMoney(1000.0);
		testObj.setName("User2");
		testObj.setStr1("1");
		testObj.setStr2("2");
		testObj.setStr3("3");
		testObj.setStr4("4");
		testObj.setStr5("5");
		testObj.setStr6("6");
		list.add(testObj);
		testObj = new TestObj();
		testObj.setAge(26);
		testObj.setBirthday(new Date());
		testObj.setCountry("JP");
		testObj.setMoney(1000.0);
		testObj.setName("User3");
		testObj.setStr1("1");
		testObj.setStr2("2");
		testObj.setStr3("3");
		testObj.setStr4("4");
		testObj.setStr5("5");
		testObj.setStr6("6");
		list.add(testObj);
		testObj = new TestObj();
		testObj.setAge(26);
		testObj.setBirthday(new Date());
		testObj.setCountry("J8");
		testObj.setMoney(1000.0);
		testObj.setName("User5");
		testObj.setStr1("1");
		testObj.setStr2("2");
		testObj.setStr3("3");
		testObj.setStr4("4");
		testObj.setStr5("5");
		testObj.setStr6("6");
		list.add(testObj);
		
		String xmlPath = "E:/Workspaces/hbxnb/List2Excel/src/TestObj.xml";
		String filePath = "E:/";
		
		String fileName = "text";
		
		ExpListObjExcelVS.expListObjFile(list, xmlPath, filePath, fileName);
	}

}
