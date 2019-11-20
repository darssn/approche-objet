package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date d = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
			
		System.out.println(sd.format(d));
		
		Date d1 = new Date();
		
		Calendar c  = Calendar.getInstance();
		
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 59);
		
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		d1= c.getTime();
		
		System.out.println(sd1.format(d1));
		
		Date d2 = new Date();
		
		System.out.println(sd1.format(d2));
		
		
		
		
		
	}

}
