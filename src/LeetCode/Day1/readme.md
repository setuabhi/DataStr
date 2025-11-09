1. int[] array = new int[]{1, 2};
2. CurrentSum initialize to 0
2. MaxSum initialize to Integer.MIN_VALUE
3. MinSum initialize to Integer.MAX_VALUE
4. startOutputIndex and endOutputIndex initialize to -1
5. HashSet add returns true if element not present, if present returns false
6. HashMap put returns null if element not present, if present returns value of that key and update that value
7. Integer[] arrNonPrimitive = {-1, -3, 3, -2, 4, 5, -1, 0};
   Arrays.sort(arrNonPrimitive, Collections.reverseOrder()); to sort in descending order,
   if it's primitive then Collections.reverseOrder() won't work as it works on Object only:
   int[] sortedDesc = Arrays.stream(arr)
   .boxed()                                 // convert IntStream → Stream<Integer>
   .sorted(Collections.reverseOrder())      // sort descending, work bcoz we converted it to  Stream<Integer>
   .mapToInt(Integer::intValue)             // back to int
   .toArray();