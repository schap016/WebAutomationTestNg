package utils;

import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlInclude;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRunner{
		 
		 public static List<String> getClassNamesTestNames(String sheetName, String colName, String filePath) {
			 List<String> classNamesTestNames = new ArrayList<String>();
			
			 try {
				  XSSFWorkbook workbook = null;
				  XSSFRow firstRow = null;
				  XSSFRow row = null;
				 int  classNameIndex =0;
				 int  testNameIndex = 0;
				 
				  
				    workbook = new XSSFWorkbook(filePath);
				    //System.out.println(workbook.getNumberOfSheets());
				    
				    XSSFSheet sheet = workbook.getSheet("TestNames");
				    
				    int numberOfRows = sheet.getLastRowNum();
				  				    
				    //get first row of sheet "TestNames" - to read column names/header			   
				    firstRow = sheet.getRow(0);
				    
				    for(int i =0; i<firstRow.getLastCellNum();i++) {
				    	
				    	if(firstRow.getCell(i).getStringCellValue().equals(colName)) {
				    		classNameIndex = i;
				    		testNameIndex = i-1;			    		
				    	}	 
				    	
				    }
				 				   
				 for(int i=1;i<numberOfRows+1;i++) {			
					 
					 		row = sheet.getRow(i);			 
					 
					 		XSSFCell classcellValue = row.getCell(classNameIndex);
					 		XSSFCell testCellValue = row.getCell(testNameIndex);
						 
							 classNamesTestNames.add(classcellValue.toString());
							 classNamesTestNames.add(testCellValue.toString());				 
					
				 }	    
				  
				  
				workbook.close();
			 }catch(FileNotFoundException  e) {
				 System.out.println(e);
				 
			 }catch(IOException e) {
				 
				 System.out.println(e);
				 
			 }catch(Exception e) {
				 
				 System.out.println(e);
				 
				 
			 }
			  return classNamesTestNames;
			 
			
			} 
		 
		 
	
	
	public static void main(String args[]) {
		String filePath ="C:\\Users\\saman\\OneDrive\\Desktop\\SmokeObservations.xlsx";
		List<String> classNamesTestNames = new ArrayList<String>();
		classNamesTestNames = getClassNamesTestNames("TestNames","ClassName",filePath);
		//System.out.println(classNamesTestNames);
		
		//[tests.TestHomePage, test_Home_Page_Appear_Correct, tests.TestHomePage, test_Home_Page_Tabs_Presence]
		/*
		 * String className = "tests.TestHomePage"; List<String> testNames = new
		 * ArrayList<String>(); testNames.add("test_Featured_Tours");
		 * testNames.add("test_Home_Page_Appear_Correct");
		 */ //int classindex = 0;
		   
		   
			  
			  //Create Suite Object 
			  XmlSuite xmlSuite = new XmlSuite();
			  xmlSuite.setName("TestNgSeleniumSuite"); 
			  xmlSuite.setParallel("false");
			  
			  
		
		for (int i=0;i<classNamesTestNames.size();i+=2) {			
		
			
			  XmlTest xmlTest = new XmlTest(xmlSuite); 
			  xmlTest.setName(classNamesTestNames.get(i+1));
			  
			  //create class object and hook it to test object 
			  XmlClass xmlClass = new XmlClass(classNamesTestNames.get(i));
			  
			  
			  //create testMethod based on testNames and hook it to class object 
			  XmlInclude method = new XmlInclude(classNamesTestNames.get(i+1));
			  
			  List<XmlInclude> testMethods = new ArrayList<XmlInclude>();
			  testMethods.add(method); 
			  xmlClass.setIncludedMethods(testMethods);
			  
			  
			  List<XmlClass> xmlClasses = new ArrayList<XmlClass>();
			  xmlClasses.add(xmlClass); 
			  xmlTest.setXmlClasses(xmlClasses);		
			}	  
		  
		
		  List<XmlSuite> suites = new ArrayList<XmlSuite>(); 
		  suites.add(xmlSuite);
		  
		  TestNG testNg = new TestNG();
		  
		  testNg.setXmlSuites(suites); 
		  testNg.run();
		  
		 
		}

	 }

