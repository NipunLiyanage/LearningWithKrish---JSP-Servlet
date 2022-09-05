package com.example.controller;

import com.example.model.Item;

import java.util.HashMap;
import java.util.Map;

public class DB {
    private Map<String , Item> items =  new HashMap<>();

    public String addItem(Item item){

        boolean isThere = isAvailable(item.getProductID());

        if (isThere=true){
            return "Item is already in the inventory";
        }
        else{
            try {
                items.put(item.getProductID(), item);
                return "Item Added";
            } catch (Exception e) {
                return "Exception";
            }
        }
    }


    public boolean isAvailable(String productID){
        if(items.containsKey(productID)){
            return true;
        }else{
            return false;
        }
    }

    public Item getItem(String productID){

        return items.get(productID);
    }
}
