package main;

import main.controller.ItemController;
import main.controller.PurchaseController;
import main.model.Item;
import main.model.SoldItem;

import java.time.LocalDate;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<SoldItem> soldItems = new ArrayList<>();

        items.add(new Item("Bag", 100, 10));
        items.add(new Item("Hat", 50, 15));
        items.add(new Item("Watch", 500, 5));

        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("_______");

        ItemController.buyItem(items, 5, 1, soldItems);
        ItemController.buyItem(items, 1, 2, soldItems);
        PurchaseController.manageItem(items, "Supreme Bag", 1000, 0);
        for (Item item : items) {
            System.out.println(item);
        }

        for(SoldItem soldItem: soldItems){
            System.out.println(soldItem);
        }
    }

//    public static void buyItem(ArrayList<Item> items, int qty, int index, ArrayList<SoldItem> soldItems){
//        int currentQty = items.get(index).getStock();
//        items.get(index).setStock(currentQty - qty);
//        soldItems.add(new SoldItem(items.get(index), qty, LocalDate.now()));
//    }

//    public static void manageItem(ArrayList<Item> items, String newName, int newPoint, int index){
//        items.get(index).setPoint(newPoint);
//        items.get(index).setName(newName);
//    }
}
