package com.example.project.cab.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="booking")
public class Booking {
	@Id
	@Column(name="bookingId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingId;
	@Column(name="cabNo")
	private int cabNo;
	@Column(name="cabTime")
	private int cabTime;
	@Column(name="numberOfSeatsBooked")
	private int numberOfSeatsBooked;
	@Column(name="bookedby")
	private int bookedBy;
	public Booking(int cabNo, int cabTime, int numberOfSeatsBooked, int bookedBy) {
		super();
		
		this.cabNo = cabNo;
		this.cabTime = cabTime;
		this.numberOfSeatsBooked = numberOfSeatsBooked;
		this.bookedBy = bookedBy;
	}
	public int getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(int bookedBy) {
		this.bookedBy = bookedBy;
	}
	public Booking() {
		
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getCabNo() {
		return cabNo;
	}
	public void setCabNo(int cabNo) {
		this.cabNo = cabNo;
	}
	public int getCabTime() {
		return cabTime;
	}
	public void setCabTime(int cabTime) {
		this.cabTime = cabTime;
	}
	public int getNumberOfSeatsBooked() {
		return numberOfSeatsBooked;
	}
	public void setNumberOfSeatsBooked(int numberOfSeatsBooked) {
		this.numberOfSeatsBooked = numberOfSeatsBooked;
	}
	public Booking(int cabNo, int cabTime, int numberOfSeatsBooked) {
		super();
		
		this.cabNo = cabNo;
		this.cabTime = cabTime;
		this.numberOfSeatsBooked = numberOfSeatsBooked;
	}
	
	
	
}
