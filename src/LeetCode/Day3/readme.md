1.  if we have only Alphabets Characters then go with approach:
    s1Data = new s1Data[52];
    for(char c: stringInput)
    s1Data[c - 'A']++; // [c - 'A'] will always lie between 0 to 51