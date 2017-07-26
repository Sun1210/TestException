package com.test.testException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	 
	   public static void main(String args[]) {
		   Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
			String nowtime = dateFormat.format( now ); 
			System.out.println(nowtime);
	   }   
	}
