Use push() --Add
use pop() --removes and returns the top element; throws EmptyStackException if empty, use if(!stack.empty() check
Use peek() -- get first element without removing, throws EmptyStackException if empty, use if(!stack.empty() check
Use remove(x) if you want to remove any specific element, here we don't have remove() to remove head
use search(x) -- get index of searched element in pop() order, starts from 1,2,3,4 return -1 if not present
Switch use case:
    int output = switch (s) {
    case "+" -> second + first;
    case "-" -> second - first;
    case "*" -> second * first;
    case "/" -> second / first;
    default -> 0;
    };