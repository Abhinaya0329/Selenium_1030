package com.qsp.genericutility;

import java.time.LocalDateTime;

public class JavaUtilityClass {
	//java logics
	public String GetSystemTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}

}
