package aula02;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;

public class DateProgram2 {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		java.util.Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		int minutes = cal.get(Calendar.MINUTE); // extrai os os minutos
		int month = 1 + cal.get(Calendar.MONTH); // extrai o mês apartir do zero!
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4); // acrescenta 4 horas na data 
		
		d = cal.getTime(); // + 4h
		System.out.println(sdf.format(d)); 
		System.out.println("Minutos: " + minutes); 
		System.out.println("Mês: " + month); 
	}

}
