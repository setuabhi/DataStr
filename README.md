**Array and Strings**

    Hashset.add returns true if new element being added else return false

    Hasmap.put returns null if new element being added else return value for that key

    Assume intervals is 2D array, then rows = intervals.length and columns = intervals[0].length
        starting index= 0,0, ending index = rows-1, columns-1

    Comparable Comparator:
        Example: Arrays.sort(2DArray, Comparator.comparing(a->a[0])); for comparable you need to extend Comparable<Employee> the override compareto
        Feature	            Comparable  	Comparator
        Defines	            Natural ordering	Custom ordering
        Sorting criteria        Single	        Multiple
        Implementation	    In  class   	Separately
        Method	            compareTo() 	compare()

    There are 127 charaters, Ascii lies between 0 to 127, 0=null, 32=space , 33-126 keyboard charaters and 127=del
        int ascii= (int)'c'
        arr['c']=52 means at index=ascii of c, 52 will be stored in arr 