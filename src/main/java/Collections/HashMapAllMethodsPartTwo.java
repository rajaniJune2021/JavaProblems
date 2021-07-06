package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapAllMethodsPartTwo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("moneyheist",10);
        map.put("blacklist",20);
        map.put("greysanatomy",30);
        map.put("shooter",40);

        map.compute("moneyheist",(key,val) -> (val==0) ? 10 : 200);
        System.out.println(map.get("moneyheist"));

        map.computeIfAbsent("shooter", k -> 300);// if this particular key doesn't exist it will add to the existing map with key and value otherwise this piece of code not executed.

        System.out.println(map);

        map.computeIfPresent("blacklist", (key, value) -> (value==0) ?10:900); // if key exists in given map it will update the given value as per condition in ternary operator mention.

        System.out.println(map);
        

    }
}
