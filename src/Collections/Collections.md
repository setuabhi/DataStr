Questions:
1. Hashset.add() and Hashset.remove() method return type
2. HashMap.put(), HashMap.remove(), HashMap.keySet(), HashMap.values(), map.entrySet(), map.entrySet().iterator() method return type
3. HashMap add and put method time complexity
4. Multimap, return type of it's get method?
5. Fail safe iterator, what will listIterator and mapIterator next() will return
6. How to iterate Hashmap using entrySet, forEach and iterator ?
7. Queue methods and which has exception
8. Stack methods and which has exception
9. How to create minHeap
10.  head = 3->2->1
     temp = 10->0
     head.next=temp, what will the structure of head and temp
11. Tree set first last pollFirst pollLast methods. Tree Map firstEntry, lastEntry, pollFirstEntry, pollLastEntry,
12. 


1. Hashset.add returns true if new element being added else return false.
   1.0 remove returns true if element present else false

2. Hashmap.put returns value for that key if that key presents else returns null
   2.0 remove also same as put
   2.1 map.values() : List of Values 
   2.2 map.keySet() : Set of Keys
   2.3 map.entrySet() gives you Set of type Map.Entry<Integer, Integer>
   2.4 map.entrySet().iterator() gives you Iterator of type Map.Entry<Integer, Integer>

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
   listIterator next() will return element, mapIterator next() will return Map.Entry<Key,Value> entry;

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
      Map.Entry<Integer, String> entry = iterator.next();
      System.out.println(entry.getKey() + " " + entry.getValue());
      }


7. Queue FIFO ( exception comes in add() ):

    Use offer instead of add to avoid exception on getting full, returns false if full, add() throws IllegalStateException if the queue is full.  --Add
    Use poll() to remove first element, returns null if empty, no exception --Remove and return head
    Use remove(x) if you want to remove specific element x
    Use peek() to access fist element without removing, if no element then no exception will be thrown, null will be returned -- get first element

8. Stack LIFO( exception comes in pop()  peek() and remove(x) ):

    Use push() --Add
    use pop() --removes and returns the top element; throws EmptyStackException if empty, use if(!stack.empty()) check
    Use peek() -- get first element without removing, throws EmptyStackException if empty, use if(!stack.empty()) check
    Use remove(x) if you want to remove any specific element


9. MinHeap: PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    By default store in increasing order, method: offer/ poll/ peek


10. LinkedList:

    head = 3->2->1
    temp = 10->0
    head.next=temp  : head= 3->10->0 and temp = 10->0
    temp=temp.next : head= 3->10->0 and temp = 0 (will not change head structure since they are only variables)

11. TreeMap & TreeSet (Uses Red Black Tree): Use where you need sorted unique element, else go for heap

    TreeSet: [10, 20, 30, 40]
        first(): first element
        last(): last element
        pollFirst(): remove and return first element
        pollLast(): remove and return last element

    TreeMap : firstEntry() , lastEntry(), pollFirstEntry(), pollLastEntry()
