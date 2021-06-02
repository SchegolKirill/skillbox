package main.java.module3.testjar.src;

import com.skillbox.airport.Airport;

public class Test {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        airport.getAllAircrafts();
        System.out.println(airport.getAllAircrafts().size());
    }
}
