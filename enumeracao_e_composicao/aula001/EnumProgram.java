package aula001;

import java.sql.Date;
import aula001.OrderStatus;
import aula001.Order;

public class EnumProgram {

	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(0), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED; // enviado
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // retorna index do delivered no enum OrderStatus
		
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
