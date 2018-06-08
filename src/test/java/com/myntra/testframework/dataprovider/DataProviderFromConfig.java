package com.myntra.testframework.dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class DataProviderFromConfig {

	static Properties pro;

	File f;
	FileInputStream istream;

	public DataProviderFromConfig() throws IOException {
		f = new File(
				"C:\\Users\\Yogesh\\git\\MyntraFrameWorkFinal\\Configuration\\confg.properties");

		istream = new FileInputStream(f);

		pro = new Properties();

		pro.load(istream);

	}

	public String getUrl() {
		return (pro.getProperty("url"));
	}

	public  String getChromePath() {
		return (pro.getProperty("chromepath"));
	}

	public  String getIEPath() {
		return (pro.getProperty("iepath"));
	}

	public  String getFirefoxpath() {
		return (pro.getProperty("firefoxpath"));
	}

	public  String getUsername() {
		return (pro.getProperty("username"));
	}

	public  String getPassword() {
		return (pro.getProperty("password"));
	}
}
