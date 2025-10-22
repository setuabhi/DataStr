1. HashSet add returns true if element not present, if present returns false
2. HashMap put returns null if element not present, if present returns value of that key and update that value
3. HashMap remove(a) return value for that key 'a', hashset remove(a) will return true or false if value present or absent
4. map.values() : List of Values
5. map.keySet() : Set of Keys
6. Integer[] arr = {-1, -3, 3, -2, 4, 5, -1, 0};
   Arrays.sort(arr, (a, b) -> b - a) to sort in descending order, if it's primitive then : Arrays.sort(arr, Collections.reverseOrder());
   Same goes for list
7. map.entrySet() gives you all the key-value pairs as a set of type Set<Map.Entry<Integer, Integer>>