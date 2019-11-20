package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println(sd.format(c.getTime()));
		

		
		c.set(Calendar.HOUR_OF_DAY, 23);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 59);
		
		SimpleDateFormat sd1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
	
		
		System.out.println(sd1.format(c.getTime()));
		
		Calendar c1 = Calendar.getInstance();
		SimpleDateFormat sd2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		
		System.out.println(sd2.format(c1.getTime()));
		

	}

}
