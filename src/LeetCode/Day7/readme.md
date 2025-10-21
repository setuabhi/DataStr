1. Assume arr is 2D array, then
   rows = arr.length() and columns = arr[0].length
   starting index= 0,0 ending index = rows-1, columns-1

2. 1D index of (a,b) index in 4*5 2D array = a*5 + b
   2D index of x in 4*5 array = x/5, x%5 , In both Calculation column only plays role

3. Arrays.sort(arr, Comparator.comparingInt(a->a[0])); //sort using first elemetn of 2D array, where arr is 2D array