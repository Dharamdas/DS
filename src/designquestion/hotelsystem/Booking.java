package designquestion.hotelsystem;

import java.util.Date;
import java.util.List;

public class Booking {

   private int bookingId;
   private int userId;
   private int hotelId;

    // We are assuming that in a single
    // booking we can book only the rooms
    // of a single hotel
   private List<Room> bookedRooms;
   private int amount;
   private PaymentStatus status_of_payment;
   private Date bookingTime;
   private Duration duration;

}
