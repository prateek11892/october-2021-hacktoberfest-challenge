public static boolean balancedBrackets(String str) {
    LinkedList<Character> st = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == '(' || ch == '[' || ch == '{')
            st.addFirst(ch);
        else if (ch == ')' || ch == ']' || ch == '}') {
            if (st.size() == 0) // more closing brackets
                return false;
            else if (ch == ')' && st.getFirst() != '(')
                return false;
            else if (ch == ']' && st.getFirst() != '[')
                return false;
            else if (ch == '}' && st.getFirst() != '{')
                return false;
            else
                st.removeFirst();
        }
    }

    return st.size() == 0; // more opening brackets
}
