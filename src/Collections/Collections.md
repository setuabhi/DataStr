1. Hashset.add returns true if new element being added else return false

2. Hashmap.put returns null if new element being added else return value for that key  
2.1 map.values() : List of Values 
2.2 map.keySet() : Set of Keys
2.3 map.entrySet() gives you all the key-value pairs as a set of type Set<Map.Entry<Integer, Integer>>

3. Both Hashmap and hashset works on O(1) for their add/put and get Methods

4. Multi value map to store duplicate key (com.google.common.collect):

    Multimap<String, String> multimap = ArrayListMultimap.create();
    multimap.put("key1", "value1");
    multimap.put("key1", "value2");  // Same key, different values
    multimap.put("key2", "value3");
    System.out.println(multimap.get("key1"));  // Outputs: [value1, value2]

5. Concurrent collections, such as ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue,
are designed for high concurrency and allow safe operations across multiple threads without the need for
external synchronization. They are FailSafe in iterator

6. hashMap iterate:

    1. entrySet:
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    2.  JAVA8:    
        tm.forEach((key, value) -> {
            System.out.println(key+ value);
        });
   3. Iterator: 
      Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
      while (iterator.hasNext()) {
       System.out.println(iterator.next().getKey() + " " + iterator.next().getValue());
      }

7. Collection hierarchy :

    java.lang.Iterable (interface)
    ↑
    java.util.Collection (interface)
    ├── java.util.List (interface)
    │     ├── ArrayList
    │     ├── LinkedList
    │     ├── Vector
    │     └── Stack
    │
    ├── java.util.Set (interface)
    │     ├── HashSet
    │     ├── LinkedHashSet
    │     └── TreeSet (implements NavigableSet)
    │
    └── java.util.Queue (interface)
    ├── java.util.Deque (interface)
    │     ├── ArrayDeque
    │     └── LinkedList (implements both Dequeue and List)
    │
    ├── PriorityQueue
    └── LinkedList


    java.util.Map (interface) (not part of collection)
    ├── HashMap
    ├── LinkedHashMap
    ├── TreeMap (implements NavigableMap)
    └── Hashtable

8. Queue:

    Use offer insead of add to avoid exception on gettting full --Add
    Use poll instead of remove to avoid exception if empty --Remove and return
    Use remove if you want to remove any specific element
    Use peek to access fist element, if no element then no exception will be thrown -- get first element

9. Stack:

    Use push --Add
    use pop --Remove and return
    Use peek -- get first element without removing, it throws exception unlike Queue
    Use remove if you want to remove any specific element
    use search -- get index of searched element 
    except search all throws exception

10. Dequeue, don't use it in interview, use either stack or queue

    It has all functions of stack and queue like push pop peek offer poll except search
    Useful one: offer/ pool/ peek / peekFirst / peekLast / pollFirst / pollLast / size
                first and last means inserted first or inserted last

11. Heap:

    By default store in increasing order, method: offer/ poll/ peek

12. Time complexity of Queue Stack and DEQUEUE are O(1)

13. LinkedList:

    head = 3->2->1
    temp = 10->0
    head.next=temp  : head= 3->10->0
    temp=temp.next : head= 3->10->0 and temp = 0 (will not change head structure sinc they are only varaibles)

14. TreeMap & TreeSet (Uses Red Black Tree): Use where you need sorted unique element, else go for heap

    TreeSet: [10, 20, 30, 40]
        first(): first element
        last(): last element
        pollFirst(): remove and return first element
        pollLast(): remove and return last element

    TreeMap : firstKey() , firstEntry(), pollFirstEntry(), pollLastEntry()

15. Integer[] arr = {-1, -3, 3, -2, 4, 5, -1, 0};
    Arrays.sort(arr, (a, b) -> b - a) to sort in descending order, if it's primitive then : Arrays.sort(arr, Collections.reverseOrder());
    Same goes for list