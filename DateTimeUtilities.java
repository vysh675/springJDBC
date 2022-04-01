package com.springboot.workers.jdbcexample.util;


	import java.util.Date;

	public class DateTimeUtilities {
		private static Date date;
		
		
	    public static String getTimeStamp(){
	       Date date = new Date();
	        return date.toString();
	    }
	}

