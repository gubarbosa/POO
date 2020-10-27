package GrandeSoftware1;

import java.util.Iterator;
import java.util.List;

public class FindGuitar {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInvetory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Bom dia Carlos, vou apresentar algumas guitarras pra você! ");
            for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("Existe uma " +
                        guitar.getBuilder() + " " +
                        guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n" +
                        guitar.getBackWood() + " atrás e lateral\n" +
                        guitar.getTopWood() + " no tampo.\nEstamos vendendo ela por US$" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Infelizmente, não temos nada para você Carlos!");
        }
    }

    private static void initializeInvetory(Inventory inventory) {
        inventory.addGuitar("V95693", 799.99, Builder.FENDER,
                "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}