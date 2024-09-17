// Find Itinerary(journey) of the tickets
//(Key-from , Value-to)
//"Chennai" -> "Bengaluru"
//"Mumbai"-> "Delhi"
// "Goa"-> "Chennai"
// "Delhi" -> "Goa"
package HashMap;

import java.util.HashMap;

public class ph6 {
    //method
    // (key-from , value-to)
    static String getStart(HashMap<String,String> tickt){
        //create a reverse HashMap to store "to" as key in it.
        HashMap <String,String> revsMap = new HashMap<>();
        //store
        for(String key : tickt.keySet()){
            revsMap.put(tickt.get(key), key);
        }
        for(String key : tickt.keySet()){
            if(!revsMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
    //main
    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai", "Bengaluru");
        ticket.put("Mumbai", "Delhi");
        ticket.put("Goa", "Chennai");
        ticket.put("Delhi", "Goa");
        String Start = getStart(ticket);
        //while loop
        while(ticket.containsKey(Start)){
            System.out.print(Start + "->");
            Start = ticket.get(Start);
        }
        System.out.println(Start);



    }
    
}
