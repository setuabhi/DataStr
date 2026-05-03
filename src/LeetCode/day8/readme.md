1. HashSet add returns true if element not present, if present returns false
2. HashMap put returns null if element not present, if present returns value of that key and update that value
3. HashMap remove(a) return value for that key 'a', hashset remove(a) will return true or false if value present or absent
4. map.values() : List of Values
5. map.keySet() : Set of Keys
6. map.entrySet() gives you all the key-value pairs as a set of type Set<Map.Entry<Integer, Integer>>
7. List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
   list.sort(Comparator.comparing(a -> a.getValue(), Collections.reverseOrder())); // sort descending based on values
   list.sort(Comparator.comparing(a -> a.getValue()); // sort ascending  based on values
8. for sort by key use treeMap