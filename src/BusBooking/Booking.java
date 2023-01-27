package BusBooking;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.SimpleDateFormat.*;
public class Booking
{
    String passengerName;
    int busNo;
    Date date;
Booking()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Passenger Name: " );
    passengerName=sc.next();
    System.out.println("Enter the Bus No:");
    busNo=sc.nextInt();
    System.out.println("Enter the travel date (dd-mm-yyyy):");
    String dateInput=sc.next();
    SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy");
    try {
        date=df.parse(dateInput);
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }

}
    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus>buses)
    {
        int capacity=0;
        for(Bus bus:buses)
        {
            if(bus.getbusNo()==busNo)
                capacity=bus.getCapacity();
        }
        int booked=0;
        for(Booking b:bookings)
        {
            if(b.busNo==busNo && b.date.equals(date))
                booked++;
        }
        return booked<capacity?true:false;

    }

}
