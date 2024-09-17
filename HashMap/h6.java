
// Find Itinerary(journey) of the tickets
//(Key-from , Value-to)
//"Chennai" -> "Bengaluru"
//"Mumbai"-> "Delhi"
// "Goa"-> "Chennai"
// "Delhi" -> "Goa"
package HashMap;

import java.util.HashMap;

public class h6 {
    //method
    public static String getStart(HashMap<String,String> tick){
        //create a reverse HashMap to store the "to" as key in it.
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tick.keySet()){
            //key -> key , value -> tick.get(key)
            revMap.put(tick.get(key), key);
        }
        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key; //start
            }
        }
        return null;
    }
    //main
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");
        //calling method
        String start = getStart(tickets);
        //while loop
        while(tickets.containsKey(start)){
            System.out.print(start + "->");
            start = tickets.get(start); //from -> to
        }
        System.out.println(start);//last destination
        
    }

    
}
