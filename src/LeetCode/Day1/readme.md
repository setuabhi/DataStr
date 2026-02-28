Questions:

      1. How to initialize an array?
      2. For coding what value you will initialize for CurrentSum, MaxSum, MinSum
      3. For coding what value you will initialize for startOutputIndex and endOutputIndex
      4. Hash set add, contains and remove method behavior?
      5. Hashmap put, containsKey and remove method behavior?
      6. How to sort Integer[] array?
      7. How to sort int[] array?


Answers:

      1. int[] array = {1, 2}; // at the time of declaration only, else new int[]{1, 2};
      2. CurrentSum to 0, MaxSum to Integer.MIN_VALUE, MinSum to Integer.MAX_VALUE
      3. startOutputIndex and endOutputIndex initialize to -1
      4. HashSet add returns true if element not present, if present returns false, internally hm.put(data,"PRESENT")
      5. HashMap put returns null if element not present, if present returns value of that key and update that value, remove also return the value if present else return null
      6. Integer[] arrNonPrimitive = {-1, -3, 3, -2, 4, 5, -1, 0};
         Arrays.sort(arrNonPrimitive, Collections.reverseOrder()); to sort in descending order,
      7. If it's primitive then Collections.reverseOrder() won't work as it works on Object only:
         int[] sortedDesc = Arrays.stream(arr)
         .boxed()                                 // convert IntStream → Stream<Integer>
         .sorted(Collections.reverseOrder())      // sort descending, work bcoz we converted it to  Stream<Integer>
         .mapToInt(Integer::intValue)             // back to int
         .toArray();