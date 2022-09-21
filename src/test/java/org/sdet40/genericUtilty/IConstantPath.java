package org.sdet40.genericUtilty;

public interface IConstantPath 
{
String PROJECT_PATH=System.getProperty("user.dir");
String EXCEL_PATH=PROJECT_PATH+"/src/test/resources/TestData.xlsx";
String PROPERTY_FILE_PATH=PROJECT_PATH+"/src/test/resources/PY.Properties";
String PHOTO_PATH=PROJECT_PATH+"";

String DB_URL="http://localhost:8888/";
}
