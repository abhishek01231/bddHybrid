package com.scientificgames.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

	@DataProvider
	public Object[][] validCredentialData() {
		Object[][] main = new Object[1][4];

		main[0][0] = "admin";
		main[0][1] = "pass";
		main[0][2] = "English (Indian)";
		main[0][3] = "OpenEMR";

//		main[1][0] = "physician";
//		main[1][1] = "physician";
//		main[1][2] = "English (Indian)";
//		main[1][3] = "OpenEMR";
//
//		main[2][0] = "accountant";
//		main[2][1] = "accountant";
//		main[2][2] = "English (Indian)";
//		main[2][3] = "OpenEMR";

		return main;
	}

//	@DataProvider
//	public Object[][] invalidCredentialData() throws IOException {
//		Object[][] main = ExcelUtils.getSheetIntoObjectArray("testdata/OpenEMRData.xlsx", "invalidCredentialTest");
//		return main;
//	}
//	
//	@DataProvider
//	public Object[][] addPatientData() throws IOException 
//	{
//		Object[][] main= ExcelUtils.getSheetIntoObjectArray("testdata/OpenEMRData.xlsx", "addPatientTest");
//		return main;
//	}
	
	@DataProvider
	public Object[][] dataProvider(Method method) throws IOException {
		
		System.out.println(method.getName());
		Object[][] main = ExcelUtils.getSheetIntoObjectArray("testdata/OpenEMRData.xlsx", method.getName());
		return main;
	}
}
