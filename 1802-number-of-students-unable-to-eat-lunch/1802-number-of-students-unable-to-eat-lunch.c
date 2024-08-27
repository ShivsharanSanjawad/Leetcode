#include <stdio.h>

int* a;
int length;

void shift() {
    int temp = a[0];
    for (int i = 0; i < length - 1; i++) {
        a[i] = a[i + 1];
    }
    a[length - 1] = temp;
}

int countStudents(int* students, int studentsSize, int* sandwiches, int sandwichesSize) {
    a = students;
    length = studentsSize;
    int x = 0;
    int count = 0;

    while (1) {
        if (x == length) {
            return 0;
        }
        if (a[0] == sandwiches[x]) {
            count = 0;
            x++;
            a[0] = 3;
            shift();
        } else if (count != length) {
            count++;
            shift();
        } else {
            return sandwichesSize - x;
        }
    }

    return sandwichesSize - x;
}

