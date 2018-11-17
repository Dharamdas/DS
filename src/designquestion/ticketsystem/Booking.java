package designquestion.ticketsystem;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Booking {
    int bookingId;
    int userId;
    int movieId;
    List<Movie> bookedSeats;
    int amount;
    PaymentStatus status_of_payment;
    Date booked_date;
    Time movie_timing;
}
