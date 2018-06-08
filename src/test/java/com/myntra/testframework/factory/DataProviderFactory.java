package com.myntra.testframework.factory;

import java.io.IOException;

import com.myntra.testframework.dataprovider.DataProviderFromConfig;
import com.myntra.testframework.dataprovider.DataProviderFromExcal;

public class DataProviderFactory {

	public static DataProviderFromConfig getDataProviderFromConfig() throws IOException {
		
		DataProviderFromConfig config = new DataProviderFromConfig();
		
		return config;
	}

	public static DataProviderFromExcal getExcalFile() throws Exception {
		
		DataProviderFromExcal excalObj = new DataProviderFromExcal();
		
		return excalObj;
	}

}
