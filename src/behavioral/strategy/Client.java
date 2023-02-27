package behavioral.strategy;

import behavioral.strategy.factory.TravelMode;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();

        Scanner sc = new Scanner(System.in);
        String source = sc.next();
        String destination = sc.next();

        googleMaps.getFastestRoute(source, destination, TravelMode.WALK);
    }
}
