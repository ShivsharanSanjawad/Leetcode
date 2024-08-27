#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* removeStars(char* s) {
    int length = strlen(s);
    char* result = (char*)malloc((length + 1) * sizeof(char));
    int top = -1;

    for (int i = 0; i < length; i++) {
        if (s[i] != '*') {
            result[++top] = s[i];
        } else {
            if (top >= 0) {
                top--;
            }
        }
    }
    result[top + 1] = '\0'; 
    return result;
}

