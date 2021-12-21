package map.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        Map<String,String> cookies = new TreeMap<>();
        cookies.put("username","Maria");
        cookies.put("e-mail","maria@gmail.com");
        cookies.put("phone","991214022");

        cookies.remove("e-mail");
        cookies.put("phone","12333312");

        System.out.println("Contains 'phone' key :" + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("E-mail: " + cookies.get("e-mail"));
        System.out.println("Size: " + cookies.size());
        System.out.println("All Cookies");

        for (String key : cookies.keySet()){
            System.out.println(key + " : " + cookies.get(key));
        }
    }

}
