package org.launchcode.java.studios.resturant;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem pasta = new MenuItem(12, "yummy pasta", "main dish", "good pasta", 1);
        MenuItem chicken = new MenuItem(15, "Spicy Chicken", "main dish", "good chicken", 2);
        Menu mcdonalds = new Menu();
        mcdonalds.addItem(pasta);
        mcdonalds.addItem(chicken);
        mcdonalds.printMenu();
    }
}
