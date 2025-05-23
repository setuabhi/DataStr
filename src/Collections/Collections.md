Hashset.add returns true if new element being added else return false 

Hashmap.put returns null if new element being added else return value for that key

Both Hashmap and hashset works on O(1) for their add/put and get Methods

Multi value map to store duplicate key (com.google.common.collect):

    Multimap<String, String> multimap = ArrayListMultimap.create();
    multimap.put("key1", "value1");
    multimap.put("key1", "value2");  // Same key, different values
    multimap.put("key2", "value3");
    System.out.println(multimap.get("key1"));  // Outputs: [value1, value2]

Concurrent collections, such as ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue, 
are designed for high concurrency and allow safe operations across multiple threads without the need for 
external synchronization. They are FailSafe in iterator

hashMap iterate: 

    1. Iterator<Map.entry<String,String> itrtr = hm.entrySet.iterator(); itrtr.next.getKey() and itrtr.next.getvalue()
    2.         tm.forEach((key, value) -> {
            System.out.println(key+ value);
        });


Collection hierarchy : 

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



Queue:

    Use offer insead of add to avoid exception on gettting full --Add
    Use poll instead of remove to avoid exception if empty --Remove and return
    Use peek to access fist element, if no element then no exception will be thrown -- get first element

Stack:

    Use push --Add
    use pop --Remove and return
    Use peek -- get first element without removing 
    use search -- get index of searched element 
    except search all throws exception

Dequeue: 

    It has all functions of stack and queue like push pop peek offer poll except search
    Useful one: offer/ pool/ peek / peekFirst / peekLast / pollFirst / pollLast / size
                first and last means inserted first or inserted last

Heap:

    By default store in increasing order, method: offer/ poll/ peek
    
Time complexity of Queue Stack and DEQUEUE are O(1) 

LinkedList: 

    head = 3->2->1
    temp = 10->0
    head.next=temp  : head= 3->10->0
    temp=temp.next : head= 3->10->0 and temp = 0 (will not change head structure sinc they are only varaibles)

TreeMap & TreeSet (Uses Red Black Tree): Use where you need sorted unique element, else go for heap  

    TreeSet: [10, 20, 30, 40]
        first(): first elelemt
        last(): last element
        pollFirst(): remove and return first element
        pollLast(): remove and return last element
        ceiling(20): least element ≥ 20, or null= 20
        floor(20): greatest element <= 20, or null= 20
        higher(20): least element > 20, or null, output= 30
        lower(20): greatest element < 20, or null= 10

    TreeMap : firstKey() , firstEntry(), pollFirstEntry(), pollLastEntry(), ceilingEntry(20), ceilingKey(20) .. same for floor/higher/lower