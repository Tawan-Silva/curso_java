package aula01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;


public class DateProgram {

	public static void main(String[] args) throws ParseException {
		
		// Formas de criar data
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // cria data com horário atual
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("28/06/2022");
		Date y2 = sdf2.parse("25/06/2022 19:07:48");
		Date y3 = Date.from(Instant.parse("2022-05-28T15:42:07Z"));
		
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2)); 
		System.out.println(sdf2.format(y2)); 
		System.out.println(sdf2.format(x1)); 
		System.out.println(sdf2.format(x2)); 
		System.out.println(sdf2.format(x3)); 
		System.out.println(sdf2.format(x4)); 
		System.out.println(sdf2.format(y3));
		
		System.out.println("----------FORMATADO-----------------");
		System.out.println(y1);
		System.out.println(y2); 
		System.out.println(y2); 
		System.out.println(x1); 
		System.out.println(x2); 
		System.out.println(x3); 
		System.out.println(x4); 
		System.out.println(y3);
		
		System.out.println("------------------UTC-----------------");
		System.out.println(sdf3.format(y1)); // 28/06/2022 03:00:00
		System.out.println(sdf3.format(y2)); // 25/06/2022 22:07:48
		System.out.println(sdf3.format(y2)); // 25/06/2022 22:07:48
		System.out.println(sdf3.format(x1)); // 28/05/2022 22:28:02
		System.out.println(sdf3.format(x2)); // 28/05/2022 22:28:02
		System.out.println(sdf3.format(x3)); // 01/01/1970 00:00:00
		System.out.println(sdf3.format(x4)); // 01/01/1970 05:00:00
		System.out.println(sdf3.format(y3)); //  28/05/2022 15:42:07
	}

}
