listobj2xls
===========

List&lt;Object> save to excel file;

将List<object>对象导出为excel文件。

目前导出格式为xls

调用方法：

String xmlPath = "E:/TestObj.xml";  
String filePath = "E:/";  
String fileName = "text";  
ExpListObjExcelVS.expListObjFile(list, xmlPath, filePath, fileName);

需要对导出的Object进行xml文件配置

XML配置文件参考：TestObj.xml

配置文件规则
必填项为:name,header，其他全部选填
	
title:excel表格中第一行合并单元格居中显示的内容
description：第二行显示的说明
author：xml作者，不会输出
sheet:导出excel的sheet名
columns:导出列的信息
	column:一个列
		name:列对应Object中的字段名，必须有标准的get方法
		header:导出excel中显示的标题
		width:列宽(单位像素)
