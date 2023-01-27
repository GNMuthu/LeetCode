package BusBooking;
import java.util.Scanner;
import java.util.ArrayList;
public class BusDemo
{
    public static void main(String[] args)
    {
        ArrayList<Bus> buses=new ArrayList<Bus>();
        ArrayList<Booking> bookings= new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,2));
        buses.add(new Bus(3,true,2));

        int userOpt=1;
        Scanner sc = new Scanner(System.in);

        for(Bus b:buses)
        {
            b.displayBusinfo();
            System.out.println("test");
        }
        while(userOpt==1) {
            System.out.println("Press 1 to Booking and 2 to Exit");
            userOpt = sc.nextInt();
            if (userOpt == 1) {
                Booking booking = new Booking();
                if (booking.isAvailable(bookings, buses)) {
                    bookings.add(booking);
                    System.out.println("Your Booking is Confired");
                } else {
                    System.out.println("Bus is full try with another date or bus");
                }
            }
        }

    }
}
