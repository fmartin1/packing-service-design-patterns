package main.shipment;

import main.util.SingleStringPrinter;

import java.util.Random;

public abstract class Shipping {

    public abstract String getMode();

    public abstract String getDeliveryTime();

    public final void print() {
        printDescription();
        printFolio();
        printStages();
    }

    private void printDescription() {
        singleStringPrinter.print("- Mode: " + getMode());
        singleStringPrinter.print("- Delivery time: " + getDeliveryTime());
    }

    private void printFolio() {
        singleStringPrinter.print("- Folio number: " + getFolioPrefix() + new Random().nextInt(1000000));
        singleStringPrinter.print("\n");
    }

    public abstract String getFolioPrefix();

    private void printStages() {
        printInitialStages();
        printOtherStages();
        printFinalStages();
    }

    private void printInitialStages() {
        singleStringPrinter.print("- Receiving package at the origin office");
        singleStringPrinter.print("- Labeling package for shipping");
    }

    public abstract void printOtherStages();

    private void printFinalStages() {
        singleStringPrinter.print("- Receiving package at destination office");
    }

    protected SingleStringPrinter singleStringPrinter = System.out::println;
}
