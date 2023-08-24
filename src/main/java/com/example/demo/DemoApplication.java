package com.example.demo;

import com.example.demo.Model.Reservation;
import com.example.demo.Service.ReservationService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
     ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	 ReservationService rs = context.getBean(ReservationService.class, args);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

		String dateInString = "22-Aug-2023";
		try {
			Date date = formatter.parse(dateInString);
			List<Reservation> l = rs.getResByDate(date);
			l.forEach(e-> System.out.println(e));
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
//		Date date = Date ("2023-08-22");



	}

}
