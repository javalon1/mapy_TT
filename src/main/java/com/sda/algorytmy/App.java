package com.sda.algorytmy;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App
{
    public static void main( String[] args )
    {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Jan");
        map.put(2,"Tomasz");
        map.put(3,"Gosia");
        map.put(4,"Barny");
        map.put(5,"Zdzichu");

//        System.out.println(map);

  /*      for(Map.Entry<Integer, String> m: map.entrySet()){
            System.out.println("Klucz: "+m.getKey());
            System.out.println("Wartość: "+m.getValue());
        }
*/
        Map<String,List<String>> food = new HashMap<>();
        //Wegan
        //Halal
        //Koszerne

        List<String> wegan = new ArrayList<>();
        wegan.add("JAJKA");
        wegan.add("SER");
        wegan.add("TOFU");

        List<String> halal = new ArrayList<>();
        halal.add("BARAN");
        halal.add("KURCZAK");
        halal.add("SALAMI");

        List<String> koszerne = new ArrayList<>();
        koszerne.add("MARCHEWKA");
        koszerne.add("CIASTKA");
        koszerne.add("HUMUS");

        food.put("WEGAN", wegan);
        food.put("HALAL", halal);
        food.put("KOSZERNE", koszerne);

        System.out.println(food);

        for(Map.Entry<String, List<String>> m: food.entrySet()){
            System.out.println(m.getKey());
            for(String item: m.getValue()) {
                System.out.println("     -"+item);
            }      }

    }
}
