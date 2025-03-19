Hashset.add returns true if new element being added else return false 

Hasmap.put returns null if new element being added else return value for that key

Both Hashmap and hashset works on O(1) for their add/put and get Methods

Multi value map to store duplicate key (com.google.common.collect):

    Multimap<String, String> multimap = ArrayListMultimap.create();
    multimap.put("key1", "value1");
    multimap.put("key1", "value2");  // Same key, different values
    multimap.put("key2", "value3");
    System.out.println(multimap.get("key1"));  // Outputs: [value1, value2]

Concurrent collections, such as ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue, are designed for high concurrency and allow safe operations across multiple threads without the need for external synchronization.

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
    