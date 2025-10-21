1. There are 128 charaters, Ascii lies between 0 to 255, 0=null, 32=space , 33-126 keyboard charaters and 127=del
   int ascii= 'c'
2. arr['c']=52 means at index=ascii of c, 52 will be stored in arr
3. hashMap.getOrDefault(c,0) -> return 0 it's values
4. Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()
5. To reverse String:
   char[] chars = str.toCharArray();
   Arrays.sort(chars);
   string sorted = new String(chars);