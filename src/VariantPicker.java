import java.util.Random;

public class VariantPicker {
    static String[] sorts = {"bubble", "selection", "insertion"};
    static String [] natural = {"by (weight,firstname,lastname) in ascending", "by (height,firstname,lastname) in ascending"};
    static String [] custom = {"by (lastname, firstname, weight) in ascending", "by (lastname, firstname,height) in ascending"};

    static void printVariant(long seed){
        Random rand = new Random(seed);
        System.out.println("Your Variant");
        System.out.println(sorts[rand.nextInt(0,sorts.length-1)]); // Elementary sort
        System.out.println(natural[rand.nextInt(0,natural.length-1)]); // Natural order
        System.out.println(custom[rand.nextInt(0,custom.length-1)]); // Custom order
    }

    static void main() {
        long id = 250000; // substitute your id here
        printVariant(id);
    }
}
