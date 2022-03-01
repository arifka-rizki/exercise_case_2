package main.controller;

import main.model.Item;

import java.util.ArrayList;

public class PurchaseController {
    public static void manageItem(ArrayList<Item> items, String newName, int newPoint, int index){
        items.get(index).setPoint(newPoint);
        items.get(index).setName(newName);
    }
}
