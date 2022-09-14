package com.justimagine.Collection.Hashset;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LanguageConfiguration {

	
	
	private Integer LangID;
	private String LangCode;
	private String LangName;
	private String LangCountry;
	
	
	
	public LanguageConfiguration(Integer langID, String langCode, String langName, String langCountry) {
		super();
		LangID = langID;
		LangCode = langCode;
		LangName = langName;
		LangCountry = langCountry;
	}
	
	
	@Override
	public String toString() {
		return "LanguageConfiguration [LangID=" + LangID + ", LangCode=" + LangCode + ", LangName=" + LangName
				+ ", LangCountry=" + LangCountry + "]";
	}


	public Integer getLangID() {
		return LangID;
	}
	public void setLangID(Integer langID) {
		LangID = langID;
	}
	public String getLangCode() {
		return LangCode;
	}
	public void setLangCode(String langCode) {
		LangCode = langCode;
	}
	public String getLangName() {
		return LangName;
	}
	public void setLangName(String langName) {
		LangName = langName;
	}
	public String getLangCountry() {
		return LangCountry;
	}
	public void setLangCountry(String langCountry) {
		LangCountry = langCountry;
	}
	public static void main(String[] args) {
		
		
		Set<LanguageConfiguration> set= new HashSet<LanguageConfiguration>();
		
		
		set.add(new LanguageConfiguration(662,"nl","Dutch","Netherlands"));
		set.add(new LanguageConfiguration(222,"en","English","Great Britain"));
		set.add(new LanguageConfiguration(333,"hi","Hindi","India"));
		set.add(new LanguageConfiguration(344,"id","indonesian","Indonesia"));
		set.add(new LanguageConfiguration(855,"ks","kashmiri","India"));
		set.add(new LanguageConfiguration(666,"ne","Nepali","Nepal"));
		set.add(new LanguageConfiguration(777,"ru","Russian","Russia"));
		set.add(new LanguageConfiguration(188,"uk","Ukarinian","Ukarian"));
		set.add(new LanguageConfiguration(939,"ug","Uygur","china"));
		set.add(new LanguageConfiguration(104,"aa","afar","Eritria"));
		
		
		
		System.out.println(set);
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		
		for(LanguageConfiguration l1:set)
		{
			
			map.put(l1.getLangID(), l1.LangCode);
		}
		
		
	System.out.println(map);
	
	Map<String,String> map2=new HashMap<String, String>();
	
	
	for(LanguageConfiguration l1:set)
	{
		
		map2.put(l1.getLangCode(), l1.getLangName());
	}
	
	
	System.out.println(map2);

	}
	
	
}	
	
	
	

