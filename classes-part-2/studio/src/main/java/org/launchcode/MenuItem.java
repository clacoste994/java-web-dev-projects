package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    HashMap<String, ArrayList<MenuItem>> items = new HashMap<>();
    public MenuItem(double p, String d, String c, boolean iN) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;

    }



    public void setPrice(double price) {
        this.price = price;
        Price scallopsPrice = new Price(100);
        Price cokePrice = new Price(20);
        Price roastPrice = new Price(50);



    }

    public void setDescription(String description) {
        this.description = description;
    Description scallopsDescription = new Description("Tasty food things!");
    Description cokeDescription = new Description("Refreshing!");
    Description roastDescription = new Description("Extremely delicious!");

    }
    public void setCategory(String category) {
        this.category = category;

    Category scallopsCategory = new Category("Appetizer");
    Category cokeCategory = new Category("Refreshment");
    Category roastCategory = new Category("Main Course");
    }
    public void setNew(boolean aNew) {
        isNew = aNew;

    New scallopsNew = new New(true);
    New cokeNew = new New(false);
    New roastNew = new New(false);

    }