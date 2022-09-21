package org.sddet40.objectRepository;

public enum TabNames 
{
	CONTACTS("Contacts"), OPPORTUNITIES("Opportunities"),PRODUCTS("Products"), DOCUMENTS("Documents"),
	EMAIL("Email"), DASHBOARD("Dashboard"), SSIGNOUT("Sign Out");
	
	String TabName;
	
	private TabNames(String TabName)
	{
		this.TabName=TabName;
	}
	
	public String getName()
	{
		return TabName;
	}
}
