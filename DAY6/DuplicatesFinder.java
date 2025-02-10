import java.util.*;

public class DuplicatesFinder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) { 
                duplicates.add(num);
            }
        }

        System.out.println(duplicates); 
    }
}
