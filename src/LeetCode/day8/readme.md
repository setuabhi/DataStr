1. HashSet add returns true if element not present, if present returns false
2. HashMap put returns null if element not present, if present returns value of that key and update that value
3. HashMap remove(a) return value for that key 'a', hashset remove(a) will return true or false if value present or absent
4. map.values() : List of Values
5. map.keySet() : Set of Keys
6. Integer[] arrNonPrimitive = {-1, -3, 3, -2, 4, 5, -1, 0};
   Arrays.sort(arrNonPrimitive, Collections.reverseOrder()); to sort in descending order, 
   if it's primitive then Collections.reverseOrder() won't work as it works on Object only: 
    int[] sortedDesc = Arrays.stream(arr)
   .boxed()                                 // convert IntStream → Stream<Integer>
   .sorted(Collections.reverseOrder())      // sort descending, work bcoz we converted it to  Stream<Integer>
   .mapToInt(Integer::intValue)             // back to int
   .toArray();
   Same goes for list
7. map.entrySet() gives you all the key-value pairs as a set of type Set<Map.Entry<Integer, Integer>>
8. List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
   list.sort(Comparator.comparing(a -> a.getValue(), Collections.reverseOrder())); // sort descending
   list.sort(Comparator.comparing(a -> a.getValue()); // sort by value asc
   for sort by key use treeMap