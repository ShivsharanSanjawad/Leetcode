char* intToRoman(int n) {
    int  i = 0;  // Initialize i to 0
   static char ans[100];
  
   

    // Process thousands
    while (n >= 1000) {
        ans[i] = 'M';
        i++;
        n -= 1000;
    }

    // Process hundreds
    if (n >= 900) {
        ans[i] = 'C';
        i++;
        ans[i] = 'M';
        i++;
        n -= 900;
    } else if (n >= 500) {
        ans[i] = 'D';
        i++;
        n -= 500;
    } else if (n >= 400) {
        ans[i] = 'C';
        i++;
        ans[i] = 'D';
        i++;
        n -= 400;
    }

    // Process tens
    while (n >= 100) {
        ans[i] = 'C';
        i++;
        n -= 100;
    }

    // Process fifties
    if (n >= 90) {
        ans[i] = 'X';
        i++;
        ans[i] = 'C';
        i++;
        n -= 90;
    } else if (n >= 50) {
        ans[i] = 'L';
        i++;
        n -= 50;
    }else if (n>=40)
    {
        ans[i] = 'X' ;
        i++ ; 
        ans[i] = 'L' ; 
        i++ ; 
        n -= 40 ; 
    }

    // Process units
    while (n >= 10) {
        ans[i] = 'X';
        i++;
        n -= 10;
    }

    // Process fours
    if (n >= 9) {
        ans[i] = 'I';
        i++;
        ans[i] = 'X';
        i++;
        n -= 9;
    } else if (n >= 5) {
        ans[i] = 'V';
        i++;
        n -= 5;
    } else if (n >= 4) {
        ans[i] = 'I';
        i++;
        ans[i] = 'V';
        i++;
        n -= 4;
    }

    // Process ones
    while (n > 0) {
        ans[i] = 'I';
        i++;
        n--;
    }

    ans[i] = '\0'; // Null-terminate the string

    printf("%s\n", ans);
  return ans ;  
}