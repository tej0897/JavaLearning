package course.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapsExample {
    public static void main(String[] args) {

        HashMap<String, String> myMaps = new HashMap<>();
        myMaps.put("IN", "India");
        myMaps.put("CN","China");
        myMaps.put("US","United States");
        myMaps.put("UK", "United Kingdom");
        for(Map.Entry<String,String> maps:myMaps.entrySet()){
            System.out.println(maps.getKey() + ":" + maps.getValue());
        }

    }
}

