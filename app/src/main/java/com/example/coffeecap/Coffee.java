package com.example.coffeecap;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Coffee extends AppCompatActivity {
    private String type;
    private int caffeine; // measured in mg
    private int size; // measured in oz
    private ImageView i;
    Coffee c1 = new Coffee("Brewed Coffee", 95, 8, findViewById(R.id.BrewedCoffee));
    Coffee c2 = new Coffee("Espresso", 64, 1, findViewById(R.id.Espresso));
    Coffee c3 = new Coffee("Instant Coffee", 62, 8, findViewById(R.id.InstantCoffee));//TODO: change this and brewed coffee's caffeine intake back to its actual values
    Coffee c4 = new Coffee("Brewed Decaf Coffee", 2, 8, findViewById(R.id.BrewedDecafCoffee));
    Coffee stb1 = new Coffee("Cafe Americano", 150, 12, findViewById(R.id.CafeAmericano));
    Coffee stb2 = new Coffee("Blonde Roast", 270, 12, findViewById(R.id.BlondeRoast));
    Coffee stb3 = new Coffee("Cappuccino", 150, 16, findViewById(R.id.Cappuccino));
    Coffee stb4 = new Coffee("Flat White", 130, 12, findViewById(R.id.FlatWhite));
    Coffee stb5 = new Coffee("Cafe Latte", 75, 12, findViewById(R.id.CafeLatte));
    Coffee stb6 = new Coffee("Caramel Macchiato", 75, 12, findViewById(R.id.CaramelMacchiato));
    Coffee stb7 = new Coffee("Cafe Latte", 75, 12, findViewById(R.id.CafeLatte));
    Coffee stb8 = new Coffee("Cafe Mocha", 95, 12, findViewById(R.id.CafeMocha));
    Coffee stb9 = new Coffee("White Chocolate Mocha", 75, 12, findViewById(R.id.WhiteChocMocha));


    private static ArrayList<Coffee> DRINKS = new ArrayList<Coffee>(); //TODO: add drinks to array

    //constructor
    public Coffee(String type, int caffeine, int size, ImageView i) {
        this.type = type;
        this.caffeine = caffeine;
        this.size = size;
        this.i = i;
    }

    public void addData() {
        addDrink(c1);
        addDrink(c2);
        addDrink(c3);
        addDrink(c4);
        addDrink(stb1);
        addDrink(stb2);
        addDrink(stb3);
        addDrink(stb4);
        addDrink(stb5);
        addDrink(stb6);
        addDrink(stb7);
        addDrink(stb8);
        addDrink(stb9);
    }

    //getters
    public String getType() {
        return type;
    }

    public int getCaffeine() {
        return caffeine;
    }

    public int getSize() {
        return size;
    }

    public static ArrayList<Coffee> getDrinksList() {
        return DRINKS;
    }


    //setters
    public void setType(String type) {
        this.type = type;
    }

    public void setCaffeine(int caffeine) {
        this.caffeine = caffeine;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Coffee) {
            Coffee cOther = (Coffee) other;
            if (this.type.equals(cOther.type)
                    && this.caffeine == cOther.caffeine
                    && this.size == cOther.size) {
                return true;
            }
        }
        return false;
    }

    public void displayImage() {
        i.setVisibility(View.VISIBLE);
    }

    //arraylist drinks modifiers
    public static boolean checkDrink(Coffee c) {//TODO: take this out if not needed
        for (int i = 0; i < DRINKS.size(); i++) {
            if(c.equals(DRINKS.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void addDrink(Coffee c) {
        if (!checkDrink(c)) {
            DRINKS.add(c);
        }
    }
}
