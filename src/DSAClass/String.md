Questions:
1. ASCII vs Extended ASCII? from where A starts? Find ASCII of any charater?
2. How to store element at ASCII value of c in array int arr[]
3. Which replacing method of string doesn't use REGEX 
4. what are whitespaces, how to remove it from a string
5. split , join and trim methods
6. Can we reverse string in space(1)? explain reverse using char[], Buffer and String reverse
7. you have benn given only lower alphabets, how to approach this ?




Answers:
1. There are 256 characters, ASCII lies between 0 and 127 while extended ASCII lies b/w 128 and 255,
   0=null, 32=space, 33-126 keyboard characters (Uppercase letters (A–Z) → 65 to 90,Lowercase letters (a–z) → 97 to 122) and 127=del
   int ascii= (int) 'c'
2. arr['c']=52 means at index=ascii of c, 52 will be stored in arr at 99th index
3.    Method	      Uses Regex?
      replace()	      ❌ No
      replaceFirst()  ✅ Yes
      replaceAll()	  ✅ Yes
4. Whitespaces are characters that create space or separation, str.replaceAll("\\s", "");
5. String.join(" ",str) // to append space between each words of String[] str; String[] str = s.split(" "); split based on space; trim to remove leading and trailing space
6. You can’t reverse a String in true O(1) space in Java, because strings are immutable. Any modification creates a new object.
   To reverse String:
   a. new StringBuilder(s).reverse().toString()
   b. char[] chars = str.toCharArray();
   Arrays.sort(chars);
   str = new String(chars);
   c. String reverse = ""; for(int i = s.length() - 1; i >= 0; i--) reverse += s.charAt(i);
7. if we have only lower case Alphabets Characters then go with approach:
   s1Data = new s1Data[26];
   for(char c: stringInput)
   s1Data[c - 'a']++; // [c - 'a'] will always lie between 0 and 25