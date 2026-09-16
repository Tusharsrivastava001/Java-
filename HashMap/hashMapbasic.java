import java.util.*;

public class HashMapRevision {

    public static void main(String[] args) {

        // =====================================================
        // 1. CREATE HASHMAP
        // =====================================================

        HashMap<Integer, Integer> map = new HashMap<>();


        // =====================================================
        // 2. put() -> ADD / UPDATE
        // =====================================================

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);

        System.out.println("Map: " + map);


        // Existing key -> VALUE UPDATE
        map.put(1, 500);

        System.out.println("After update: " + map);


        // =====================================================
        // 3. get() -> GET VALUE
        // =====================================================

        System.out.println("Value of key 2: " + map.get(2));


        // =====================================================
        // 4. containsKey() -> CHECK KEY
        // =====================================================

        System.out.println("Key 2 exists: " + map.containsKey(2));

        System.out.println("Key 10 exists: " + map.containsKey(10));


        // =====================================================
        // 5. containsValue() -> CHECK VALUE
        // =====================================================

        System.out.println("Value 300 exists: "
                + map.containsValue(300));


        // =====================================================
        // 6. getOrDefault()
        // =====================================================

        System.out.println("Key 2: "
                + map.getOrDefault(2, 0));

        System.out.println("Key 10: "
                + map.getOrDefault(10, 0));


        // =====================================================
        // 7. putIfAbsent()
        // =====================================================

        map.putIfAbsent(4, 400);

        // 4 already exists, so 999 will NOT replace 400
        map.putIfAbsent(4, 999);

        System.out.println("After putIfAbsent: " + map);


        // =====================================================
        // 8. replace()
        // =====================================================

        map.replace(4, 444);

        System.out.println("After replace: " + map);


        // =====================================================
        // 9. remove()
        // =====================================================

        map.remove(3);

        System.out.println("After removing key 3: " + map);


        // =====================================================
        // 10. size()
        // =====================================================

        System.out.println("Size: " + map.size());


        // =====================================================
        // 11. isEmpty()
        // =====================================================

        System.out.println("Is empty: " + map.isEmpty());


        // =====================================================
        // 12. keySet() -> ALL KEYS
        // =====================================================

        System.out.println("\nAll Keys:");

        for (Integer key : map.keySet()) {
            System.out.println(key);
        }


        // =====================================================
        // 13. values() -> ALL VALUES
        // =====================================================

        System.out.println("\nAll Values:");

        for (Integer value : map.values()) {
            System.out.println(value);
        }


        // =====================================================
        // 14. entrySet() -> KEY + VALUE
        // =====================================================

        System.out.println("\nKey + Value:");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(
                    "Key = " + entry.getKey()
                    + ", Value = " + entry.getValue()
            );
        }


        // =====================================================
        // 15. FREQUENCY COUNTING
        // =====================================================

        int[] arr = {1, 2, 2, 3, 1, 2, 4, 3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : arr) {

            freq.put(
                    x,
                    freq.getOrDefault(x, 0) + 1
            );
        }

        System.out.println("\nFrequency Map: " + freq);


        // =====================================================
        // 16. PRINT DUPLICATES
        // =====================================================

        System.out.println("\nDuplicates:");

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(
                        entry.getKey()
                        + " appears "
                        + entry.getValue()
                        + " times"
                );
            }
        }


        // =====================================================
        // 17. CHARACTER FREQUENCY
        // =====================================================

        String s = "banana";

        HashMap<Character, Integer> charFreq = new HashMap<>();

        for (char ch : s.toCharArray()) {

            charFreq.put(
                    ch,
                    charFreq.getOrDefault(ch, 0) + 1
            );
        }

        System.out.println("\nCharacter Frequency: "
                + charFreq);


        // =====================================================
        // 18. NUMBER -> INDEX
        // Useful for Two Sum
        // =====================================================

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (indexMap.containsKey(complement)) {

                System.out.println(
                        "\nTwo Sum indices: "
                        + indexMap.get(complement)
                        + ", "
                        + i
                );

                break;
            }

            indexMap.put(nums[i], i);
        }


        // =====================================================
        // 19. CLEAR
        // =====================================================

        map.clear();

        System.out.println("\nAfter clear: " + map);

        System.out.println("Is empty: " + map.isEmpty());
    }
}
