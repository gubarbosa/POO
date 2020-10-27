package com.guitar;

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializaInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                5, Wood.ALDER, Wood.ALDER);

        List<?> guitars = inventory.search(whatErinLikes);
        if (!guitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator<?> i = guitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                InstrumentSpec spec = guitar.getSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n   " +
                        spec.getBackWood() + " back and sides,\n   " +
                        spec.getTopWood() + " top,\n You can have it for only $" +
                        guitar.getPrice() + "!\n -----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }

    }

    private static void initializaInventory(Inventory inventory) {
    	InstrumentSpec spec1 = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                5, Wood.ALDER, Wood.ALDER);
    	InstrumentSpec spec2 = new GuitarSpec(Builder.FENDER, "Whatetor",
                Type.ELECTRIC, 5, Wood.ALDER, Wood.ALDER);

        inventory.addInstrument("V95693", 1499.95, spec1);
        inventory.addInstrument("V9512", 1549.95, spec2);
    }

}
