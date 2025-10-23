1.  head (head node points to the node 3)
    ↓
    [3] -> [2] -> [1] -> null 

    temp (temp node points to the node 10)
    ↓
    [10] -> [0] -> null

    now we did head.next = temp; then:

    head
    ↓
    [3] -> [10] -> [0] -> null
            ↑
            temp

    further we did temp = temp.next; then:

    head
    ↓
    [3] -> [10] -> [0] -> null
                ↑
                temp

2. Always use temp for traversing and dummy to be returned as output