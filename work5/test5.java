package work5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class test5 {
    public static void main(String[] args) {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
                new GregorianCalendar(2014, 4, 5, 5, 5, 0),
                new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235",
                new GregorianCalendar(2014, 4, 5, 6, 55, 0),
                new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237",
                new GregorianCalendar(2014, 4, 5, 9, 35, 0),
                new GregorianCalendar(2014, 4, 5, 12, 55, 0)));

        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTime());
        System.out.println(itinerary.getTotalTime());
    }
    static class  Flight{
        String flightNo;
        GregorianCalendar departureTime;
        GregorianCalendar arrivalTime;

        public Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
            this.flightNo = flightNo;
            this.departureTime = departureTime;
            this.arrivalTime = arrivalTime;
        }
        public Flight() {
        }
        public String getFlightNo() {
            return flightNo;
        }

        public GregorianCalendar getDepartureTime() {
            return departureTime;
        }

        public void setDepartureTime(GregorianCalendar departureTime) {
            this.departureTime = departureTime;
        }

        public GregorianCalendar getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(GregorianCalendar arrivalTime) {
            this.arrivalTime = arrivalTime;
        }
        public int getFlightTime(){

           long i= this.arrivalTime.getTimeInMillis();
           long j= this.departureTime.getTimeInMillis();
           return (int) (i-j)/(1000*60);

        }

    }
    static class Itinerary{
        List<Flight> flights;//=new ArrayList<>();

        public Itinerary(List<Flight> flights) {
            this.flights = flights;
        }
        public int getTotalTime(){

           Calendar a=(Calendar) this.flights.get(0).departureTime;

            int i=flights.size()-1;
            Calendar b=this.flights.get(i).arrivalTime;
            return (int) (b.getTimeInMillis()-a.getTimeInMillis())/(1000*60);
        }
    }
}
