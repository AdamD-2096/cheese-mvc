package com.company.cheesemvc.Models;

import java.util.HashMap;
import java.util.Map;

public class CheeseData {
    static HashMap<String, Cheese> cheeses = new HashMap<>();

    public static HashMap<String, Cheese> getAll(){
        return cheeses;
    }
    public static void add(Cheese newCheese){
        String key = newCheese.getName() + newCheese.getId();
        cheeses.put(key, newCheese);
    }
    public static Cheese getById(int id){
        Cheese theCheese = new Cheese("","");
        for (Map.Entry<String, Cheese> cheeseSet : cheeses.entrySet()){
            Cheese cheese = cheeseSet.getValue();
            if(cheese.getId() == id){
                theCheese = cheese;
            }
        }

        return theCheese;
    }
    public static void remove(int id){
        Cheese cheese = getById(id);
        remove(cheese);
    }
    public static void remove(Cheese cheese){
        cheeses.remove(cheese.getName()+cheese.getId());
    }
}
