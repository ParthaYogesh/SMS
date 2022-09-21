package org.sdet40.genericUtilty;

import java.util.Random;

import Practice.DataType;

public class JavaUtility 
{
public int getRandomNumber(int limit)
{
	return new Random().nextInt(limit);
}

public Object ConvertToAnyDatatype(String DataType, DataType Statergy)
{
	Object obj=null;
	
	if(Statergy.toString().contentEquals("long"))
		obj=Long.parseLong(DataType);
	else if(Statergy.toString().equalsIgnoreCase("int"))
		obj=Integer.parseInt(DataType);
	else if(Statergy.toString().equalsIgnoreCase("double"))
		obj=Double.parseDouble(DataType);
	
	return obj;
}
}
