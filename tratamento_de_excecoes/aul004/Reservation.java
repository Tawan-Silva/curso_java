package aul004;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import DomianExeception.DomainExecption_aula004;

public class Reservation {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	// static para não permitir nova intancia deste objeto 
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
		if (!checkOut.after(checkIn)) {
			throw new DomainExecption_aula004("Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	// getTime() retorna quatidade de milissegundos
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); // converte milissegundos para dias 
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainExecption_aula004("Reservation dates for update must be future dates"); 
		}
		
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override // sobrescrita / sobreposição
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: " 
				+ sdf.format(checkOut)
				+ ", check-out "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights ";
	}
}
