package com.mypages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyfileTest {

	public static void main(String[] args) throws IOException {
		Properties obj = new Properties();
		
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\config\\config.properties");
		obj.load(objfile);
		String Browser = obj.getProperty("browser");
		String headless = obj.getProperty("headless");
		String elementflash = obj.getProperty("elementflash");
		String url = obj.getProperty("url");
		String username = obj.getProperty("username");
		String password = obj.getProperty("password");
		String accountname = obj.getProperty("accountname");
		System.out.println(Browser);
		System.out.println(headless);
		System.out.println(elementflash);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println(accountname);
	}

}
