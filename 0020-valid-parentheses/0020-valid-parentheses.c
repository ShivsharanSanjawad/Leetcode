#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define MAX 10000

typedef struct Stack {
    char arr[MAX];
    int top;
} Stack;

void initStack(Stack* s) {
    s->top = -1;
}

bool isFull(Stack* s) {
    return s->top == MAX - 1;
}

bool isEmpty(Stack* s) {
    return s->top == -1;
}

void push(Stack* s, char c) {
    if (!isFull(s)) {
        s->arr[++(s->top)] = c;
    }
}

char pop(Stack* s) {
    if (!isEmpty(s)) {
        return s->arr[(s->top)--];
    }
    return '\0'; // Return null character if stack is empty
}

char peek(Stack* s) {
    if (!isEmpty(s)) {
        return s->arr[s->top];
    }
    return '\0'; // Return null character if stack is empty
}

bool isValid(char* s) {
    int i = 0;
    Stack p;
    initStack(&p);
    
    while (s[i] != '\0') {
        char c = s[i];
        if (c == '(' || c == '{' || c == '[') {
            push(&p, c);
        } else {
            if (isEmpty(&p)) {
                return false;
            }
            if (c == ')') {
                c = '(';
            }
            if (c == ']') {
                c = '[';
            }
            if (c == '}') {
                c = '{';
            }
            if (peek(&p) != c) {
                return false;
            } else {
                pop(&p);
            }
        }
        i++;
    }
    return isEmpty(&p);
}
