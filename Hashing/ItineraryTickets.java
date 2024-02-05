package Hashing;

import java.util.HashMap;

public class ItineraryTickets {
    public static String getStart(HashMap<String, String> tick) {
        HashMap<String, String> revMap = new HashMap<>();
        // RevMap have opposite key-value to that of tick
        for (String key : tick.keySet()) {
            revMap.put(tick.get(key), key);
        }
        // To identify start
        for (String key : tick.keySet()) {
            if (revMap.containsKey(key) == false) {
                return key;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bangalore");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        while(tickets.containsKey(start)) {
            System.out.print(start+"->");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
