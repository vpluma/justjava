package com.example.android.vinsonjustjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        /*int price = quantity * 5; */
        int price = calculatePrice();
        createOrderSummary(price);
        /*int numberOfCoffees = quantity;
        display(numberOfCoffees);
        displayPrice(numberOfCoffees * 5);*/
    }
    /**
     * Calculates the price of the order based on the quantity & pricePerCup.
     *
     * @return the price
     */
    private int calculatePrice() {
        int price = quantity * 5;
        return price;
    }

    public void createOrderSummary(int price){
        String priceMessage = "Name: Kaptain Kunal\nQuantity: " + quantity + "\nTotal: $" + price;
        priceMessage = priceMessage + " \nThank you!";
        displayMessage(priceMessage);
    }
    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}


