import java.util.Stack;

class Solution {
    public char perform(char s, char t, char operation) {
        if (s != 't' && s != 'f') {
            return t == 't' ? 't' : 'f';
        }
        if (operation == '&') {
            return (s == 't' && t == 't') ? 't' : 'f';
        }
        if (operation == '|') {
            return (s == 't' || t == 't') ? 't' : 'f';
        }
        if (operation == '!') {
            return s == 't' ? 'f' : 't';
        }
        return t == 't' ? 't' : 'f';
    }

    public boolean parseBoolExpr(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length() - 1;

        for (int i = n; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '|' || c == '&' || c == '!') {
                char curr = c == '|' ? 'f' : 't'; 
                while (!st.isEmpty() && st.peek() != ')') {
                    curr = perform(st.pop(), curr, c);
                }
                st.pop();
                st.push(curr); 
            } else if (c == ',') {
                continue;
            } else {
                st.push(c);
            }
        }

        char curr = st.peek();
        if (st.size() != 1) {
            if (st.peek() == '&' || st.peek() == '|') {
                char x = st.peek();
                curr = 't';
                while (!st.isEmpty()) {
                    curr = perform(st.pop(), curr, x);
                }
            }
        }
        return curr == 't';
    }
}
