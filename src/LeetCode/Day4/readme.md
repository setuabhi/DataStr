1. There are 128 charaters, Ascii lies between 0 to 255, 0=null, 32=space , 33-126 keyboard charaters and 127=del
   int ascii= 'c'
2. arr['c']=52 means at index=ascii of c, 52 will be stored in arr
3. hashMap.getOrDefault(c,0) -> return 0 it's values
4. Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()
5. String.join(" ",str) // to append space between each words of str array
6. To reverse String: 
   a. new StringBuilder(s).reverse().toString()
   b. char[] chars = str.toCharArray();
      Arrays.sort(chars);
      string sorted = new String(chars);
   c. String output=""; for(int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
7. trim to remove leading and trailing space