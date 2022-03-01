package main.controller;

import main.model.Item;
import main.model.SoldItem;

import java.time.LocalDate;
import java.util.ArrayList;

public class ItemController {
    public static void buyItem(ArrayList<Item> items, int qty, int index, ArrayList<SoldItem> soldItems){
        int currentQty = items.get(index).getStock();
        items.get(index).setStock(currentQty - qty);
        soldItems.add(new SoldItem(items.get(index), qty, LocalDate.now()));
    }
}
