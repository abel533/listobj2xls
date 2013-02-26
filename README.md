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
TestObj.xml如下：

<?xml version="1.0" encoding="UTF-8"?>
<excel>
  <!-- 
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
	 -->
	<title>人员信息导出</title>
	<description>这里是描述信息</description>
	<author>isea533</author>
	<sheet>人员信息</sheet>
	<columns>
		<column>
			<name>name</name>
			<header>姓名</header>
			<width>200</width>
		</column>
		<column>
			<name>country</name>
			<header>国籍</header>
			<width>50</width>
		</column>
		<column>
			<name>birthday</name>
			<header>生日</header>
			<width>160</width>
		</column>
		<column>
			<name>age</name>
			<header>年龄</header>
		</column>
		<column>
			<name>str4</name>
			<header>字符串4</header>
		</column>
		<column>
			<name>str2</name>
			<header>字符串2</header>
		</column>
		<column>
			<name>str3</name>
			<header>字符串3</header>
		</column>
		<column>
			<name>str1</name>
			<header>字符串1</header>
		</column>
		<column>
			<name>str5</name>
			<header>字符串5</header>
		</column>
	</columns>
</excel>
