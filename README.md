**Array and Strings**

    int max=Integer.MIN_VALUE , int min=Integer.MAX_VALUE

    Hashset.add returns true if new element being added else return false

    Hasmap.put returns null if new element being added else return value for that key

    Both Hashmap and hashset works on O(1) for their add/put and get Methods

    Assume intervals is 2D array, then rows = intervals.length and columns = intervals[0].length
        starting index= 0,0, ending index = rows-1, columns-1

    1D index of (a,b) in 4*5 2D array = a*5 + b
    2D index of x in 4*5 array = x/5, x%5 , In both claculation column only plays role

    Comparable Comparator:
        Example: Arrays.sort(2DArray, Comparator.comparing(a->a[0])); for comparable you need to extend Comparable<Employee> the override compareto
        Feature	            Comparable  	Comparator
        Defines	            Natural ordering	Custom ordering
        Sorting criteria        Single	        Multiple
        Implementation	    In  class   	Separately
        Method	            compareTo() 	compare()

    There are 127 charaters, Ascii lies between 0 to 255, 0=null, 32=space , 33-126 keyboard charaters and 127=del
        int ascii= 'c'
        arr['c']=52 means at index=ascii of c, 52 will be stored in arr 