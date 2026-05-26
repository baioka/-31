import java.util.Comparator;

public class ElementarySort {
    // bubble sort variant
    public static <E extends Comparable<E>> void sort(E[] list){

    for (int i = 0; i < list.length - 1; i++) {

        int minIndex = i;

        for (int j = i + 1; j < list.length; j++) {

            if (list[j].compareTo(list[minIndex]) < 0) {
                minIndex = j;
            }
        }

        E temp = list[i];
        list[i] = list[minIndex];
        list[minIndex] = temp;
    }
}

public static <E> void sort(E[] list, Comparator<? super E> comparator) {

    for (int i = 0; i < list.length - 1; i++) {

        int minIndex = i;

        for (int j = i + 1; j < list.length; j++) {

            if (comparator.compare(list[j], list[minIndex]) < 0) {
                minIndex = j;
            }
        }

        E temp = list[i];
        list[i] = list[minIndex];
        list[minIndex] = temp;
    }
}

    // Example for Comparable usage
    public static <E extends Comparable<E>> E findMin(E[] list){
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if  (list[i].compareTo(list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    // Example for Comparator usage
    public static <E> E findMin(E[] list, Comparator<? super E> comparator) {
        int minIndex = 0;
        for (int i = 1; i < list.length; i++) {
            if  (comparator.compare(list[i],list[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return list[minIndex];
    }

    static void main() {
        String [] names = {"Bob", "John", "Alice"};
        
        //Comparable used
        System.out.println(findMin(names)); // Alice (smallest by alphabet, natural)
        
        // Comparator used
        System.out.println(findMin(names, new StringComparator())); // Bob (smallest by length, custom)
    }
}

