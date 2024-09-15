import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // Initialize an array of ArrayList<Integer>
        ArrayList<Integer>[] arrayOfLists = new ArrayList[3]; // Array with 3 ArrayLists

        // Initialize each ArrayList in the array
        for (int i = 0; i < arrayOfLists.length; i++) {
            arrayOfLists[i] = new ArrayList<Integer>();
        }

        // Populate the ArrayLists with numbers divisible by 3, 5, and both
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) arrayOfLists[0].add(i);
            if (i % 5 == 0) arrayOfLists[1].add(i);
            if (i % 3 == 0 && i % 5 == 0) arrayOfLists[2].add(i);
        }

        // Display the values
        String[] labels = {"Divisible by 3", "Divisible by 5", "Divisible by both 3 and 5"};
        for (int i = 0; i < arrayOfLists.length; i++) {
            System.out.println(labels[i] + ":");
            for (int j = 0; j < arrayOfLists[i].size(); j++) {
                System.out.println(arrayOfLists[i].get(j));
            }
            System.out.println();
        }
    }
}
