import java.util.*;

// Enums
enum Type { ACOUSTIC, ELECTRIC }
enum Wood { ALDER, MAHOGANY, MAPLE }
enum Builder { FENDER, MARTIN, GIBSON }

class GuitarSpec {
    private Type type;
    private String model;
    private Wood topWood;
    private Wood backWood;
    private int numStrings;
    private Builder builder;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        this.type = type;
        this.model = model;
        this.builder = builder;
        this.topWood = topWood;
        this.backWood = backWood;
        this.numStrings = numStrings;
    }

    public Type getType() { return type; }
    public String getModel() { return model; }
    public Wood getTopWood() { return topWood; }
    public Wood getBackWood() { return backWood; }
    public Builder getBuilder() { return builder; }
    public int getNumStrings() { return numStrings; }

    public boolean matches(GuitarSpec otherSpec) {
        if (builder != otherSpec.builder)
            return false;

        if (model != null && !model.equalsIgnoreCase(otherSpec.model))
            return false;

        if (type != otherSpec.type)
            return false;

        if (numStrings != otherSpec.numStrings)
            return false;

        if (backWood != otherSpec.backWood)
            return false;

        if (topWood != otherSpec.topWood)
            return false;

        return true;
    }
}

class Guitar {

    private String serialNumber;
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public double getPrice() { return price; }
    public GuitarSpec getSpec() { return spec; }
    public String getSerialNumber() { return serialNumber; }
}

class Inventory {
    private List<Guitar> guitars = new LinkedList<>();

    public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
        guitars.add(new Guitar(serialNumber, price, spec));
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();

        for (Guitar guitar : guitars) {
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }

        return matchingGuitars;
    }
}

public class GuitarApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                6,
                Wood.ALDER,
                Wood.ALDER
        );

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:\n");

            for (Guitar guitar : matchingGuitars) {
                GuitarSpec spec = guitar.getSpec();

                System.out.println("We have a " +
                        spec.getBuilder() + " " +
                        spec.getModel() + " " +
                        spec.getNumStrings() + "-string " +
                        spec.getType() + " guitar:");
                System.out.println(spec.getBackWood() +
                        " back and sides, " +
                        spec.getTopWood() + " top.");
                System.out.println("Price: $" + guitar.getPrice());
                System.out.println("----");
            }

        } else {
            System.out.println("Sorry, no matching guitars found.");
        }
    }

    private static void initializeInventory(Inventory inventory) {

        inventory.addGuitar("V95693", 1499.95,
                new GuitarSpec(
                        Builder.FENDER,
                        "Stratocastor",
                        Type.ELECTRIC,
                        6,
                        Wood.ALDER,
                        Wood.ALDER
                ));

        inventory.addGuitar("V9512", 1549.95,
                new GuitarSpec(
                        Builder.FENDER,
                        "Stratocastor",
                        Type.ELECTRIC,
                        6,
                        Wood.ALDER,
                        Wood.ALDER
                ));

        inventory.addGuitar("X1111", 1799.95,
                new GuitarSpec(
                        Builder.MARTIN,
                        "D-28",
                        Type.ACOUSTIC,
                        6,
                        Wood.MAHOGANY,
                        Wood.MAPLE
                ));
    }
}
