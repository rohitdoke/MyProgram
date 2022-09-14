package com.justimagine.Collection.ArrayList;

import java.util.Comparator;

public class MyComprator implements Comparator<ComapratorSort> {

	@Override
	public int compare(ComapratorSort o1, ComapratorSort o2) {
		
		//return (o1.getName()).compareTo(o2.getName());
		//return 1;
		
		//return -1;
		return -(o1.getName()).compareTo(o2.getName());
		
	}

}
